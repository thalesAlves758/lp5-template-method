public class WelcomeEmailGenerator extends EmailGenerator {
    private String recipientName;

    public WelcomeEmailGenerator(String recipientName) {
        this.recipientName = recipientName;
    }

    @Override
    public String getRecipientName() {
        return recipientName;
    }

    @Override
    public String generateSubject() {
        return "Welcome " + recipientName + "!";
    }

    @Override
    public String generateBody() {
        return "Dear " + getRecipientName() + ",\n" +
                "Welcome to our community! We are thrilled to have you on board." +
                "Feel free to explore our website, join discussions, connect with like-minded individuals, " +
                "and make the most out of your membership.";
    }
}
