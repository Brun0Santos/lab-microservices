package io.github.bruno.msclient.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "tb_permissions")
public class PermissionEntity implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    public PermissionEntity() {
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getAuthority() {
        return this.description;
    }
}
