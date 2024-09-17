package br.com.fiap.locaweb.LocawebEmail.controller;

import br.com.fiap.locaweb.LocawebEmail.services.SpamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spam")
public class SpamController {

    private final SpamService spamService;

    @Autowired
    public SpamController(SpamService spamService) {
        this.spamService = spamService;
    }

    @PostMapping("/verificar")
    public ResponseEntity<Boolean> verificarSpam(@RequestBody String corpoEmail) {
        boolean isSpam = spamService.verificarSpam(corpoEmail);
        return ResponseEntity.ok(isSpam);
    }
}
