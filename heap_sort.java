package sorting;


import java.util.Arrays;

public class heap_sort {
	  /**
	   * perform a heap sort. O(n*log(n) ). In this example, we do not skip the first
	   * index in the array. Meaning: the index of parent of an element in a heap form
	   * if the element has a parent is the index of element itself minus one and then
	   * divided by 2((i-1)/2). And similarily, the index of left child of an element
	   * if the element has one is the index of the element itself times two and add 1
	   * (2i+1). The index of right child of an element if the element has one is the
	   * index of the element itself times two and add 2 (2i+2).
	   * 
	   * @param toSort, the array that is being sorted
	   */
	  public static void heapSort(int[] toSort) {
			 // forming a maxheap
			 for (int i = (toSort.length - 2) / 2; i > -1; i--) {
					reheap(toSort, i, toSort.length);
			 }
			 // swap the biggest element and the last element
			 swap(toSort, 0, toSort.length - 1);

			 // maintaining the state of maxheap and keeping the sorted elements undisturbed
			 // forloop ends at i = 1, i acts like length(border). because if there if only
			 // one element in the array that
			 // has not been sorted yet, then the element is sorted already.
			 for (int i = toSort.length - 1; i > 1; i--) {
					reheap(toSort, 0, i);
					swap(toSort, 0, i - 1);
			 }
	  }

	  /**
	   * helper method for heapSort to maintain the state of a maxheap or a
	   * minheap(depending on the needs and implementations, usually a maxheap).
	   * 
	   * @param toSort, the array that is being sorted
	   * @param start, the starting index of reheap
	   * @param end, the ending index of reheap
	   */
	  public static void reheap(int[] toSort, int start, int end) {
			 int parent = start;
			 int largerChild = start * 2 + 1;
			 boolean Notdone = true;

			 while (Notdone && largerChild < end) {
					int rightChild = largerChild + 1;
					if (rightChild < end)
						  // suppose to use the compareTo method or something more strict
						  // than the greater or smaller operations eg, <, >
						  largerChild = (toSort[largerChild] > toSort[rightChild]) 
						  									? largerChild : rightChild;
					// same reason above for the operations
					if (toSort[largerChild] > toSort[parent]) {
						  swap(toSort, largerChild, parent);
						  parent = largerChild;
						  largerChild = largerChild * 2 + 1;
					} else
						  Notdone = false;
			 }
	  }

	  /**
	   * helper method for heapSort to swap the element specified by int a and b
	   * 
	   * @param toSort, the array that is being acted on
	   * @param a, first index of the element being swapped(assuming vaild)
	   * @param b, second index of the element being swapped(assunimh vaild)
	   */
	  public static void swap(int[] toSort, int a, int b) {
			 // assuming the element is int type, because in the example I used int[] as the
			 // object of being sorted
			 int temp = toSort[a];
			 toSort[a] = toSort[b];
			 toSort[b] = temp;
	  }
}
