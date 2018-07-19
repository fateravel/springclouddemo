package com.pengsong.eurekafeignclient.hystrix;

import com.pengsong.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author pengsong
 */
@Component
public class HiHystrix implements EurekaClientFeign{
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
