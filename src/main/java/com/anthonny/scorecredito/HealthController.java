package com.anthonny.scorecredito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping
    public Map<String, String> health(){
        return Map.of(
                "Status", "Ok",
                "mensagem", "Api de score no ar"
        );
    }

    @GetMapping("/ola")
    public Map<String, String> ola(){
        return Map.of("Mensagem", "Olá, Mundo");
    }
}
