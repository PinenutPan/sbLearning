package pan.main.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * pan.main.controller.GirlController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint point){
       ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder .getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        logger.info("url={}",request.getRequestURL());
        // method
        logger.info("method={}",request.getMethod());
        // ip
        logger.info("ip={}",request.getRemoteUser());
        // 类方法
        logger.info("class_method={}",point.getSignature().getDeclaringTypeName()+"."+point.getSignature().getName());
        // 参数
        logger.info("args={}",point.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("方法执行前通知");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object) throws Exception{
        logger.info("response={}",object.toString());

    }

}
