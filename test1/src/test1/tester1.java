package test1;

import java.util.Scanner;

public class tester1 {
	
	private static int tall = 0;
	
	

	public static void main (String[] args){
		System.out.println("Input Bob's health");

		deDart(8, tall);
	}
	
	
	
	public static void deDart(int m, int n) {
		int bob = m;
		int bab = n;
		while(bob > bab) {
			System.out.println("Bob has "+bob+" health!");
			bob--;
		}
		System.out.println("Bob died");
	}
}

