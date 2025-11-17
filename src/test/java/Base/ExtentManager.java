	package Base;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentManager  {

	    public static ExtentReports extent;
	    public static ExtentTest test;

	    public static ExtentReports createInstance(String fileName) {
	        ExtentSparkReporter reporter = new ExtentSparkReporter(fileName);
	        reporter.config().setReportName("Automation Test Report");
	        reporter.config().setDocumentTitle("TutorialsNinja Test Report");

	        extent = new ExtentReports();
	        extent.attachReporter(reporter);

	        extent.setSystemInfo("Tester", "Your Name");
	        extent.setSystemInfo("Environment", "QA");
	        return extent;
	    }
	}



