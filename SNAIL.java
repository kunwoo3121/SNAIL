import java.util.Scanner;
public class SNAIL {
	static double[][] climb = new double[1001][2001];
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		climb[1][1] = 0.25;
		climb[1][2] = 0.75;
		
		for(int i = 2; i < 1001; i++)
		{
			for(int j = i; j < i*2+1; j++)
			{
				climb[i][j] = climb[i-1][j-1] * 0.25 + climb[i-1][j-2] * 0.75;
			}
		}
		
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++)
		{
			int n, m ;
			double result = 0;
			
			n = sc.nextInt();
			m = sc.nextInt();
			
			if(n <= m) System.out.println(1);
			else 
			{
				for(int j = n; j < m*2+1; j++)
				{
					result += climb[m][j];
				}
				System.out.println(String.format("%.10f", result));
			}
		}
		
		sc.close();
	}

}
