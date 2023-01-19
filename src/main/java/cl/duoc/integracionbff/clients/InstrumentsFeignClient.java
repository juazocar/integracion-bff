package cl.duoc.integracionbff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.integracionbff.model.dto.Instrumento;

@FeignClient(name = "svc-instruments", url = "http://localhost:8181/instrumentos")
public interface InstrumentsFeignClient {
    
    @GetMapping(path = "/instrumento", produces = { "application/json" })
    public List<Instrumento> getAll();

    @PostMapping(path = "/instrumento", consumes = {"application/json"},  produces = {"application/json"})
    public Instrumento add(@RequestBody Instrumento instrumento);

}
