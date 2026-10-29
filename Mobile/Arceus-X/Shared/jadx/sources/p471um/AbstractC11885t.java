package p471um;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: um.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11885t implements Closeable, Flushable {

    /* JADX INFO: renamed from: e */
    public String f42171e;

    /* JADX INFO: renamed from: f */
    public boolean f42172f;

    /* JADX INFO: renamed from: g */
    public boolean f42173g;

    /* JADX INFO: renamed from: h */
    public boolean f42174h;

    /* JADX INFO: renamed from: a */
    public int f42167a = 0;

    /* JADX INFO: renamed from: b */
    public int[] f42168b = new int[32];

    /* JADX INFO: renamed from: c */
    public String[] f42169c = new String[32];

    /* JADX INFO: renamed from: d */
    public int[] f42170d = new int[32];

    /* JADX INFO: renamed from: i */
    public int f42175i = -1;

    /* JADX INFO: renamed from: q */
    public static AbstractC11885t m44393q(InterfaceC12926f interfaceC12926f) {
        return new C11881p(interfaceC12926f);
    }

    /* JADX INFO: renamed from: B */
    public final void m44394B(boolean z10) {
        this.f42173g = z10;
    }

    /* JADX INFO: renamed from: F */
    public abstract AbstractC11885t mo44363F(double d10);

    /* JADX INFO: renamed from: H */
    public abstract AbstractC11885t mo44364H(long j10);

    /* JADX INFO: renamed from: I */
    public abstract AbstractC11885t mo44365I(Boolean bool);

    /* JADX INFO: renamed from: L */
    public abstract AbstractC11885t mo44366L(Number number);

    /* JADX INFO: renamed from: M */
    public abstract AbstractC11885t mo44367M(String str);

    /* JADX INFO: renamed from: P */
    public final AbstractC11885t m44395P(InterfaceC12928g interfaceC12928g) {
        if (this.f42174h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        InterfaceC12926f interfaceC12926fMo44369X = mo44369X();
        try {
            interfaceC12928g.mo48003K2(interfaceC12926fMo44369X);
            if (interfaceC12926fMo44369X != null) {
                interfaceC12926fMo44369X.close();
            }
            return this;
        } catch (Throwable th2) {
            if (interfaceC12926fMo44369X != null) {
                try {
                    interfaceC12926fMo44369X.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: U */
    public abstract AbstractC11885t mo44368U(boolean z10);

    /* JADX INFO: renamed from: X */
    public abstract InterfaceC12926f mo44369X();

    /* JADX INFO: renamed from: a */
    public abstract AbstractC11885t mo44371a();

    /* JADX INFO: renamed from: b */
    public final int m44396b() {
        int iM44403r = m44403r();
        if (iM44403r != 5 && iM44403r != 3 && iM44403r != 2 && iM44403r != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f42175i;
        this.f42175i = this.f42167a;
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC11885t mo44374c();

    /* JADX INFO: renamed from: d */
    public final boolean m44397d() {
        int i10 = this.f42167a;
        int[] iArr = this.f42168b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new C11875j("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f42168b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f42169c;
        this.f42169c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f42170d;
        this.f42170d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof C11884s)) {
            return true;
        }
        C11884s c11884s = (C11884s) this;
        Object[] objArr = c11884s.f42163j;
        c11884s.f42163j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC11885t mo44375e();

    /* JADX INFO: renamed from: f */
    public final void m44398f(int i10) {
        this.f42175i = i10;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC11885t mo44378g();

    public final String getPath() {
        return C11879n.m44345a(this.f42167a, this.f42168b, this.f42169c, this.f42170d);
    }

    /* JADX INFO: renamed from: h */
    public final String m44399h() {
        String str = this.f42171e;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: j */
    public final boolean m44400j() {
        return this.f42173g;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m44401l() {
        return this.f42172f;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC11885t m44402m(Object obj) {
        if (obj instanceof Map) {
            mo44374c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                mo44380n((String) key);
                m44402m(entry.getValue());
            }
            mo44378g();
            return this;
        }
        if (obj instanceof List) {
            mo44371a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m44402m(it.next());
            }
            mo44375e();
            return this;
        }
        if (obj instanceof String) {
            mo44367M((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            mo44368U(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            mo44363F(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            mo44364H(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            mo44366L((Number) obj);
            return this;
        }
        if (obj == null) {
            mo44381o();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: n */
    public abstract AbstractC11885t mo44380n(String str);

    /* JADX INFO: renamed from: o */
    public abstract AbstractC11885t mo44381o();

    /* JADX INFO: renamed from: r */
    public final int m44403r() {
        int i10 = this.f42167a;
        if (i10 != 0) {
            return this.f42168b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: s */
    public final void m44404s() {
        int iM44403r = m44403r();
        if (iM44403r != 5 && iM44403r != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f42174h = true;
    }

    /* JADX INFO: renamed from: u */
    public final void m44405u(int i10) {
        int[] iArr = this.f42168b;
        int i11 = this.f42167a;
        this.f42167a = i11 + 1;
        iArr[i11] = i10;
    }

    /* JADX INFO: renamed from: v */
    public final void m44406v(int i10) {
        this.f42168b[this.f42167a - 1] = i10;
    }

    /* JADX INFO: renamed from: w */
    public void mo44382w(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f42171e = str;
    }

    /* JADX INFO: renamed from: y */
    public final void m44407y(boolean z10) {
        this.f42172f = z10;
    }
}
