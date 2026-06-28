import java.util.*;
public class Sollution
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={7,1,5,3,6,4};
		int maxProfit=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<min){
		        min=arr[i];
		    }
		    maxProfit=(arr[i]-min > maxProfit) ? arr[i]-min: maxProfit;
		}
        System.out.println(maxProfit);
	}
}
