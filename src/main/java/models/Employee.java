package models;

public class Employee extends User{

    String id;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, String email, String password, String id) {
        super(firstName, lastName, email, password);
        this.id = id;
    }

    public Employee(String email, String password, String id) {
        super(email, password);
        this.id = id;
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String email, String id) {
        super(email);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "models.Employee{" +
                "id='" + id + '\'' +
                '}';
    }
}
