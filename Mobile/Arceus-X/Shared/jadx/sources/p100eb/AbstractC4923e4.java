package p100eb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: eb.e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4923e4 implements Comparable {
    /* JADX INFO: renamed from: c */
    public static int m23579c(byte b) {
        return (b >> 5) & 7;
    }

    /* JADX INFO: renamed from: h */
    public static C5047z3 m23580h(long j10) {
        return new C5047z3(j10);
    }

    /* JADX INFO: renamed from: l */
    public static C4911c4 m23581l(String str) {
        return new C4911c4(str);
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC4923e4 m23582n(byte... bArr) {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return C4929f4.m23593a(byteArrayInputStream, new C4941h4(byteArrayInputStream));
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC4923e4 m23583o(InputStream inputStream) {
        return C4929f4.m23593a(inputStream, new C4941h4(inputStream));
    }

    /* JADX INFO: renamed from: a */
    public int mo23557a() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC4923e4 m23584b(Class cls) throws C4917d4 {
        if (cls.isInstance(this)) {
            return (AbstractC4923e4) cls.cast(this);
        }
        throw new C4917d4("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    /* JADX INFO: renamed from: d */
    public final C5036x3 m23585d() {
        return (C5036x3) m23584b(C5036x3.class);
    }

    /* JADX INFO: renamed from: e */
    public final C5047z3 m23586e() {
        return (C5047z3) m23584b(C5047z3.class);
    }

    /* JADX INFO: renamed from: j */
    public final C4905b4 m23587j() {
        return (C4905b4) m23584b(C4905b4.class);
    }

    public abstract int zza();
}
