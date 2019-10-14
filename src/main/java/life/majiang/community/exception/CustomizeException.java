package life.majiang.community.exception;

/**
 * @author:吴玉魁
 * @date:2019/10/14_12:07
 */
public class CustomizeException extends RuntimeException{
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
       this.message = errorCode.getMessage();

    }

    @Override
    public String getMessage() {
        return message;
    }
}
