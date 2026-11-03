package sm;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31642h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31636a = 0;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f31637c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f31638d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31643i = -1;

    public static t q(vu.f fVar) {
        return new p(fVar);
    }

    public final void A(boolean z10) {
        this.f31641g = z10;
    }

    public abstract t F(double d10);

    public abstract t H(long j10);

    public abstract t I(Boolean bool);

    public abstract t L(Number number);

    public abstract t M(String str);

    public final t P(vu.g gVar) {
        if (this.f31642h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        vu.f fVarW = W();
        try {
            gVar.a3(fVarW);
            if (fVarW != null) {
                fVarW.close();
            }
            return this;
        } catch (Throwable th2) {
            if (fVarW != null) {
                try {
                    fVarW.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract t U(boolean z10);

    public abstract vu.f W();

    public abstract t a();

    public final int b() {
        int iR = r();
        if (iR != 5 && iR != 3 && iR != 2 && iR != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f31643i;
        this.f31643i = this.f31636a;
        return i10;
    }

    public abstract t c();

    public final boolean d() {
        int i10 = this.f31636a;
        int[] iArr = this.b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new j("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f31637c;
        this.f31637c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f31638d;
        this.f31638d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof s)) {
            return true;
        }
        s sVar = (s) this;
        Object[] objArr = sVar.f31633j;
        sVar.f31633j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract t e();

    public final void f(int i10) {
        this.f31643i = i10;
    }

    public abstract t g();

    public final String getPath() {
        return n.a(this.f31636a, this.b, this.f31637c, this.f31638d);
    }

    public final String h() {
        String str = this.f31639e;
        return str != null ? str : "";
    }

    public final boolean j() {
        return this.f31641g;
    }

    public final boolean l() {
        return this.f31640f;
    }

    public final t m(Object obj) {
        if (obj instanceof Map) {
            c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                n((String) key);
                m(entry.getValue());
            }
            g();
            return this;
        }
        if (obj instanceof List) {
            a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m(it.next());
            }
            e();
            return this;
        }
        if (obj instanceof String) {
            M((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            U(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            F(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            H(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            L((Number) obj);
            return this;
        }
        if (obj == null) {
            o();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public abstract t n(String str);

    public abstract t o();

    public final int r() {
        int i10 = this.f31636a;
        if (i10 != 0) {
            return this.b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void s() {
        int iR = r();
        if (iR != 5 && iR != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f31642h = true;
    }

    public final void u(int i10) {
        int[] iArr = this.b;
        int i11 = this.f31636a;
        this.f31636a = i11 + 1;
        iArr[i11] = i10;
    }

    public final void v(int i10) {
        this.b[this.f31636a - 1] = i10;
    }

    public void w(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f31639e = str;
    }

    public final void x(boolean z10) {
        this.f31640f = z10;
    }
}
