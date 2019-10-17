package life.majiang.community.dto;

import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/10/15_15:21
 */
@Data
public class CommenCreatetDTO {
    private Integer parentId;
    private String content;
    private Integer type;
}
