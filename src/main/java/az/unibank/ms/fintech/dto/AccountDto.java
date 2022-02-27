package az.unibank.ms.fintech.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private String pin;

    private String firstName;

    private String lastName;

    private String accountNumber;

    private BigDecimal availableAmount;

}
