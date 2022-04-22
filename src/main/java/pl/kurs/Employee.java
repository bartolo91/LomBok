package pl.kurs;

import lombok.*;

import java.util.Objects;

@Getter
@Setter

@AllArgsConstructor
@RequiredArgsConstructor

@ToString(includeFieldNames = false)

@EqualsAndHashCode

public class Employee {

    private String name;
    private String surname;
    @ToString.Exclude
    private double sal;
    @EqualsAndHashCode.Exclude
    private final String pesel;


}
