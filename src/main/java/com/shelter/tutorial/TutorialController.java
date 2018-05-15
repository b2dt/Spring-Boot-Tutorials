package com.shelter.tutorial;

import com.shelter.tutorial.model.PrequelModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tutorial")
public class TutorialController {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        System.out.println("Hello World!");
        return ResponseEntity.status(200).body("Goodbye!");
    }

    @PostMapping("/test")
    public ResponseEntity<String> testPost() {
        System.out.println("Hello World!");
        return ResponseEntity.status(201).body("Post Goodbye!");
    }

    @PostMapping("/test/body")
    public ResponseEntity<PrequelModel> testPostWithBody(@RequestBody PrequelModel jsonBody) {
        System.out.println(jsonBody);
        return ResponseEntity.status(201).body(jsonBody);
    }

    @PostMapping("/test/query")
    public ResponseEntity<String> testPostWithQuery(@RequestParam("hello") String hello, @RequestParam("general") String general) {
        String values = "key of hello = " + hello + " and key of general = " + general;
        System.out.println(values);
        return ResponseEntity.status(201).body(values);
    }
}
