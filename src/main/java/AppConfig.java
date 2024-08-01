import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    //fixme между методами расстояние 1 строка
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Scope("prototype")
    @Bean(name="cat")
    public Cat getNameCat(){
        Cat cat = new Cat();
        cat.setName("Milka");
        return cat;
    }
}