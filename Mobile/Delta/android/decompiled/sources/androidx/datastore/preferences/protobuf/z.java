package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2398a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f2399c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f2400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f2401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f2402f;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
        T a(int i10);
    }

    public interface c {
        boolean a(int i10);
    }

    public interface d extends f<Integer> {
    }

    public interface e extends f<Long> {
    }

    public interface f<E> extends List<E>, RandomAccess {
        void j();

        boolean n();

        f<E> o(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f2400d = bArr;
        f2401e = ByteBuffer.wrap(bArr);
        f2402f = h.i(bArr);
    }

    public static <T> T a(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T b(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int iH = h(i11, bArr, i10, i11);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object g(Object obj, Object obj2) {
        return ((r0) obj).a().l((r0) obj2).d();
    }

    public static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
