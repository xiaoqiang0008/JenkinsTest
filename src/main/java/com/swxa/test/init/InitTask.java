package com.swxa.test.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class InitTask  implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        log.debug("---------------------------->>>>>>>");
    }
}
