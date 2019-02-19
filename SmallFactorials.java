import java.util.*;
import java.lang.*;
 
import java.math.BigInteger;
import java.util.*;
 
 // note that class name is incorrect for spoj judges!

public class SmallFactorials{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			BigInteger integer = BigInteger.ONE;
			for (int i = 1; i <= n; i++)
				integer = integer.multiply(BigInteger.valueOf(i));
			System.out.println(integer);
		}
	}
}