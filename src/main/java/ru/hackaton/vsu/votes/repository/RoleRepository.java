package ru.hackaton.vsu.votes.repository;

import ru.hackaton.vsu.votes.model.Role;
import ru.hackaton.vsu.votes.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}