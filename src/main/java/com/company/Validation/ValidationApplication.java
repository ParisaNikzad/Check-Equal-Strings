package com.company.Validation;


public class ValidationApplication {

	public static void main(String[] args) {

		String firstVal = null;
		String secondVal = null;
		System.out.println(checkEquals(firstVal, secondVal));

	}

	public static boolean checkEquals(Object a, Object b){
		if(a!=null && b!= null ) return a.equals(b);
		if(a==null && b== null) return true;
		else return false;
	}
}
