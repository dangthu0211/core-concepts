package Array;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("m = ");
        m = sc.nextInt();
        
        int[][] a = new int [n][m];
        int[] tmp = new int [n*m]; int k = 0;
        System.out.println("Nhap mang a(n,m): ");
        for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
        	   a[i][j] = sc.nextInt();
        	   tmp[k] = a[i][j];
        	   k++;
           }
        }
        
        tmp = sortInc(tmp,n*m);
        k=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
         	   a[i][j] = tmp[k];
         	   k++;
            }
         }
        
        System.out.println("Hien ket qua");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++)
            	System.out.print(a[i][j] + " ");
            System.out.println();
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
