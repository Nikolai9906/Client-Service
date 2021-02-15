package edu.escuelaing.arep.url;
import java.net.*;

public class URLParser {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.google.com:8080/clientService.txt?value=1&valuer=7#content");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Host: " + url.getHost());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("File: " + url.getFile());
        System.out.println("Ref: " + url.getRef());
        System.out.println("Port: " + url.getPort());


    }
}
