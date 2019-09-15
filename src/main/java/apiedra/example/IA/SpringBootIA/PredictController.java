package apiedra.example.IA.SpringBootIA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictController {

    @PostMapping("/predict")
    public int survive(@RequestBody PredictModel predict){


        return 0;
    }
}
