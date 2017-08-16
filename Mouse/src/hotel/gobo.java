package hotel;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.OutputType.*;

public class gobo {
	
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    public static void main(String[] args) throws Exception {
    	
    	String seldate="8/16/2017";
        Date d = new Date(seldate);
        
        SimpleDateFormat dt= new  SimpleDateFormat("MMMM/dd/yyyy");
        
        String date=dt.format(d);
        System.out.println(date);
        
        String[] split= date.split("/");
        
        System.out.println(split[0]+"--"+split[1]+"--"+split[2]);
        
        String month=split[0]+" "+split[2];
        
        System.out.println("month and year----"+month);
      
    	
      ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.goibibo.com/");
        
       Thread.sleep(3000);
       
       // click on one way radio button
        driver.findElement(By.xpath(".//*[@id='gi_oneway_label']")).click();
        Thread.sleep(3000);
        
        // clicking on start date
        driver.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/input")).click();
        Thread.sleep(3000);
        
      /*  while(true)
        {

        try{

        	
        	//driver.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/div/div,'"+month+"'")).isDisplayed();
        
        
        }
        			
       catch(Exception e)
       {
    	 System.out.println(e); 
       }
        }*/
       // driver.findElement(By.xpath("//div[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/input[1]")).click();
       // driver.findElement(By.id("fare_20170914")).click();
        
        
        driver.quit();

    }}

    
