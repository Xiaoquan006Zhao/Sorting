package sorting;


import java.util.Arrays;

public class merge_sort {

	  public static int[] mergeSort(int[] toSort) {
			 if (toSort == null)
					throw new NullPointerException();

			 if (toSort.length < 2)
					return toSort;

			 int mid = toSort.length / 2;
			 int[] firstHalf = Arrays.copyOfRange(toSort, 0, mid);
			 mergeSort(firstHalf);
			 int[] secondHalf = Arrays.copyOfRange(toSort, mid, toSort.length);
			 mergeSort(secondHalf);

			 int[] sorted = merge(firstHalf, secondHalf,toSort);

			 return sorted;
	  }

	  public static int[] merge(int[] first, int[] second,int[] origin) {
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

			 return origin;
	  }

}
