package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Payment {
	
	@Autowired
	@Qualifier("PythonBean")
	Order order;

	@Override
	public String toString() {
		return "Payment [order=" + order + "]";
	}

}
