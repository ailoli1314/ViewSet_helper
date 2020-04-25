package Annotations;

import com.example.zhenmei.R;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  辅助类 GuiBhelp ：用于 设置点击事件
 *  需要注意的是 注解的运用会相对导致class文件 初始化的时间延长
 *  主要用于 soquickadapter 万能适配器 的实现，其他的地方也可以 但不必要
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface viewonclick {
    int value() default R.id.name;
}
