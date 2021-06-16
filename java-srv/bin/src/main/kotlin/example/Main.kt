package example

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import example.filters.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
class Main

@Bean
fun simpleFilter(): SimpleFilter {
    return SimpleFilter();
}

fun main(args: Array<String>) {
 runApplication<Main>(*args)
}
