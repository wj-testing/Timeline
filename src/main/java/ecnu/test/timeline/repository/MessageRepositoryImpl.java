package ecnu.test.timeline.repository;

import ecnu.test.timeline.bean.MessageBean;
import ecnu.test.timeline.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepositoryImpl implements MessageRepository{
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<MessageBean> getMessageList() {

        try {
            List<MessageBean> messages = messageMapper.getMessageList();
            return  messages;
        }
        catch (Exception e)
        {
            throw e;
//            return null;
        }
    }

    @Override
    public MessageBean deleteMessageByID(int id) {
        try {
            MessageBean message = messageMapper.getMessageByID(id);
            messageMapper.deleteMessageByID(id);
            return  message;
        }
        catch (Exception e)
        {
            throw e;
//            return null;
        }
    }

    @Override
    public void addTestMessage()
    {
        try {
            messageMapper.addTestMessage();
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public MessageBean getMessageByID(int id) {
        try {
            MessageBean message = messageMapper.getMessageByID(id);
            return  message;
        }
        catch (Exception e)
        {
            throw e;
//            return null;
        }
    }
}
