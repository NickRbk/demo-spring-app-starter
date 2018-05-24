package cursor.rybak.demostarter.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class DevProfileResolverEnvPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.err.println("\n\n\n=======================>---CUSTOM STARTER: Hello world---<=======================\n\n\n");
        if (environment.getActiveProfiles().length == 0) {
            environment.addActiveProfile("DEV");
        }
    }
}
