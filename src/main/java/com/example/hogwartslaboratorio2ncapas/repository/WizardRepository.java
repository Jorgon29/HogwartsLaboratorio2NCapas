package com.example.hogwartslaboratorio2ncapas.repository;

import com.example.hogwartslaboratorio2ncapas.domain.entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WizardRepository extends JpaRepository<Wizard, UUID> {
    List<Wizard> findWizardsByPatronus(String patronus);

    List<Wizard> findWizardsIsDeatheaterTrue();

    void updateWizardById(UUID id, Wizard wizard);
}

