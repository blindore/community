package life.majiang.community.exception;

/**
 * @author:吴玉魁
 * @date:2019/10/14_12:07
 */
public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode(){return code;}
}
