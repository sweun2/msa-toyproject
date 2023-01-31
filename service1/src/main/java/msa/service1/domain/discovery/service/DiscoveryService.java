package msa.service1.domain.discovery.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import msa.service1.domain.discovery.controller.FeignClientCommunicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class DiscoveryService {
    private final DiscoveryClient discoveryClient;
    private final FeignClientCommunicator feignClientCommunicator;
    public List getServices(){
        List<String> services = new ArrayList<String>();
        discoveryClient.getServices().forEach(serviceName -> {
            discoveryClient.getInstances(serviceName).forEach(instance->{
                services.add( String.format("%s:%s",serviceName,instance.getUri()));
            });
        });
        return services;
    }
    public String feign(String id) {
        return id + " is " + feignClientCommunicator.getName(id);
    }
}
