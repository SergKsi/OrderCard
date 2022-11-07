
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderCardTest {

    @Test
    void orderCardTest() {
        open("http://localhost:9999");
        $("[data-test-id=\"name\"] input").sendKeys("Сергей");
        $("[data-test-id=\"phone\"] input").sendKeys("+79103258888");
        $("[data-test-id=\"agreement\"] span").click();
        $("button").click();

        $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
 @Test
    void orderCardTestAllDataNameFam() {
        open("http://localhost:9999");
        $("[data-test-id=\"name\"] input").sendKeys("Сергей Иванов");
        $("[data-test-id=\"phone\"] input").sendKeys("+79103258833");
        $("[data-test-id=\"agreement\"] span").click();
        $("button").click();

        $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    void orderCardTestAllDataFamName() {
        open("http://localhost:9999");
        $("[data-test-id=\"name\"] input").sendKeys("Иванов Сергей");
        $("[data-test-id=\"phone\"] input").sendKeys("+79103258822");
        $("[data-test-id=\"agreement\"] span").click();
        $("button").click();

        $("[data-test-id=\"order-success\"]").shouldHave(Condition.text("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }


}
