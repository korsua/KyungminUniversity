package org.example.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLEx {
    public URLEx() {
        String code = null;
        System.out.println(System.getProperty("user.dir"));
        System.out.println("주소 입력 !!");
        Scanner scan = new Scanner(System.in);
        String address = scan.next();

        try{
            URL url = new URL(address);

            URLConnection conn = url.openConnection();

            BufferedReader webData = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            FileWriter fw = new FileWriter("./file2.html",false);

            char[] ch = new char[1024];
            //while((code = webData.readLine()) != null){
            //    fw.write(code);
            //}
            int size ;
            while((size = webData.read(ch,0,ch.length)) > 0){
                fw.write(ch,0,size);
            }
            System.out.println("끝");

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new URLEx();
    }
}
