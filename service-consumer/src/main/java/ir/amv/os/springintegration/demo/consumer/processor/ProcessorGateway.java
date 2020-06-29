package ir.amv.os.springintegration.demo.consumer.processor;

import org.springframework.integration.annotation.MessagingGateway;

/**
 * @author Amir
 */
@MessagingGateway
public interface ProcessorGateway
    extends ProcessorApi {

}
