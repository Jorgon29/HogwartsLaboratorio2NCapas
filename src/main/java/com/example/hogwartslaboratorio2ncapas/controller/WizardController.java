package com.example.hogwartslaboratorio2ncapas.controller;

import com.example.hogwartslaboratorio2ncapas.domain.entity.Wizard;
import com.example.hogwartslaboratorio2ncapas.service.WizardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wizards")
public class WizardController {
    private final WizardService wizardService;

    @PostMapping
    public ResponseEntity<Void> createWizard(@RequestBody Wizard wizard) {
        wizardService.createWizard(wizard);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Wizard>> findAllWizards() {
        return ResponseEntity.ok(wizardService.findAllWizards());
    }

    @GetMapping("deatheaters")
    public ResponseEntity<List<Wizard>> findWizardsIsDeatheaterTrue() {
        return ResponseEntity.ok(wizardService.findWizardsIsDeatheaterTrue());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateWizard(@PathVariable UUID id, @RequestBody Wizard wizard) {
        wizard.setId(id);
        wizardService.updateWizardById(id, wizard);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/patronus/{patronus}")
    public ResponseEntity<List<Wizard>> findByPatronus(@PathVariable String patronus) {
        return ResponseEntity.ok(wizardService.findWizardsByPatronus(patronus));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWizard(@PathVariable UUID id) {
        wizardService.deleteWizardById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
