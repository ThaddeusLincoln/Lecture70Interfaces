package com.turing.jdev.interfaces;

public class Main {
	
	public static void main(String[] args){
	
		// creando dos objetos totalmente distintos que pueden ser utilizados de la misma manera
		ITelephone agnesPhone = new DeskPhone(12345);
		agnesPhone.powerOn();
		agnesPhone.callPhone(12345);
		agnesPhone.answer();
		
		agnesPhone = new MobilePhone(56789);
		agnesPhone.powerOn();
		agnesPhone.callPhone(12345);
		agnesPhone.answer();
		
	}
}
