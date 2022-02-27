package az.unibank.ms.fintech.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.GUIDGenerator")
    private String id;

    @Column(name = "PIN", unique = true)
    private String pin;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ACC_NO")
    private String accountNumber;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "AVAILABLE_AMOUNT")
    private BigDecimal availableAmount;

}
