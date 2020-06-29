package ir.amv.os.springintegration.demo.consumer.processor;

import ir.amv.os.springintegration.demo.api.model.Book;
import java.io.File;
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

  @ServiceActivator(inputChannel = PROCESS_CHANNEL)
  public void process(Book book) {
    log.info("processing book '{}'", book);
  }

  @Override
  @ServiceActivator(inputChannel = UPLOAD_FILE_CHANNEL)
  public void uploadFile(File file) {
    log.info("Uploaded file size: {}", file.length());
  }

  @Override
  @ServiceActivator(inputChannel = DOWNLOAD_FILE_CHANNEL)
  public File downloadFile(String fileName) {
    return new File(fileName);
  }
}
