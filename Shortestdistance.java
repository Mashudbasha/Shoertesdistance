package com.bl;

import java.util.Vector;

public class Shortestdistance {

	
		// TODO Auto-generated method stub
		

public static  void shortestDistance(String S,char C) {
	
		 int prev = Integer.MAX_VALUE;
		    Vector<Integer> ans = new Vector<>();
		     
		    for (int i = 0; i < S.length(); i++)
		    {
		        if (S.charAt(i) == C)
		            prev = i;
		        if (prev == Integer.MAX_VALUE)
		            ans.add(Integer.MAX_VALUE);
		        else   
		            ans.add(i - prev);
		    }
		 
		    		    prev = Integer.MAX_VALUE;
		    for (int i = S.length() - 1; i >= 0; i--)
		    {
		        if (S.charAt(i) == C)
		            prev = i;
		        if (prev != Integer.MAX_VALUE)   
		            ans.set(i, Math.min(ans.get(i), prev - i));
		    }
		 
		    for (Integer val: ans)
		            System.out.print(val+" ");
		}

public static void main(String args[]) {
	String S="first";
	  C = "r";
	shortestDistance(S,C);
	
}
	
		
	}


