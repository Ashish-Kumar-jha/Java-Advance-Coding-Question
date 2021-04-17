package com.stack.NearestSmallerLeft;
import java.util.*;
public class NearestSmallerLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		Stack<Integer> s=new Stack<>();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(s.isEmpty()) {
				al.add(-1);
			}
			else 
				if(!s.isEmpty() && s.peek()<arr[i]){
					al.add(s.peek());
				}
				else 
					if(!s.isEmpty() && s.peek()>=arr[i]) {
					while(!s.isEmpty() && s.peek()>=arr[i]) {
						s.pop();
					}
					if(s.isEmpty()) 
					{
						al.add(-1);
					}
					else {
						al.add(s.peek());
					}
				}
			s.push(arr[i]);
		}
		System.out.println(al);
		scan.close();

	}

}
