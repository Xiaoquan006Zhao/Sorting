package sorting;


public class Insertion_sort {

	  public static int[] insertionSort(int[] toSort) {
			 if(toSort==null)
					throw new NullPointerException();
			 for (int i = 1; i < toSort.length; i++) {
					int insert = toSort[i];
					int j;
					for (j = i; j >= 1 && toSort[j - 1] > insert; j--) {
						  toSort[j] = toSort[j - 1];
					}				
					//check if swap is necessary
					if (j != i)
						  toSort[j] = insert;
			 }
			 return toSort;
	  }
	  
}
