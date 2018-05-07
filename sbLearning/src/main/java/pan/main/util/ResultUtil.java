package pan.main.util;

import pan.main.domain.Result;

/**
 * @author pjp
 * @date 2018年4月28日23:05:20
 */
public class ResultUtil {
    /**
     *
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
