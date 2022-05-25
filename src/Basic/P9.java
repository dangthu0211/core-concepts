package Basic;

public class P9 {
	public static void main(String[] args) {
        int n = 1111111;
        
        System.out.println("So thuan nghich; co chu so 0,6,8; tong chu so chia het 10");
        while (n<=999999999) {
        	if(check(n)) {
        		if(check068(n)) 
        			if(check10(n))
        			{
                		System.out.println(n);
        			}
        	}
        	n++;
        }
        
	}
	
	public static boolean check(int n) {
		String str = Integer.toString(n);
    	for(int k=0; k<str.length()/2; k++) {
    		if(str.charAt(k) != str.charAt(str.length()-k-1)) {
    			return false;
            }
    	}
    	return true;
	}
	
	public static boolean check068(int n) {
		String str = Integer.toString(n);
		int t = '0';
		boolean c=true;
        for(int i=0; i< str.length(); i++) {
        	int tmp = str.charAt(i) - t;
        	if(tmp != 6 & tmp != 8 && tmp != 0 )
        		c = false;
        	
        }
		return c;
	}
	
	public static boolean check10(int n) {
		String str = Integer.toString(n);
		int t = '0', s = 0;
        for(int i=0; i< str.length(); i++) {
        	s += (str.charAt(i) - t);
        }
		return (s%10 == 0)?true:false;
	}
}
