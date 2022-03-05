package org.day;

public class Logi1 {
	public static void main(String[] args) {
		int num =567;
		int out=0;
		while(num>0) {
			int a = num%10;
			out = out+a;
			num = num/10;
			}
		System.out.println(out);
	}


}
