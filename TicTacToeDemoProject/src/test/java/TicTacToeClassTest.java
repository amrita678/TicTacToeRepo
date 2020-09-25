import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeClassTest {
	  private TicTacToeClass ticTacToeObject;
		@BeforeEach
		public void init() {
			ticTacToeObject=new TicTacToeClass();	
		}
		@Test
		public void shouldPrintEmptyBoard() {
			String expected ="/---|---|---\\"
				    +"\n" + "| 1 | 2 | 3 |"
				    +"\n"  +"|-----------|"
				    + "\n"+ "| 4 | 5 | 6 |"
				     +"\n"+ "|-----------|" 
				     +"\n"+ "| 7 | 8 | 9 |"
				     +"\n"+ "|-----------|";
			
			String actual=ticTacToeObject.populateEmptyBoard();
	        assertEquals(expected, actual);
	   }
		@Test
		public void XTurnShouldBeFirst() {
			assertEquals('X', ticTacToeObject.turn,"X should play first ");
		}
		@Test
		public void slotNumberValidation() {
			int[] slotNumberShouldBe= {1,2,3,4,5,6,7,8,9};
			int actual=ticTacToeObject.validatingSlotAsNumber();
			assertEquals(true,Arrays.stream(slotNumberShouldBe).anyMatch(x -> x ==actual ));
		}
		
}
