package ir.amv.os.springintegration.demo.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

/**
 * @author Amir
 */
@Configuration
@EnableIntegration
public class ConsumerIntegrationConfig {

  @Bean
  public MessageChannel processorChannel() {
    return new DirectChannel();
  }

}
