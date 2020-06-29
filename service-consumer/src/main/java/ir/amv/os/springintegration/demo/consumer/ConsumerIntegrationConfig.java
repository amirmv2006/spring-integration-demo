package ir.amv.os.springintegration.demo.consumer;

import ir.amv.os.springintegration.demo.consumer.processor.ProcessorApi;
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

  @Bean(name = ProcessorApi.PROCESS_CHANNEL)
  public MessageChannel processorChannel() {
    return new DirectChannel();
  }

  @Bean(name = ProcessorApi.UPLOAD_FILE_CHANNEL)
  public MessageChannel uploadFileChannel() {
    return new DirectChannel();
  }

  @Bean(name = ProcessorApi.DOWNLOAD_FILE_CHANNEL)
  public MessageChannel downloadFileChannel() {
    return new DirectChannel();
  }

}
