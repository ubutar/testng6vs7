import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test7_9 {

    private AtomicInteger integer = new AtomicInteger(0);

    @Test(dataProvider = "generator", retryAnalyzer = RetryListener.class)
    public void testableTest(Integer unique) {
        System.out.println("Test Input: "+unique);
        assert false;
    }

    @DataProvider
    public Object[][] generator() {
        System.out.println("DataProvider: "+integer.incrementAndGet());
        return new Object[][] {{integer.get()}};
    }
}
