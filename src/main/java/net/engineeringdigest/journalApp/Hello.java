package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("abc")
    public String function(){
        return "Hello World";
    }
}