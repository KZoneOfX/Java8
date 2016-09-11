package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: Xiaoke Zhang
 * Date: 9/11/2016
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class FunctionInterface {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

		list.forEach(System.err::println);

		System.out.println("All of the numbers:");
		eval(list, n->true);

		System.out.println("Even numbers:");
		eval(list,n-> n%2 == 0);

		System.out.println("Numbers that greater than 5:");
		eval(list,n -> n>5);

	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.println(n + "\t");
			}
		}

	}
}
