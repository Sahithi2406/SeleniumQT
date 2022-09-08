package javaprogs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int n=num,i,sum=0;
	while(n>0) {
		i=n%10;
		sum=sum+(i*i*i);
		n=n/10;
		
	}

	if(sum==num) System.out.println("Armstrong number");
	else System.out.println("Not Armstrong");
	}

}
