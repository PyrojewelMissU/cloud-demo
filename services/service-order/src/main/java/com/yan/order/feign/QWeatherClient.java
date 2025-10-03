package com.yan.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "qweatherClient", url = "https://nc5u9vnpd6.re.qweatherapi.com")
public interface QWeatherClient {

    @GetMapping("/v7/weather/now")
    String getNowWeather(@RequestParam("location") String location,
                         @RequestHeader("X-QW-Api-Key") String apiKey,
                         @RequestHeader(value = "Accept-Encoding", defaultValue = "gzip") String encoding);
}
