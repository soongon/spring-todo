package kr.or.ssis.todo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class PerformanceMeasureAspect {

    private static final Logger log =
            LoggerFactory.getLogger(PerformanceMeasureAspect.class);

    @Around("execution(* kr.*.ssis.todo.controller.*.*(..))")
    public Object measurePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        // before 실행
        Instant startTime = Instant.now();
        Object obj = joinPoint.proceed();  // 타겟메소드를 실행한다.
        // after 실행
        Instant endTime = Instant.now();

        // 실행시간 계산
        Duration elapsedTime = Duration.between(startTime, endTime);
        log.info(clsName + "." + methodName + " 에서 실행된 시간은 "
                + elapsedTime.toMillis() + "밀리초 걸렸습니다.");
        return obj;
    }
}
