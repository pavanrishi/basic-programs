import java.util.*;
public class factorial {

	
	static int fact(int i ) {
		if(i==0) {
			return 1;
		}
		else {
			return i*fact(i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     int a = sc.nextInt();
     int fact=1;
     for(int i= a;i>0;i--) {
    	 fact = fact*i;
     }
		System.out.println(fact);
		System.out.println(fact(a));
		
		
	}

}
