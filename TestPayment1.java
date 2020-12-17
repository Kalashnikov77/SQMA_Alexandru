import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPayment1 {

    Payment payment;

    @Before
    public void setUp() {
        System.out.println("----------START!----------");
        System.out.println("----------First JUnit4 Set----------");
        payment = new Payment(40);
    }

    @Test
    public void testPayEnel() {
        assertEquals(20, payment.payEnel());
    }

    @After
    public void tearDown() {
        System.out.println("----------STOP!----------");
    }

}