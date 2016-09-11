package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 9/11/2016
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface learner {
	default void print() {
		System.out.println("I am a learner.");
	}
}
