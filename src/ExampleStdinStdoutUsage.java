import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExampleStdinStdoutUsage {
	public static void main(String args[]) throws IOException {
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		
		System.out.println("Enter text: ");
		
		String str = br.readLine();
		
		System.out.println("You entered String: ");
		
		System.out.println(str);
	}
}
