package ecnu.test.timeline.service;

import ecnu.test.timeline.bean.MessageBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

        List<MessageBean> getMessageList();
}
