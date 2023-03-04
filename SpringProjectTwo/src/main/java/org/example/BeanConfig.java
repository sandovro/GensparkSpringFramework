package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class BeanConfig {
    @Bean
    public Phone getMobile(){
        return new Phone("408-555-7777");
    }

    @Bean
    public Phone getHome(){
        return new Phone("408-555-5555");
    }

    @Bean
    public Address getAddress(){
        return new Address("Monterey","California","US","90200");
    }

    @Bean
    public Student getStudent(List<Phone> phone, Address address){
        return new Student("1234","Kevin",phone,address);
    }

}
