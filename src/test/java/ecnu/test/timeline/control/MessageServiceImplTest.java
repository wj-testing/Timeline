package ecnu.test.timeline.control;


import ecnu.test.timeline.bean.MessageBean;
import ecnu.test.timeline.mapper.MessageMapper;
import ecnu.test.timeline.repository.MessageRepository;
import ecnu.test.timeline.repository.MessageRepositoryImpl;
import ecnu.test.timeline.service.MessageService;
import ecnu.test.timeline.service.MessageServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceImplTest {

    @Mock
    MessageServiceImpl messageServiceImpl;

    @Mock
    MessageRepositoryImpl messageRepositoryImpl;

    @Mock
    MessageMapper messageMapper;

    private MessageBean messageBean;

    @BeforeEach
    public void init(){
        messageServiceImpl = new MessageServiceImpl();
        messageRepositoryImpl = new MessageRepositoryImpl();

        messageBean = new MessageBean();
        messageBean.setMessage_ID(1);
        messageBean.setUser_ID("TestMessage");
        messageBean.setContext("New feature Application");
        messageBean.setTime("");
    }

    @Test
    public void shouldListMessages(){

        List<MessageBean> messages = new ArrayList<>();
        messages.add(messageBean);
        when(messageRepositoryImpl.getMessageList()).thenReturn(messages);
        List<MessageBean> messageList = messageServiceImpl.getMessageList();
        verify(messageServiceImpl,times(1)).getMessageList();
    }

    @Test
    public void shouldgetMessageById(){
        when(messageRepositoryImpl.getMessageByID(1)).thenReturn(messageBean);
        messageServiceImpl.getMessageByID(1);
        verify(messageServiceImpl,times(1)).getMessageByID(1);
    }

    @Test
    public void shouldDeleteMessageByid(){
        messageServiceImpl.deleteMessageByID(1);
        verify(messageServiceImpl,times(1)).deleteMessageByID(1);
    }

    @Test
    public void shouldAddMessageById(){
        messageServiceImpl.addTestMessage();
        verify(messageServiceImpl,times(1)).addTestMessage();
    }
}

