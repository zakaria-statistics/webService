import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        //connecteur http pour le web service
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:9191/");
    }
}
