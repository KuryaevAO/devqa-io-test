package com.kuryaevao.test.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${runType}.properties"})
public interface RunTypeConfig extends Config {

    @Key("remoteUrl")
    String getRemoteUrl();
}