package lesson4.University;

import java.net.ServerSocket;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class server {

    public static class servererror {
        public static void main(String[] args) throws IOException {
            ServerSocket servererror =
            new ServerSocket(8008);
            Socket clientSocket =
            servererror.accept();
            try {
                BufferedReader in =
                new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter out =
                new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                String s = "qwe";
                out.write(s+"\n");
                out.flush();
                s = in.readLine();
                System.out.println(s);
            }catch (IOException x){
                System.out.println(x);
            }
        }
    }

}
