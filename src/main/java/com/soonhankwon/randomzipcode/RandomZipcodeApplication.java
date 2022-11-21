package com.soonhankwon.randomzipcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class RandomZipcodeApplication {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(RandomZipcodeApplication.class, args);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i<number; i++) {
//            System.out.println("0" + ((int) (Math.random() * 196) + 8200));
            System.out.println("'0" + ((int) (Math.random() * 196) + 8200)); //구글 스프레드시트 용도
        }
    }
}
