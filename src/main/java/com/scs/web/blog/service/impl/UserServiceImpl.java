//package com.scs.web.blog.service.impl;
//
//import com.scs.web.blog.dao.impl.UserDao;
//import com.scs.web.blog.domain.UserDto;
//import com.scs.web.blog.entity.User;
//import com.scs.web.blog.factory.DaoFactory;
//import com.scs.web.blog.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class UserServiceImpl implements UserService {
//    private UserDao userDao = DaoFactory.getUserDaoInstance();
//    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
//    @Override
//    public Map<String,Object> signIn(UserDto userDto){
//        User user = null;
//        Map<String,Object> map = new HashMap<>();
//        try {
//            //调用Dao实现类中的方法查询数据，将查到的数据存入user中
//            user = userDao.findUserByMobile(userDto.getMobile());
//
//        }catch (SQLException e){
//            logger.error("根据手机好查询用户出现异常");
//        }
//        if(user !=null){
//            //将前端获得的密码于user中的密码进行比较
//            if(user.getPassword().equals(userDto.getPassword())){
//                //将数据存不同的对应值中
//                map.put("msg",Message.SIGN_IN_SUCCESS);
//                map.put("data",user);
//
//            }else {
//                map.put("msg",Massage.PASSWORD_ERROR);
//            }
//
//        }else {
//            map.put("msg",Massage.MOBILE_NOT_FOUND);
//        }
//        return  map;
//    }
//
//}
