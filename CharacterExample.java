package com.regex;

import java.util.regex.Pattern;

public class CharacterExample {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[xyz]", "lve"));
		System.out.println(Pattern.matches("[ab]", "b"));
	}
}
