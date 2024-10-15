package ie.atu.week4lab;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private List<Person> personList = new ArrayList<>();

    @GetMapping
    public List<Person> getPersonList(){
        return personList;
    }

    @PostMapping("/createPerson")
    public String createPerson(@RequestBody @Valid Person createPerson){
        personList.add(createPerson);
        return "Person Created";
    }
}
