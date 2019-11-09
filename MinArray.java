class MinArray{
	public static void main(String[] args) {
		int[] arr1 = {3,5,2,6,109};
		System.out.println(minValueArray(arr1));	
		}	
	public static int minValueArray(int[] arr){
		int minvalue = arr[0];
		for (int i=1;i<arr.length ;i++ ) {
			if (minvalue>arr[i]) {
				minvalue=arr[i];
			}
		}
		return minvalue;
	}
}