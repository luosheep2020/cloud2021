package com.cloudconsumerorder80;

import cn.hutool.extra.tokenizer.engine.mynlp.MynlpWord;
import com.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Luosheep
 */
@EnableEurekaClient
@SpringBootApplication
/*@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)*/
public class CloudConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }

}
