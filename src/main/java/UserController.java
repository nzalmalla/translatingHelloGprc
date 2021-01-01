import java.sql.SQLException;

public class UserController<ResponseEntity> {
    private final HelloService helloService;
    private Object HttpStatus;


    public UserController(HelloService userService) {
        this.helloService= userService;
    }



    public User getById( String id) throws SQLException {
        return helloService.findById(id);
    }

    public ResponseEntity<User> save( User user) {

        Either<String, User> save = helloService.save(user);
        if (save.isLeft()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        else return ResponseEntity.ok(user);
    }

}
