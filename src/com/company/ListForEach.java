package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ike on 2016/9/11.
 */
public class ListForEach {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Pater");
		names.add("Nick");
		names.add("Linda");
		names.add("Zack");
		names.add("Tom");

		names.forEach(System.out::println);
		names.forEach(System.err::println);

	}
}
