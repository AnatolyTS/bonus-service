import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateWhenTrueInLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expect = 30;

        long actual = service.calculate(amount, registered);


        assertEquals(expect, actual);

    }

    @Test
    void calculateWhenTruOnLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000_000;
        boolean registered = true;
        long expect = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expect, actual);

    }


    @Test
    void calculateWhenFalseInLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expect = 10;

        long actual = service.calculate(amount, registered);


        assertEquals(expect, actual);
    }

    @Test
    void calculateWhenFalseOnLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_000;
        boolean registered = false;
        long expect = 500;

        long actual = service.calculate(amount, registered);


        assertEquals(expect, actual);
    }
}