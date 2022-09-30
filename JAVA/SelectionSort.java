package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,3,4,1,2};
		System.out.println("Intially array is");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
			System.out.println();
			selection_sort(arr);
			System.out.println("Finally array sorted is");
			for(int i = 0;i<arr.length;i++)
			{
				System.out.print(" "+arr[i]);
			}
				System.out.println();

		}
  
  //Function to sort array using selection sort
	static void selection_sort(int arr[])
	{
		for(int i = 0;i < arr.length-1;i++)
		{
			int min = arr[i];
			int p = i;
			for(int j = i+1;j < arr.length;j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
				    p = j;
				}
			}
			int tem = arr[p];
			arr[p] = arr[i];
			arr[i] = tem;
		}
	}
}
