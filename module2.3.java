import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;  
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
       
        Scanner sc = new Scanner(System.in);
        

        String input = sc.nextLine();
        

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes());
        

        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b)); 
        }
        

        System.out.println(sb.toString());
        

        sc.close();
    }
}
