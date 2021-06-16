package example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DefaultRestController {

  @RequestMapping("/all")
  fun available(): String {
    return "Spring in Action";
  }
}
