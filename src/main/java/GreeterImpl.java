import com.google.common.collect.Lists;
import com.google.protobuf.Timestamp;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import io.grpc.stub.StreamObserver;
import io.quarkus.example.GreeterGrpc;
import io.quarkus.example.HelloReply;
import io.quarkus.example.HelloRequest;

import java.sql.Connection;
import java.sql.*;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static org.graalvm.compiler.options.OptionType.User;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {


    private static final Logger logger = LoggerFactory.getLogger(GreeterImpl.class);

    public static Connection getConnection() {
        return getConnection();
    }


    public boolean save(User user) {
        String sql = "insert into User" + "(Id,Name,Passwordd)" + "values(?,?,?)";
        try (Connection connection = GreeterImpl.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(4, user.getPassword());
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            logger.error("Error saving user data");
        }
        return false;
    }

    public List<User> findAll() throws SQLException {
        String sql = "SELECT (id, name, password) FROM user";
        List<User> results = Lists.newArrayList();
        try (Connection connection = GreeterImpl.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                results.add(new User(id, name, password));
            }
        } catch (SQLException e) {
            logger.error("Error getting user data.");
            throw e;
        }
        return results;
    }


    public User findById(String id) throws SQLException {
        String sql = "SELECT (id, name, password) FROM user";
        try (Connection connection = GreeterImpl.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = getResultSet(statement, id)) {
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                return new User(id, name, password);
            }
        } catch (SQLException e) {
            logger.error("Error getting user data.");
            throw e;
        }
        return null;
    }

    private ResultSet getResultSet(PreparedStatement statement, String... args) throws SQLException {
        for (int i = 0; i < args.length; i++) {
            statement.setString(i + 1, args[i]);
        }
        return statement.executeQuery();


    }

/*
    private static Set<StreamObserver<helloworld.UserAccountResponse>> observers= ConcurrentHashMap.newKeySet();
    public StreamObserver<helloworld.UserAccountRequest> helloworld(StreamObserver<helloworld.UserAccountResponse> responseStreamObserver) {
        observers.add(responseObserver);

        return new StreamObserver<helloworld.UserAccountRequest>() {;

            @Override
            public void onNext(helloworld.UserAccountRequest value) {
                System.out.println(value);
                helloworld.UserAccountResponse message = helloworld.UserAccountResponse.newBuilder()
                        .setMessage(value)
                        .setTimestamp(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000))
                        .build();

                for (StreamObserver<helloworld.UserAccountResponse> observer : observers) {
                    observer.onNext(message);
                }
            }}
    }
*/


    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getText()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}