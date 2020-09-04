package com.company.Validation;


public class ValidationApplication {

	public static void main(String[] args) {

		String str1 = null;
		String str2 = null;
		System.out.println(checkEquals(str1, str2));

	}

	public static boolean checkEquals(String str1, String str2){
		return (str1 == null ? str2 == null : str1.equals(str2));
	}
}
