package Annotations;

import com.example.zhenmei.R;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  辅助类 TextviewSethelp ：用于为不变化的 逻辑简单的 view 初始化数据展示
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TextviewSetUtil {
    int id() default R.id.name;
    String head() default "";//textview 的头部信息 例如：￥ 等
    String foot() default "";// 尾部信息
    boolean isiv() default false;// imageview 标识
}
