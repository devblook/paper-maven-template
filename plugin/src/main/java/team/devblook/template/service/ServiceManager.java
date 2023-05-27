package team.devblook.template.service;

import team.devblook.template.api.Service;

import java.util.LinkedHashSet;
import java.util.Set;

public class ServiceManager {

    private final Set<Service> serviceSet = new LinkedHashSet<>();

    public void register(Service service) {
        serviceSet.add(service);
    }

    public void start() {
        serviceSet.forEach(Service::start);
    }

    public void stop() {
        serviceSet.forEach(Service::stop);
    }
}
