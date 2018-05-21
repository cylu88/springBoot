package com.lcy.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义filter
 */
@Order(2)
//重点
@WebFilter(filterName = "customerFilter2", urlPatterns = "/*")
public class CustomerFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomerFilter2 start...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CustomerFilter2 end...");

    }

    @Override
    public void destroy() {

    }
}
