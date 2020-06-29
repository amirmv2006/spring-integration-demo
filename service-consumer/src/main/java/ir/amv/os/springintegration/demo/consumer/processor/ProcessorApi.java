package ir.amv.os.springintegration.demo.consumer.processor;

import ir.amv.os.springintegration.demo.api.model.Book;
import java.io.File;
import org.springframework.integration.annotation.Gateway;

/**
 * @author Amir
 */
public interface ProcessorApi {
  String PROCESS_CHANNEL = "processorChannel";
  String UPLOAD_FILE_CHANNEL = "uploadFileChannel";
  String DOWNLOAD_FILE_CHANNEL = "downloadFileChannel";

  @Gateway(requestChannel = PROCESS_CHANNEL)
  void process(Book book);

  @Gateway(requestChannel = UPLOAD_FILE_CHANNEL)
  void uploadFile(File file);

  @Gateway(requestChannel = DOWNLOAD_FILE_CHANNEL)
  File downloadFile(String fileName);
}
