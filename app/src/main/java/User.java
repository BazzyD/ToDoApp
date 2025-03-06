public class User {
    public String id, username, email, password, role;

    // Empty constructor required for Firebase
    public User() {}

    public User(String id, String username, String email, String password, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
