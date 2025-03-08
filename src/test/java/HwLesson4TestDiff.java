import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HwLesson4TestDiff {

    @Test
    void test() {
        open(getClass().getClassLoader().getResource("test.html"));
        SelenideElement firstH1 = $("div h1");
        assert firstH1.exists();

        SelenideElement directH1 = $("div").$("h1");
        assert !directH1.exists();
    }
}
