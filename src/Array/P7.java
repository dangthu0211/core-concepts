package Array;

import java.util.Scanner;

public class P7 {
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
        
        int imaxi = 0, lmaxi = 1;
        for(int i = 0; i < n-1; i++) {
        	int l = 1;
        	for(int j = i; j < n-1; j++) {
        		if (a[j] < a[j+1]) {
            		l++;
            	}
        		else break;
        	}
        	if ( lmaxi < l) {
        		lmaxi = l;
        		imaxi = i;
        	}
        }
        
        System.out.println("Đường chạy dài nhất ở vị trí " + imaxi+ 
        		" với độ dài là " + lmaxi);
	}
}
