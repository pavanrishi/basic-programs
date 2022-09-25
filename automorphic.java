import java.util.*;
public class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int t =a;
       int c =a;
       int ct = 0;
       while(a>0) {
    	   a=a/10;
    	   ct++;
       }
       int sq = (int) Math.pow(t,t);
       
       int sum =0;
       int tem=0;
       for(int i =0;i<ct;i++) {
    	   tem = t%10;
    	   sum = (tem*10)+sum;
    	   t=t/10;
       }
  System.out.println(sum);
       
	}

}
