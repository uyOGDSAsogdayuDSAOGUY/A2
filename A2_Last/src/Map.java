import java.io.IOException;			//Import for IO Exception;
import java.awt.image.BufferedImage;//Import for Buffered;

import javax.imageio.ImageIO; 

// A data class for storing a map of a Place. 
// This will handle the 2d array of art types for us. 
public class Map{


  private char[][] currentMap;

  // in pixels
  private int mapSize = 512; // in pixels
  private int tileSize = 64; // 

  /* (1)
   * Load a prebuilt map by index.
   * Pass index to the getBoard .
   */
  
  public Map(int index){
	  
	  Map.getBoard(index);
	  
  }

  // Generate the map based on the template
	public Map(char[][] mapTemplate){

	}
	
	/* (2)
	 * Convert the char to the String using String.valueOf() method.
	 */
	
	private String lookUpArt(char tileCode) {
		
	String jString = String.valueOf(tileCode);
	
	return jString;
	
	}
	/* Take each char in the array and draw the corresponding image. 
	// laying them out in a grid might be tricky, you can keep a fixed size for now
	// of 64 px images on a 512 px map
	 *  (3)
	 * 1.Need to load all the images by BufferedImage.
	 * 2.Draw a picture by using  specific char key  from currentMap variable.
	 * 3.Crate lookUpArt method that I did before. 
	 * 4. Add try catch , since we load files.
	 */
	 private BufferedImage image1;
	 
	public void drawMap(){
		
		try {																		// Load all the files.
			
			image1 = ImageIO.read(getClass().getResourceAsStream("Person0.png"));	// First file.
			
		}catch(IOException e){														// Catch IO Exception.
			
			e.printStackTrace();													// for handle exceptions and errors.
		}
		
		//Now I will check the char key , and find specific one . 
		for ( int i = 0 ; i < currentMap.length ; i++ ) {	// check currentMap
		 //   public static void picture(double x, double y, String s, double w, double h, double degrees){  //Draw picture (gif, jpg, or png) centered on (x, y), rescaled to w-by-h.
		    																								//http://download.oracle.com/javase/6/docs/api/java/awt/event/KeyEvent.html  	
		   
		    }

		}
		 
	
	
	/*(4)
	 * Converts an array of Strings to a 2d array of chars.
	 */
	
	public static char[][] stringToChar(String[] strings){
		char [][] anyChar = null;
		for ( int i = 0 ; i <strings.length ; i++ ) {	//check rows 
			for (int b = 0 ; b < strings[i].length() ;b++) {
		//		 anyChar[i][b];
			}
		}
		return anyChar; 								//return anyChar;
	}
	
	
	
	
  

	// Testing Data for now, we will replace this later
	 // Add more if you want
	private static String[][] testBoards = {
    { "X.X",
      ".X.",
      "X.X"},

    { ".......",
      "..X.X..",
      ".X...X.",
      "..XXX..",
      "......."},

    { "P.XX",
      "X.XX",
      "X..X",
      "XXXX"},

      {"XXXXXXXX",
      "X......X",
      "X...P..X",
      "X......X",
      "X..1...X",
      "X......X",
      "X......X",
      "XXXXXXXX"},

      // 16xx16 too big, needs scaling
    { "XXXXXXXXXXXXXXXX",
      "X..............X",
      "X...P..........X",
      "X..............X",
      "X..........1...X",
      "X..............X",
      "X..............X",
      "X..............X",
      "X..2...........X",
      "X..............X",
      "X........3.....X",
      "X..............X",
      "X....4.........X",
      "X..............X",
      "X..............X",
      "XXXXXXXXXXXXXXXX"}
	};

	// This will convert the selected test case from an array of Strings into
  // the 2D array of booleans used in Assignment 2.
	
	/* (5)
	 * Converts an array of Strings to a 2d array of char
	 */
	
  private static char[][] getBoard(int index){
	  char[][] randomChar = null;
	  for ( int row = 0 ; row < testBoards.length;row++){ 		//check row.
		  for (int col = 0 ;col< testBoards[col].length;col ++){//check col.
		//	  randomChar[row][col];
			  Map.testMaps(); 		// call the test map
		  }
	  }
	  return randomChar;
	  
  }

// Debugging
  public static void main(String[] args){
    testMaps();
  }

    // Debugging: 
  public static void testMaps(){
    Map m = new Map(Map.getBoard(0));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();

    m = new Map(Map.getBoard(1));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();

    m = new Map(Map.getBoard(2));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();

    m = new Map(Map.getBoard(3));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();

    m = new Map(Map.getBoard(4));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();

    // This one should fail gracefully (ie not crash)
    /*
    m = new Map(Map.getBoard(5));
    m.drawMap();
    StdDraw.show(2000);
    StdDraw.clear();
    */
  }

}