package routes;

import com.sun.net.httpserver.HttpServer;
import handlers.UsersHandler;
import handlers.OrdersHandler;

public class Router {

    public static void registerRoutes(HttpServer server) {

        server.createContext("/users", new UsersHandler());

        server.createContext("/orders", new OrdersHandler());
    }
}