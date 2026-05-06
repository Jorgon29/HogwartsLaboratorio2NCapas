package com.example.hogwartslaboratorio2ncapas.service;

import com.example.hogwartslaboratorio2ncapas.domain.entity.Wizard;

import java.util.List;
import java.util.UUID;

public interface WizardService {
    public void createWizard(Wizard wizard);
    public List<Wizard> findAllWizards();
    public List<Wizard> findWizardsByPatronus(String patronus);
    public List<Wizard> findWizardsIsDeatheaterTrue();
    public void updateWizardById(UUID id, Wizard wizard);
    public void deleteWizardById(UUID id);
}

