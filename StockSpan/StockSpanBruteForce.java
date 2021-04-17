package com.stack.StockSpan;
import java.util.Scanner;

public class StockSpanBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER THE TOTAL DAYS ");
		int  n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int span[]=new int[n];

		span[0]=1;
		
		for(int i=1;i<n;i++) {
			span[i]=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<=arr[i]) {
					span[i]++;
				}
				else {
					break;
				}
			}
		}
		System.out.println("SPAN ARRAY:");
		for(int x:span) {
			System.out.println(x);
		}
		
		scan.close();

	}

}
