import java.sql.SQLException;
import java.util.List;

public interface UserRepo {
    boolean save(User user);
    List<User>findAll() throws SQLException;

    User findById(String id) throws SQLException;
}