import java.util.*;
public class sunny {
static void sunny(int i) {
	if(pftsqr(i+1)==true) {
		System.out.println("yes it is a sunny nummber");
	}
	else {
		System.out.println("no");
	}
}
static  boolean pftsqr(int i) {
	for(int j =1;j<=i/2;j++) {
		if(i==j*j) {
			return true;
		}
	}
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      sunny(i);
	}

}
