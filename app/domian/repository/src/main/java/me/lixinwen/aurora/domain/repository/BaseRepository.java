package me.lixinwen.aurora.domain.repository;

import me.lixinwen.aurora.domian.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by chucklee on 2016/11/24.
 */
@NoRepositoryBean
public interface BaseRepository<TEntity extends BaseEntity> extends JpaRepository<TEntity, Long> {
}
