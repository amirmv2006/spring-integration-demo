package ir.amv.os.springintegration.demo.consumer.processor;

import ir.amv.os.springintegration.demo.api.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author Amir
 */
@MessageEndpoint
@Slf4j
public class Processor
    implements ProcessorApi {

  @ServiceActivator(inputChannel = "processorChannel")
  public void process(Book book) {
    log.info("processing book '{}'", book);
  }
}
