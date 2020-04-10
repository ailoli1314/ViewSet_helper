package utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import Annotations.TextviewSetUtil;

public class TextviewSethelp {
    public static void bind(Class classaction, Activity context, Object classobj){
        Field[] ms = classaction.getDeclaredFields();
        for (Field m : ms) {
            if (m.isAnnotationPresent(TextviewSetUtil.class)) {
                TextviewSetUtil d1=m.getAnnotation(TextviewSetUtil.class);
                m.setAccessible(true);
                try {
                    if(d1.isiv()){
                        Glide.with(context).load(m.get(classobj)).into((ImageView) context.findViewById(d1.id()));
                    }else{
                        ((TextView)context.findViewById(d1.id())).setText(d1.head()+m.get(classobj)+d1.foot());
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void bind(Class classaction, View view, Object classobj){
        Field[] ms = classaction.getDeclaredFields();
        for (Field m : ms) {
            if (m.isAnnotationPresent(TextviewSetUtil.class)) {
                TextviewSetUtil d1=m.getAnnotation(TextviewSetUtil.class);
                m.setAccessible(true);
                try {
                    if (d1.isiv()) {
                        Glide.with(view.getContext()).load(m.get(classobj)).into((ImageView) view.findViewById(d1.id()));
                    } else {
                        ((TextView)view.findViewById(d1.id())).setText(d1.head()+m.get(classobj)+d1.foot());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
