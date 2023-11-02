package br.com.fk.apimultipleservices.controller;

import br.com.fk.apimultipleservices.entity.Person;
import br.com.fk.apimultipleservices.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    // Create a new person
    @PostMapping
    public Person createUser(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    // Get all users
    @GetMapping
    public List<Person> getAllUsers() {
        return personService.getAllPeople();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public Optional<Person> getUserById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    // Update user by ID
    @PutMapping("/{id}")
    public Person updateUser(@PathVariable Long id, @RequestBody Person userDetails) {
        return personService.updatePerson(id, userDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllUsers() {
        personService.deleteAllPeople();
        return "All users have been deleted successfully.";
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        personService.deleteUser(id);
    }

}