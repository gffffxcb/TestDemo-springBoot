package com.mgh.testdemospringboot.filter;

import lombok.extern.slf4j.Slf4j;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author MGH
 * @create 2022-0125 4:02 下午
 */

@Slf4j
@WebFilter(filterName = "MyFilter", urlPatterns = { "/*" })
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter初始化时");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("filter执行之前");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("filter执行之后");
    }

    @Override
    public void destroy() {
        log.info("filter销毁之前");
        Filter.super.destroy();
    }
}
