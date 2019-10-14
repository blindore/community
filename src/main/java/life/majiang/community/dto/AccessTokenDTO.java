package life.majiang.community.dto;

import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/9/29_9:22
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
