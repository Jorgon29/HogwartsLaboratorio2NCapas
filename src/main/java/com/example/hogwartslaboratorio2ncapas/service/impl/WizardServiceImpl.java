package com.example.hogwartslaboratorio2ncapas.service.impl;

import com.example.hogwartslaboratorio2ncapas.domain.entity.Wizard;
import com.example.hogwartslaboratorio2ncapas.repository.WizardRepository;
import com.example.hogwartslaboratorio2ncapas.service.WizardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WizardServiceImpl implements WizardService {
    private final WizardRepository wizardRepository;

    @Override
    public void createWizard(Wizard wizard) {
        wizardRepository.save(wizard);
    }

    @Override
    public List<Wizard> findAllWizards() {
        return wizardRepository.findAll();
    }

    @Override
    public List<Wizard> findWizardsByPatronus(String patronus) {
        return wizardRepository.findWizardsByPatronus(patronus);
    }

    @Override
    public List<Wizard> findWizardsIsDeatheaterTrue() {
        return wizardRepository.findWizardsByIsDeatheaterTrue();
    }

    @Override
    public void updateWizardById(UUID id, Wizard wizard) {
        wizard.setId(id);
        wizardRepository.save(wizard);
    }

    @Override
    public void deleteWizardById(UUID id) {
        wizardRepository.deleteById(id);
    }
}