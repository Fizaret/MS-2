package az.ingress.ms2.Service;

import az.ingress.ms2.dto.XDto;
import lombok.SneakyThrows;
import org.springframework.expression.spel.ast.StringLiteral;
import org.springframework.stereotype.Service;

@Service
public interface HelloService {


    @SneakyThrows
    XDto sayHello1(String language);

    @SneakyThrows
    XDto sayHello1();

    XDto sayHello2();
    XDto sayHello3();

}
