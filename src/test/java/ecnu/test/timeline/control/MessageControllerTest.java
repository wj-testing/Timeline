package ecnu.test.timeline.control;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest
public class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    MessageController messageController;

}
