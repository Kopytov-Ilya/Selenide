import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchExample {
    /*
    1.Open 'https://github.com/' +
    2.Enter 'Selenide' in search bar +
    3.Press Enter button +
    4.Select first link in results +
    5.Select 'Wiki' tab in navigation bar +
    6.Expand 'Pages' list +
    6.Check that 'SoftAssertions' displayed in 'Pages' list+
    7.Click on 'SoftAssertions' +
    8.Check that in 'Example' chapter displayed 'Using JUnit5 extend test class:' +

     */

@Test
    void SearchingOfExample() {
    Configuration.holdBrowserOpen = true;

    open("https://github.com/");
    $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
    $$("ul.repo-list li").first().$("a").click();
    $("#wiki-tab").click();
    $("#wiki-pages-box button").click();
    $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
    $("#wiki-pages-box").$(byText("SoftAssertions")).click();
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
