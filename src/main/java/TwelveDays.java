import java.util.*;
class TwelveDays {
   
    String start = "On the %s day of Christmas my true love gave to me: ";

    String[] gifts    ={
		"twelve Drummers Drumming",
		"eleven Pipers Piping",
		"ten Lords-a-Leaping",
		"nine Ladies Dancing",
		"eight Maids-a-Milking",
		"seven Swans-a-Swimming",
		"six Geese-a-Laying",
		"five Gold Rings",
		"four Calling Birds",
		"three French Hens",
		"two Turtle Doves",
		"and a Partridge in a Pear Tree."};

    String[] date =  {"first", "second", "third", "fourth", "fifth", "sixth",
		"seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};


    String verse(int verseNumber) {
        String temp = String.format(start,date[verseNumber-1]);
	if(verseNumber==1)
	{
		return(temp+"a Partridge in a Pear Tree"+'\n');
	}
	else
	{
		String[] slice = Arrays.copyOfRange(gifts,12-verseNumber,12);
		return(temp+String.join(", ", slice)+'\n');
	}
    }

    String verses(int startVerse, int endVerse) {
	String temp = "";
	for (int i=startVerse-1;i<endVerse;i++)
	{
		if(i==0)
		{
			temp = temp+String.format(start,date[i])+"a Partridge in a Pear Tree"+'\n';	
		}
		else
		{
		String[] slice = Arrays.copyOfRange(gifts,11-i,12);
		temp += String.format(start,date[i])+String.join(", ", slice)+'\n';

		}
	}
	return temp;
        
    }
    
    String sing() {
        String temp = "";
	temp = temp+String.format(start,date[0])+"a Partridge in a Pear Tree"+'\n';
	for (int i=1;i<12;i++)
	{
		String[] slice = Arrays.copyOfRange(gifts,11-i,12);
		temp += String.format(start,date[i])+String.join(", ", slice)+'\n';
	}
	return temp;
    }
}
