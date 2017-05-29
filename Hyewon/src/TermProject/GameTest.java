package TermProject;

public class GameTest {
	public static void main(String[] args){
		MemorizationGame game = new MemorizationGame();
		
		System.out.println("게임을 시작합니다!");
		
		while(true){
			game.level();
			System.out.printf("LEVEL %d\n", game.printLevel());
			game.gameStart();
			game.printVal();
			if(!game.answer()){
				break;
			}
		}
		
		
		
	}
}
