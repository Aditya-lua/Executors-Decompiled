package p462u9;

import androidx.annotation.NonNull;
import p305n9.C8947k;

/* JADX INFO: renamed from: u9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11811b {
    /* JADX INFO: renamed from: a */
    public static boolean m44169a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static <T> boolean m44170b(@NonNull T[] tArr, T t8) {
        int length = tArr != null ? tArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (C8947k.m36026b(tArr[i10], t8)) {
                if (i10 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
