package com.inheritamce.computer;

public class ComputerMain {

public static void main(String[] args) {
	myComputer mycom = new myComputer("Lenovo",8,5,true,"yes",true);
	AkifComputer akifComputer = new AkifComputer("Lenovo but old",8,7,true,"nai amar",true);


	mycom.messege();
	System.out.print(mycom.toString());
	
	System.out.print(akifComputer.toString());
	akifComputer.messege();
	}


}
