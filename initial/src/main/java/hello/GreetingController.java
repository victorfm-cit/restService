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

    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String ultimoCaracter = String.valueOf(name.charAt(name.length() - 1));
        if (ultimoCaracter.equals("a")) {
            return "Hello Senhorita " + name;
        } else {
            return "Hello Senhor " + name;
        }
    }

    @RequestMapping("/mathpow") //through the calculator it calculates the value squared
    public String mathpow() {
        double a = Math.pow(2, 2);
        return "resultado: " + a;
    }

    @RequestMapping("/calculator")
    public double calculator(@RequestParam(value = "num", defaultValue = "World") double num) {
        num = Math.pow(num, 2);
        return num;
    }
}