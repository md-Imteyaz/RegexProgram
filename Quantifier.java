package com.regex;

import java.util.regex.Pattern;

public class Quantifier {

	public static void main(String[] args) {

		System.out.println("? quantifiers......");
		System.out.println(Pattern.matches("[xyz]?", "ikl"));
		System.out.println(Pattern.matches("[xyz]?", "x"));
		System.out.println(Pattern.matches("[xyz]?", "z"));
		
		System.out.println(Pattern.matches("[xyz]?", "aayyzz"));
		System.out.println(Pattern.matches("[xyz]?", "y"));
		System.out.println(Pattern.matches("[xyz]?", "z"));

		System.out.println("....................................");

		
		System.out.println("+ quantifiers......");
		System.out.println(Pattern.matches("[abc]+", "zaa"));
		System.out.println(Pattern.matches("[abc]+", "aa"));
		System.out.println(Pattern.matches("[abc]+", "b"));
		System.out.println(Pattern.matches("[abc]+", "aaaaaa"));
		System.out.println(Pattern.matches("[abc]+", "amnntaaaa"));
		
		System.out.println("....................................");


		System.out.println("* quantifiers......");

		System.out.println(Pattern.matches("[abc]*", "amnntaaaa"));
		System.out.println(Pattern.matches("[abc]*", "aaaaa"));
		System.out.println(Pattern.matches("[abc]*", "bbbbbb"));
		System.out.println(Pattern.matches("[abc]*", "cccc"));


		



	}
}
