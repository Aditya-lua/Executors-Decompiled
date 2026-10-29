package eb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15390a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f15391c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f15392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f15393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r3 f15394f;

    static {
        byte[] bArr = new byte[0];
        f15392d = bArr;
        f15393e = ByteBuffer.wrap(bArr);
        int i10 = r3.f15370a;
        o3 o3Var = new o3(bArr, 0, 0, false, null);
        o3Var.a(0);
        f15394f = o3Var;
    }
}
