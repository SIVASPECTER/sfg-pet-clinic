package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class OwnerController {
    @RequestMapping({"owner/index.html","owner/index"})
    String ownerResponse(){
        return "owner/index";
    }
}
