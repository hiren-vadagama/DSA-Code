package DynamicPro;

class RemovingElementMaxSum {
	
	// Method returns maximum sum of all subarray where
	// removing one element is also allowed
	static int maxSumSubarrayRemovingOneEle(int arr[],int n)
	{
		
		// Maximum sum subarrays in forward and
		// backward directions
		int fw[] = new int[n];
		int bw[] = new int[n];

		// Initialize current max and max so far.
		int cur_max = arr[0], max_so_far = arr[0];

		// calculating maximum sum subarrays in forward
		// direction
		fw[0] = arr[0];

		for (int i = 1; i < n; i++) {
			cur_max = Math.max(arr[i], cur_max + arr[i]);
			max_so_far = Math.max(max_so_far, cur_max);

			// storing current maximum till ith, in
			// forward array
			fw[i] = cur_max;

		}
		System.out.println();

		// calculating maximum sum subarrays in backward
		// direction
		cur_max = max_so_far = bw[n - 1] = arr[n - 1];
		
		for (int i = n - 2; i >= 0; i--) {

			cur_max = Math.max(arr[i], cur_max + arr[i]);
			max_so_far = Math.max(max_so_far, cur_max);

			// storing current maximum from ith, in
			// backward array
			bw[i] = cur_max;

		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.print(fw[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n; i++)
		{
			System.out.print(bw[i]+" ");
		}
		System.out.println();
		/* Initializing final ans by max_so_far so that,
		case when no element is removed to get max sum
		subarray is also handled */
		int fans = max_so_far;

		// choosing maximum ignoring ith element
		for (int i = 1; i < n - 1; i++)
		{
			System.out.println(fans+" "+(fw[i - 1] + bw[i + 1]));	

			fans = Math.max(fans, fw[i - 1] + bw[i + 1]);
			System.out.println(fans);	
		}


		return fans;
	}
	
	// Driver code
	public static void main(String arg[])
	{
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length;
		
		System.out.print(maxSumSubarrayRemovingOneEle(arr, n));
	}
}

//This code is contributed by Anant Agarwal.
