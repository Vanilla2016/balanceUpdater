package com.wds.balanceUpdater;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration()
@ComponentScan({"wds.service","wds.controller","wds.exception"})
@EnableJpaRepositories({"wds.repository"})
@EntityScan("wds.beans.entity")

public class TestConfig {


}
