package br.com.fiap.locaweb.LocawebEmail.services;


import org.springframework.stereotype.Service;

@Service
public class SpamService {

    private static final String PALAVRA_CHAVE = "Promoção";

    public boolean verificarSpam(String corpoEmail) {
        return corpoEmail != null && corpoEmail.contains(PALAVRA_CHAVE);
    }
}
