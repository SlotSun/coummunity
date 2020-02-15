package life.slot.community.dto;

import life.slot.community.model.User;
import lombok.Data;

/**
 * Create by slot on 2020-02-15
 */
@Data
public class QuestionDTO {
    private String id;
    private String title;
    private String description;
    private String tag;
    private long gmtCreate;
    private long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private User user;
}
