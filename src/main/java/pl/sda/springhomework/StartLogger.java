package pl.sda.springhomework;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StartLogger implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.warn("Hello");
    }
}
