package com.leetcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromePairs {

	/**
	 * @param args
	 * @throws IOException 
	 */
//	 Given a list of unique words, find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.
//
//	 Example 1:
//	 Given words = ["bat", "tab", "cat"]
//	 Return [[0, 1], [1, 0]]
//	 The palindromes are ["battab", "tabbat"]
//
//	 Example 2:
//	 Given words = ["abcd", "dcba", "lls", "s", "sssll"]
//	 Return [[0, 1], [1, 0], [3, 2], [2, 4]]
//	 The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
//		System.out.println("Please input the words.");
//		FileReader file = new FileReader("C:");
//		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = words.length;
		for (int i = 0 ; i<=n ; i++) {
			char[] charI = words[i].toCharArray();
		}
		
		System.out.println(n);
		
		
	}

}
