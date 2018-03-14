package top.linxz.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.linxz.java.domain.Girl;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
}
