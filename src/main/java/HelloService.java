import io.grpc.stub.StreamObserver;
import io.quarkus.example.GreeterGrpc;
import io.quarkus.example.HelloReply;
import io.quarkus.example.HelloRequest;
import sun.jvm.hotspot.HelloWorld;

import javax.imageio.spi.ServiceRegistry;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class HelloService extends GreeterGrpc.GreeterImplBase {


    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
       String text = request.getText();
       String message = text +"...... is Translated to Hello ";

       responseObserver.onNext(HelloReply.newBuilder().setMessage(message).build());
       responseObserver.onCompleted();

    }

    }


