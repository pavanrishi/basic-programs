import java.util.*;
public class prime {
    static void ifprime(int i) {
     if(i==2) {
    	 System.out.println("prime");
     }
     else if(i==0&&i==1) {
    	 System.out.println("not prime");
     }
     else {
    	 int c=0;
    	for(int j =3;j<i;j++) {
    		if(i%j==0&&i!=j) {
    			c=1;
    			System.out.println("not prime");
    			break;
    		}
    	}
    	if(c==0) {
    		System.out.println("prime");
    	}
     }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	ifprime(a);

	}

}
