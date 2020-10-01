package research.TestingRandD;

import org.junit.Test;

public class ArrayProblem {

//	public List<int[]> listOf = {1,2,3,4,5,6,7,8};
	public int[] listOf = {1,2,3,4,5,6,7,8};
	
	@Test
	public void sortByBiggestNumber(){
		int a = 0;
		for(int i=0; i<listOf.length; i++ ) {
			 	if(listOf[i]>a ){
				 a=listOf[i];
			}
		}
		System.out.println("biggest number: "+a);
	}
	
	@Test
	public void invertList(){
		int[] newList= new int[listOf.length];

		for(int i=listOf.length; i>0; i--) {
			newList[listOf.length-i]=listOf[i-1];
		}

		for(int i=0; i<=newList.length-1; i++) {
			System.out.println("newList["+i+"]: "+newList[i]);
		}
	}
	
}
