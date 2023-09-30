package az.ingress.ms2.Service;

import az.ingress.ms2.dto.XDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
@Slf4j
@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {
    @Override
    public XDto sayHello1(String language) {
        return null;
    }

    @Override
@SneakyThrows
public XDto sayHello1(){

    Thread.sleep(new Random().nextInt(1000));

        return new XDto("Hello World1");
    }

    @Override
    @SneakyThrows
    public XDto sayHello2() {

        Thread.sleep(new Random().nextInt(1000));


        return new XDto("Hello World2");
    }

    @Override
    @SneakyThrows
    public XDto sayHello3(){
        Thread.sleep(new Random().nextInt(1000));
        return new XDto("Hello World3");
    }
}
