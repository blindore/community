package life.majiang.community.exception;

/**
 * @author:吴玉魁
 * @date:2019/10/14_15:15
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001,"问题不存在!"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论"),
    NO_LOGIN(2003,"当前操作需要登录,请登录后重试!"),
    SYS_ERROR(2004,"服务器瓦特了"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在!"),
    COMMENT_NOT_FOUND(2006,"评论不存在!");
    @Override
    public Integer getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
    private Integer code;
    private String message;
    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
