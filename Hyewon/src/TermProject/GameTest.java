package TermProject;

public class GameTest {
	public static void main(String[] args){
		MemorizationGame game = new MemorizationGame();
		
		System.out.println("������ �����մϴ�!");
		
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
