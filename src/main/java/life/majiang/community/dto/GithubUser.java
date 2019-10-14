package life.majiang.community.dto;

import lombok.Data;

/**
 * @author:吴玉魁
 * @date:2019/9/29_11:14
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
