package com.rainlf.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : rain
 * @date : 2018/10/22 5:10 PM
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 上一次指令开始执行后，延迟5s再次执行。
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    /**
     * 上一次指令执行完毕后，延迟5秒再次执行
     */
    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime2() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    /**
     * 第一次延迟1秒后执行，之后按fixedDelay规则进行
     */
    @Scheduled(initialDelay = 1000,fixedDelay = 5000)
    public void reportCurrentTime3() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    /**
     * cron规则
     * 秒，分，时，日，月，星期内日
     *
     * 每5s的时候执行一次
     */
    @Scheduled(cron="*/5 * * * * *")
    public void reportCurrentTime4() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
