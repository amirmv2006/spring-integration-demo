package ir.amv.os.springintegration.demo.consumer;

import ir.amv.os.springintegration.demo.api.model.Book;
import ir.amv.os.springintegration.demo.consumer.processor.ProcessorGateway;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Amir
 */
@SpringBootApplication
public class ConsumerRunner {

  public static void main(String[] args) throws IOException {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(ConsumerRunner.class);
    ProcessorGateway processorChannel = applicationContext.getBean(ProcessorGateway.class);
    processorChannel.process(new Book("The Book", 2020));
    processorChannel.uploadFile(new File("pom.xml"));
    File file = processorChannel.downloadFile("pom.xml");
    Files.readAllLines(file.toPath())
        .forEach(System.out::println);
  }
}
