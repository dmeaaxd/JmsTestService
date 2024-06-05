package org.example.jmstestservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WriteOffDTO {
    private Long billId;
    private int amount;

    public boolean check() {
        return (billId != null && amount > 0);
    }
}
