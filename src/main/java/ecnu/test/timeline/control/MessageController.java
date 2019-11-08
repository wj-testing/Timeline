package ecnu.test.timeline.control;

import ecnu.test.timeline.bean.MessageBean;
import ecnu.test.timeline.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/message")
    @ResponseStatus(HttpStatus.OK)
    public List<MessageBean> getMessageList()
    {
        return messageService.getMessageList();
    }

    @GetMapping("/message/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageBean getMessageByID(@PathVariable("id") int id)
    {
        return messageService.getMessageByID(id);
    }

    @PostMapping("/message")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTestMessage()
    {
        messageService.addTestMessage();
    }

    @DeleteMapping("/message/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public MessageBean deleteMessageByID(@PathVariable("id") int id){
        return  messageService.deleteMessageByID(id);
    }
}
