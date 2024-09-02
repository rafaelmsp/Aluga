package com.rafaelpassos.backend.controller;

import com.rafaelpassos.backend.model.Locatario;
import com.rafaelpassos.backend.repository.LocatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/locatarios")
public class LocatarioController {

    @Autowired
    private LocatarioRepository locatarioRepository;

    // Create a new Locatario
    @PostMapping
    public Locatario createLocatario(@RequestBody Locatario locatario) {
        return locatarioRepository.save(locatario);
    }

    // Get all Locatarios
    @GetMapping
    public List<Locatario> getAllLocatarios() {
        return locatarioRepository.findAll();
    }

    // Get a Locatario by ID
    @GetMapping("/{id}")
    public ResponseEntity<Locatario> getLocatarioById(@PathVariable Long id) {
        Optional<Locatario> locatario = locatarioRepository.findById(id);
        if (locatario.isPresent()) {
            return ResponseEntity.ok(locatario.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Update a Locatario
    @PutMapping("/{id}")
    public ResponseEntity<Locatario> updateLocatario(@PathVariable Long id, @RequestBody Locatario locatarioDetails) {
        Optional<Locatario> locatario = locatarioRepository.findById(id);
        if (locatario.isPresent()) {
            Locatario locatarioToUpdate = locatario.get();
            locatarioToUpdate.setNome(locatarioDetails.getNome());
            locatarioToUpdate.setCpf(locatarioDetails.getCpf());
            locatarioToUpdate.setEmail(locatarioDetails.getEmail());
            locatarioToUpdate.setTelefone(locatarioDetails.getTelefone());
            locatarioToUpdate.setEndereco(locatarioDetails.getEndereco());
            locatarioToUpdate.setDataNascimento(locatarioDetails.getDataNascimento());

            Locatario updatedLocatario = locatarioRepository.save(locatarioToUpdate);
            return ResponseEntity.ok(updatedLocatario);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Delete a Locatario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocatario(@PathVariable Long id) {
        if (locatarioRepository.existsById(id)) {
            locatarioRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
