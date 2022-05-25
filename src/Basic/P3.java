package Basic;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a & b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int ucln = ucln(a,b);
        int bcnn = (ucln!=0)?(a*b)/ucln:0;
        System.out.print("Uoc chung lon nhat: " + ucln + "\nBoi chung nho nhat: " + bcnn);
	}
	public static int ucln (int a, int b) {
		if (a == 0 || b == 0){
	        return a + b;
	    }
	    while (a != b){
	        if (a > b){
	            a -= b;
	        }else{
	            b -= a;
	        }
	    }
	    return a; 
	}
}
