package com.bytatech.ayoos.client.doctor.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Review.
 */

@Document(indexName = "review")
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    private Long id;

   
    private String review;

    
    private Ratting ratting;

   
    private Set<Reply> replies = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public Review review(String review) {
        this.review = review;
        return this;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Ratting getRatting() {
        return ratting;
    }

    public Review ratting(Ratting ratting) {
        this.ratting = ratting;
        return this;
    }

    public void setRatting(Ratting ratting) {
        this.ratting = ratting;
    }

    public Set<Reply> getReplies() {
        return replies;
    }

    public Review replies(Set<Reply> replies) {
        this.replies = replies;
        return this;
    }

    public Review addReply(Reply reply) {
        this.replies.add(reply);
        reply.setReview(this);
        return this;
    }

    public Review removeReply(Reply reply) {
        this.replies.remove(reply);
        reply.setReview(null);
        return this;
    }

    public void setReplies(Set<Reply> replies) {
        this.replies = replies;
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
        Review review = (Review) o;
        if (review.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), review.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Review{" +
            "id=" + getId() +
            ", review='" + getReview() + "'" +
            "}";
    }
}
