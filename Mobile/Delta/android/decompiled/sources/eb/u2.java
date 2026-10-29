package eb;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f15410a = new s2("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final u2 b = new s2("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u2 f15411c = new t2("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u2 f15412d = new t2("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u2 f15413e = new r2("base16()", "0123456789ABCDEF");

    public static u2 d() {
        return f15413e;
    }

    public abstract void a(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract int b(int i10);

    public abstract u2 c();

    public final String e(byte[] bArr, int i10, int i11) {
        n0.e(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(b(i11));
        try {
            a(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
