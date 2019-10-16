package com.inheritamce.computer;

public class AkifComputer extends computer {
	private boolean mouse;
	private String monitor;
	private boolean girlFriend;
	
	public AkifComputer(String brandName, int ram, int yearsOld, boolean mouse, String monitor, boolean girlFriend) {
		super(brandName, ram, yearsOld);
		this.mouse = mouse;
		this.monitor=monitor;
	 	this.girlFriend=girlFriend;
		
	}
	public void messege() {
		System.out.print("amar oita onek cool");
	}

	public String toString() {
		return ("Amar nam AKIF!"+"\n"+super.toString()+ "\n"+"Monitor:"+monitor+"\n"+"mouse:"
				+mouse+"\n"+"bou:"+girlFriend);
		
	}
	

}
