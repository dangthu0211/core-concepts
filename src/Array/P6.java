package Array;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
        int n,x;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu n: ");
        n = sc.nextInt();
        int[] a = new int [n+1];
        System.out.print("Nhap mang a: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        
        System.out.print("Nhap gia tri x: ");
        x = sc.nextInt();
        a[n] = x;
        
        a = sortInc(a,n+1);
        
        System.out.print("Mang ket qua: ");
        for(int i = 0 ; i <=n; i ++) {
        	System.out.print(a[i] + " ");
        }
        
	}
	
	public static int[] sortInc(int[] a, int n) {
		for(int i=0; i<n; i++) {
        	for(int j=i; j<n; j++) {
        		if(a[i]>a[j]) {
        			int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        		}
        	}
        }
		return a;
	}
}
