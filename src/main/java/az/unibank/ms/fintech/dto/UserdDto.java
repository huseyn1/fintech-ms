package az.unibank.ms.fintech.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserdDto {

    private String firstName;
    private String lastName;
    private String pin;
    private String password;

}
