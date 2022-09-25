import java.util.*;
public class fibonacci {
static int  fibonacci(int value) {
		if(value==0) {
			return 1;
		}
		else if(value==1) {
			return 1;
		}
			return fibonacci(value-1)+fibonacci(value-2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
   /*  int sum =0;
     int n0=0;
     int n1 =1;
     System.out.println(n0);
     System.out.println(n1);
     for(int i =0;i<a;i++) {
    sum = n0+n1;
    n0=n1;
    n1=sum;
     System.out.println(sum);
     }*/
		
System.out.println(fibonacci(a));		
		
		
	}
}
