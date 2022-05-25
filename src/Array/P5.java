package Array;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
        int n, m, p, q;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu mang a la n: ");
        n = sc.nextInt();
        int[] a = new int [n];
        System.out.print("Nhap mang a: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        
        System.out.print("Nhap so luong phan tu mang b la m: ");
        m = sc.nextInt();
        int[] b = new int [m];
        System.out.print("Nhap mang b: ");
        for(int i=0; i<m; i++) {
            b[i]=sc.nextInt();
        }
        
        do {
        	System.out.print("Nhap vi tri p (0<=p<n): ");
            p = sc.nextInt();
            if(p<n && p >=0) break;
        } while (p<n || p >=0);
        
        
        q= n+m;
        int[] c = new int [q];
        
        for(int i = 0; i < q; i++) {
        	if (i<p) c[i] = a [i];
        	else if (i <= (p+m-1)) c[i] = b[i-p];
        	else c[i] = a [i-m];
        }
        
        System.out.print("Mang sau khi chen: ");
        for (int i = 0; i < q; i ++) {
        	System.out.print(c[i] + " ");
        }
	}
}
