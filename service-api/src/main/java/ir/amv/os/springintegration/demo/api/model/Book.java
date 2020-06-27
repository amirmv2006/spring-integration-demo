package ir.amv.os.springintegration.demo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amir
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
  private String name;
  private Integer publishYear;
}
