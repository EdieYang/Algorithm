package com.example.demo.analyzer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ProjectConstraintViolationFailureAnalyzer extends AbstractFailureAnalyzer implements BeanFactoryAware, EnvironmentAware {


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, Throwable cause) {
        System.out.println("analyze open ================");
        System.out.println(rootFailure.fillInStackTrace());
        System.out.println(cause.fillInStackTrace());
        return null;
    }

    @Override
    public void setEnvironment(Environment environment) {

    }
}
