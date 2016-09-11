package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 9/11/2016
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student implements younger,learner{
	public Student() {
	}

	public void print() {
		younger.super.print();
		learner.super.print();
		younger.sayHi();
		System.out.println("I am a student!");
	}
//	default void print() {
//		System.out.println("I am a younger and a learner, so I am a student.");
//	}
}
