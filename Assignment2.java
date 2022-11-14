package arrays;
import java.util.*;

// -------------------------------       DUPILCATE FINDER       -------------------------------------

class DuplicateFinder
{

	static void duplicateDetector(int []ar) 
{
		
		l1:{
		
		for(int i=0;i<ar.length;i++)
			
		{

			  for(int j=1;j<ar.length-i ;j++)
			{
				if(ar[i+j]==ar[i])
				{
					System.out.println("array is duplicate ");
					break l1;
				}
				
			}
			
		}
	
	System.out.println("array isn't duplicate");
	
			}
	}
}

// ----------------------------------        BUBBLE SORTER        ----------------------------------

class BubbleSorter
{
	static void bubbleSort( int ar[] )
  {
	
	for(int i=0;i<ar.length;i++)
		{
	       for(int j=1;j<ar.length - i;j++)
		  {
			if(ar[j]<ar[j-1])
			{
				int temp = ar[j-1];
				ar[j-1] = ar[j];
				ar[j] = temp;
			}
		  }
	   } 
	for(int elem:ar)
	{
		System.out.print(elem+" ");
	}
  }
}	


//--------------------------------    SELECTED SORTE    ----------------------------
class SelectedSorte
{
	

	static void selectedSorter(int[]ar)
	{
		int temp=0;
		for (int i = 0; i < ar.length; i++)
		{
		  for (int j = i; j < ar.length; j++)
			{
		       int min=ar[i];
		       
				 if(ar[j]<min)
		     	{    
					 temp=ar[i];
					 ar[i]=ar[j];
					 ar[j]=temp;
			     }
			   
			} 
		
			
		}
		for(int elem:ar)
		{
		 System.out.println(elem);
		}
	}
}



	

//---------------------------------    SUBSET TRACKER    ------------------------------

class SubsetTracker
{
	static void subsetTrack(int []ar,int []br,int []ref)
	{    
		if(ar.length<=br.length)
		{
		
	   l1:{	l3: for(int i=0;i<ar.length;i++)
		         {
	        l2:       for(int j=0;j<br.length;j++)
		                 {
	    	                  for (int n = 0; n < i; n++) 
	    	                       {
		                            	if(j==ref[n]) 
			                        	continue l2;
				                        else
					                    break;
			                       }
	    	                  if(br[j]==ar[i]) 
	    	                       { 
	    	                            ref[i]=j;
	    	                            continue l3;
	    	                        }
		                }     
	    	     
	    	           System.out.println("ar is not a subset of br");
		              break l1;
		         } 
	   
	        System.out.println("ar is subset of br");
		  }
		}
		else
			System.out.println("length of ar should be less than br");
	}
}

//--------------------------------------------------------------------------------------
public class Assignment2 {

	public static void main(String[] args) 
	{
		
		int []ar = new int [5];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array ar");
		for (int i=0;i<ar.length;i++)
		{
			System.out.print("enter array element"+ " "+i);
			ar[i]=scan.nextInt();
		}
/*		System.out.println();
//	 	DuplicateFinder.duplicateDetector(ar);
	 	System.out.println();
//		BubbleSorter.bubbleSort(ar);
		System.out.println();
		int []br = new int [5];
		int []ref = new int [ar.length];
		
		System.out.println("enter the array br");
		for (int i=0;i<br.length;i++)
		{
			System.out.print("enter array element"+ " "+i);
			br[i]=scan.nextInt();
		}
		SubsetTracker.subsetTrack(ar, br, ref);*/
        SelectedSorte.selectedSorter(ar);
	}

}

