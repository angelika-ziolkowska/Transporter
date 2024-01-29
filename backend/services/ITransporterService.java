package com.example.transporter.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.example.transporter.backend.model.Transporter;

public interface ITransporterService {
    ArrayList<Transporter> getAndSaveAllResponses();
    void saveToDatabase(Transporter transporter);
    List<Transporter> createTransporter(List<Transporter> transporter);
    List<Transporter> findAllTransporters();
    Transporter findById(Long id);
    boolean delete(Long id);
    boolean update(Transporter b);
}
