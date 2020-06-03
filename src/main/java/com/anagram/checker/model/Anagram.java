package com.anagram.checker.model;


import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Anagram {


    private  String input1;
   

	private String input2;
	
	private String error;

	private boolean isAnagram;
	
	private ArrayList<String> anagrams = new ArrayList<String>();
	
	public void reset() {
		this.error=null;
		this.isAnagram=false;
		this.anagrams=new ArrayList<String>();
		
	}
	
	public ArrayList<String> getAnagrams() {
		return anagrams;
	}


	public void setAnagrams(ArrayList<String> angrams) {
		this.anagrams = angrams;
	}


	public void setAnagram(boolean isAnagram) {
		this.isAnagram = isAnagram;
	}


	public boolean getIsAnagram() {
		return isAnagram;
	}


	public void setIsAnagram(boolean value) {
		this.isAnagram = value;
	}

	
	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}



	public String getInput2() {
		return input2;
	}


	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

    

    
}
