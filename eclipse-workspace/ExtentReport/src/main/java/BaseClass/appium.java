package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium 
{
	private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    //protected AndroidDriver<AndroidElement> driver = null;
    public static AppiumDriver<MobileElement> driver;
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeTest
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "4f7ec77f");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.handzap.handzap.global");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.handzap.handzap.ui.main.splash.SplashScreenActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }
    
    
}



