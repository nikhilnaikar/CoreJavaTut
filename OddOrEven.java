package Pracc;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}

	}

}
