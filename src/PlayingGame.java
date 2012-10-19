import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/**
 * @author ejay
 *
 */
public class PlayingGame {

	private static List<Integer> n1List = new ArrayList<Integer>();
	private static List<Integer> n2List = new ArrayList<Integer>();
	private static int n1, n2;
	private static List<String> winners = new ArrayList<String>();
	private static Random randomGen = new Random();
	
	public static void main(String args[]) throws IOException {

		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();
		for(int i = 0; i < cases; i++) {
			n1List.add(s.nextInt());
			n2List.add(s.nextInt());			
		}
		s.close();
		int turnCount;
		
		for(int i = 0; i < cases; i++) {
			n1 = n1List.get(i);
			n2 = n2List.get(i);
			turnCount = 0;
			turn(turnCount);			
		}
		
		for(String winner : winners) {
			System.out.println(winner);			
		}
	}
	
	
	
	public static void turn(int turnCount) {
		if(n1 == 1 && n2 == 1) {
			if(turnCount % 2 == 0) {
				winners.add("Bob");
			}
			else winners.add("Alice");
		}
		else {
			int s = removeStack(n1, n2);
			splitStack(s);
			turnCount++;
			turn(turnCount);
		}
		turnCount++;
	}
	
	public static int removeStack(int n1, int n2) {
		if(n1 == 1) return n2;
		else if (n2 == 1) return n1;
		else {
			if(n1 > n2) {
				return n1;
			}
			else return n2;
		}
	}
	
	public static void splitStack(int n) {
		n1 = n / 2;
		n2 = n - n1;
		if( n == 4) {
			n1 = 3;
			n2 = 1;
		}
		if(n == 5){
			n1 = 4;
			n2 = 1;
		}
	}
	
}
