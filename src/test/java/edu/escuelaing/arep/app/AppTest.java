package edu.escuelaing.arep.app;

import edu.escuelaing.arep.server.Request;
import edu.escuelaing.arep.server.SocketServer;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static edu.escuelaing.arep.server.SocketServer.getStatic;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{


        /**
         * Prueba que se retorne la informacion de los archivos
         */
        @org.junit.Test
        public void shouldDoGetFiles() {
            Request req = new Request();
            req.setPath("/files");
            getStatic("/files", (request) -> {
                return "returnfiles";
            });
            String data = SocketServer.getSolicitudesTest().get(req.getPath()).apply(req);
            assertEquals(data, "returnfiles");
        }

        /**
         * Prueba que se retorne la informacion del html
         */
        @org.junit.Test
        public void shouldDoGetHtmls() {
            Request req = new Request();
            req.setPath("/html");
            getStatic("/html", (request) -> {
                return "index.html";
            });
            String data = SocketServer.getSolicitudesTest().get(req.getPath()).apply(req);
            assertEquals(data, "index.html");
        }

        /**
         * Prueba que se retorne la informacion del css
         */
        @Test
        public void shouldDoGetCss() {
            Request req = new Request();
            req.setPath("/css");
            getStatic("/css", (request) -> {
                return "style.css";
            });
            String data = SocketServer.getSolicitudesTest().get(req.getPath()).apply(req);
            assertEquals(data, "style.css");
        }
}