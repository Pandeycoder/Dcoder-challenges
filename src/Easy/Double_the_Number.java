package Easy;

import java.util.Scanner;

public class Double_the_Number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in );
	    int input=sc.nextInt();
	    int j=0;
	    
	    while(input>j)
	    {
	    	j++;
	    	 int size1=sc.nextInt();
	    	 int check=sc.nextInt();
	 	     int arr[]=new int[size1];
	 	     int count=0;
	 	    for(int i=0;i<arr.length;i++)
		    {
		      arr[i]=sc.nextInt();
		      if(arr[i]*2==check)
		      {
		        count++;
		      }
		    }
	 	    System.out.println(count);
	    }
	    
	 

	}

}
