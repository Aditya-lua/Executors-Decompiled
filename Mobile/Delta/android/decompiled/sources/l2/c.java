package l2;

import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a {
        public static <T> T a(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    public static <T> T a(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(intent, str, cls);
        }
        T t8 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t8)) {
            return t8;
        }
        return null;
    }
}
