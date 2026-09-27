package com.example.notepad_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;


@Entity 
@Table(name = "users")
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (unique = true, nullable = false)
    private String username;

    @Column (nullable = false)
    private String password;

    @Column (unique = true, nullable = false)
    private String email;

    @Column (name="created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist 
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
