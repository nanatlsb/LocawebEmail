package br.com.fiap.locaweb.LocawebEmail.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTS_MASTER")
public class ContactsMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contacts_master_seq")
    @SequenceGenerator(name = "contacts_master_seq", sequenceName = "contacts_master_seq", allocationSize = 1)
    @Column(name = "CONTACT_ID")
    private Integer contactId;

    @Column(name = "CONTACT_NAME")
    private String contactName;

    @Column(name = "CONTACT_NUMBER")
    private Long contactNumber;
}
