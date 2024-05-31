package com.kodnest.seperate0and1;

import java.util.Arrays;
import java.util.Scanner;

public class Separate0and1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<a.length; i++) {
			int in = sc.nextInt();
			if(in==0 || in==1) {
				a[i] = in;
			} else {
				System.out.println("Invalid code");
				return;
			}
		}
		int[] result = separate0and1(a);
		System.out.println("circuit code");
		System.out.println(Arrays.toString(result));
		sc.close();
	}

	
	public static int[] separate0and1(int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		for(int i=0; i<count; i++) {
			a[i] = 0;
		}
		for(int i=count; i<a.length; i++) {
			a[i] = 1;
		}
		return a;
	}
}
/*
 		public static int[] separate0and1(int[] a, int n) {
		List<Integer> al = new ArrayList()<>();
		List<Integer> al1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				al.add(a[i]);
			} else {
				al1.add(a[i]);
			}
		}
		List<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(al);
		al2.addAll(al1);
		if (al2 != null) {
			System.out.println("circuit code");
			System.out.println(al2);
		}
*/