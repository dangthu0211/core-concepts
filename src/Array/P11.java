package Array;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("m = ");
        m = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();
        
        int[][] a = new int [m][n]; // m dong n cot
        System.out.println("Nhap mang a(m,n): ");
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++)
        	   a[i][j] = sc.nextInt();
        }
        
        int smin=0, imin=0;
        for(int i=0; i<m; i++) {
        	int s = 0;
        	for(int j=0; j<n; j++) {
        		s += a[i][j];
        	}
        	if(i == 0) smin = s;
        	else
	        	if(smin > s) {
	        		smin = s;
	        		imin = i;
	        	}
        	System.out.println("Test = " + s + " " + i + " "+ smin + " " + imin);
        }
        
        for(int i=imin; i<m-1; i++) {
        	for(int j=0; j<n; j++) {
        		a[i][j] = a[i+1][j];
        	}
        }
        
        System.out.println("Ket qua");
        for(int i=0; i<m-1; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print(a[i][j] + " ");
        	}
            System.out.println();
        }
	}
}
