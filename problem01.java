package problem01;

import java.util.Scanner;

public class problem01 {
	
	    public static void main(String[] args) {
	    	/**
	    	 Program description: I built a word manipulation tool for a word game. In this game, players can enter a sentence, and the program will rearrange the words in a specific way. The goal is to create a fun and challenging word puzzle.
	    	 Author: Gülfem Küpeli
	    	 E-mail address: 210401024@ogr.ikcu.edu.tr
	    	 Homework Number: 01
	    	 Last Changed: 20/10/2023
	    	 */
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String sentence = input.nextLine();
	        //I used this for splitting the input to words with space.
	        String[] words = sentence.split(" ");
	        int l = words.length;

	        //In this section if there are two words or more, it swaps the first and last words in the sentence with some modifications.The code changes the new sentence's first letter, and last letter case using toUpperCase, toLowerCase.
	        if (l >= 2) {
	            String last = words[l - 1];
	            String first = words[0].toLowerCase();
	            
	            String biggerLastWord = last.substring(0, 1).toUpperCase() + last.substring(1);
	            words[l - 1] = first;
	            words[0] = biggerLastWord;
	            String puzzled_sentence = String.join(" ", words);
	            System.out.println("Transformed sentence:) " + puzzled_sentence);
	        } else {
	            System.out.println("Please enter more than a word!");
	        }
	        //If there fewer words in the input sentence, the program displays a warning message.
	    }
	}
mmmm

