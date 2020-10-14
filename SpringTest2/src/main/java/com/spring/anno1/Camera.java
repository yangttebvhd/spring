package com.spring.anno1;

import org.springframework.beans.factory.annotation.Required;

public class Camera {

	private int number; // 카메라 갯수

	@Required
	public void setNumber(int number) {
		this.number = number;
		System.out.println("setNumber()호출됨" + number);
	}

	// @Override를 메서드 위에 기술할 경우 : 메서드명이 오버라이딩 된 것인지 알려주는 기능을 가짐
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Camera[number=" + number + "]";
	}
}
