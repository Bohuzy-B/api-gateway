package server;

import com.sun.net.httpserver.HttpServer;
import routes.Router;
import java.net.InetSocketAddress;

public class Server {

    public static void start(int port) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        Router.registerRoutes(server);

        server.start();

        System.out.println("Server running on http://localhost:" + port);
    }
}