package com.kuryaevao.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class devqaTitleTest extends TestBase {

    @Test
    public void testTitle() {

        open("/selenium-css-selectors/");
        $(".post-title").shouldHave(text("Selenium CSS Selectors Examples"));
    }
}