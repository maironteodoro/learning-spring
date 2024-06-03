package learningspring.course.controllers;

import learningspring.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation para identificar um contoller restful // recurso web
@RequestMapping(value = "/users")//annotation para mapear que esse recurso seja chamado quando a url receber
// "/users" exemplo: "localhost:8080/users" dai ele vem parar aqui. Isso seria o endpoint para chamar
//as funcionalidades desse controller
public class UserController {



    @GetMapping //annotaiton que identifica esse metodo como sendo um metodo GET do restful que é
    //para buscar informações
    //ResponseEntity<T> é um generic que é usado para receber respostas de requisições web
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Mairon","mairon@gmail.com","999999","12345");
        return ResponseEntity.ok().body(u);

    }
}
