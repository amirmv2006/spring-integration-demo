package ir.amv.os.springintegration.demo.consumer.processor;

import ir.amv.os.springintegration.demo.api.model.Book;

/**
 * @author Amir
 */
interface ProcessorApi {

  void process(Book book);
}
