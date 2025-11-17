package GoogleTest;
import Base.BaseClass;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

    @Test
    public void openGoogle() {
        getDriver().get("https://www.google.com");
        System.out.println("Title: " + getDriver().getTitle());
    }
}
