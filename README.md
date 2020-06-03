# Anagram Service

### Service
Using Spring Boot, Gradle, and your JVM language of choice, create a REST service that:
- Receives a payload of the following format, where `phrase` is a case-insensitive string of space separated words, made up of alpha-characters only (no numbers, punctuation or special characters):

  Request:http://localhost:8080/api/abc/bac
 Response: {"input1":"abc","input2":"bac","error":null,"isAnagram":true,"anagrams":[]}


http://localhost:8080/api/abc
{"input1":"abc","input2":"bac","error":null,"isAnagram":false,"anagrams":["abc","acb","bac","bca","cba","cab"]}


- Validates the request using the following rules, and returns an appropriate HTTP error response:
  - The request can not be empty/null
  - Content-Type must be application/json
  - Phrase can not be empty/null
  - Phrase must be < 1024 characters in length
  - Phrase should only contain alphabetical characters (no punctuation or special characters) and spaces

Configure Spring Boot to expose this service on port 3000.

Create a Dockerfile that bundles this service into a container
Spring Boot REST API for Anagrams 


  
  
