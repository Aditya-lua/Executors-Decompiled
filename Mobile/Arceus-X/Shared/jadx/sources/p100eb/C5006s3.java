package p100eb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: eb.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5006s3 {

    /* JADX INFO: renamed from: a */
    public static final Charset f19801a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f19802b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f19803c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f19804d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f19805e;

    /* JADX INFO: renamed from: f */
    public static final C5000r3 f19806f;

    static {
        byte[] bArr = new byte[0];
        f19804d = bArr;
        f19805e = ByteBuffer.wrap(bArr);
        int i10 = C5000r3.f19779a;
        C4982o3 c4982o3 = new C4982o3(bArr, 0, 0, false, null);
        c4982o3.m23686a(0);
        f19806f = c4982o3;
    }
}
