package com.inheritamce.computer;

public class computer {
	private String brandName;
	private int ram;
	private int yearsOld;

	public computer(String brandName, int ram, int yearsOld) {
		this.brandName = brandName;
		this.ram = ram;
		this.yearsOld = yearsOld;
	}

	public void messege() {
		System.out.print("my PC is the coolest! ami English bahlo paris!");
	}

	public String toString() {
		return ("Brand Name is: "+brandName+ "\n"+"ram is : "+ram+"\n"+ 
	"age of my pasa PC: "+yearsOld);
		
		
		
	}

	

}


