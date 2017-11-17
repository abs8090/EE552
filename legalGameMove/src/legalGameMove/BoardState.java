package legalGameMove;

public class BoardState {

	public static enum boardState { AVAILABLE, TAKEN, ILLEGAL}
	
	public static boardState[][] bs = new boardState[8][8];
	
	public static void showBoardState(){
		
		for(int x = 0; x < BoardState.bs.length; x++){
			for(int y = 0; y < BoardState.bs.length; y++){
				
				System.out.println("x: " + x + " y: " + y + " " + BoardState.bs[x][y]);
			}
		}
	}
}
