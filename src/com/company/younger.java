package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 9/11/2016
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public interface younger {
	default void print() {
		System.out.println("I am a younger.");
	}

	static void sayHi() {
		System.out.println("Young is the capital.");
	}


}
