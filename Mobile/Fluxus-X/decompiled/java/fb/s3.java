package fb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f15860a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f15861c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f15862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f15863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r3 f15864f;

    static {
        byte[] bArr = new byte[0];
        f15862d = bArr;
        f15863e = ByteBuffer.wrap(bArr);
        int i10 = r3.f15840a;
        o3 o3Var = new o3(bArr, 0, 0, false, null);
        o3Var.a(0);
        f15864f = o3Var;
    }
}
