package com.stack.NearestLargestLeft;
import java.util.*;
public class NearestLargestLeft {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer> al=new ArrayList<>();
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(s.isEmpty()) {
				al.add(-1);
			}
			else if(!s.isEmpty() && s.peek()>arr[i]) {
				al.add(s.peek());
			}
			else if(!s.isEmpty() && s.peek()<=arr[i]) 
			{
				while(!s.isEmpty() && s.peek()<=arr[i]) 
				{
					s.pop();
				}
				if(s.isEmpty()) {
					al.add(-1);
				}
				else if(!s.isEmpty()){
					al.add(s.pop());
					
				}
			}
			s.push(arr[i]);
		}
		System.out.println("NEAREST LARGEST ELEMENT LEFT ");
		System.out.println(al);
		scan.close();
	}
}
