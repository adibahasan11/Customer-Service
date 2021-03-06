package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String address;

    @Field
    private double age;

    @Document
    private enum paymentAddress{
        Mobile_number,
        Card_number,
        Expiry_date
    };
}
