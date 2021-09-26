import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class RunTest {
    @Test
    public void testSuite() {
        Selenide.open("https://dodopizza.ru/");
//        Configuration.holdBrowserOpen = true; //для того, чтоб не закрывать браузер после прогона
        $(By.xpath("//*[contains(@placeholder, 'Поиск...')]")).click();
        $(By.xpath("//*[contains(@placeholder, 'Поиск...')]")).setValue("Омск");
        $(By.xpath(".//a[text()='Омск']")).click();
        $(By.xpath("//*[contains(text(), 'Чизбургер-пицца')]")).scrollIntoView("{block: 'center'}");
        $(By.xpath("//div[text()='Чизбургер-пицца']/ancestor::article/*/button[contains(text(), 'Выбрать')]")).shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Чизбургер-пицца']/ancestor::article/*/button[contains(text(), 'Выбрать')]")).click();
        $(By.xpath("//button[contains(text(), 'Добавить в корзину за ')]")).click();
        $(By.xpath("//button[contains(text(), 'Корзина')]")).click();
        $(By.xpath("//h3[text()='Чизбургер-пицца']")).shouldBe(Condition.visible);
//        $(By.xpath("//button[contains(text(), 'Оформить заказ')]")).scrollIntoView("{block: 'center'}");
//        $(By.xpath("//button[contains(text(), 'Оформить заказ')]")).click();




    }
}
