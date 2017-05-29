package TermProject;

public class GameTest {
	public static void main(String[] args){
		MemorizationGame game = new MemorizationGame();
		
		System.out.println("게임을 시작합니다!");
		
		game.gameStart();
		game.printVal();
		game.answer();
		
		
	}
}
