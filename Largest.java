import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),temp=c;
	if((a>b) && (a>c))
	{
		temp=a;
	}
	else if(b>c)
	{
		temp=b;
	}
	else
	{
		temp=c;
	}
	System.out.println(temp);
	
	}
}
