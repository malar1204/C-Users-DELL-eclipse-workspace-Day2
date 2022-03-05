package org.day;

public class Logi2 {
	public static void main(String[] args) {
		int num = 567;
		int out=1;
		while(num>0) {
			int a = num%10;
			out = (out*a);
			num = num/10;
			}
		System.out.println(out);
	}

}
