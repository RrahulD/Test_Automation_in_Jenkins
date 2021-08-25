import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 

public class Assignment2App {
public WebDriver driver;
 @BeforeClass
 public void chromedriver(){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
	  driver =new ChromeDriver();
 }
 @Test(priority=1)
 public void Google() throws Exception{  
	 driver.get("http://www.google.com.");
 }
 @Test(priority=2)
  public void getDishtitle() {
	 driver.findElement(By.name("q")).sendKeys("careers.dish.com");
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	 String gd= driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]")).getText();
	 System.out.println(gd); 
 }
 @Test (priority=0)
 public void checking1()
 {
	 System.out.println("configured!!"); }
@AfterClass
public void close() throws InterruptedException{
driver.close();
System.out.println("Done!!");
}
}
