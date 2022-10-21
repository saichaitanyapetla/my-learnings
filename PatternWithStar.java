
public class PatternWithStar {


	public static void main(String[] args)
	{


		
	
		int n=9;
		if(n%2==0)
			n--;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j<=(n-1)/2  || j==0  ||  j==n-1  ||  j-i>=(n-1)/2 || i==n-1)
			                 
				System.out.print("*");
					/*else if(j==0 && i<(n-1)/2 && i>0  ||  j==n-1 && i>(n-1)/2 && i<n-1)
						System.out.print("|");*/
					else
					System.out.print(" ");
					}
			
			
//------------------------------------------------------------------------------------------------------------
			System.out.print(" ");
			
				for(int j=0;j<n;j++)
				{
					if(i-j>=(n-1)/2  ||     j+i<=(n-1)/2  || i==0 || i==n-1)
			                 
				System.out.print("*");
					/*else if(j==0 && i<(n-1)/2 && i>0  ||  j==n-1 && i>(n-1)/2 && i<n-1)
						System.out.print("|");*/
					else
					System.out.print(" ");
					}

				
				//------------------------------------------------------------------------------------------------------------
							System.out.print(" ");
							
								for(int j=0;j<n;j++)
								{
									if(i-j>=(n-1)/2  || i+j>=3*(n-1)/2 )
							                 
								System.out.print("*");
									/*else if(j==0 && i<(n-1)/2 && i>0  ||  j==n-1 && i>(n-1)/2 && i<n-1)
										System.out.print("|");*/
									else
									System.out.print(" ");
									}		
				
				
				System.out.println();
			}
	}
}

	


