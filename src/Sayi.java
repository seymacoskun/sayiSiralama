import java.util.Scanner;

public class Sayi 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("1. sayi: ");
		a = inp.nextInt();
		System.out.println("2. sayi: ");
		b = inp.nextInt();
		System.out.println("3. sayi: ");
		c = inp.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a en buyuk sayidir.");
			if(b>c) 
				System.out.println("a>b>c");
			else  System.out.println("a>c>b");
	    }	
			
		else if(b>a && b>c) {
				System.out.println("b en buyuk sayidir.");
				if(a>c) 
				{
					System.out.println("b>a>c");
				}else {System.out.println("b>c>a");}
		}	
		
		else {
			if(a>b) {
				System.out.println("c en buyuk sayidir.");
			System.out.println("c>a>b");
			}else {
				System.out.println("c>b>a");
			}
		}	
		
		
	}

}
