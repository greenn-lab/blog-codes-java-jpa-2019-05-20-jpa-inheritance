package io.greenb.dev.inheritance.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JOINED_MEMBER_CUSTOMER")
@DiscriminatorValue("CUSTOMER")
@Setter @Getter
class Customer extends JoinedTypeMember {

  private String email;

}
