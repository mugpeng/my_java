public class MyArray {
	public static void main(String[] args) {
		int arr[] = new int[] {93,23,1,2,3,0,4,5,66} ;
		int arr2[] = new int[] {1,2,3,4,5} ;
		System.arraycopy(arr, 5, )
		// int tail = arr.length - 1 ;
		// int head = 0 ; 
		// int center = arr.length / 2 ;
		// for (int i = 0 ; i < center ; i ++) {
		// 	int temp = arr[head] ; 
		// 	arr[head++] = arr[tail];
		// 	arr[tail--] = temp ; 
		// }
		for (int i : arr){
			System.out.print(i + ", ") ;
		}	
	}
} 