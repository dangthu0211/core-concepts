package Basic;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        int n,sa1 = 0, sa2 = 0; float sb = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        System.out.println("So n = " + n);
        //Bai 1 a
    	for(int i = n%2; i <=n; i+=2) {
    		if(n%2==0) sa1 +=i;
    		else sa2 +=i;
    	}
    	System.out.println("Tong neu n chan= " + sa1);
    	System.out.println("Tong neu n le= " + sa2);
    	//Bai 1 b
    	for(int i=1; i<=n; i++) {
    		sb += (1/(float)i);
    	}
    	System.out.println("Tong thap phan= " + sb);
    }
}
