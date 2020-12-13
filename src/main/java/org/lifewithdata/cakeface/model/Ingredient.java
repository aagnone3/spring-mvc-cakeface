package org.lifewithdata.cakeface.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "ingredient")
public class Ingredient {
   @Id 
   private String id;

   @NotNull
   @Size(min=5, message="Name must be at least 5 characters")
   private String name;

   @Column(name = "created_at")
   @CreationTimestamp
   private Date createdAt;

   @Column(name = "updated_at")
   @UpdateTimestamp
   private Date updatedAt;
}
