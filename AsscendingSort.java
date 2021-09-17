package designPattern;

public class AsscendingSort {

	
	public static void arrange(int [] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[]= {1,2,10,25,3,0,9};
		arrange(arr);

	}

}
