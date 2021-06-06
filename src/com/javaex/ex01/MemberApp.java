package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member jws = new Member();
		Member yjs = new Member();
		Member lhr = new Member();

		jws.showInfo("정우성", "jws", 50000);
		yjs.showInfo("유재석", "yjs", 30000);
		lhr.showInfo("이효리", "lhr", 40000);
	}

}
