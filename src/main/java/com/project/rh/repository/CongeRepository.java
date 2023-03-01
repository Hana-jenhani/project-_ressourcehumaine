package com.project.rh.repository;

import com.project.rh.model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CongeRepository extends JpaRepository<Conge, Long> {
    @Query("select c from Conge c where c.statusOfDemand like 'Waiting'")
    public List<Conge> getCongeByStatus();

    @Query("select count(duree) from Conge c where c.user.idUser = :id")
    public int countDuree(Long id );
}
