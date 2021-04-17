package com.stack.StockSpan;

import java.util.*;
import java.util.Scanner;

public class StockSpanOptimized {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();
		}
		int span[]=new int[n];
		span[0]=1;
		Stack<Integer> s=new Stack<Integer>();
		s.push(0);
		for(int i=1;i<n;i++) {
			while(!s.isEmpty() && arr[i]>=arr[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i]=i+1;
			}
			else {
				span[i]=i-s.peek();
			}
			s.push(i);
		}
		for(int x: span) {
			System.out.println(x);
		}
		scan.close();
	}

}
