package sortingAlgorythms;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,7,4,2,1};
		
		mergeSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void mergeSort(int[] array) {
 
        if(array.length > 1) {
            
        	int mid = array.length / 2;
 
            // copy the left array
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
             
            // copy the right array
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
            // split the arrays apart
            mergeSort(left);
            mergeSort(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
 
            // Merge left and right arrays
            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                }
                else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
            
            while(j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
}

