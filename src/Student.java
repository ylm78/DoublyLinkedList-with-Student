public class Student {

    private String name;
    private int id;
    private String email;

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Student{ name : " + this.getName() + "/id : " + this.getId() + "/email : " + this.getEmail() + "}";
    }
}
