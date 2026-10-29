package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0892z {

    /* JADX INFO: renamed from: a */
    public static final Charset f3157a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f3158b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final Charset f3159c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d */
    public static final byte[] f3160d;

    /* JADX INFO: renamed from: e */
    public static final ByteBuffer f3161e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC0843h f3162f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public interface a {
        int getNumber();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$b */
    public interface b<T extends a> {
        /* JADX INFO: renamed from: a */
        T m4244a(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean m4245a(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$d */
    public interface d extends f<Integer> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$e */
    public interface e extends f<Long> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$f */
    public interface f<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: j */
        void mo3359j();

        /* JADX INFO: renamed from: n */
        boolean mo3360n();

        /* JADX INFO: renamed from: o */
        f<E> mo3381o(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f3160d = bArr;
        f3161e = ByteBuffer.wrap(bArr);
        f3162f = AbstractC0843h.m3481i(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m4236a(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m4237b(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m4238c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m4239d(byte[] bArr) {
        return m4240e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    public static int m4240e(byte[] bArr, int i10, int i11) {
        int iM4243h = m4243h(i11, bArr, i10, i11);
        if (iM4243h == 0) {
            return 1;
        }
        return iM4243h;
    }

    /* JADX INFO: renamed from: f */
    public static int m4241f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: g */
    public static Object m4242g(Object obj, Object obj2) {
        return ((InterfaceC0874r0) obj).mo4025a().mo3336l((InterfaceC0874r0) obj2).mo4030d();
    }

    /* JADX INFO: renamed from: h */
    public static int m4243h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
