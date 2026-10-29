package p456u2;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: u2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11774c {

    /* JADX INFO: renamed from: u2.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static <T> T m44056a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m44055a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.m44056a(bundle, str, cls);
        }
        T t8 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t8)) {
            return t8;
        }
        return null;
    }
}
