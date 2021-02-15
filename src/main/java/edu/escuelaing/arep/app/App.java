package edu.escuelaing.arep.app;

import edu.escuelaing.arep.services.ServicesHttp;

import static edu.escuelaing.arep.services.HttpServer.port;
import static edu.escuelaing.arep.services.HttpServer.post;
import static edu.escuelaing.arep.services.HttpServer.get;

/**
 * @author Nikolai Bermudez V
 *
 */
public class App 
{
    /**
     * Inicia el servidor
     * @param args Parametros recibidos al ejecutar
     */
    public static void main( String[] args )
    {
        ServicesHttp servicesHttp = new ServicesHttp();
        port(getPort());

        get("/tenis", (request, response) -> {
            return servicesHttp.getAnimals();
        });

        post("/addtenis", (request, response) -> {
            String body = request.getBody();
            String res = "Para poder añadir un tenis, envielo desde el formulario en la página principal";
            System.out.println("REQUEST POST ----------- \n" + body);
            if (body != null) {
                servicesHttp.addAnimal(body);
                res = "El animal con las características \n" + body + "\nHa sido añadido correctamente";
            }
            return res;
        });
    }

    /**
     * Retorna el número del puerto por el cual correrá el servicio.
     * @return El número de puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000;
    }
}
