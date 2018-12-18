package sorting;

public class selection_sort {
	  /**
	   * perform selection sort. O(n^2).
	   * @param toSort, the array that is being sorted
	   */
	  public static void selectionSort(int[] toSort) {
			 if (toSort == null)
					throw new NullPointerException();
			 
			 for (int i = 0; i < toSort.length-1; i++) {
					// index for the "smallest" element
					int smallest = i;
					for (int j = i + 1; j < toSort.length; j++) {
						  if (toSort[j] < toSort[smallest]) {
								 smallest = j;
						  }
					}
					// swap 
					int temp = toSort[smallest];
					toSort[smallest] = toSort[i];
					toSort[i] = temp;
			 }
	  }
	  
}
