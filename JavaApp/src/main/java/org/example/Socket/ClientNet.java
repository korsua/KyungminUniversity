package org.example.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientNet {
    Socket soc = null;
    PrintWriter writer = null;
    BufferedReader reader = null;

    public ClientNet(){
        try{
            soc = new Socket("localhost", 5505);
            writer = new PrintWriter(soc.getOutputStream(),true);
            reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            String str = null;
            BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));

            while ((str = cReader.readLine()) != null) {
                writer.println(str);
                System.out.println("출력된 값 " + str);
            }


            writer.close();
            reader.close();
            cReader.close();
            soc.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new ClientNet();
    }
}
