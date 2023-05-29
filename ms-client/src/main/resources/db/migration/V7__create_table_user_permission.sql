CREATE TABLE tb_users_permission (
    id_user SMALLINT,
    id_permission SMALLINT,
    PRIMARY KEY(id_user, id_permission),
    CONSTRAINT fk_user_permission FOREIGN KEY (id_user) REFERENCES tb_users(id),
    CONSTRAINT fk_permission_permissions FOREIGN KEY (id_permission) REFERENCES tb_permissions(id)
);
