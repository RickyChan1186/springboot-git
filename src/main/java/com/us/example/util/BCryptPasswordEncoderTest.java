package com.us.example.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by yangyibo on 17/3/2.
 */
public class BCryptPasswordEncoderTest {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("encoder:  " + encoder.encode("abel"));
        System.out.println("encoder:  " + encoder.encode("admin"));

        if (encoder.matches("abel", "$2a$10$K/pLIT7JCV35YU7G1ZW0sudPiRx/Gq/E87BcwC4Dwb8cxzY7y81nG")) {
            System.out.println("encoder: true");
        }


        System.out.println("------------华丽的分割线-----------------------");
        String Md5Password = MD5Util.encode("abel");
        System.out.println("Md5Password:  " + Md5Password);
        System.out.println("encoder:  " + encoder.encode(Md5Password));
        if (encoder.matches(Md5Password, encoder.encode(Md5Password))) {
            System.out.println("Md5Password: true");
        }

    }
}
