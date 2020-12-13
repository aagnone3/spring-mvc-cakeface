package org.lifewithdata.cakeface.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "cake")
public class Cake {
   @Id 
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long id;

   @NotNull
   @Size(min=5, message="Name must be at least 5 characters")
   private String name;

   @ManyToMany(targetEntity = Ingredient.class)
   @Size(min = 1, message = "Choose at least 1 ingredient")
   @Size(max = 5, message = "Choose only up to 5 ingredients")
   private List<Ingredient> ingredients;

   @Column(name = "created_at")
   @CreationTimestamp
   private Date createdAt;

   @Column(name = "updated_at")
   @UpdateTimestamp
   private Date updatedAt;
}
