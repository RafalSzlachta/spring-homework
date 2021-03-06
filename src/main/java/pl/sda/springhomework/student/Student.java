package pl.sda.springhomework.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
class Student {
    private Integer id;
    private String name;
    private Short age;
    private Gender gender;
}
