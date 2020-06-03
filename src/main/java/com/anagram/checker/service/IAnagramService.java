package com.anagram.checker.service;


import com.anagram.checker.model.Anagram;

public interface IAnagramService {

	Anagram isAnagrams(String input1,String input2)throws Exception;
	Anagram getAnagrams(String input1)throws Exception;

}
