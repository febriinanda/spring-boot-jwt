package com.auth0.samples.authapi.repository;

import com.auth0.samples.authapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
