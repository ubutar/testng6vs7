package ex;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryListener implements IRetryAnalyzer {

    @Override
    public boolean retry(ITestResult iTestResult) {
        return iTestResult.getMethod().getCurrentInvocationCount() < 3;
    }
}
