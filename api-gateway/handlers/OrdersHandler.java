package handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.OutputStream;

public class OrdersHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) {
        try {
            String response = "{ \"orders\": [101, 102, 103]}";

            exchange.sendResponseHeaders(200, response.length());

            OutputStream os = exchange.getResponseBody();

            os.write(response.getBytes());

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}