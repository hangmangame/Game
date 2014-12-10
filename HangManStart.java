
public class HangManStart {
	
static 	String[][] hang = {
		{
		"+----+",
		"|    |",
		"|     ",
		"|     ",
		"+====="}, //hang[0]

		{
		"+----+",
		"|    |",
		"|    o",
		"|     ",
		"|     ",
		"|     ",
		"+====="}, //hang[1]
		
		
		{"+----+",
		"|    |",
		"|    o",
		"|    | ",
		"|     ",
		"|     ",
		"+====="}, //hang[2]

		{"+----+",
		"|    |",
		"|    o",
		"|   /|",
		"|     ",
		"|     ",
		"+====="}, //hang[4]
		
		{"+----+",
		"|     |",
		"|     o",
		"|    /|\\",
		"|     ",
		"|     ",
		"+====="}, //hang[5]
		
		{"+----+",
		"|     |",
		"|     o",
		"|    /|\\",
		"|    / ",
		"|     ",
		"+====="}, //hang[6]
		
		{"+----+",
		"|     |",
		"|     o",
		"|    /|\\",
		"|    / \\",
		"|     ",
		"+====="} //hang[7]
		};

	public static void main(String[] args) {
		int n=0;
		//for(int i=0; i<5; i++) {
		for(int i=0;i< hang[n].length;i++) {
			System.out.println(hang[n][i]);
		}
		n=1;
		for(int i=0;i<hang[n].length;i++) {
			System.out.println(hang[n][i]);
		}
		
	}	
}
		

		
