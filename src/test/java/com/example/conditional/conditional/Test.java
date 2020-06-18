package com.example.conditional.conditional;


import com.example.conditional.conditional.Bean.Config;
import com.example.conditional.conditional.Bean.WindowsBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    private ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    @Before
    public void init(){

    }

    @org.junit.Test
    public void test(){

        String osName = context.getEnvironment().getProperty("os.name");
        System.out.println(osName);
        
        Map<String, WindowsBean> beansOfType = context.getBeansOfType(WindowsBean.class);
       System.out.println(beansOfType);
    }

}
