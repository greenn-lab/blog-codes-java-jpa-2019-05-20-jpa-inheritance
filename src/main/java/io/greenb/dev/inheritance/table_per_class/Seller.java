package io.greenb.dev.inheritance.table_per_class;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLEPERCLASS_MEMBER_SELLER")
@Setter
@Getter
class Seller extends TablePerClassMember {

  private String company;

}
