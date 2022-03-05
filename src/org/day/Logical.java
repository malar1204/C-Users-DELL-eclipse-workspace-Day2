package org.day;

public class Logical {
public static void main(String[] args) {
	int num =234;
	int out=0;
	while(num>0) {
		int a = num%10;
		out = (out*10)+a;
		num = num/10;
		}
	System.out.println(out);
}
}
