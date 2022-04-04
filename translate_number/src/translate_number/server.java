package translate_number;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		try {
			ServerSocket svSocket = new ServerSocket(8888);
			System.out.println("Server is connecting ...");
			Socket socket = svSocket.accept();
			System.out.println("Server connected");
			DataInputStream input = new DataInputStream(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			while (true) {
				double a = input.readDouble();
				double b = input.readDouble();
				System.out.println("Number A: "+a);
				System.out.println("Number B: "+b);
				
				double tong = a + b;
				output.writeDouble(tong);
				output.flush();
				double hieu = a - b;
				output.writeDouble(hieu);
				output.flush();
				double tich = a * b;
				output.writeDouble(tich);
				output.flush();
				double thuong = a / b;
				output.writeDouble(thuong);
				output.flush();
			}
		} catch (Exception e) {
     	}
     }
}
