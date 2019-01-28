package minishop.irerin07.github.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = { "minishop.irerin07.github.service" })
@Import({DataSourceConfig.class})
public class ApplicationConfig {
}