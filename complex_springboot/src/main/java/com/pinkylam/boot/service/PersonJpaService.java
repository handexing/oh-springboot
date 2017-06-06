package com.pinkylam.boot.service;

import com.pinkylam.boot.entity.PersonJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午3:25:34
 */
@Repository
public interface PersonJpaService extends JpaRepository<PersonJpa, Long> {

}
