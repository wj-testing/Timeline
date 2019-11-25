package ecnu.test.timeline.service;

import ecnu.test.timeline.bean.MessageBean;
import ecnu.test.timeline.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author lyx
 */
@Service
public class MessageServiceImpl implements MessageService{

        @Autowired
        private MessageRepository messageRepository;
        @Override
        public List<MessageBean> getMessageList() {

                List<MessageBean> messages = messageRepository.getMessageList();
                return messages;
        }

    @Override
    public MessageBean deleteMessageByID(int id) {
                MessageBean message = messageRepository.getMessageByID(id);
                messageRepository.deleteMessageByID(id);
                return  message;
    }

    @Override
        public void addTestMessage() {
        messageRepository.addTestMessage();
        }

    @Override
    public MessageBean getMessageByID(int id) {
            MessageBean message = messageRepository.getMessageByID(id);
            return  message;
    }
}
