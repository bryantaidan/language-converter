import java.util.Scanner;
import java.io.*;	// imports all I/O files
import java.util.*;



public class ab_project3 {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
//3
		for (int num = 0; num < 100; num++)
        {    
            if (num % 3 == 0)
                System.out.println(num);
        }
       System.out.println("These numbers are divisble by 3");

// 5
		for (int num = 0; num < 100; num++)
        {    
            if (num % 5 == 0)
                System.out.println(num);
        }
        System.out.println("These numbers are divisble by 5");


// 3 and 5
		for (int num = 0; num < 100; num++)
        {    
            if (num % 3 == 0 && num % 5 == 0)
                System.out.println(num);
        }
       System.out.println("These numbers are divisble by 3 and 5");

// Problem 2
	Scanner englishList = new Scanner(new File("english.txt"));
	Scanner panjabiList = new Scanner(new File("panjabi.txt"));
boolean y = true;
boolean n = false;
String keepPlaying = "";
 

 	// 	System.out.print("What english word do you want to translate? ");
		// String wordToTranslate = keyboard.nextLine();


		 int i = 0;
		 int x = 0;

		do{
 		System.out.print("What english word do you want to translate? ");
		String wordToTranslate = keyboard.nextLine();

		do{
			englishList.hasNext();
			i++;

		}while(!englishList.next().equals(wordToTranslate));
		
		



		while(panjabiList.hasNextLine()){
			x++;
			String line = panjabiList.nextLine();
			//System.out.println(line);
			//System.out.println(x);
			if(x == i){
				System.out.println(wordToTranslate + " in Panjabi is " + line);
			}


		}
wordToTranslate = "";
System.out.print("y to play or n to cancel: ");
 
keepPlaying = keyboard.nextLine();
 
}while(keepPlaying.equals("y"));

panjabiList.close();
englishList.close();



	}


}