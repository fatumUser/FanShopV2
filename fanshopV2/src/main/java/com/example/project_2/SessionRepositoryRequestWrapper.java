/*package com.example.project_2;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SessionRepositoryRequestWrapper extends HttpServletRequestWrapper {
    private SessionRepositoryRequestWrapper(HttpServletRequest request,
                                            HttpServletResponse response, ServletContext servletContext) {
        super(request);
        this.response = response;
        this.servletContext = servletContext;
    }
    @Override
    public HttpSessionWrapper getSession(boolean create) {
        // handle session creation internally
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        request.setAttribute(SESSION_REPOSITORY_ATTR, this.sessionRepository);

        SessionRepositoryRequestWrapper wrappedRequest = new SessionRepositoryRequestWrapper(
                request, response, this.servletContext);
        SessionRepositoryResponseWrapper wrappedResponse = new SessionRepositoryResponseWrapper(
                wrappedRequest, response);

        try {
            filterChain.doFilter(wrappedRequest, wrappedResponse);
        } finally {
            wrappedRequest.commitSession();
        }
    }

        //other methods and details
} */
