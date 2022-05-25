package Array;

import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
        int m,n,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("m = ");
        m = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("k = ");
        k = sc.nextInt();
        
        int[][] a = new int [m][n]; // m dong n cot
        int[][] b = new int [n][k]; // n cot k dong
        System.out.println("Nhap mang a(m,n): ");
        for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++)
        	   a[i][j] = sc.nextInt();
        }
		
		System.out.println("Nhap mang b(n,k): "); 
		for(int i=0; i<n; i++) { 
			for(int j=0; j<k; j++)
				b[i][j] = sc.nextInt(); 
		} 
        
		int[][] c = new int [m][k];
		for(int i=0; i<m; i++) {
			for (int j=0; j<k; j++) {
				int s = 0;
				for (int l=0; l<n; l++) {
					s += (a[i][l] * b[l][j]);
				}
				c[i][j] = s;
			}
		}
		
        System.out.println("Hien");
        for(int i=0; i<m; i++) {
            for(int j=0; j<k; j++)
            	System.out.print(c[i][j] + " ");
            System.out.println();
         }
        
        
	}
}
