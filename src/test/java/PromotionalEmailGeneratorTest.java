import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromotionalEmailGeneratorTest {
    @Test
    void shouldGeneratePromotionalEmailSubject() {
        PromotionalEmailGenerator emailGenerator = new PromotionalEmailGenerator(10.0);

        assertEquals("Exclusive Offer Inside! Don't Miss Out!", emailGenerator.generateSubject());
    }

    @Test
    void shouldGeneratePromotionalEmailEmailBody() {
        PromotionalEmailGenerator emailGenerator = new PromotionalEmailGenerator(10.0);

        String expectedResult = "Dear Visitor,\n" +
                "We hope this email finds you well. " +
                "We're excited to bring you an exclusive promotional offer that you won't want to miss!\n" +
                "For a limited time only, we're offering 10,00% off on some of our products/services.";

        assertEquals(expectedResult, emailGenerator.generateBody());
    }

    @Test
    void shouldGeneratePromotionalEmailEmail() {
        PromotionalEmailGenerator emailGenerator = new PromotionalEmailGenerator(10.0);

        String expectedResult = "Subject: Exclusive Offer Inside! Don't Miss Out!\n" +
                "Body: Dear Visitor,\nWe hope this email finds you well. " +
                "We're excited to bring you an exclusive promotional offer that you won't want to miss!\n" +
                "For a limited time only, we're offering 10,00% off on some of our products/services.";

        assertEquals(expectedResult, emailGenerator.sendEmail());
    }
}
