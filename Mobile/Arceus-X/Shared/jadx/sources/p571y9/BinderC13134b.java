package p571y9;

import android.os.IBinder;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import p305n9.C8953m;

/* JADX INFO: renamed from: y9.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC13134b<T> extends InterfaceC13133a.a {

    /* JADX INFO: renamed from: a */
    public final Object f46390a;

    public BinderC13134b(Object obj) {
        this.f46390a = obj;
    }

    @NonNull
    /* JADX INFO: renamed from: t2 */
    public static <T> T m48742t2(@NonNull InterfaceC13133a interfaceC13133a) {
        if (interfaceC13133a instanceof BinderC13134b) {
            return (T) ((BinderC13134b) interfaceC13133a).f46390a;
        }
        IBinder iBinderAsBinder = interfaceC13133a.asBinder();
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
        C8953m.m36047l(field);
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
    /* JADX INFO: renamed from: u2 */
    public static <T> InterfaceC13133a m48743u2(@NonNull T t8) {
        return new BinderC13134b(t8);
    }
}
