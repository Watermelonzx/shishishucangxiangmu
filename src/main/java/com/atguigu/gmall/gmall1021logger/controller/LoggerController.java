package com.atguigu.gmall.gmall1021logger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//192.168.28.22
@RestController
@Slf4j
public class LoggerController {
    @Autowired
    KafkaTemplate kafkaTemplate;
    @RequestMapping("/applog")
    public String logger(@RequestParam("param") String logJsonStr) {
        //打印到控制台
 System.out.println(logJsonStr);


        //落盘  使用lgback
    //    log.info(logJsonStr);
        //发送到kakfa的主题中
        kafkaTemplate.send("ods_base_log", logJsonStr);
        return "success";
    }

}
