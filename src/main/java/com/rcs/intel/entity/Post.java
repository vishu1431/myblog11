package com.rcs.intel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String content;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    private String title;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
}
