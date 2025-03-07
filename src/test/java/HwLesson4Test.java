import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HwLesson4Test {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";

    }

    @Test
    void formTest() {
        open("/selenide/selenide");
        $("span[data-content='Wiki']").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $$("a.Truncate-text").shouldHave(itemWithText("SoftAssertions"));
        $$("a.Truncate-text").findBy(text("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(text("JUnit5 extension"));

    }
}
