/**
 * This file was generated by the JPA Modeler
 */ 

package ru.ilb.jparestresource.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Entity
@Table(name="DOCUMENT",uniqueConstraints={@UniqueConstraint(columnNames={"UID"})})
public class Document implements Serializable { 

    @Column(nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    /**
 * Document name
 */
    @XmlElement
    @Basic
    @Size(min=1,max=255,message="must be beweeen 1 and 255 chars")
    private String displayName;

    /**
 * Document description
 */
    @Basic
    private String description;

    /**
 * Document date
 */
    @Basic
    private LocalDate docDate;

    @XmlTransient
    @OneToMany(targetEntity = Docfile.class,mappedBy = "document")
    private List<Docfile> docfiles;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDocDate() {
        return this.docDate;
    }

    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    public List<Docfile> getDocfiles() {
        return this.docfiles;
    }

    public void setDocfiles(List<Docfile> docfiles) {
        this.docfiles = docfiles;
    }


}
