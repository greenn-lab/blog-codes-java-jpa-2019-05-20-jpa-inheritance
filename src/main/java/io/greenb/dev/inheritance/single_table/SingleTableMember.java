package io.greenb.dev.inheritance.single_table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SINGLETABLE_MEMBER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "MEMBER_TYPE")
@Setter
@Getter
abstract class SingleTableMember {

  @Id
  @Column(name = "MEMBER_ID")
  private Long id;

  private String username;
  private String password;

  // Admin
  @Column(name = "DEPT_CD")
  private String department;

  // Seller
  private String company;

  // Customer
  private String email;

}
