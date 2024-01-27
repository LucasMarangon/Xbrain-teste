package br.com.springbootXB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

   @Id
    private Long id;
    private String username;
    private String password;
    private List<String> roles;
 }
    
    // Armazenar e retornar quando requisitado os dados básicos do cliente que foram definidos.