package com.example.capstone3.Repository;

import com.example.capstone3.Model.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackathonRepository extends JpaRepository<Hackathon,Integer> {
    Hackathon findHackathonById(Integer id);
}
