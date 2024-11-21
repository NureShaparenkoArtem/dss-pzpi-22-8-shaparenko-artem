package com.example.SRBDlab3.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/worker")
@CrossOrigin(origins = "http://localhost:3000")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/count-scalar")
    public Integer countWorkersByAddressScalar(@RequestParam("address") String addressInput) {
        return workerService.countWorkersByAddressScalar(addressInput);
    }

    @GetMapping("/count-tabular")
    public List<String> countWorkersByAddressTabular(@RequestParam("address") String addressInput){
        return workerService.countWorkersByAddressTabular(addressInput);
    }

    @GetMapping
    public List<Worker> getWorkers(){
        return workerService.getWorkers();
    }
}
