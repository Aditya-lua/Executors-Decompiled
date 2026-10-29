package u9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean b(@NonNull T[] tArr, T t8) {
        int length = tArr != null ? tArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (n9.k.b(tArr[i10], t8)) {
                if (i10 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
