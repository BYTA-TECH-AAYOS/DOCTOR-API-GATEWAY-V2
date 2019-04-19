package com.bytatech.ayoos.client.doctor.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Ratting.
 */

@Document(indexName = "ratting")
public class Ratting implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;

   
    private String userName;

 
    private Double ratting;

   
    private Set<Review> reviews = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public Ratting userName(String userName) {
        this.userName = userName;
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getRatting() {
        return ratting;
    }

    public Ratting ratting(Double ratting) {
        this.ratting = ratting;
        return this;
    }

    public void setRatting(Double ratting) {
        this.ratting = ratting;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public Ratting reviews(Set<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public Ratting addReview(Review review) {
        this.reviews.add(review);
        review.setRatting(this);
        return this;
    }

    public Ratting removeReview(Review review) {
        this.reviews.remove(review);
        review.setRatting(null);
        return this;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
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
        Ratting ratting = (Ratting) o;
        if (ratting.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), ratting.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Ratting{" +
            "id=" + getId() +
            ", userName='" + getUserName() + "'" +
            ", ratting=" + getRatting() +
            "}";
    }
}
