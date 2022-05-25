package Array;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
        int n,x ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so X: ");
        x = sc.nextInt();
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        
        int[] a = new int [n];
        int[] p = new int [n];
        int k = 0;
        
        System.out.print("Nhap mang: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            if(isPrime(a[i])) {
            	p[k] = a[i];
            	k++;
            }
        }
        
        int nearX= Math.abs(x - p[0]); 
        int inearX=0;
        for(int i=0; i<k; i++) {
        	int tmp = Math.abs(x - p[i]);
        	if(nearX >= tmp) {
        		nearX = tmp;
        		inearX = p[i];
        	}
        }
        
        for(int i=0; i<n; i++) {
        	if(a[i] == inearX)
        	{
        		nearX = a[i];
        		inearX = i;
        		break;
        	}
        }
        System.out.println("So nguyen to gan nhat: " + nearX + " o vi tri " + inearX);
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
