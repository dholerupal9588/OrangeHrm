import java.util.Scanner;
class factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=m ; i<=n ; i++)
		{
		isFindSolution(i);
		}
	}
		public static void isFindSolution(int a)
		{
			int fact = 1;
			for(int i=1;i<=a;i++)
			{
				fact = fact*i;
             System.out.print(i+ " ");
	}
    System.out.println();
}
	}+ 