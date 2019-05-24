package com.dao;

import com.entity.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInformationDao extends JpaRepository<PersonalInformation, Long> {
}
