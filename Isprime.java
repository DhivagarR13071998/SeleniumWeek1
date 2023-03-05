package week1day1;

public class Isprime {
	public static void main(String[] args) {

		int num = 20;
		boolean prime = true;
		for (int i=2; i<num ; i++)
		{
			if( num%i == 0)
			{
				prime = false;
				break;
			}
		}
		if ( prime == false) {
			System.out.println(num + " " + "is not prime number");
		}
		else {
			System.out.println(num + " " + "is a prime number " );
		}
	}
	}