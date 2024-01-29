// package com.example.books.backend.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name= "timings")
// class Timing {
//     @Id
// 	@GeneratedValue(strategy = GenerationType.AUTO)
// 	private long id;
    
//     @Column(name = "type")
//     private String type;

//     @Column(name = "countdownServerAdjustment")
//     private String countdownServerAdjustment;

//     @Column(name = "source")
//     private String source;

//     @Column(name = "insert")
//     private String insert;

//     @Column(name = "read")
//     private String read;

//     @Column(name = "sent")
//     private String sent;

//     @Column(name = "received")
//     private String received;

//     public Timing(String type,
//                     String countdownServerAdjustment,
//                     String source,
//                     String insert,
//                     String read,
//                     String sent,
//                     String received) {
//         super();
//         this.type = type;
//         this.countdownServerAdjustment = countdownServerAdjustment;
//         this.source = source;
//         this.insert = insert;
//         this.read = read;
//         this.sent = sent;
//         this.received = received;
//     }

//     @Override
// 	public String toString() {
// 		return "Timing [id=" + id + ", type=" + type +
//             ", countdownServerAdjustment=" + countdownServerAdjustment +
//             ", source=" + source + 
//             ", insert=" + insert +
//             ", read=" + read +
//             ", sent=" + sent +
//             ", received=" + received +
//             "]";
// 	}

//     public long getId() {
//         return id;
//     }

//     public String getType() {
//         return type;
//     }

//     public void setType(String type) {
//         this.type = type;
//     } 

//     public String getCountdownServerAdjustment() {
//         return countdownServerAdjustment;
//     }

//     public void setCountdownServerAdjustment(String countdownServerAdjustment) {
//         this.countdownServerAdjustment = countdownServerAdjustment;
//     } 

//     public String getSource() {
//         return source;
//     }

//     public void setSource(String source) {
//         this.source = source;
//     } 

//     public String getInsert() {
//         return insert;
//     }

//     public void setInsert(String insert) {
//         this.insert = insert;
//     } 

//     public String getRead() {
//         return read;
//     }

//     public void setRead(String read) {
//         this.read = read;
//     } 

//     public String getSent() {
//         return sent;
//     }

//     public void setSent(String sent) {
//         this.sent = sent;
//     } 

//     public String getReceived() {
//         return received;
//     }

//     public void setReceived(String received) {
//         this.received = received;
//     } 
// }
