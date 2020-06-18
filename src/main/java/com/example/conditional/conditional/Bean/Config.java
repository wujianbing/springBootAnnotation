package com.example.conditional.conditional.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @Conditional(WindowsConditional.class)
    public WindowsBean windowsBean(){
        return new WindowsBean();
    }

    @Bean
    @Conditional({LinuxConditional.class})
    public LinuxBean linuxBean(){
        return new LinuxBean();
    }
}
