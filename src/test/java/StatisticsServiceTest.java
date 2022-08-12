import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;
import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-10,0,-3,-1};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}