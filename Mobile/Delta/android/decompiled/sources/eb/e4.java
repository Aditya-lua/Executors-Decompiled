package eb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class e4 implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static z3 h(long j10) {
        return new z3(j10);
    }

    public static c4 l(String str) {
        return new c4(str);
    }

    public static e4 n(byte... bArr) {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return f4.a(byteArrayInputStream, new h4(byteArrayInputStream));
    }

    public static e4 o(InputStream inputStream) {
        return f4.a(inputStream, new h4(inputStream));
    }

    public int a() {
        return 0;
    }

    public final e4 b(Class cls) throws d4 {
        if (cls.isInstance(this)) {
            return (e4) cls.cast(this);
        }
        throw new d4("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    public final x3 d() {
        return (x3) b(x3.class);
    }

    public final z3 e() {
        return (z3) b(z3.class);
    }

    public final b4 j() {
        return (b4) b(b4.class);
    }

    public abstract int zza();
}
