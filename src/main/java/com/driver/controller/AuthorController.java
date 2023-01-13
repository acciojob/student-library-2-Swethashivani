package com.driver.controller;

//Add required annotations

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    //Write createAuthor API with required annotations

    @Autowired
    AuthorService authorService;

    @PostMapping("/")
    public ResponseEntity createAuthor(@RequestBody Author author){

        authorService.create(author);
        return new ResponseEntity<>("the author is successfully added to the system", HttpStatus.CREATED);
    }

}
