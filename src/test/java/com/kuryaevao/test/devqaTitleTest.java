package com.kuryaevao.test;

import com.kuryaevao.test.config.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class devqaTitleTest extends TestBase {

    final BaseConfig config =
            ConfigFactory.create(BaseConfig.class, System.getProperties());

    @Test
    public void testTitle() {

        open("/selenium-css-selectors/");
        $(".post-title").shouldHave(text("Selenium CSS Selectors Examples"));
    }
}