package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/10/21_17:23
 */
@Data
public class NotificationDTO {
    private Integer id;
    private Integer gmtCreate;
    private Integer status;
    private Integer notifier;
    private String notifierName;
    private String outerTitle;
    private String typeName;
    private Integer outerId;
    private Integer type;
}
