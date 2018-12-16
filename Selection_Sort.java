public static int[] selectionSort(int[] toSort) {
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

	return toSort;
	}