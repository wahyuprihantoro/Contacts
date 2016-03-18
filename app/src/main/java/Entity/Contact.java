package Entity;

/**
 * Created by Wahyu Prihantoro on 18-Mar-16.
 */
public class Contact {
    private String name;
    private String address;
    private String phoneNumber;
    private long id;

    /**
     * constructor Contact
     */
    public Contact(String name, String address, String phoneNumber, long id) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
