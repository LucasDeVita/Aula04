package br.usjt.aula04;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;


/**
 * Created by Lucas De Vita on 01/04/2018.
 * RA 81617007
 */
public class util {
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
