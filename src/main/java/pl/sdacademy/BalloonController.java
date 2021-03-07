package pl.sdacademy;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/balloon")
public class BalloonController {
    private BalloonRepository ballonRepository;

    public BalloonController(BalloonRepository ballonRepository) {
        this.ballonRepository = ballonRepository;
    }

    @GetMapping
    public List<Balloon> getAll(){
        return ballonRepository.findAll();
    }
    @PostMapping
    public Balloon create(@RequestBody Balloon balloon){
        return ballonRepository.save(balloon);
    }
}

