package Array;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        int[] a = new int [n];
        System.out.print("Nhap mang: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
        	for(int j=i; j<n; j++) {
        		if(a[i]>a[j]) {
        			int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        		}
        	}
        }
        System.out.print("Mang tang dan: ");
        for(int i=0; i<n; i++) {
        	System.out.print(a[i] + " ");
        }
	}
}
