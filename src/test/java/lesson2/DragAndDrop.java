package lesson2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {
    @Test
    void swapping_rectangles() {
        holdBrowserOpen = true;
        //Откройте https://the-internet.herokuapp.com/drag_and_drop;
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенесите прямоугольник А на место В;
        $("#column-a").dragAndDropTo("#column-b");
        //Проверьте, что прямоугольники действительно поменялись;
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));

      /*  open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200, 0).release().perform();
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));*/

    }
}
