/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int[] b = a.clone();
		Arrays.sort(b);
	    int[] c = new int[n];
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<n;j++){
	    		if(a[i]==b[n-1]){
	    			c[i]=0;
	    		}
	    		else if(a[i]==b[j]){
	    			c[i] = b[j+1];
	    		}
	    	}
	    }  
	    
	    for(int i=0;i<n;i++){
	    	System.out.print(c[i]+" ");
	    }
		
		
	}
}
