package io.greenb.dev.inheritance.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SELLER")
class Seller extends SingleTableMember {
}
