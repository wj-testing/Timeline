package ecnu.test.timeline.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimelineController {
    @RequestMapping("/timeline")
    public String indexPage() {
        return "Hello!";
    }

}
