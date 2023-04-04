package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 t1 = ctx.getBean("java1", TestBean1.class);
        TestBean2 t2 = ctx.getBean("ex", TestBean2.class);
        System.out.println(t2.getData1());
        System.out.println(t2.getData2());
        System.out.println(t2.getData3());

        TestBean3 t3 = ctx.getBean("java4", TestBean3.class);

        ctx.close();
    }
}