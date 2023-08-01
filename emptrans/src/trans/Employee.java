package trans;

interface EmployeeInterface {
    int getId();
    void setId(int id);
    String getName();
    void setName(String name);
    String getContactNumber();
    void setContactNumber(String contactNumber);
    String getEmail();
    void setEmail(String email);
}

public class Employee implements EmployeeInterface {
    private int id;
    private String name;
    private String contactNumber;
    private String email;

   

    public Employee() {
    }

    public Employee(int id, String name, String contactNumber, String email) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }

  
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
