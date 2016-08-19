package com.yottapeng.blog.repositories;

import com.yottapeng.blog.models.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yottapeng<i@yottapeng.com>
 */
@Repository
@Transactional
public interface SettingRepository extends JpaRepository<Setting, Long> {
    Setting findByKey(String key);
}
