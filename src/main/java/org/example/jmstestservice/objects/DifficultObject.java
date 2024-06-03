package org.example.jmstestservice.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DifficultObject {
    private String name;
    private int id;
    private Long hardId;


    @Override
    public String toString() {
        return "DifficultObject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hardId=" + hardId +
                '}';
    }
}
