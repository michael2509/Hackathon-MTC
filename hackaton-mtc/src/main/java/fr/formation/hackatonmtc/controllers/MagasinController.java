package fr.formation.hackatonmtc.controllers;

import fr.formation.hackatonmtc.dtos.MagasinDto;
import fr.formation.hackatonmtc.entities.Magasin;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("situation")
public class MagasinController {

    @PostMapping
    protected void create(@Valid @RequestBody MagasinDto dto) {
        Magasin magasin = populate(dto);
    }

    protected Magasin populate(MagasinDto dto) {
        Magasin magasin = new Magasin(dto.getNbArticlesByClient(), dto.getVelocites());
        return magasin;
    }

}