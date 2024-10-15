package ie.atu.week4lab;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @PostMapping("/person/createPerson")
    public String createPerson(@RequestBody @Valid Person createPerson){
        return "Person Created";
    }
}
