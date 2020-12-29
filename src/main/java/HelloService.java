import io.grpc.stub.StreamObserver;
import io.quarkus.example.GreeterGrpc;
import io.quarkus.example.HelloReply;
import io.quarkus.example.HelloRequest;

public class HelloService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
       String text = request.getText();
       String message = text +"...... is Translated to Hello ";

       responseObserver.onNext(HelloReply.newBuilder().setMessage(message).build());
       responseObserver.onCompleted();

    }
}
