package TermProject;
import java.util.*;


public class MemorizationGame {
	Scanner input = new Scanner (System.in);
	private int count;
	private int val[];
	
	public int getCount(){
		return count;
	}
	public void setCount(int n){
		count = n;
	}
	
	public void gameStart(){
		Random random = new Random();
		setCount( count + 1 );
		val = new int [count];
		for(int i=0; i<getCount(); i++) {
			int scan = random.nextInt(10);
			val[i] = scan;
		}
	}
	
	public void printVal(){
		System.out.println();
		for(int i=0; i<val.length; i++){
			System.out.print(val[i]);
		}
	}
	
	public void answer(){
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
		}
		else{
			System.out.println("틀렸습니다");
		}
		
	}
	
	public int level () {
		if( 2<= count && count < 6){
			return 2;
		} else if( 6 <= count && count < 12){
			return 3;
		} else if( 12<= count && count <20 ){
			return 4;
		} else {
			return 5;
		}
	}
	/*
	public void Answer(int n){
		
	}
	public void checkedAnswer(){
		
	}
	
*/	
}


