package week1day1;

public class Fibonnici {
	    public static void main(String[] args) {
	        int numone = 0;
	        int numtwo = 1;
	        System.out.print(numone +" " + numtwo +" ");
	        for (int i = 0; i <=10; i++) {
	            int sum = numone + numtwo;
	            System.out.print(sum + " ");
	            numone = numtwo;
	            numtwo = sum;
	        }
	    }
	}

