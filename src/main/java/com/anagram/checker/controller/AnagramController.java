package com.anagram.checker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.anagram.checker.model.Anagram;
import com.anagram.checker.service.IAnagramService;


/**
 * The class AnagramController where we find the REST methods.
 */
@RestController
//@RequestMapping("api")
public class AnagramController {

  @Autowired
  private IAnagramService anagramService;



 @RequestMapping(path="/{input1}/{input2}", method = RequestMethod.GET)
public ResponseEntity<?>  isAnagram(@PathVariable String input1, @PathVariable String input2)throws Exception 
{
	Anagram anagram =anagramService.isAnagrams(input1,input2);
	if(anagram.getError()!=null)
		return new ResponseEntity<Anagram>(anagram, HttpStatus.BAD_REQUEST);
	else
		return new ResponseEntity<Anagram>(anagram, HttpStatus.OK);
}

 @RequestMapping(path="/{input}", method = RequestMethod.GET)
public ResponseEntity<?>  getAnagrams(@PathVariable String input)throws Exception 
{
	Anagram anagram =anagramService.getAnagrams(input);
	if(anagram.getError()!=null)
		return new ResponseEntity<Anagram>(anagram, HttpStatus.BAD_REQUEST);
	else
		return new ResponseEntity<Anagram>(anagram, HttpStatus.OK);
}

	
   
}
