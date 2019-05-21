package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// @RestController anotação, e o GreetingController abaixo manipula GET solicitações /greeting
// retornando uma nova instância da Greetingclasse:

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")  //A @RequestMapping anotação assegura que as solicitações HTTP
                                // /greeting sejam mapeadas para o greeting() método.

    public String greeting(@RequestParam(value="name", defaultValue ="World") String name) {
         //final String ultimaLetra = name.charAt(name.length()-1);
        String ultimoCaracter = String.valueOf(name.charAt(name.length()-1));
        if (ultimoCaracter.equals("a") )  { //o ultimo caracter
            //name.charAt(name.length()-1);
            return "Hello Senhorita " + name;
            //System.out.println(name.charAt(name.length()-1));

        } else {
            return "Hello Senhor "+name;
            //name.charAt(name.length()-1);
        }

        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}