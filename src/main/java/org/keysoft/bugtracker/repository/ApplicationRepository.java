package org.keysoft.bugtracker.repository;

import org.keysoft.bugtracker.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
