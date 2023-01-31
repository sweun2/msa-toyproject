package msa.service2.domain.name.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import msa.service2.domain.name.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping(value="/name")
public class NameController {

    private final NameService nameService;

    @GetMapping(value = "/{id}")
    public String name(@PathVariable("id") String id) {
        return nameService.getName(id);
    }
}