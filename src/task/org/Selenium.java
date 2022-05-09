package task.org;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kinslin\\eclipse-workspace\\Task\\src\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.get("https://www.clinique.in/");
		
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		driver.findElement(By.xpath("(//div[@title='Hide'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/products/1575/best-sellers']")).click();
		
		Thread.sleep(1000);
        List<WebElement> products = driver.findElements(By.xpath("//h1[@data-test-id='product_name']"));
        System.out.println("List of Product:"+products.size());
        
        for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getText());
		}
        Set<WebElement> s=new LinkedHashSet<>();
        s.addAll(products);
        System.out.println("Set of Product:"+s.size());
        

		}}


