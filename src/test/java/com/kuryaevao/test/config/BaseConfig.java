package com.kuryaevao.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:base.properties"})
public interface BaseConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String getPageLoadStrategy();
}