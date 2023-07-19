import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel extends Basefunctions {

	public static void main(String[] args) {
		browserlauncher("chrome");
		gourl("http://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		sendkeys("vishnuchittu",findElement);
		WebElement findElement1 = driver.findElement(By.id("password"));
		sendkeys("DMESQ3",findElement1);
		driver.findElement(By.id("login")).click();
		WebElement element = driver.findElement(By.id("location"));
		Select sc = new Select(element);
		sc.selectByVisibleText("Brisbane");
		WebElement element1 = driver.findElement(By.id("hotels"));
		Select sc1 = new Select(element1);
		sc1.selectByIndex(1);
		WebElement element2 = driver.findElement(By.id("room_nos"));
		Select sc2 = new Select(element2);
		sc2.selectByValue("5");
		WebElement element3 = driver.findElement(By.id("datepick_in"));
		element3.clear();
		sendkeys("07/03/2023",element3);
		WebElement element4 = driver.findElement(By.id("datepick_out"));
		element4.clear();
		sendkeys("09/03/2023",element4);
		WebElement findElement2 = driver.findElement(By.id("adult_room"));
		Select sc3 = new Select(findElement2);
		sc3.selectByIndex(3);
		WebElement findElement3 = driver.findElement(By.id("child_room"));
		Select sc4 = new Select(findElement3);
		sc4.selectByVisibleText("2 - Two");
		WebElement findElement4 = driver.findElement(By.id("Submit"));
		click(findElement4);
		driver.findElement(By.id("radiobutton_3")).click();
		driver.findElement(By.id("continue")).click();
		WebElement element5 = driver.findElement(By.id("first_name"));
		sendkeys("vishnu",element5);
		WebElement element6 = driver.findElement(By.id("last_name"));
		sendkeys("Priya",element6);
		WebElement element7 = driver.findElement(By.id("address"));
		sendkeys("19/a,railway colony road,round road pudur,dgl-624005",element7);
		WebElement element8 = driver.findElement(By.id("cc_num"));
		sendkeys("1234567890123456",element8);
		WebElement findElement5 = driver.findElement(By.id("cc_type"));
		Select sc5 = new Select(findElement5);
		sc5.selectByVisibleText("Master Card");
		WebElement findElement6 = driver.findElement(By.id("cc_exp_month"));
		Select sc6 = new Select(findElement6);
		sc6.selectByIndex(3);
		WebElement findElement7 = driver.findElement(By.id("cc_exp_year"));
		Select sc7 = new Select(findElement7);
		sc7.selectByValue("2018");
		WebElement element9 = driver.findElement(By.id("cc_cvv"));
		sendkeys("1234",element9);
		driver.findElement(By.id("book_now")).click();
		implicitwait(10);
		driver.findElement(By.id("logout")).click();
		
		
	}

}
