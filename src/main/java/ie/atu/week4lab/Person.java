package ie.atu.week4lab;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotBlank(message = "Name cannot be Blank")
    private String name;

    @NotBlank(message = "Title cannot be Blank")
    private String title;

    @NotBlank(message = "Employment status cannot be Blank")
    private String employed;

    @NotNull(message = "Age cannot be Null")
    private int age;

    @Email(message = "Must be a valid email")
    private String email;

    @NotBlank(message = "Position cannot be Blank")
    private String position;

    @NotBlank(message = "Department cannot be Blank")
    private String department;
}
