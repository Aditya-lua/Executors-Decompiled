package ge;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
