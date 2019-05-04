package com.wunai.design.proxy.dynamic;

import java.lang.reflect.Proxy;

import com.wunai.design.proxy.RealSubject;
import com.wunai.design.proxy.Subject;

public class TestDynamicProxy {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(realSubject);
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[] { Subject.class }, proxy);
		subject.visit();
	}
}
