package p462u9;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: u9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11812c {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static byte[] m44171a(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m44172b(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
