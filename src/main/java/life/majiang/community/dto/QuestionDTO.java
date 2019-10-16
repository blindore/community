package life.majiang.community.dto;

import life.majiang.community.mapper.QuestionMapper;
import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/10/9_17:03
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;


}
