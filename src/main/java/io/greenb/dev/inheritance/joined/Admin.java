package io.greenb.dev.inheritance.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JOINED_MEMBER_ADMIN")
@DiscriminatorValue("ADMIN")
@Setter @Getter
class Admin extends JoinedTypeMember {

  @Column(name = "DEPT_CD")
  private String department;

}
