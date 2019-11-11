package ecnu.test.timeline.control;

import ecnu.test.timeline.service.MessageService;
import ecnu.test.timeline.service.MessageServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MessageController.class)
public class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    MessageService messageService;

    @MockBean
    MessageServiceImpl messageServiceImpl;

    @MockBean
    MessageMapper messageMapper;

    @Test
    @DisplayName("测试getMessageList()方法")
    public void shouldGetMessageList() throws Exception{
        ResultActions perform = mockMvc.perform(get("/api/message"));
        perform.andExpect(status().isOk());
        // 验证messageServiceImpl的getMessageList()方法执行次数为1
        verify(messageServiceImpl,times(1)).getMessageList();
    }

    @Test
    @DisplayName("测试getMessageByID()方法")
    public void shouldGetMessageByID() throws Exception{
        ResultActions perform = mockMvc.perform(get("/api/message/1"));
        perform.andExpect(status().isOk());
        // 验证messageServiceImpl的getMessageByID()方法执行次数为1且参数一致
        verify(messageServiceImpl,times(1)).getMessageByID(1);
    }

    @Test
    @DisplayName("测试addTestMessage()方法")
    public void shouldAddTestMessage() throws Exception{
        ResultActions perform = mockMvc.perform(post("/api/message"));
        perform.andExpect(status().isCreated());
        // 验证messageServiceImpl的addTestMessage()方法执行次数为1
        verify(messageServiceImpl,times(1)).addTestMessage();
    }

    @Test
    @DisplayName("测试deleteMessageByID()方法")
    public void shouldDeleteMessageByID() throws Exception{
        ResultActions perform = mockMvc.perform(delete("/api/message/11"));
        perform.andExpect(status().isNoContent());
        // 验证messageServiceImpl的deleteMessageByID方法执行次数为1且参数一致
        verify(messageServiceImpl,times(1)).deleteMessageByID(11);
    }
}
