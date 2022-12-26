package lesson2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class GitHubEnterprize {
    @Test
    void enterprise_displayed_successfully() {
        //Открыть страницу GitHub;
        open("https://github.com/");
        //Выбрать в навигационном меню Solutions;
        $(byText("Solutions")).hover();
        //В раскрывшемся списке выбрать Enterprise;
        $(byText("Enterprise")).click();
        //Убедиться, что открылась необходимая старница;
        $(".font-mktg").shouldHave(text("Build like the best"));
    }
}
