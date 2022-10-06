package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegexExampleApplication {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher(".2wx.");
		Matcher matcher2 = pattern.matcher("2xxo");
		Matcher matcher3 = pattern.matcher(".x7x.");
		Matcher matcher4 = pattern.matcher("pxxv");
		
		

		System.out.println("String matches the given regex :" + matcher.matches());
		System.out.println("String matches the given regex :" + matcher2.matches());
		System.out.println("String matches the given regex :" + matcher3.matches());
		System.out.println("String matches the given regex :" + matcher4.matches());

	}

}
