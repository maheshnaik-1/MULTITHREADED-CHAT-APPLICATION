import java.util.Scanner;
import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_IP = "127.0.0.1";  // localhost
    private static final int SERVER_PORT = 12345;
    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             // Scanner to read user input from console
             Scanner scanner = new Scanner(System.in)) {
            // Thread to read messages from server
            Thread readThread = new Thread(() -> {
                try {
                  // Connect to the server at localhost and port 12345
                    String response;
                    while ((response = in.readLine()) != null) {
                        System.out.println(response);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });
            readThread.start();
            // Send messages to server
            // Then keep reading input and sending messages
            while (true) {
                String message = scanner.nextLine();
                out.println(message);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }
            System.out.println("Disconnected from chat.");
        } catch (IOException e) {
            System.out.println("Error connecting to server: " + e.getMessage());
        }
    }
}
