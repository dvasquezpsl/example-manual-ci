package co.com.psl.exampleci.domain;

import java.time.LocalDateTime;

public class Person {

  private String id;

  private String name;

  private LocalDateTime birth;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Person withId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person withName(String name) {
    this.name = name;
    return this;
  }

  public LocalDateTime getBirth() {
    return birth;
  }

  public void setBirth(LocalDateTime birth) {
    this.birth = birth;
  }

  public Person withBirth(LocalDateTime birth) {
    this.birth = birth;
    return this;
  }

}
