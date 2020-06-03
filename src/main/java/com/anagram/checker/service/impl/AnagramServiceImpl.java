package com.anagram.checker.service.impl;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anagram.checker.model.Anagram;
import com.anagram.checker.service.IAnagramService;

@Service

public class AnagramServiceImpl implements IAnagramService {
@Autowired
private Anagram anagram;
	@Override
	public Anagram isAnagrams(String input1, String input2) throws Exception {
		anagram.reset();
		anagram.setInput1(input1);
		anagram.setInput2(input2);
		if(isInvalid(input1,input2)) {
			anagram.setError("Invalid input");
			return anagram;
		}

		int[] letterCount = new int[126];
		for (char ch : input1.toCharArray()) {
			letterCount[ch]++;
		}

		for (char ch : input2.toCharArray()) {
			letterCount[ch]--;
		}

		for (int count : letterCount) {
			if (count != 0) {
				anagram.setIsAnagram(false);
				return anagram;
			}
		}
		anagram.setIsAnagram(true);
		return anagram;
		// return anagram;
	}
	private boolean isInvalid(String input1,String input2) {
		 Pattern patt = Pattern.compile("[^A-Za-z]");
		  Matcher mat = patt.matcher(input1);
		  boolean found = mat.find();
		  if(found)
			  return found;
		  if(input2=="")
			  return found;
		  mat = patt.matcher(input2);
		  found =mat.find();
		  return found;
	}

	public Anagram getAnagrams(String input) throws Exception {
		anagram.reset();
		anagram.setInput1(input);
		if(isInvalid(input,"")) {
			anagram.setError("Invalid input");
			return anagram;
		}

		permute(input,0,input.length()-1,anagram);
		return anagram;
	}
	
	
	 private void permute(String str, int l, int r, Anagram anagram) 
	    { 
	        if (l == r) 
	            anagram.getAnagrams().add(str);
	        else { 
	            for (int i = l; i <= r; i++) { 
	                str = swap(str, l, i); 
	                permute(str, l + 1, r,anagram); 
	                str = swap(str, l, i); 
	            } 
	        } 
	    } 
	  
	    /** 
	     * Swap Characters at position 
	     * @param a string value 
	     * @param i position 1 
	     * @param j position 2 
	     * @return swapped string 
	     */
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i]; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	
	
}
