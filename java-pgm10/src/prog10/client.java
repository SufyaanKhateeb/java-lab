package prog10;

import java.io.DataOutputStream;
import java.net.Socket;

public class client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream d = new DataOutputStream(s.getOutputStream());
			d.writeUTF("Hello world");
			d.flush();
			d.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
