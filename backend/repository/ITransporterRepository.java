package com.example.transporter.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.transporter.backend.model.Transporter;

@Repository
public interface ITransporterRepository extends JpaRepository<Transporter, Long> {
    //<S extends Transporter> void save(Transporter transporter);
    //   List<Tutorial> findByPublished(boolean published);

//   List<Tutorial> findByTitleContaining(String title);
}
