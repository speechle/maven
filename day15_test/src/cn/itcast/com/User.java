package cn.itcast.com;

public class User {
    private int id;
    private String username;
    private String passwold;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswold() {
        return passwold;
    }

    public void setPasswold(String passwold) {
        this.passwold = passwold;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwold='" + passwold + '\'' +
                '}';
    }
}
