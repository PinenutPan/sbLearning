package pan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.main.ResultEnum;
import pan.main.domain.Girl;
import pan.main.exception.GirlException;
import pan.main.repository.GirlRepository;

/**
 * @author pjp
 * @date 2018年4月28日23:25:37
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    /**
     * 获取一个生数据
     * @param id
     */
    public void gerGirl(Integer id) throws Exception{
        Girl girl = girlRepository.findById(id).orElse(null);
        Integer age = girl.getAge();
        if (age<10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>10 && age<13){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
}
