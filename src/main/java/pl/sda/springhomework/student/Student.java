package pl.sda.springhomework.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class Student {
    private String name;
    private Short age;
    private Gender gender;
}
