import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int  t = a;
  int n =0;
  int sum=0;
  while(a>0) {
	  n=a%10;
	  sum=(sum*10)+n;
	  a=a/10;
  }
  if(t==sum) {
	  System.out.println("it IS a palindrom");
	  
  }
  else {
	  System.out.println("not palindrom");
  }
	}

}
