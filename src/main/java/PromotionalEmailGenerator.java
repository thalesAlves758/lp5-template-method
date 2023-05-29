public class PromotionalEmailGenerator extends EmailGenerator {
    private double discountPercentage;

    public PromotionalEmailGenerator(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String generateSubject() {
        return "Exclusive Offer Inside! Don't Miss Out!";
    }

    @Override
    public String generateBody() {
        return "Dear " + getRecipientName() + ",\n" +
                "We hope this email finds you well. " +
                "We're excited to bring you an exclusive promotional offer that you won't want to miss!\n" +
                "For a limited time only, we're offering " + String.format("%.2f", discountPercentage) +
                "% off on some of our products/services.";
    }
}
