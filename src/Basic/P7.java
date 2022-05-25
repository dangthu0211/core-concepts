package Basic;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
        System.out.println("So nguyen to co 6 chu so le: ");
        int n = 111111;
        while (n<=999999) {
        	if(isPrime(n)) {
        		String str = Integer.toString(n);
            	boolean check = true;
            	int t = '0';
                for(int i=0; i< str.length(); i++) {
                	if((str.charAt(i) - t) % 2 == 0) {
                		check = false;
                		break;
            		}
                }
            	if(check) {
            		System.out.println(n);
            	}
        	}
        	n++;
        }
	}

	public static boolean isPrime(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i*i <= n; i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
    }
}
