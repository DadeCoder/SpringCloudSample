//package com.example;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * Created by Dade on 2017/3/9.
// */
//public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                        Authentication authentication) throws IOException, ServletException {
//        JSONResponse jsonResponse = new JSONResponse();
//        jsonResponse.addMsg("result", "SUCCESS");
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write(jsonResponse.toString());
//        printWriter.flush();
//        printWriter.close();
//        clearAuthenticationAttributes(request);
//    }
//}
