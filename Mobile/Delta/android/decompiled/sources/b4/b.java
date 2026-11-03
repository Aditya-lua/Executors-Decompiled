package b4;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3788a = new Object();
    public static volatile Editable.Factory b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f3789c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f3789c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (f3788a) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f3789c;
        return cls != null ? z3.h.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
