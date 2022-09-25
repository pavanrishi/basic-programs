import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int sum=0;
int ct =0;
int t =a;
int tp=0;
while(a>0) {
	a=a/10;
	ct++;
}
for(int i=0;i<ct;i++) {
	tp = t%10;
	sum = (int) (sum+Math.pow(tp, ct));
	t=t/10;
}
		
System.out.println(sum);
		
		
		
		
		
		
		
	}

}
