import java.util.Scanner;

public class Vowel {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	if(c>=65 && c<=90)
	{
		c=(char) (c+32);
	}
	if(c>=97 && c<=122)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
	else
	{
		System.out.println("invalid");
	}
}
}
