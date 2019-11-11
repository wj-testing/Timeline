package ecnu.test.timeline.control;

import ecnu.test.timeline.service.MessageService;
import ecnu.test.timeline.service.MessageServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
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
    void shouldGetMessageList() throws Exception{
        ResultActions perform = mockMvc.perform(get("/api/message"));
        perform.andExpect(status().isOk());
        verify(messageService,times(1)).getMessageList();
    }

    @Test
    void shouldGetMessageByID() throws Exception{
        ResultActions perform = mockMvc.perform(get("/api/message/1"));
        perform.andExpect(status().isOk());
        verify(messageService,times(1)).getMessageByID(1);
    }

    @Test
    void shouldAddTestMessage() throws Exception{
        ResultActions perform = mockMvc.perform(post("/api/message"));
        perform.andExpect(status().isOk());
    }

    @Test
    void shouldDeleteMessageByID() throws Exception{
        ResultActions perform = mockMvc.perform(delete("/api/message/11"));
        perform.andExpect(status().isOk());
    }
}
