package com.stack.NearestLargestRight;
import java.util.*;
public class NearestLargestRight {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		Stack<Integer> s=new Stack<Integer>();
		int arr[]=new int[10];
		int n=scan.nextInt();
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();
		}

		for(int i=arr.length-1;i>=0;i--) 
		{
			// only for last element o the array since we are traversing from the last
			if(s.isEmpty()) 
			{
				al.add(-1);
			}
			
			else if(!s.isEmpty() && s.peek()> arr[i]) 
			{
				al.add(s.peek());
			}
			
			else if(!s.isEmpty() && s.peek()<=arr[i]) 
				{
					while(!s.isEmpty() && s.peek()<=arr[i]) 
				{
					s.pop();
				}
				if(s.isEmpty())
				{
					al.add(-1);
				}
				else 
				{
					al.add(s.peek());
				}
			}
			s.push(arr[i]);
		}
		Collections.reverse(al);
		for(int i=0;i<n;i++) {
			System.out.print(al.get(i)+" ");
		}
		scan.close();
	}

}
