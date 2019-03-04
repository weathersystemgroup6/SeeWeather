package com.xiecc.seeWeather.common;

import com.xiecc.seeWeather.BuildConfig;
import com.xiecc.seeWeather.base.BaseApplication;
import java.io.File;

public class C {

    public static final String API_TOKEN = BuildConfig.FirToken;
    public static final String KEY = BuildConfig.WeatherKey;// 和风天气 key

    public static final String MULTI_CHECK = "multi_check";
   //城市数据库
    public static final String ORM_NAME = "cities.db";

    public static final String UNKNOWN_CITY = "unknown city";

    public static final String NET_CACHE = BaseApplication.getAppCacheDir() + File.separator + "NetCache";
}
