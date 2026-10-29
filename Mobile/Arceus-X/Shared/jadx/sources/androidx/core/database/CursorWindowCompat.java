package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String name, long windowSizeBytes) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new CursorWindow(name, windowSizeBytes);
        }
        if (i10 >= 15) {
            return new CursorWindow(name);
        }
        return new CursorWindow(false);
    }
}
