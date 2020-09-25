
public class TicTacToeClass {

	//Instantiating boardof tictoc
	char board[][]=new char[3][3];
    int counter=1;
    char turn;
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

}
