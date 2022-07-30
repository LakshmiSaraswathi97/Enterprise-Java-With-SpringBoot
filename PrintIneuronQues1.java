package assignment1;
//Question 1: Write a program(WAP) to print INEURON using pattern programming logic

public class PrintIneuronQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Letter I
		int n=5;
		for(int i=0;i<n;i++)
			{
			for(int j=0;j<n;j++)
	        	{
	        		if(i==0|| j==n/2 || i==n-1)
	        		{                          
	        			System.out.print("*");
	        		}
	        		else
	        		{
	        			System.out.print(" ");
	        		}
	        	}
	        	System.out.print(" ");
	        	
	        	
				
	   //Letter N
			for(int j=0;j<n;j++)
			    {
			      if(j==0|| i==j || j==n-1)
			       {                          
			         System.out.print("*");
			       }
			      else
			       {
			         System.out.print(" ");
			       }
			    }
			System.out.print(" ");
	        
		//Letter E
		for(int j=0;j<n;j++)
        	{
        		if(i==0 || j==0 || i==n/2 ||i==n-1)
        		{                          
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
        	System.out.print(" ");
        	
        // Letter U 	
        for(int j=0;j<n;j++)
        {
        	if((j==0 && i<n-1)|| (j==n-1 && i<n-1) || (i==n-1 && j>0 && j<n-1))
        	{
        		System.out.print("*");
        	}
        	else
        	{
        		System.out.print(" ");
        	}
        }
            System.out.print(" ");
            
         // Letter R
         for(int j=0;j<n;j++)
         {
        	 if((i==0 && j<n-1) || j==0 ||(i==n/2 && j<n-1)|| (i==j && j>n/2) || (j==n-1 && i<n/2 && i>0))
        	 {
        		 System.out.print("*");
        	 }
        	 else
        	 {
        		 System.out.print(" ");
        	 }
         }
             System.out.print(" ");
        // Letter O     
         for(int j=0;j<n;j++)
         {
        	 if ((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n-1 ))
        	 {
        		 System.out.print("*");
        	 }
        	 else
        	 {
        		 System.out.print(" ");
        	 }
         }
         System.out.print(" ");
          
         // Letter N
         
         
         for(int j=0;j<n;j++)
		    {
		      if(j==0|| i==j || j==n-1)
		       {                          
		         System.out.print("*");
		       }
		      else
		       {
		         System.out.print(" ");
		       }
		    }
		System.out.println();
			}
		
		

	}

	}

