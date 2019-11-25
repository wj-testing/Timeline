package ecnu.test.timeline.repository;

import ecnu.test.timeline.bean.MessageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository {

    List<MessageBean> getMessageList();
    void addTestMessage();
    MessageBean getMessageByID(int id);
    MessageBean deleteMessageByID(int id);
}
