package in.ss.design.patterns.chainofresponsibility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ATMDispenseTest {

    @Test
    public void dispenseMoney() {
        ATMMoneyDispenser atmMoneyDispenser = new ATMMoneyDispenser();
        atmMoneyDispenser.runDispenser(new Currency(500));
    }

}
