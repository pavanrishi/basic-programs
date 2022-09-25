import java.util.*;
public class peterson {
	
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum =0;
int temp =a;
int n=0;
  while(a>0) {
    n = a%10;
	sum= sum+fact(n);
	a=a/10;
}
if(temp ==sum) {
	System.out.println("peterson");
}
else {
System.out.println("not peterson");
}
	}

}
