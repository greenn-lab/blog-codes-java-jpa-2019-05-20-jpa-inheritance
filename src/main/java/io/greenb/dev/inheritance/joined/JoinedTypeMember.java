package io.greenb.dev.inheritance.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "JOINED_MEMBER")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "MEMBER_TYPE")
@Setter
@Getter
abstract class JoinedTypeMember {

  @Id
  @Column(name = "MEMBER_ID")
  private Long id;

  private String username;
  private String password;

}
