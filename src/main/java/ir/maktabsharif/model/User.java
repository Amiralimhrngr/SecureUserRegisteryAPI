package ir.maktabsharif.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "APP_USER",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_app_user_username",
                columnNames = "username"
        )
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(name = "full_name", length = 100)
    private String fullName;
    @Column(nullable = false)
    private short age;
}
