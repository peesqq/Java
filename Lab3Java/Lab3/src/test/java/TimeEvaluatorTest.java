import com.Gnidskiy.TimeEvaluator;
import org.junit.jupiter.api.Test;

public class TimeEvaluatorTest {
    @Test
    public void TestCountAll() {
        double[] addResults = TimeEvaluator.countAdd();
        double[] removeResults = TimeEvaluator.countRemove();
        double[] getResults = TimeEvaluator.countGet();

        System.out.println("        |  Array List | Linked List |");
        System.out.println("--------+-------------+-------------+");
        System.out.println("   Add  |    " + addResults[0] + "s  |    " + addResults[1] + "s  |");
        System.out.println("--------+-------------+-------------+");
        System.out.println(" Remove |    " + removeResults[0] + "s  |    " + removeResults[1] + "s  |");
        System.out.println("--------+-------------+-------------+");
        System.out.println("  Get   |    " + getResults[0] + "s  |    " + getResults[1] + "s  |");
        System.out.println("--------+-------------+-------------+");
    }
}
