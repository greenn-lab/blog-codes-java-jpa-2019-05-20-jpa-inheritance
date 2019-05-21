package io.greenb.dev.inheritance.table_per_class;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLEPERCLASS_MEMBER_ADMIN")
@Setter
@Getter
class Admin extends TablePerClassMember {

  @Column(name = "DEPT_CD")
  private String department;

}
