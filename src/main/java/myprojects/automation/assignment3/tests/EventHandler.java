package myprojects.automation.assignment3.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener
{
    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver)
    {
        System.out.println("Before navigate to: " + s);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver)
    {
        System.out.println("Navigated to: " + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver)
    {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver)
    {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver)
    {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver)
    {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver)
    {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver)
    {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver)
    {
        System.out.println("Looking for element: " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver)
    {
        System.out.println("Found element: " + by);
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver)
    {
        System.out.println("Before click to the element: " + webElement);
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver)
    {
        System.out.println("Clicked element: " + webElement);
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences)
    {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences)
    {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver)
    {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver)
    {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver)
    {

    }
}
