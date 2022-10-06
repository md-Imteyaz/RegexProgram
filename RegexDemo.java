package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("enter regex pattern.....");
				String regexpattern = sc.nextLine();
				Pattern pattern = Pattern.compile(regexpattern);
				Matcher matcher = pattern.matcher(" welcome to regex in java ");
				boolean found = false;
				while (matcher.find()) {
					System.out.println(" found the text " + matcher.group() + " starting index position "
							+ matcher.start() + " end index position " + matcher.end());
					found = true;
				}
				if (!found) {
					System.out.println("match not found");
				}
			}

		} catch (Exception ex) {
			System.out.println("exception found");

		}
	}
}
