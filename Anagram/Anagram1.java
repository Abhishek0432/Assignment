package com.cloudvandhana;

import java.util.Arrays;

public class Anagram1  {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		if(s1.length()==s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		else {
			System.out.println("false");
		}

	}

}
