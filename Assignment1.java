
public class Assignment1 {

	public static void main(String[] args) {
		
		int n=9;
	if(n%2==0)
		n--;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>0 && j<n-1 || i== n-1 && j>0 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1) 
		                 
			System.out.print("-");
				else if(j==0 && i<(n-1)/2 && i>0  ||  j==n-1 && i>(n-1)/2 && i<n-1)
					System.out.print("|");
				else
				System.out.print(" ");
				}
//-----------------------------s s s s s s s s s s s s s s s s s s s s s s s s s s s s s -------------------------------------------
			
		
			
			for(int j=0;j<n;j++)
			{
				if(i+2*j==(n-1)&& j!=(n-1)/2  )
		                 
					System.out.print("/" );
				
			
				else if ( 2*j-i==n-1 && j!=(n-1)/2  )
					System.out.print("\\");
				else if (j==(n-1)/2 && i==0 )
					
					System.out.print("-");	
				
				else if( i==(n-1)/2 && j>(n-1)/4 && j<=3*(n-1)/4)
					System.out.print("-" );
				else
				System.out.print(" ");
				}
		
//-----------------------------a a a a a a a a a a a a a a a a a a a a a a a a a a a a a-------------------------
			
		
			
			for(int j=0;j<n;j++)
			{
				if(i==0  || i==n-1)
		                 System.out.print("-");
				else if(j==(n-1)/2)
					System.out.print("|");
				else
				System.out.print(" ");
				}

 
//-----------------------------i i i i i i i i i i i i i i i i i i i i i i i i i i i i i-------------------------------

			
			for(int j=0;j<n;j++)
			{
				/* if(i+2*j==(n-1)&& j!=(n-1)/2  )
		                 
					System.out.print("/" );
				
			
				else if ( 2*j-i==n-1 && j!=(n-1)/2  )
					System.out.print("\\");
				else if (j==(n-1)/2 && i==0 )
					
					System.out.print("-");	
				
				else*/ if( i==(n-1)/2 && j>(n-1)/4 && j<=3*(n-1)/4)
					System.out.print("-" );
				else
				System.out.print(" ");
				}
//--------------------------------------------------------------------------------------------------------		

			System.out.print(" "); 
			
			for(int j=0;j<n;j++)
			{
				if(i==0  || i==n-1)
		                 System.out.print("-");
				else if(j==(n-1)/2)
					System.out.print("|");
				else
				System.out.print(" ");
				}
//---------------------------------i i i i i i i i i i i i i i i i i i i i i i i i i i i i -------------------------------------------------------------------------	
			System.out.print(" "); 
			
			for(int j=0;j<n;j++)
			{
			/*	if(i==0 && j>0 && j<n-1 || i== n-1 && j>0 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1) */
				if ( i==j && i!=0 && i!=n-1 )        
			System.out.print("\\");
				else if(j==0 && i<=(n-1) && i>0  ||  j==n-1 && i<(n-1))
					System.out.print("|");
			/*	else if (i==0 && j==0 || i==n-1 && j==n-1)
					System.out.print("-");*/
				else
				System.out.print(" ");
				}
//----------------------------------n n n n n n n n n n n n n n n n n n n n n n n n n n n -------------------------------------------------------------------------
			System.out.print(" "); 
				for(int j=0;j<n;j++)
				{
					if(i==0 && j>0 && j<n-1 || i== n-1 && j>0 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1) 
			                 
				System.out.print("-");
					else if(j==0 && i<(n-1) && i>0  && i<n-1)
						System.out.print("|");
					else
					System.out.print(" ");
					}
	//------------------------------e e e e e e e e e e e e e e e e e  e e e e  e e e e e e--------------------------------------------------------------------------
				System.out.print(" "); 
				for(int j=0;j<n;j++)
				{
					if( i== n-1 && j==(n-1)/2) 
			                 
				System.out.print("-");
					else if(j==0 && i<7*(n-1)/10 && i>0  ||  j==n-1 && i< 7*(n-1)/10 && i>0)
						System.out.print("|");
					else if(i==8*(n-1)/10 && j==(n-1)/10 || i==9*(n-1)/10 && j==2*(n-1)/10  )
						System.out.print("\\");
					else if(i==8*(n-1)/10 && j==9*(n-1)/10 || i==9*(n-1)/10 && j==8*(n-1)/10 )
						System.out.print("/");
				
					else
					System.out.print(" ");
					}
	//------------------------------u u u u u u u u u u u u u u u u u u u u u u u u u u u u u --------------------------------------------------------------------------
				System.out.print(" "); 

				for(int j=0;j<n;j++)
				{
					if(i==0 && j>0 && j<7*(n-1)/10 ) 
			                 
				System.out.print("-");
					else if(j==0 && i<(n-1) && i>0 )
						System.out.print("|");
					else if( i==(n-1)/10 && j==8*(n-1)/10 || i==2*(n-1)/10 && j==9*(n-1)/10)
						System.out.print("\\");
					else if(i==3*(n-1)/10 && j==9*(n-1)/10 || i==4*(n-1)/10 && j==8*(n-1)/10   )
						System.out.print("/");
					else if(i==5*(n-1)/10 && j>0 && j<7*(n-1)/10 ) 
		                 
						System.out.print("-");
//					else if (i==7*(n-1)/10 && j==(n-1)/4 || i==8*(n-1)/10 && j==(n-1)/2 || i==9*(n-1)/10&& j==3*(n-1)/4)
					else if(i==j && i>(n-1)/2)
					System.out.print("\\");
			
	        	else 
				System.out.print(" ");
					}
	//---------------------------------r r r r r r r r r r r r r r r r r r r r r r r  r r r r r -----------------------------------------------------------------------
				for(int j=0;j<n;j++)
				{
					if(i==0 && j>3*(n-1)/10 && j<8*(n-1)/10|| i== n-1 && j>3*(n-1)/10 && j<8*(n-1)/10)
			                 
				System.out.print("-");
					else if(j==0 && i<8*(n-1)/10 && i>3*(n-1)/10 ||  j==n-1 && i>3*(n-1)/10 && i<8*(n-1)/10)
						System.out.print("|");
					else if(i==8*(n-1)/10 && j==(n-1)/10 || i==9*(n-1)/10 && j==2*(n-1)/10   )
						System.out.print("\\");
					else if(i==8*(n-1)/10 && j==9*(n-1)/10 || i==9*(n-1)/10 && j==8*(n-1)/10 )
						System.out.print("/");
					else if( i==(n-1)/10 && j==8*(n-1)/10 || i==2*(n-1)/10 && j==9*(n-1)/10)
						System.out.print("\\");
					else if(i==(n-1)/10 && j==2*(n-1)/10 || i==2*(n-1)/10 && j==(n-1)/10  )
					
						System.out.print("/");
					
					else
					System.out.print(" ");
					}
	//----------------------------------o o o o o o o o o o o o o o o o o o o o o o o o o o o o o---------------------------------------------------------------------
				System.out.print(" "); 
				
				for(int j=0;j<n;j++)
				{
				/*	if(i==0 && j>0 && j<n-1 || i== n-1 && j>0 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1) */
					if ( i==j && i!=0 && i!=n-1 )        
				System.out.print("\\");
					else if(j==0 && i<=(n-1) && i>0  ||  j==n-1 && i<(n-1))
						System.out.print("|");
				/*	else if (i==0 && j==0 || i==n-1 && j==n-1)
						System.out.print("-");*/
					else
					System.out.print(" ");
					}
	//----------------------------------n n n n n n n n n n n n n n n n n n n n n n n n n n n n n n--------------------------------------------------------------------------
				
				
		System.out.println();
		}
		
		}
		 


	}


