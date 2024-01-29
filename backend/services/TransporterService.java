package com.example.transporter.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
//import javax.transaction.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.transporter.backend.model.Transporter;
import com.example.transporter.backend.repository.ITransporterRepository;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransporterService implements ITransporterService {
    @PersistenceContext
    EntityManager entityManager;

    public TransporterService(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Transactional
    public long saveTransporter(Transporter transporter){
        entityManager.persist(transporter);
        return transporter.getIdentityId();
    }
    
    @Autowired
    private ITransporterRepository repository;

    @Override
    public List<Transporter> createTransporter(List<Transporter> transporters) {
        // transporters.forEach((i) -> (
        //     repository.save(i)
        // ));
        return null;
    }

    @Override
    public ArrayList<Transporter> getAndSaveAllResponses() {
        String url = "https://api.tfl.gov.uk/StopPoint/490009333W/arrivals";
        RestTemplate restTemplate = new RestTemplate();
  
        Object[] londonTransportData =  restTemplate.getForObject(url, Object[].class);        

        ArrayList<Transporter> tList = new ArrayList<Transporter>();

        for( Object o : londonTransportData){
            Transporter t = (Transporter)objectMapper(o);
            tList.add(t);
            saveToDatabase(t);
        }

        return tList;
    }

    @Override 
    public void saveToDatabase(Transporter transporter){
        repository.save(transporter);
    }

    public static Object objectMapper(Object object){
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    	Transporter transporter = mapper.convertValue(object, Transporter.class);
        return transporter;
    }

    @Override
    public List<Transporter> findAllTransporters() {
        return (List<Transporter>)repository.findAll();
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        try{
            repository.deleteById(id);
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Transporter findById(Long id) {
        Optional<Transporter> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public boolean update(Transporter transporter) {
        try {
            repository.saveAndFlush(transporter);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
