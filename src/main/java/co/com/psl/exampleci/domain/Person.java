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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getBirth() {
    return birth;
  }

  public void setBirth(LocalDateTime birth) {
    this.birth = birth;
  }

}
