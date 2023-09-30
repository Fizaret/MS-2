package az.ingress.ms2.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Aspect
@Component
@Slf4j
public class ExecutionTimeLogger {
    @Pointcut("execution( * az.ingress.ms2.Service.HelloServiceImpl.sayHello1*(..))")
    public void logExecutionTimePc(){

    }
    @Around(value = "logExecutionTimePc()")
    public void logExecutionTime(ProceedingJoinPoint pc){
        long started = System.currentTimeMillis();
        log.info("Our aspect in action");
        try {
            pc.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}", ended - started);

    }
    @SneakyThrows
    @After(value = "logExecutionTimePc()")
    public void logExecutionTime(JoinPoint joinPoint){
        Arrays.stream(joinPoint.getArgs())
                .forEach((arg)->log.info("arguments are {}",arg));
    }
}
