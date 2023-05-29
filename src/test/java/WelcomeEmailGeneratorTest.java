import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WelcomeEmailGeneratorTest {
    @Test
    void shouldGenerateSubject() {
        WelcomeEmailGenerator emailGenerator = new WelcomeEmailGenerator("Thales");

        assertEquals("Welcome Thales!", emailGenerator.generateSubject());
    }

    @Test
    void shouldGenerateEmailBody() {
        WelcomeEmailGenerator emailGenerator = new WelcomeEmailGenerator("Thales");

        String expectedResult = "Dear Thales,\n" +
                "Welcome to our community! We are thrilled to have you on board." +
                "Feel free to explore our website, join discussions, connect with like-minded individuals, " +
                "and make the most out of your membership.";

        assertEquals(expectedResult, emailGenerator.generateBody());
    }

    @Test
    void shouldGenerateEmail() {
        WelcomeEmailGenerator emailGenerator = new WelcomeEmailGenerator("Thales");

        String expectedResult = "Subject: Welcome Thales!\n" +
                "Body: Dear Thales,\n" +
                "Welcome to our community! We are thrilled to have you on board." +
                "Feel free to explore our website, join discussions, connect with like-minded individuals, " +
                "and make the most out of your membership.";

        assertEquals(expectedResult, emailGenerator.sendEmail());
    }
}
