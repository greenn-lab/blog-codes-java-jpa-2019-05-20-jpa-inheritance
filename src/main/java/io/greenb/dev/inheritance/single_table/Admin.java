package io.greenb.dev.inheritance.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
class Admin extends SingleTableMember {
}
