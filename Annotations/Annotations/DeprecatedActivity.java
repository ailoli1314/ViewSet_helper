package Annotations;

import com.example.zhenmei.MainNewActivity_tow;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 配合 hook startactivity，实现：通过注解 对过时的activity重定向到正确的activity，
 * 避免某个常用的activity重写后要到处修改
 * em~,android10（华为 meta 30_5G）貌似hook不了？？
 * 这就是hook的危险所在，系统更新 源码一改 ，程序就出问题了
 */
@Deprecated
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedActivity {
    Class value() default MainNewActivity_tow.class;
}
