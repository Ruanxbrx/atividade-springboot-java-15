package resources;

import entities.Servidor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/servidor")
public class ServidorResources {
    @GetMapping
    public ResponseEntity<Servidor> findAll(){
        Servidor u = new Servidor(1L,"ruan",1L,LocalDateTime.now());
        return ResponseEntity.ok().body(u);
    }
}
