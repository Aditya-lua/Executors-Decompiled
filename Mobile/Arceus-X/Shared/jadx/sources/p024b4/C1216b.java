package p024b4;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;
import p593z3.C13697h;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1216b extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f5086a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile Editable.Factory f5087b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f5088c;

    @SuppressLint({"PrivateApi"})
    public C1216b() {
        try {
            f5088c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1216b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f5087b == null) {
            synchronized (f5086a) {
                try {
                    if (f5087b == null) {
                        f5087b = new C1216b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f5087b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f5088c;
        return cls != null ? C13697h.m50028c(cls, charSequence) : super.newEditable(charSequence);
    }
}
