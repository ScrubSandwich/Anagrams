# Anagrams
This program determines if two words are anagrams of each other

## Usage
1. Open up your favorite terminal
2. Clone the repository `git clone https://github.com/jmieczni/Anagrams.git`
3. Navigate to the Anagrams folder `cd Anagrams`
4. Compile the program `javac Anagrams.java`
5. Run the program with the 2 words as arguments `java Anagrams [word2] [word2]`

## Background
The Fundamental Theorem of Arithmetic states that 
> Any integer greater than 1 is either a prime number, or can be written as a unique product of prime numbers (ignoring the order).

This implies that every real integer is a prime or a *unique* product of primes.
Given any two words with the same letters, but in a different order, they will have the same product when each character is mapped to a unique prime number and multiplied out.

## Algorithm
1. Map each of the 26 English letters to a prime number
2. Multiply the cooresponding numbers of the characters of each word
3. If the products of each word are the same, the words are anagrams

## Motivation
This project was created after seeing a tweet by @fermatslibrary on Twitter. 
https://twitter.com/fermatslibrary/status/988399621402656773
