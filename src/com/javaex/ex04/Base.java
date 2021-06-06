package com.javaex.ex04;

public class Base {

	private String state;

	public void service(String state) {
		this.state = state;
		if (state.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자");
		} else if (state.equals("밤")) {
			System.out.println("밤에는 숙면");
		} else if (state.equals("오후")) {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}
	}

	public void day(String state) {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night(String state) {
		System.out.println("밤에는 숙면");
	}

	public void afternoon(String state) {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
