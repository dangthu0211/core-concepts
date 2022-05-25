package Basic;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
        String str; int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        str = sc.nextLine();
        int t = '0';
        for(int i=0; i< str.length(); i++) {
        	s += (str.charAt(i) - t);
        }
        System.out.println("Tong: " + s);
	}
}
