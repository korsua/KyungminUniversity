package org.example.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNet {
    ServerSocket svSoc = null;
    Socket soc = null;
    PrintWriter writer = null;
    BufferedReader reader = null;
    String lineStr;

    public ServerNet() {
        try {
            //Sever Socket 생성
            svSoc = new ServerSocket(5505);

            while (true) {
                soc = svSoc.accept();
                System.out.println("Client 에서 요청 접수");

                writer = new PrintWriter(soc.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));

                while ((lineStr = reader.readLine()) != null) {
                    writer.write(lineStr);
                    System.out.println("입력 값" + lineStr);
                }

                writer.close();
                reader.close();
                soc.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new ServerNet();
    }

}
