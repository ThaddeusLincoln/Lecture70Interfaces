package com.turing.jdev.interfaces;

public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging = false;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber){
		this.myNumber = myNumber;
	}
	
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("There's no action to be taken, desk phone do not have a power button");
		
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn){
			System.out.println("Now ringing " + phoneNumber + " on MobilePhone");
		}else{
			System.out.println("MobilePhone is switch off");
		}
		
	}

	@Override
	public void answer() {
		if(isRinging){
			System.out.println("Answering the MobilePhone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn){
			isRinging = true;
			System.out.println("Ring ring");
		}else{
			isRinging = false;
			System.out.println("Mobile phone is not on, or number different");
		}
		
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
	

}
