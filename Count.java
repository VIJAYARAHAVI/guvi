import java.util.Scanner;

public class Count {
	public static void main(String[] args)
	{

		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		scn.close();
	}

}
