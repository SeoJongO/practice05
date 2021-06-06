package com.javaex.ex09;

public class StringUtil {

	private static String result = "";	
	
	public static String concatString(String[] strArray) {
		
		for (int i = 0; i < strArray.length; i++) {
			result += strArray[i];
		}
		return result;

		// 메소드 내용작성

	}
}
