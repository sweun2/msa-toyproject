package msa.service1.domain.discovery.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service2")
public interface FeignClientCommunicator {
    @GetMapping("/name/{id}")
    String getName(@PathVariable("id") String id);
}

