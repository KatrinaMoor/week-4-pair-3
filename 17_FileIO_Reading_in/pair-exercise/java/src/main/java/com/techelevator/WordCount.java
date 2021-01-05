package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount 
{

	public static void main(String[] args) 
	{
		/*
		 * 1 - Specify file path (create a File)
		 * 2 - Create a Scanner to read the FileStream
		 * 3 - Loop through the stream - scanner.nextLine() or scanner.next()
		 * 4 - do something with the data on each line
		 */
		Scanner userInput = new Scanner(System.in);
		System.out.println("What file do you want to read?");
		String fileName = userInput.nextLine();
		
		File file = new File(fileName);
		// don't even try to read the file if it doesn't exist
		if(file.exists()) 
		{
			readFile(file);
		}
		else
		{
			System.out.println("The file '" + fileName + "' does not exist.");
		}

		//knows the text file is in the same directory
		
	}
	

	public static void readFile(File file)
	{
		//this is where I will read the file
		try
		{
		Scanner fileScanner = new Scanner(file);
		
		String line = "";
		int wordCount = 0;	
		int sentenceCount = 0;
		
		while(fileScanner.hasNext())
		{
			String word = fileScanner.next();
			System.out.println(word);
			wordCount++;
			if(word.endsWith(".") || word.endsWith("!") || word.endsWith("?"))
			{
				sentenceCount++;
			}
		}
		System.out.println("Word Count: " + wordCount);
		System.out.println("Sentence Count: " + sentenceCount);
		}
		catch (FileNotFoundException e)
		{
			//TODO: handle exception
		}

	}

}
