package com.jeremy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScProvider01Provider8081ApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        int i = 1 ;
        String s = "1";
        System.out.println(s.equals(String.valueOf(i)));
    }
}
