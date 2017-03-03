/**
 * This file was generated by the JPA Modeler
 */ 

package ru.ilb.jparestresource.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Entity
@Table(name="DOCFILE")
public class Docfile implements Serializable { 

    @Column(nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    /**
 * File comment
 */
    @Basic
    private String comment;

    /**
 * Confirmation status
 */
    @Basic
    private Boolean confirm;

    /**
 * User created
 */
    @Basic
    private String userName;

    @XmlInverseReference(mappedBy="docfiles")
    @ManyToOne(targetEntity = Document.class)
    @JoinColumn(name="DOCUMENT_ID",referencedColumnName="ID",nullable=false)
    private Document document;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean isConfirm() {
        return this.confirm;
    }

    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Document getDocument() {
        return this.document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
