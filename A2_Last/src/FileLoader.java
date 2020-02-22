import java.util.Scanner;
import java.io.*; // IO and Exceptions
import java.io.BufferedReader;
import java.io.FileReader;

public class FileLoader{

	private static boolean DEBUG_MODE = true;

	public   void BufferedReader(String[]s) {
	
	}
	
	/*(1)
	 * Load all people contained in the testPeople String array as Person objects within a PersonList.
	 * 1.Make Variable.
	 * 2.Pass all data . 
	 * 3.Copy data to the new Array.
	 * 4.Close file .
	 * 5.Do it in try catch with IOException.
	 */
	
	public static PersonList loadPeople(){
		
		try {
			Person[]PersonArray;									// The variable will contain all the data . 
			FileReader read = new FileReader(testPeople.toString());// Pass  testPeople to the FileReader.
			BufferedReader buff = new BufferedReader(read);			// Pass read to  BufferedReader.
			
			String line = buff.readLine();							// read line.
			
			while (line != null){									//read line until it reach the end .
		
				for ( int c = 0 ; c < line.length() ;c++) {			//go through line.length by c .
					
					PersonArray = new Person[testPeople.length];	//pass the testPeople length to the PersonArray.
					System.arraycopy(testPeople,0,PersonArray,0,testPeople.length); //copy from one array to another .
					}
				}
				
			read.close(); 											//close the read.
		
		}catch(IOException e){										// catch IO exception . 
			
			e.printStackTrace();									// for handle exceptions and errors.			
		}
		
	}
	/*(2)
	 * Load all people defined in the given file.
	 * 1.Add key word.
	 * 2.Add FileWriter.
	 * 3.Add PrintWriter.
	 * 4.Go through the array and print data to the file .
	 */
	
	public static PersonList loadPeople(String fileName) {
		
		try {
		String key = "Person";
		Person[]PersonArray;									// The variable will contain all the data . 
		FileReader read = new FileReader(testPeople.toString());// Pass  testPeople to the FileReader.
		FileWriter write = new FileWriter(fileName());			// Pass fileName to the FileWriter.
		
		BufferedReader buff = new BufferedReader(read);			// Pass read to  BufferedReader.
		PrintWriter pWriter = new PrintWriter(write);			// Pass write   to the PrintWriter.
		
		String line = buff.readLine();							// read line.
		
		while (line != null){									//read line until it reach the end .
	
			for ( int c = 0 ; c < line.length();c++) {			//go through line.length by c .
				
				PersonArray = new Person[testPeople.length];	//pass the testPeople length to the PersonArray.
				System.arraycopy(testPeople,0,PersonArray,0,testPeople.length); //copy from one array to another .
				}
			for ( int f = 0 ; f < testPeople.length; f++){		//go through testPeople.length by f.
				
				if(key == testPeople[f]){						//if key found print the data to new File .
					pWriter.println(testPeople[f]);				// data that will be print to the file .
				}
			}
		}
		read.close(); 											//close the read.
		write.close();
	
	}catch(IOException e){										// catch IO exception . 
		
		e.printStackTrace();									// for handle exceptions and errors.			
		}
	}
	/*(3)
	 * First load test data from the String array to parse (no File IO) and return a Person 
	 */
	public static Person loadPerson(int index) {
		

	}
	/*(4)
	 * Converts a String describing a Person to a Person object. You will need to set the delimiter of the Scanner to use "," 
	 */
	private static Person parsePersonString(String aPerson) throws Exception{
		
		Scanner scanner = new Scanner(aPerson);
		scanner.useDelimiter(",");
		
		
	}

	private static String fileName() {
		// TODO Auto-generated method stub
		return null;
	}

	// Test methods
	public static void main(String[] args){
		PersonList list = loadPeople();
		System.out.println("Load from String array");
		System.out.println(list.toString());

		list = loadPeople("TestPeople.txt");
		System.out.println("Load from File");
		System.out.println(list.toString());
	}

	private static String[] testPeople = {
		"Person1,Fairly Interesting",
		"Person2,More Testing of People",
		"Another Person,Might have many words or few",
		"Valid but empty description,"
	};
	

}