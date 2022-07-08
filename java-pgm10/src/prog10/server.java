package prog10;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(6666);
			Socket ss = s.accept();
			DataInputStream d = new DataInputStream(ss.getInputStream());
			String x = (String) d.readUTF();
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
