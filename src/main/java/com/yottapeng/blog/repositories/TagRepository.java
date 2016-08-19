package com.yottapeng.blog.repositories;

import com.yottapeng.blog.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yottapeng<i@yottapeng.com>.
 */
public interface TagRepository extends JpaRepository<Tag, Long>{
    Tag findByName(String name);
}
