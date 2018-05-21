package com.lcy.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义filter
 */
@Order(1)
//重点
@WebFilter(filterName = "customerFilter", urlPatterns = "/*")
public class CustomerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomerFilter start...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CustomerFilter end...");

    }

    @Override
    public void destroy() {

    }
}
