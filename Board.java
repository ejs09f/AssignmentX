
public class Board {

	// Constructor creates a new Board 
	// 0 | 0 | 0
	// 0 | 0 | 0
	// 0 | 0 | 0
	
	public Board( )
	{
		
		board = new int [3][3];
		boardTokens = new String[3][3];
		
		for (int i = 0; i < 3; ++i) {
			
			for (int j = 0; j < 3; ++j) {
				
				board[i][j] = 0;
			}
		}
		
		// Constructs a parallel two-dimensional array of Null Strings
		for (int i = 0; i < 3; ++i) {
			
			for (int j = 0; j < 3; ++j) {
				
				boardTokens[i][j] = "";
			}
		}
	}
			
	
	public void printBoard() {
		
		final String divider = "------------";
		
		System.out.printf("%s", "Slot Machine:\n");
		System.out.println();
		System.out.printf("  %d | %d | %d\n",
				this.board[0][0],this.board[0][1],this.board[0][2] );
		System.out.printf("%s\n", divider);
		System.out.printf("  %d | %d | %d\n",
				this.board[1][0],this.board[1][1],this.board[1][2]);
		System.out.printf("%s\n", divider);
		System.out.printf("  %d | %d | %d\n\n",
				this.board[2][0],this.board[2][1],this.board[2][2]);	
	}
	public void printBoardWithTokens() {
		
		final String divider = "------------";
		final String divider2 = "-------------------------------------------------";
		
		System.out.printf("%s", "Slot Machine:\n");
		System.out.println();
		System.out.printf("  %d | %d | %d\t\t\t  %10s | %10s | %10s\n",
				this.board[0][0],this.board[0][1],this.board[0][2], 
				this.boardTokens[0][0],this.boardTokens[0][1],this.boardTokens[0][2] );
		
		System.out.printf("%s\t\t\t%s\n", divider, divider2);
		System.out.printf("  %d | %d | %d\t\t\t  %10s | %10s | %10s\n",
				this.board[1][0],this.board[1][1],this.board[1][2],
				this.boardTokens[1][0],this.boardTokens[1][1],this.boardTokens[1][2]);
		
		System.out.printf("%s\t\t\t%s\n", divider, divider2);
		System.out.printf("  %d | %d | %d\t\t\t  %10s | %10s | %10s\n\n",
				this.board[2][0],this.board[2][1],this.board[2][2],
				this.boardTokens[2][0],this.boardTokens[2][1],this.boardTokens[2][2]);	
	}
	
public int board[][];
public String boardTokens[][];

//private int boardPositions[][];	
	
}
