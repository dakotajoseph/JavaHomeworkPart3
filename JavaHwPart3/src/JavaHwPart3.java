import java.util.Scanner;
	public class JavaHwPart3 {
		public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! Astrology is fun to get to know a little about a person's general personality. Enter a zodiac sign, and I will tell you which birthdates it includes.");
			String zodiacSign = userInput.nextLine(); 
			
			if (zodiacSign == "Aquarius")
			{ 
				System.out.println("The birthdates for the Aquarius sign are January 20-February 18.");
			}
			
			else if (zodiacSign == "Gemini")
			{
				System.out.println ("The birthdates for the Gemini sign are May 22-June 21");
			}
			
			else if (zodiacSign == "Libra")
			{ 
				System.out.println ("The birthdates for the Libra sign are September 22 - October 22.");
			}
			
			else if (zodiacSign == "Leo")
			{
				System.out.println ("The birthdates for the Leo sign are July 23-August 22.");
			}
			
			else if (zodiacSign == "Aries")
			{
				System.out.println ("The birthdates for the Aries sign are March 21-April 20.");
			}
			
			else if (zodiacSign == "Sagittarius")
			{
				System.out.println ("The birthdates for the Sagittarius sign are November 22-December 21");
			}
			
			else if (zodiacSign == "Capricorn")
			{
				System.out.println ("The birthdates for the Capricorn sign are December 22-January 19.");
			}
			else if (zodiacSign == "Virgo")
			{
				System.out.println ("The birthdates for the Virgo sign are August 23-September 21.");
			}
			
			else if (zodiacSign == "Taurus")
			{
				System.out.println ("The birthdates for the Taurus sign are April 22-May 21.");
			}
			
			else if (zodiacSign == "Pisces")
			{
				System.out.println ("The birthdates for the Leo sign are February 19-March 20.");
			}
			
			else if (zodiacSign == "Scorpio")
			{
				System.out.println ("The birthdates for the Scorpio sign are October 23-November 21.");
			}
			
			else if (zodiacSign == "Cancer")
			{
				System.out.println ("The birthdates for the Pisces sign are June 22-July 22.");
			}
				
			else {
				System.out.println("Please enter one of the following signs: Aquarius, Pisces, Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, or Capricorn. Be sure to capital the initial letter of the sign.");
			}
				
				
				
	}

}
