package ecnu.test.timeline.control;
import ecnu.test.timeline.bean.MessageBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author lyx
 */
@Component
public interface MessageMapper {
    @Select("select * from message order by time DESC ")
    List<MessageBean> getMessageList();

    @Select("select * "+
            "from message " +
            "where message_id = #{id}")
    MessageBean getMessageByID(int id);

    @Delete("delete from message where message_id = #{id}")
    void deleteMessageByID(int id);

    @Insert("insert into message values(0,'Test','2013-10-12 13:20:45','I am testing data')")
    void addTestMessage();
}
