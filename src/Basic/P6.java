package Basic;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        n = sc.nextInt();
        
        System.out.print("Thua so nguyen to: ");
        
        if(n <=1) {
        	System.out.print(n);
        }
        else {
        	int[] a = new int[n]; int j = 0;
            while(n!=1) {
            	for(int i = 2; i <= n; i++) {
            		if(n%i == 0) {
            			n/=i;
            			a[j] = i; j++;
            			break;
            		}
            	}
            }
            
            for(int i = 0; i < j; i++) {
            	System.out.print(a[i] + " ");
            }
        }  
        
	}
}
