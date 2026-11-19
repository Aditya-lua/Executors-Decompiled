package za;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f39208a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f39208a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
