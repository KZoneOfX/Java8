package com.company;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 9/11/2016
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestOptional {
	public static void main(String[] args) {
		TestOptional tester = new TestOptional();
		Integer value1 = null;
		Integer value2 = 5;
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);

		System.out.println(tester.sum(a,b));

	}

	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		System.out.println("First parameter is present: "+a.isPresent());
		System.out.println("Second parameter is present: "+b.isPresent());

		Integer value1 = a.orElse(0);

		Integer value2 = b.get();

		return value1+value2;

	}



}
