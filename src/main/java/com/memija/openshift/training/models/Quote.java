package com.memija.openshift.training.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

  private Long id;
  @JsonProperty("quote")
  private String content;
  private String author;

  // Empty constructor needed for Jackson deserialization
  public Quote() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Quote{" +
        "id=" + id +
        ", content='" + content + '\'' +
        ", author='" + author + '\'' +
        '}';
  }
}
