package practise;

import java.util.Arrays;
import java.util.List;

public class StringSplitter {

	// TODO: Constructor
	private Separator seperator;

	private Separator seperator2;
	public StringSplitter(Separator seperator)
	{
		this.seperator=Separator.PERIOD;
	}

	public StringSplitter(Separator seperator ,Separator seperator2)
	{
		this.seperator =Separator.PERIOD;
		this.seperator2=Separator.HASH;
	}


	/**
	 * Splits the given string based on the separator(s) given at
	 * in the constructor.
	 * @param string String to be split
	 * @return Resulting list of substrings.
	 */
	public List<String> split(String string) {

		String[] str1 = null ;




		for  (int i=0;i<string.length()-1;i++)
		{

			if(string.charAt(i)==Separator.valueOf("PERIOD").asChar())
			{
				str1=string.split("\\.");
			}
			if(this.seperator2!=null)
			{
				string=string.replace('.', '#');
				if(string.charAt(i)==Separator.valueOf("HASH").asChar())
				{   
					str1= string.split("#");  	  
				} 
			}

		}



		//Initialise List of Strings to be returned  

		List<String>  listtobeReturned = Arrays.asList(str1);

		return listtobeReturned;


	}
}


enum Separator {
	PERIOD('.'),HASH('#');

	private final char asChar;
	private Separator(char asChar) {
		this.asChar = asChar;
	}

	public char asChar() {
		return asChar;
	}
}

