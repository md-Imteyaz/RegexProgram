package com.regex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;


public class EmailValidatorTest {

	@Autowired
	private EmailValidator emailvalidator;

	//@BeforeClass
	public void initdata() {
		emailvalidator = new EmailValidator();
	}

	//@Dataprovider
	public Object[][] ValidEmailProvider() {
		return new Object[][] {
				{ new String[] { "imteyaz143@gmail.com", "imteyaz786@hotmail.com", "imteyazmd@yahoo.com" } } };

	}

	// @Dataprovider

	public Object[][] InvalidEmailProvider() {
		return new Object[][] { { new String[] { "imteyaz143@.com", "imteyaz786@hotmail", "imteyazmd@1m" } } };

	}

	//@Test(dataProvider="ValidEmailProvider")
	public void validemailtest(String[] Email) {
		for (String temp : Email) {
			boolean valid = emailvalidator.equals(temp);
			System.out.println("email is validvalid " + temp + " ," + valid);
			Assert.hasLength(temp);
		}

	}
	public static void main(String[] args) {
		EmailValidatorTest	obj=new EmailValidatorTest();
		obj.initdata();
		obj.ValidEmailProvider();

		obj.InvalidEmailProvider();
		obj.validemailtest(args);
	}
}
