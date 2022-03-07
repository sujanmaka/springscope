package edu.cs544.sujan.spring.scopes.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class PrototypeDestroy implements BeanPostProcessor, BeanFactoryAware, DisposableBean {
    private BeanFactory beanFactory;
    private final List<Object> prototypeBeans = new ArrayList<>();

    public PrototypeDestroy() {
        System.out.println("PrototypeDestroy created");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanFactory.isPrototype(beanName)) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Prototype destroy is called.......");
        synchronized (prototypeBeans) {
            for (Object bean : prototypeBeans) {
                if (bean instanceof DisposableBean) {
                    DisposableBean disposableBean = (DisposableBean) bean;
                    disposableBean.destroy();
                }
            } prototypeBeans.clear();
        }
    }

}