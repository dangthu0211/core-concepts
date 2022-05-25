package Array;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();
        
        int[] a = new int [n];
        int[] b = new int [n];
        
        System.out.print("Nhap mang: ");
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            b[i]=1;
        }
        
        a=sortInc(a,n);
        
        for(int i=0; i<n-1; i++) {
        	int j = i + 1; 
        	if(a[i] == a[j]) {
        		b[i] ++;
        		a=removeOne(a,n,j);
        		n--; i--;
        	}
        }
        
        System.out.println("So lan xuat hien: ");
        for(int i=0; i<n; i++) {
        	System.out.println(a[i] + " " + b[i]);
        }
        
        int maxi = b[0], imaxi = 0;
        for (int i=0; i<n; i++) {
        	if(maxi < b[i]) {
        		maxi = b[i];
        		imaxi = i;
        	}
        }
        System.out.println("So xuat hien nhieu nhat la " + a[imaxi] + " voi " + maxi + " lan");
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
	
	public static int[] removeOne(int[]a, int n, int r) {
		for(int i=r; i<n-1; i++ ) {
			a[i] = a[i+1];
		}
		n--;
		return a;
	}
}
