package org.example.network;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {
    Scanner scan;

    public InetAdressEx() {
        System.out.println("Host 입력 !!");

        scan = new Scanner(System.in);
        try{
            InetAddress inetAdd = InetAddress.getByName(scan.next());
            System.out.println("Server 이름 : " + inetAdd.getHostName()); // 주소값
            System.out.println("Server Ip : " + inetAdd.getHostAddress()); // IP ADDRESS
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
