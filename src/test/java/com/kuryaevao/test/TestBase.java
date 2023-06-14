package com.kuryaevao.test;

import com.codeborne.selenide.Configuration;
import com.kuryaevao.test.config.BaseConfig;
import com.kuryaevao.test.config.RunTypeConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        System.setProperty("runType", "local");// сюда вставляем local или remote

        final BaseConfig config =
                ConfigFactory.create(BaseConfig.class, System.getProperties());

        final RunTypeConfig runConfig =
                ConfigFactory.create(RunTypeConfig.class, System.getProperties());

        Configuration.browser = config.getBrowser();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.pageLoadStrategy = config.getPageLoadStrategy();
        Configuration.remote = runConfig.getRemoteUrl();
    }
}
