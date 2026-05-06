package com.example.hogwartslaboratorio2ncapas.repository;

import com.example.hogwartslaboratorio2ncapas.domain.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, UUID> {
    List<Wizard> findWizardsByPatronus(String patronus);

    List<Wizard> findWizardsByIsDeatheaterTrue();

}

