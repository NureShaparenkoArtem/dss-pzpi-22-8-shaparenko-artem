package com.example.SRBDlab3.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public Integer countWorkersByAddressScalar(String addressInput) {
        return workerRepository.countWorkersByAddressScalar(addressInput);
    }

    public List<String> countWorkersByAddressTabular(String addressInput) {
        return workerRepository.countWorkersByAddressTabular(addressInput);
    }

    public List<Worker> getWorkers() {
        return workerRepository.findAll();
    }
}
