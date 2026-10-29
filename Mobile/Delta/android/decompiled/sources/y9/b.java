package y9;

import android.os.IBinder;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0656a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35780a;

    public b(Object obj) {
        this.f35780a = obj;
    }

    @NonNull
    public static <T> T t2(@NonNull a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).f35780a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        m.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    @NonNull
    public static <T> a u2(@NonNull T t8) {
        return new b(t8);
    }
}
