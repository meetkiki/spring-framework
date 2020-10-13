package com.meetkiki.aspectj_aop;


import org.springframework.stereotype.Component;


@Component
public class InstanceA {
	public InstanceA() {
		System.out.println("InstanceA实例化");
	}

	public void say() {
		say2();
	}

	@LockAction
	public void say2() {
		System.out.println("hello world");
	}

}
