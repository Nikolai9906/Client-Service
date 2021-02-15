package edu.escuelaing.arep.url;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLReader {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        String address;
        String line = "";
        // Enter username and press Enter
        System.out.println("Enter URL");
        address = myObj.nextLine();
        URL url = new URL (address);
        BufferedReader reader = (new BufferedReader(new InputStreamReader(url.openStream()))); {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                line = line.concat(inputLine) ;
                //System.out.println(inputLine);
            }
            //System.out.println("-----------------------------------------------------");
            //System.out.println(line);
            writeUsingFileWriter(line);

        }
        //System.out.println(line);
    }
    private static void writeUsingFileWriter(String data) {
        File file = new File("C:\\Users\\Nikolai Bermudez V\\Desktop\\Nico nico ni\\SISTEMAS\\9 Semestre\\AREP\\ClientService\\ejemplo.html");
        file.delete();
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
