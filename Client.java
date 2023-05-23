import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            // Create input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            out.println("Hello from the client!");

            // Receive response from the server
            String serverResponse = in.readLine();
            System.out.println("Received response from server: " + serverResponse);

            // Close the connections
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
