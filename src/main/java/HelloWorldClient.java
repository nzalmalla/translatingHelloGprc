import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.quarkus.example.GreeterGrpc;
import io.quarkus.example.HelloReply;
import io.quarkus.example.HelloRequest;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
public class HelloWorldClient {

    public void greet(String text) {
        Logger logger = Logger.getLogger("HelloWorldClient");
        logger.info("Will try to greet " + text + " ...");
        HelloRequest request = HelloRequest.newBuilder().setText(text).build();

        HelloReply response;
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
            GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);
            response = blockingStub.sayHello(request);
            System.out.println(response.getMessage());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
    }}

    */

public class HelloWorldClient {

    public static void main(String[] args){


        Scanner myObj =new Scanner(System.in);
        System.out.println("Say hi in any language");
        String text = myObj.nextLine();

        HelloReply response;
        HelloRequest request = HelloRequest.newBuilder().setText(text).build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        GreeterGrpc.GreeterBlockingStub blockingStub=  GreeterGrpc.newBlockingStub(channel);
        response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());



    }
}