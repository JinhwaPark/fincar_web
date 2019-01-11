package fincar.fincar_web.controller;

import fincar.fincar_web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class testController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    private String jspTest(Model model, @RequestParam Map param) {

        List<Map<String, Object>> test3 = testService.getTest(param);
        model.addAttribute("test1", test3);

        return "testjsp";

    }
}
