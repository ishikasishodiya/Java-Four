import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		int[] arr = new int[10];
				for(int i =0; i<10;i++)
				{
					 arr[i]=  sc.nextInt();
					 
				}
				//for loop k scope k bahar arr[i] accessible nhi tha!!
				
			for(int i =0;i<10;i++)
				{
				for(int j= i+1;j<10;j++)
				{
					
					if(arr[i] > arr[j]);
					{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
					
				}
			
				
					
				}
				for(int i=0;i<9;i++) {
			System.out.print(" "+arr[i]);
				}
				System.out.print(" "+arr[9]);
}
}