package com.test003;

//실생활에 존재하는 대상을 객체 지향적 표현
//->클래스
//->예를 들어, 보드마카를 표현한다면 class BoardMarker { }
public class BoardMarker {

	//state -> 프로퍼티
	String color = "black";
	String thick = "normal";

	//behavior -> 메소드
	void write(String msg) {
		//콘솔 전용 UI
		System.out.printf("(%s,%s)%s%n",color, thick, msg);
	}
	
}
