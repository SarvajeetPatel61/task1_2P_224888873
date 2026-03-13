package sit707_week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium API to automate chromium browser.
 *
 * SIT707 - Task 1.2P
 * @author Student
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------
    // CASE 1: Open chrome and close
    // -------------------------------------------------------
    public static void open_chrome_and_close() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        // close chrome driver
        driver.close();
        System.out.println("Closed chrome browser.");
    }

    // -------------------------------------------------------
    // CASE 2: Open chrome, maximize and close
    // -------------------------------------------------------
    public static void open_chrome_maximize_close() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Maximize the window
        driver.manage().window().maximize();
        System.out.println("Maximized chrome browser.");

        sleep(2);

        // close chrome driver
        driver.close();
        System.out.println("Closed chrome browser.");
    }

    // -------------------------------------------------------
    // CASE 3: Open chrome, load a web page and close
    // -------------------------------------------------------
    public static void load_web_page_close() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Load a webpage
        driver.get("https://www.google.com");
        System.out.println("Loaded page: " + driver.getCurrentUrl());

        sleep(2);

        // close chrome driver
        driver.close();
        System.out.println("Closed chrome browser.");
    }

    // -------------------------------------------------------
    // CASE 4: Open chrome, load page, resize and close
    // -------------------------------------------------------
    public static void open_chrome_loadpage_resize_close() {

        // Fill your personal information.
        System.out.println("Hello from 224888873, SARVAJEET HITESHKUMAR PATEL");

        // Step 1: Locate chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        // Step 2: Use above chrome driver to open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        /*
         * Load google page.
         */
        driver.get("https://www.google.com");
        System.out.println("Loaded page: " + driver.getCurrentUrl());

        /*
         * Set window size manually to 640x480 and wait 2 seconds.
         */
        driver.manage().window().setSize(new Dimension(640, 480));
        System.out.println("Window resized to 640x480.");
        sleep(2);

        /*
         * Double window size manually to 1280x960 and wait 2 seconds.
         */
        driver.manage().window().setSize(new Dimension(1280, 960));
        System.out.println("Window resized to 1280x960.");
        sleep(2);

        // Sleep a while
        sleep(2);

        // close chrome driver
        driver.close();
        System.out.println("Closed chrome browser.");
    }
}
