package selenium.winium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MiPrimerCaso {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver  driver = new WiniumDriver(new URL ("http://localhost:9999"), option);
		
		Thread.sleep(5000);
		driver.findElement(By.name("Ocho")).click();
		driver.findElement(By.name("Más")).click();
		driver.findElement(By.name("Seis")).click();
		driver.findElement(By.name("Es igual a")).click();
	
		Thread.sleep(5000);
		String resultado = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		driver.findElement(By.id("Close")).click();
		System.out.println(resultado);
		
		
	}

}
