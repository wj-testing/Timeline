package ecnu.test.timeline.service;

import ecnu.test.timeline.bean.MessageBean;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

        List<MessageBean> getMessageList();
        void addTestMessage();
        MessageBean getMessageByID(int id);
        MessageBean deleteMessageByID(int id);
}
