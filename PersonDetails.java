public class PersonDetails {

    // Attributes
    String name;
    String title;
    String telNum;
    String email;
    String address;

    // Constructor
    public PersonDetails(String name, String title, String telNum, String email, String address)
    {
        this.name = name;
        this.title = title;
        this.telNum = telNum;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method for printing out person details
    public String printPersonInfo() {
        String output = "\nContractor: " + name;
        output += "\nTitle: " +title;
        output += "\nTel Num: " +telNum;
        output += "\nEmail: " + email;
        output += "\nAddress: " + address;
        return output;
    }
}
