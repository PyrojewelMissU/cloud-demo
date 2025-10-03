package com.yan.order;

import com.yan.order.feign.QWeatherClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootTest
public class WeatherTest {

    @Autowired
    private QWeatherClient qWeatherClient;

    @Test
    public void testNowWeather() {
        String apiKey = "21a144c7722e46d4a4524a07cd92fb53"; // 直接写死测试用
        String location = "101050910"; // 北京
        String result = qWeatherClient.getNowWeather(location, apiKey, "gzip");
        System.out.println(result);
    }
}
