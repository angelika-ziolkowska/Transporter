// package com.example.transporter.backend.repository;

// import java.util.List;
// import java.util.Optional;
// import java.util.function.Function;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort;
// import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;
// import com.example.transporter.backend.model.Transporter;

// @Repository
// public class TransporterRepository implements ITransporterRepository {
//     @Autowired 
//     private JdbcTemplate jdbcTemplate;

//     @Override
//     public int save(Transporter transporter) {
//         return jdbcTemplate.update("INSERT INTO responses (type, id, operationType, vehicleId, naptanId, stationName, lineId, lineName, platformName, direction, bearing, destinationNaptanId, destinationName, timestamp, timeToStation, currentLocation, towards, expectedArrival, timeToLive, modeName, timing) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
//         new Object[] {transporter.getType(), transporter.getId(), 
//           transporter.getOperationType(), 
//           transporter.getVehicleId(), transporter.getNaptanId(), 
//           transporter.getStationName(), transporter.getLineId(), 
//           transporter.getLineName(), transporter.getPlatformName(), 
//           transporter.getDirection(), transporter.getBearing(), 
//           transporter.getDestinationNaptanId(), transporter.getDestinationName(), 
//           transporter.getTimestamp(), transporter.getTimeToStation(), 
//           transporter.getCurrentLocation(), transporter.getTowards(),
//           transporter.getExpectedArrival(), transporter.getTimeToLive(),
//           transporter.getModeName()});
//     }

//     @Override
//     public List<Transporter> findAll() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Transporter> findAll(Sort sort) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Transporter> findAllById(Iterable<Long> ids) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Transporter> List<S> saveAll(Iterable<S> entities) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void flush() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public <S extends Transporter> S saveAndFlush(S entity) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Transporter> List<S> saveAllAndFlush(Iterable<S> entities) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void deleteAllInBatch(Iterable<Transporter> entities) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllByIdInBatch(Iterable<Long> ids) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllInBatch() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public Transporter getOne(Long id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Transporter getById(Long id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Transporter getReferenceById(Long id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Transporter> List<S> findAll(Example<S> example) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Transporter> List<S> findAll(Example<S> example, Sort sort) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Page<Transporter> findAll(Pageable pageable) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Optional<Transporter> findById(Long id) {
//         // TODO Auto-generated method stub
//         return Optional.empty();
//     }

//     @Override
//     public boolean existsById(Long id) {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public long count() {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public void deleteById(Long id) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void delete(Transporter entity) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllById(Iterable<? extends Long> ids) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAll(Iterable<? extends Transporter> entities) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAll() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public <S extends Transporter> Optional<S> findOne(Example<S> example) {
//         // TODO Auto-generated method stub
//         return Optional.empty();
//     }

//     @Override
//     public <S extends Transporter> Page<S> findAll(Example<S> example, Pageable pageable) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Transporter> long count(Example<S> example) {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public <S extends Transporter> boolean exists(Example<S> example) {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public <S extends Transporter, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
//         // TODO Auto-generated method stub
//         return null;
//     }
// }
