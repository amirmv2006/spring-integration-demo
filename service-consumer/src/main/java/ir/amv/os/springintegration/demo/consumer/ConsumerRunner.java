package ir.amv.os.springintegration.demo.consumer;

import ir.amv.os.springintegration.demo.api.model.Book;
import ir.amv.os.springintegration.demo.consumer.processor.ProcessorGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Amir
 */
@SpringBootApplication
public class ConsumerRunner {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(ConsumerRunner.class);
    ProcessorGateway processorChannel = applicationContext.getBean(ProcessorGateway.class);
    processorChannel.process(new Book("The Book", 2020));
  }
}
