package Annotations;

import com.example.zhenmei.R;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  辅助类 GuiBhelp ：判空操作 ，可对 变量及edittext判空，偷懒用的
 */
@Target({ElementType.FIELD,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NoNull {
    String[] value() default "不能为空~";
}
