import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

 // note that class name is incorrect for spoj judges!

 public class Factorial {
 
	public static int getZero(int n) {
		int zero = 0;
		while (n > 0) {
			zero += n / 5;
			n /= 5;
		}
		return zero;
	}
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			pr.println(getZero(n));
		}
		pr.flush();
		pr.close();
	}
}