import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeClass {

	//Instantiating boardof tictoc
	char board[][]=new char[3][3];
    int counter=1;
    char turn='X';
    Scanner in;
    int userInputSlotNumber;
	public String populateEmptyBoard() {
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 board[i][j]=Character.forDigit(counter++, 10);
			}}
		String output=printBoard();
		return output;
	}
	public String printBoard() {
		String output ="/---|---|---\\"
			    +"\n" + "| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |"
			    +"\n"  +"|-----------|"
			    + "\n"+ "| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |"
			     +"\n"+ "|-----------|" 
			     +"\n"+ "| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |"
			     +"\n"+ "|-----------|";
		System.out.println(output);
		return output;
      }
	
	public static void main(String[] args) {
        TicTacToeClass obj=new TicTacToeClass();
        obj.populateEmptyBoard();
        obj.validatingSlotAsNumber();
	}
	
	public int validatingSlotAsNumber() {
		boolean flag=true;
		 in=new Scanner(System.in);
		 while(flag) 
		 {
		   try
		   {
				System.out.println("X's will play first. Enter a slot number(1 to 9) to place X in: ");
				System.out.println("--------------------------------");
				userInputSlotNumber = in.nextInt();
			    if (userInputSlotNumber <1 || userInputSlotNumber > 9) {
				       System.out.println("Invalid input; re-enter slot number:");
			           continue;
			    }else 
			    	flag=false;
			 }
			 catch(InputMismatchException ex) { 
				     System.out.println(ex);
			 } 
        }
		 return userInputSlotNumber;
	}  
}