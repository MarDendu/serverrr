package lesson4.University;
import java.io.*;
import java.net.Socket;

class Client {
    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("localhost", 8008);
        BufferedReader in =
        new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out =
        new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        String s = in.readLine();
        System.out.println(s);
        s = "1111";
        out.write(s+"\n");
        out.flush();
    }
}