package TermProject;
import java.util.*;


public class MemorizationGame {
	Scanner input = new Scanner (System.in);
	private int count;
	private int val[];
	private int level=1;
	
	public int getCount(){
		return count;
	}
	public void setCount(int n){
		count = n;
	}
	
	public void gameStart(){
		Random random = new Random();
		count = count + 1 ;
		val = new int [count];
		for(int i=0; i<count; i++) {
			int scan = random.nextInt(10);
			val[i] = scan;
		}
	}
	
	public void printVal(){
		System.out.println();
		for(int i=0; i<val.length; i++){
			System.out.printf("%d ",val[i]);
		}
	}
	
	public boolean answer(){
		System.out.println("\n");
		System.out.print("답을 입력하세요: ");
		int n=0;
		for(int i=0; i<val.length; i++){
			int answer = input.nextInt();
			if(answer == val[i]){
				n ++;
			}
		}
		if(n == val.length){
			System.out.println("맞았습니다");
			return true;
		}
		else{
			System.out.println("틀렸습니다");
			return false;
		}
		
	}
	
	public void level () {
		if( count < 3){
			level = 1;
		}else if( 3<= count && count < 6){
			level = 2;
		}else if( 6 <= count && count < 9){
			level = 3;
		} else if( 9 <= count && count < 15 ){
			level = 4;
		} else {
			level = 5;
		}
	}
	
	public int printLevel(){
		return level;
	}
	
}


