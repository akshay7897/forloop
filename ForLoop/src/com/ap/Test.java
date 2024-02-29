package com.ap;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("Divisible By 2 ..");
			}else {
				System.out.println("Not Divisible By 2 ..");
			}
			t--;
		}
		
		


	}

}
