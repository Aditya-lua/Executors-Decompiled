package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: androidx.core.view.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0614k {
    /* JADX INFO: renamed from: a */
    public static void m2929a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    /* JADX INFO: renamed from: b */
    public static int m2930b(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
