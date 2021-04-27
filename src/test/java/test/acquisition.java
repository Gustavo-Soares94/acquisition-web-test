package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acquisition {
    @Test
    public void testAquisicaoCC(){

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gusta\\OneDrive\\Documentos\\drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navegando para a pagina da Sales
        driver.get("https://sicredi--tst.my.salesforce.com/");

        //Logar na Sales
        driver.findElement(By.xpath("//div[@id='idp_section_buttons']/button[@class='button mb24 secondary wide']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bianca_britto");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("teste123");
        driver.findElement(By.xpath("//button[@class='button -block -primary sc-sicredi-button sc-sicredi-button-s']")).click();

        driver.get("https://sicredi--tst.lightning.force.com/lightning/n/Novo_Atendimento");

        driver.findElement(By.xpath("//div[@id='cpf']/lightning-input[@class='slds-form-element']//input[@pattern='^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$']")).sendKeys("91856063089");

    }
}
