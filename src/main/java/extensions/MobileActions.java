package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class MobileActions extends CommonOps {

    @Step("Update Text in Element")
    public static void updateText(MobileElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Clear Text in Element")
    public static void clearText(MobileElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
    }

    @Step("Tap on Element")
    public static void tap(int fingers, MobileElement elem, int duration){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
//        mobileDriver.tap(fingers,elem,duration); // Line needs to be remarked while testing Desktop Apps
    }

    @Step("Swipe")
    public static void swipe(int startX, int startY, int endX, int endY, int duration){
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
//        mobileDriver.swipe(startX, startY, endX, endY, duration); // Line needs to be remarked while testing Desktop Apps
    }

    @Step("Zoom Element")
    public static void zoom(MobileElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
//        mobileDriver.zoom(elem); // Line needs to be remarked while testing Desktop Apps
    }

    @Step("Pinch Element")
    public static void pinch(MobileElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
//        mobileDriver.pinch(elem); // Line needs to be remarked while testing Desktop Apps
    }

    @Step("Execute Script")
    public static void executeScript(String script){
        mobileDriver.executeScript(script);
    }
}
