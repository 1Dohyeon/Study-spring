package hello.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class CallBackTest {
    @Test
    public void callBackTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        CallBack callBack = ac.getBean(CallBack.class);
        ac.close(); //스프링 컨테이너를 종료, ConfigurableApplicationContext 필요
    }
    @Configuration
    static class LifeCycleConfig {
        @Bean
        public CallBack callBack() {
            CallBack callBack = new CallBack();
            callBack.setId("KIM");
            return callBack;
        }
    }
}
