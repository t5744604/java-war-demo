package com.demo;

import java.io.IOException;
import java.time.Instant;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ApiServlet", urlPatterns = {"/api"})
public class ApiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json; charset=UTF-8");
        resp.getWriter().printf(
            "{\"status\":\"ok\",\"time\":\"%s\"}%n",
            Instant.now().toString()
        );
    }
}
