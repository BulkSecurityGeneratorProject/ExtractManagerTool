package io.github.jhipster.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A ExtractOrganisationAudit.
 */
@Entity
@Table(name = "extract_organisation_audit")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ExtractOrganisationAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_extract_point")
    private String firstExtractPoint;

    @Column(name = "last_extract_point")
    private String lastExtractPoint;

    @Column(name = "created_date")
    private Instant createdDate;

    @Column(name = "success")
    private Boolean success;

    @ManyToOne
    @JsonIgnoreProperties("extractOrganisationAudits")
    private Organisation organisation;

    @ManyToOne
    @JsonIgnoreProperties("extractOrganisationAudits")
    private ExtractAudit extractAudit;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstExtractPoint() {
        return firstExtractPoint;
    }

    public ExtractOrganisationAudit firstExtractPoint(String firstExtractPoint) {
        this.firstExtractPoint = firstExtractPoint;
        return this;
    }

    public void setFirstExtractPoint(String firstExtractPoint) {
        this.firstExtractPoint = firstExtractPoint;
    }

    public String getLastExtractPoint() {
        return lastExtractPoint;
    }

    public ExtractOrganisationAudit lastExtractPoint(String lastExtractPoint) {
        this.lastExtractPoint = lastExtractPoint;
        return this;
    }

    public void setLastExtractPoint(String lastExtractPoint) {
        this.lastExtractPoint = lastExtractPoint;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public ExtractOrganisationAudit createdDate(Instant createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean isSuccess() {
        return success;
    }

    public ExtractOrganisationAudit success(Boolean success) {
        this.success = success;
        return this;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public ExtractOrganisationAudit organisation(Organisation organisation) {
        this.organisation = organisation;
        return this;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public ExtractAudit getExtractAudit() {
        return extractAudit;
    }

    public ExtractOrganisationAudit extractAudit(ExtractAudit extractAudit) {
        this.extractAudit = extractAudit;
        return this;
    }

    public void setExtractAudit(ExtractAudit extractAudit) {
        this.extractAudit = extractAudit;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtractOrganisationAudit extractOrganisationAudit = (ExtractOrganisationAudit) o;
        if (extractOrganisationAudit.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), extractOrganisationAudit.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ExtractOrganisationAudit{" +
            "id=" + getId() +
            ", firstExtractPoint='" + getFirstExtractPoint() + "'" +
            ", lastExtractPoint='" + getLastExtractPoint() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", success='" + isSuccess() + "'" +
            "}";
    }
}
