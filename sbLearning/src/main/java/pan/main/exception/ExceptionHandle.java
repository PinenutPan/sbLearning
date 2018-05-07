package pan.main.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pan.main.domain.Girl;
import pan.main.domain.Result;
import pan.main.util.ResultUtil;

/**
 * @author pjp
 * @date 2018年4月28日23:26:30
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result hanld(Exception e){
        if (e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }
        return ResultUtil.error(-1,"未知错误");
    }
}
