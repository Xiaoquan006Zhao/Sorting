package sorting;


import java.util.Arrays;

public class merge_sort {
	  /**
	   * perform a merge sort. O(n*log(n) ). merge sort is faster than quick sort when the sample size is very
	   * large, but takes more memory.
	   * @param toSort, the array that is being sorted
	   */
	  public static void mergeSort(int[] toSort) {
			 if (toSort == null)
					throw new NullPointerException();
			 if (toSort.length < 2)
					return;

			 int mid = toSort.length / 2;
			 int[] firstHalf = Arrays.copyOfRange(toSort, 0, mid);
			 mergeSort(firstHalf);
			 int[] secondHalf = Arrays.copyOfRange(toSort, mid, toSort.length);
			 mergeSort(secondHalf);

			 merge(firstHalf, secondHalf,toSort);
	  }

	  public static void merge(int[] first, int[] second,int[] origin) {
			 int mergedIndex = 0;
			 int firstIndex = 0;
			 int secondIndex = 0;
			 while (firstIndex < first.length && secondIndex < second.length) {
					if (first[firstIndex] < second[secondIndex])
						  origin[mergedIndex++] = first[firstIndex++];
					else
						  origin[mergedIndex++] = second[secondIndex++];
			 }
			 
			 while (firstIndex < first.length)
					origin[mergedIndex++] = first[firstIndex++];

			 while (secondIndex < second.length)
					origin[mergedIndex++] = second[secondIndex++];

	  }
}
