package com.dataprogramming.customer.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@Document("Customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    private TypeCustomer typeCustomer;
    private DocumentType documentType;
    @NotEmpty
    private String documentNumber;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    @NotNull
    private String gender;

    public enum DocumentType {
        DNI,
        PASSPORT
    }
}
