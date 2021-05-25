package com.practice.cash;

import java.util.Random;
import java.util.Scanner;

public	class cash3random {

			public static void main(String[] args) {
				Scanner Mmill = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter last mega"+ "");
			    
			 
				
			    String lastNumbers = Mmill.nextLine();  // Read user input
			    System.out.println("Next number to fall: " + lastNumbers);  // Output user input
			    
			    


			Random Mmill1 = new Random();
		   System.out.println(	
			Mmill1.nextInt(70) + " " + 
					Mmill1.nextInt(70) + " "+ 
					Mmill1.nextInt(70) + " "+ 
					Mmill1.nextInt(70) + " "+ 
					Mmill1.nextInt(70) + " "+ 
					Mmill1.nextInt(70) + " "+ 
					
					Mmill1.nextInt(70));

		}

	}
	/*	
	String[]numbers;
	numbers = new String[10];
	numbers[0] = "00";
	numbers[1]=  "01";
	numbers[2]=  "02";
    numbers[3]=  "03";
	numbers[4]=  "04";
	numbers[5]=  "05";
	numbers[6]=  "06";
    numbers[7]=  "07";
    numbers[8]=  "08";
    numbers[9]=  "09";
    
 	
	
	
int random = (int) (Math.random()*10);
	
System.out.println("The random number is:" + numbers[random] + " " + numbers[random] + " " + numbers[random]);

  }

		 */