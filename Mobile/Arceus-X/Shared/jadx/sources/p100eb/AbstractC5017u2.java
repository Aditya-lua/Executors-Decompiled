package p100eb;

import java.io.IOException;

/* JADX INFO: renamed from: eb.u2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5017u2 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC5017u2 f19822a = new C5005s2("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b */
    public static final AbstractC5017u2 f19823b = new C5005s2("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c */
    public static final AbstractC5017u2 f19824c = new C5011t2("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d */
    public static final AbstractC5017u2 f19825d = new C5011t2("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e */
    public static final AbstractC5017u2 f19826e = new C4999r2("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: d */
    public static AbstractC5017u2 m23707d() {
        return f19826e;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo23699a(Appendable appendable, byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract int mo23701b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC5017u2 mo23702c();

    /* JADX INFO: renamed from: e */
    public final String m23708e(byte[] bArr, int i10, int i11) {
        C4973n0.m23681e(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo23701b(i11));
        try {
            mo23699a(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
