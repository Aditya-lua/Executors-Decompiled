package eb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f16004a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f16005c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f16006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f16007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r3 f16008f;

    static {
        byte[] bArr = new byte[0];
        f16006d = bArr;
        f16007e = ByteBuffer.wrap(bArr);
        int i10 = r3.f15984a;
        o3 o3Var = new o3(bArr, 0, 0, false, null);
        o3Var.a(0);
        f16008f = o3Var;
    }
}
