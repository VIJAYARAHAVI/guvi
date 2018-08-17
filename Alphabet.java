import java.util.Scanner;

public class Alphabet {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	if((c>=97 && c<=122) || (c>=65 && c<=90))
	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.println("No");
	}
}
}
