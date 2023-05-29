public abstract class EmailGenerator {

    public String getRecipientName() {
        return "Visitor";
    }

    public abstract String generateSubject();

    public abstract String generateBody();

    public String sendEmail() {
        return "Subject: " + generateSubject() + "\n" +
            "Body: " + generateBody();
    }
}
