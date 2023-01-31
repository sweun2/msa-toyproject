package msa.service2.domain.name.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getName(String id) {
        return switch (id) {
            case "1" -> "Jesse";
            case "2" -> "Jimmy";
            default -> "UnKnown";
        };
    }
}

