
public class Logistics {
	public static void checkWin(int row, int col)
	{
		//hor check- loop through row and check if matches input symbol 4+ consecutive times
		int horCount = 0;
		for(int i = 0; i <= 8; i++)
		{
			//System.out.println(row + " " + col);
			if(GridTracker.grid[row][i] == GridTracker.grid[row][col])
				horCount ++;
			else
				horCount = 0;
			
			if(horCount >= 5)
			{
				GUI.endFrame.setVisible(true);//set game over message
				System.out.println("Game over, hor win");
				
			}
				
		}
		
		//vert check- loop through col and check if matches input symbol 4+ consecutive times
		int vertCount = 0;
		for(int j = 0; j <= 8; j++)
		{
			if(GridTracker.grid[j][col] == GridTracker.grid[row][col])
				vertCount ++;
			else
				vertCount = 0;
			
			if(vertCount >= 5)
				System.out.println("Game over."); //dsiplay game over message
		}
		
		//diag l -> h check
		int diagHLCount = 0; 
		int startRow = row;
		int startCol = col;
		//find the starting diag
		for(int k = 0; k <= 8; k++)
		{
			if(startRow == 0 || startCol == 0)
			{
				k = 8;
			}
			else
			{
				startRow --;
				startCol --;
			}
		}
		//System.out.println("Row: " + startRow + " Col: " + startCol);
		//loop through l -> h diag and check if input symbol matches 4+ times
		int start;
		if(startRow > startCol)
			start = startRow;
		else
			start = startCol;
		for(int l = start; l <= 8; l++)
		{
			if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
				diagHLCount ++;
			else
				diagHLCount = 0;
			if(diagHLCount >= 5)
				System.out.println("Game over"); //display game over message
			startRow++;
			startCol++;
		}
		
		
		
		
		//diag h -> l check
		startRow = row;
		startCol = col;
		int diagLHCount = 0;
		//find starting row and col values
		if(!((startRow >= 6 && startCol >= 6) || (startRow < 2 && startCol < 2)))
		{
			System.out.println("found values");
			for(int m = 0; m <= 8; m++)
			{
				if(startRow == 0)
				{
					m = 8;
				}
				else if(startCol == 8 || startRow == 8)
				{
					m = 8;
				}
				else
				{
					startRow --;
					startCol ++;
				}
			}
			
			//set limits so that it can't get out of bounds rows or cols
			System.out.println("Row: " + startRow + " Col: " + startCol);
			if(startRow == 8)
			{
				start = startCol;
				for(int n = start; n < 9; n++)
				{
					System.out.println(startRow + " " + startCol);
					if(startRow < 0 || startCol < 0)
					{
						n = 18;
					}
					else
					{
					if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
						diagHLCount ++;
					else
						diagHLCount = 0;
					if(diagHLCount >= 5)
						System.out.println("Game over"); //display game over message
					startRow--;
					startCol++;
					}
				}
			}
			else
			{
				System.out.println("inside else condition");
				if(startRow > startCol)
					start = startRow;
				else
					start = startRow;
				if(startCol == 8)
				{
					start = startRow;
				}
				System.out.println("Start value: " + start);
				for(int n = start; n < 9; n++)
				{
					System.out.println(startRow + " " + startCol);
					if(startRow < 0 || startCol < 0)
					{
						n = 18;
						System.out.println("Stopped loop");
					}
					else
					{
					if(GridTracker.grid[row][col] == GridTracker.grid[startRow][startCol])
						diagHLCount ++;
					else
						diagHLCount = 0;
					if(diagHLCount >= 5)
						System.out.println("Game over"); //display game over message
					startRow++;
					startCol--;
					}
				}
			}
			
		}
		
		
	}
}
