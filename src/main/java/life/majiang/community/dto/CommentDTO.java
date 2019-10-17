package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/10/17_8:29
 */
@Data
public class CommentDTO {

    private Integer id;
    private Integer parentId;
    private Integer type;
    private Integer commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer likeCount;
    private String content;
    private User user;
}
