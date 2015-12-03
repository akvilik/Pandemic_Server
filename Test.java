import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Client
{
	public static final int PORT = 9000;
	public static void main(String[] args) throws UnknownHostException, IOException {
		String name = args[0];
		Socket socket = new Socket("localhost", PORT);
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));
		while(true){
			String readerInput = bufferedReader.readLine();
			printWriter.println(name +": "+readerInput);
		}
	}
}