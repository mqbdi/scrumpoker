package mqbdi.scrumpoker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/alive")
public class AliveController {

    @GetMapping("/get")
    public String get() {
        String ret =  "UP";
        return ret;
    }
}
