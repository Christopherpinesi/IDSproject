package com.ids.Justmeet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ids.Justmeet.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);    
}