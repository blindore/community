package life.majiang.community.dto;

import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/10/23_16:28
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
