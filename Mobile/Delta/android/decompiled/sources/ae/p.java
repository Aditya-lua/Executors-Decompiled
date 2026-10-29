package ae;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static o a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            return (i10 == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new a0() : new c0();
        }
        return new z();
    }
}
