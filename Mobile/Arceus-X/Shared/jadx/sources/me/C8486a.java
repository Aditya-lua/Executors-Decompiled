package me;

import androidx.core.view.inputmethod.EditorInfoCompat;
import p169he.C6384n;

/* JADX INFO: renamed from: me.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8486a extends AbstractC8487b {
    /* JADX INFO: renamed from: a */
    public static int m34269a(int i10, int i11, int i12) {
        C6384n.m27923g(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    /* JADX INFO: renamed from: b */
    public static int m34270b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : (int) j10;
    }
}
