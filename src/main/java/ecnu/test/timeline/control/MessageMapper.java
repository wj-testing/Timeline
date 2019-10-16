package ecnu.test.timeline.control;
import ecnu.test.timeline.bean.MessageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MessageMapper {
    @Select("select * from message order by message_id ")
    List<MessageBean> getMessageList();
}