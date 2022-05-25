package Basic;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
        int n, cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        System.out.println("Uoc: ");
        for (int i=1; i*2 <= n; i++) {
        	if(n%i==0) {
        		 System.out.println(i);
        		 cnt ++;
        	}
        }
        System.out.println("Tong so luong uoc: " + cnt);
	}
}
