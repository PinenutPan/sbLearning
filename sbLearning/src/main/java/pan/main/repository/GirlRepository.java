package pan.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pan.main.domain.Girl;

import java.util.List;

/**
 * @author pjp
 * @date 2018年4月24日23:08:50
 */
public interface GirlRepository extends JpaRepository<Girl, Integer>{
    /**
     * 通过年龄查找女生
     * @param age
     * @return
     */
    List<Girl> findByAge(Integer age);
}
