package org.example.jmstestservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopUpDTO {
    private Long billId;
    private String cardNumber;
    private int amount;

    public boolean check() {
        if (cardNumber == null || cardNumber.length() != 16) {
            return false;
        }

        boolean flag = false;
        for (int i = 0; i < cardNumber.length(); i++) {
            try {
                int tmp = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            } catch (NumberFormatException numberFormatException) {
                flag = true;
            }
        }
        if (flag) return false;

        return (billId != null && amount > 0);
    }
}
