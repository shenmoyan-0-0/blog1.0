//package com.scs.web.blog.controller;
//
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.scs.web.blog.domain.UserDto;
//import com.scs.web.blog.factory.ServiceFactory;
//import com.scs.web.blog.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.io.PrintWriter;
//import java.util.Map;
//
//@WebServlet(urlPatterns = "/sign-in")
//public class UserController extends HttpServlet {
//    private static Logger logger = LoggerFactory.getLogger(UserController.class);
//    private UserService userService = ServiceFactory.getStudentServiceInstance();
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
//        //获得前端提交的数据
//        BufferedReader reader = req.getReader();
//        //新建一个可变的字符序列
//        StringBuilder stringBuilder = new StringBuilder();
//        String line = null;
//        //通过while循环，一行一行的读入内容
//        while ((line = reader.readLine()) !=null){
//            //将得到的字符放入stringBuilder中
//            stringBuilder.append(line);
//        }
//        //将错误打入日志
//        logger.info("登录用户信息:" + stringBuilder.toString());
//        //new一个gson
//        Gson gson = new GsonBuilder().create();
//        //将得到的gson类型数据转换成java类型存入到userDto中
//        UserDto userDto = gson.fromJson(stringBuilder.toString(), UserDto.class);
//        //定义map获取signin的返回值
//        Map<String,Object> map = userService.signIn(userDto);
//        //通过map。get方法获得建为msg的值
//        String msg = (String) map.get("msg");
//        ResponseObject ro;
//        if (msg.equals(Message.SIGN_IN_SUCCESS)){
//            //如果登录成功，取出键值为data对应的值
//            ro = ResponseObject.success(200,msg,map.get("data"));
//
//        }else {
//            ro = ResponseObject.success(200,msg);
//        }
//        //定义输出流
//        PrintWriter out = resp.getWriter();
//        //转换为gsons数据并输出
//
//        out.print(gson.toJson(ro));
//        out.close();
//
//    }
//
//
//}
