package pan.main;

/**
 * @author pjp
 * @date 2018年4月29日00:10:10
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能在上小学"),
    MIDDLE_SCHOOL(101,"你可能在上初中")
    ;

    ResultEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    };
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
