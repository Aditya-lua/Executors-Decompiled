package p261l2;

import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: l2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7976c {

    /* JADX INFO: renamed from: l2.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static <T> T m33031a(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m33030a(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.m33031a(intent, str, cls);
        }
        T t8 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t8)) {
            return t8;
        }
        return null;
    }
}
