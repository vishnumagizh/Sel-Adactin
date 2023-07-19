import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GreenKart extends Basefunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		browserlauncher("chrome");
		gourl("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("(//a[@href='#'])[5]")).click();
		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Cart'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[text()='PROCEED TO CHECKOUT'])[1]")).click();
		
		implicitwait(10);
		
		driver.findElement(By.xpath("(//button[text()='Place Order'])[1]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		click(findElement);
		Select sc = new Select(findElement);
		sc.selectByValue("India");
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}

}
