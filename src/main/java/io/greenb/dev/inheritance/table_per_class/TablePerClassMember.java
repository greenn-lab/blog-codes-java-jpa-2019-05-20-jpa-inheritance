package io.greenb.dev.inheritance.table_per_class;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TABLEPERCLASS_MEMBER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
abstract class TablePerClassMember {

  @Id
  @Column(name = "MEMBER_ID")
  private Long id;

  private String username;
  private String password;

}

