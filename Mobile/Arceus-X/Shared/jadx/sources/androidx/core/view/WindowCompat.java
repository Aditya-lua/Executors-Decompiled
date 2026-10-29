package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private WindowCompat() {
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) window.requireViewById(i10);
        }
        T t8 = (T) window.findViewById(i10);
        if (t8 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Window");
        }
        return t8;
    }
}
