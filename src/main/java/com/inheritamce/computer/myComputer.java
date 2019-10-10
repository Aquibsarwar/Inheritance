package com.inheritamce.computer;

public class myComputer extends computer{

	private boolean mouse;
	private String monitor;
	private boolean girlFriend;
	
	public myComputer(String brandName, int ram, int yearsOld, boolean mouse, String monitor, boolean girlFriend) {
		super(brandName, ram, yearsOld);
		this.mouse = mouse;
		this.monitor=monitor;
		this.girlFriend=girlFriend;
	}

	
	public String toString() {
		return ("Amar nam Bhuiyan!"+"\n"+super.toString()+ "\n"+"Monitor:"+monitor+"\n"+"mouse:"+mouse+"\n"+"bou:"+girlFriend+"\n"+"\n");
		
	}
	
	
}
