import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPayment2 {

    Payment payment;

    @Before
    public void setUp() {
        System.out.println("----------START!----------");
        System.out.println("----------Second JUnit4 Set----------");
        payment = new Payment(50);
    }

    @Test
    public void testPayEnel() {
        assertEquals( 25, payment.payTax(), 0.5);
    }

    @After
    public void tearDown() {
        System.out.println("----------STOP!----------");
    }

}