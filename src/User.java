public class User {
    private String name;
    private College college = new College();
    private String email;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    College getCollege() {
        return this.college;
    }
    
    String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }
}
