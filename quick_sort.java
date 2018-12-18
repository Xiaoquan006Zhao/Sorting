package sorting;



public class quick_sort {
	  /**
	   * perform a quick sort. O(n*log(n) )
	   * @param toSort, the array that is being sorted
	   * @param start, the first index of toSort
	   * @param end, the last index of toSort
	   */
	  public static void quickSort(int[] toSort, int start, int end) {
			 if(toSort==null)
					throw new NullPointerException();
			 if (start >= end)
					return;

			 int initial = start + 1;
			 int terminal = end;
			 int cursor = toSort[start]; //pick the first element as the cursor

			 while (initial < terminal) {
					while (initial < end && toSort[initial] <= cursor)
						  initial++;
					while (terminal >= start && toSort[terminal] > cursor)
						  terminal--;

					if (initial < terminal) {
						  int temp = toSort[initial];
						  toSort[initial] = toSort[terminal];
						  toSort[terminal] = temp;
					}	
			 }
			 toSort[start] = toSort[terminal];
			 toSort[terminal] = cursor;
			 
			 quickSort(toSort, start, terminal - 1);
			 quickSort(toSort, terminal + 1, end);
	  }

}
