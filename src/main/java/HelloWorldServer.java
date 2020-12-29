import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloWorldServer {
    public static void main(String args[]) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9091).addService(new HelloService()).build();

        server.start();

        System.out.println("The server started on " + server.getPort());

        server.awaitTermination();
    }
}
