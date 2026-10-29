package androidx.core.util;

import android.os.Build;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object a10, @Nullable Object b) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(a10, b);
        }
        return a10 == b || (a10 != null && a10.equals(b));
    }

    public static int hashCode(@Nullable Object o8) {
        if (o8 != null) {
            return o8.hashCode();
        }
        return 0;
    }

    public static int hash(@Nullable Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(values);
        }
        return Arrays.hashCode(values);
    }
}
