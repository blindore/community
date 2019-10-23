package life.majiang.community.enums;

/**
 * @author:吴玉魁
 * @date:2019/10/21_16:37
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }

}
