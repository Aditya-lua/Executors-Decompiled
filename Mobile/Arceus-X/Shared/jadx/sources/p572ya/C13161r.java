package p572ya;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: renamed from: ya.r */
/* JADX INFO: loaded from: classes.dex */
public final class C13161r {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f46425a = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public static String m48764a() {
        byte[] bArr = new byte[16];
        f46425a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
