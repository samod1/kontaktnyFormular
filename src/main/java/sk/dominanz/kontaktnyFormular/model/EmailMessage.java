package sk.dominanz.kontaktnyFormular.model;

public class EmailMessage {

    private String name;
    private String email;
    private String phone;
    private String message;
    private String subject;

    public EmailMessage() {
    }

    public EmailMessage(String name,String email, String phone, String message, String subject) {
        this.name = name;
        this.phone = phone;
        this.message = message;
        this.subject = subject;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
