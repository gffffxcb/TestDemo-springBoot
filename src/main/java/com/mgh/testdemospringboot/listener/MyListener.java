package com.mgh.testdemospringboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author MGH
 * @create 2022-0125 4:01 下午
 */
//监听器
@WebListener
@Slf4j
public class MyListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("监听器监听对象初始化完成后");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("监听器监听对象销毁之后");
    }
}
