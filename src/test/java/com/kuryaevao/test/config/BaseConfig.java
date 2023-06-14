package com.kuryaevao.test.config;

import org.aeonbits.owner.Config;

public interface BaseConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://devqa.io")
    String getBaseUrl();

    @Key("browserVersion")
    @DefaultValue("113")
    String getBrowserVersion();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String getPageLoadStrategy();
}