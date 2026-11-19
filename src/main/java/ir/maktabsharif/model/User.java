package ir.maktabsharif.model;

import jakarta.persistence.*;

@Entity
@Table(name = "APP_USER",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_app_user_username",
                columnNames = "username"
        )
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(name = "full_name", length = 100)
    private String fullName;
    private short age;
}
