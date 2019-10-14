package ecnu.test.timeline.control;

import ecnu.test.timeline.bean.MessageBean;
import ecnu.test.timeline.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
@Autowired
    private MessageServiceImpl messageService;

    @RequestMapping("/getmessagelist")
    public List<MessageBean> getMessageList()
    {
        return messageService.getMessageList();
    }

}
