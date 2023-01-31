package msa.service1.domain.discovery.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import msa.service1.domain.discovery.service.DiscoveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class DiscoveryController {
    private final DiscoveryService discoveryService;

    @GetMapping(value = "/services")
    public List services() {
        return discoveryService.getServices();
    }
    @GetMapping(value = "/feign/{id}")
    public String feign(@PathVariable("id") String id) {
        return discoveryService.feign(id);
    }
}

