package Array;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        int[] a = new int [n];
        System.out.println("Nhap mang: ");
        for(int i=0; i<n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n/2; i++) {
            if(a[i] != a[n-i-1]) {
            	System.out.println("Khong phai mang doi xung");
            	break;
            }
        }
        System.out.println("La mang doi xung");
    }  
}
