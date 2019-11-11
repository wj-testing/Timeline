package ecnu.test.timeline.bean;
import java.util.*;

/**
 * @author lyx
 */
public class MessageBean {
    private int message_ID;
    private String user_ID;
    private String time;
    private String context;

    public int getMessage_ID() {
        return message_ID;
    }

    public void setMessage_ID(int message_ID) {
        this.message_ID = message_ID;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) { this.user_ID = user_ID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }


}
