package um;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32452h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32446a = 0;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f32447c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f32448d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32453i = -1;

    public static t q(xu.f fVar) {
        return new p(fVar);
    }

    public final void B(boolean z10) {
        this.f32451g = z10;
    }

    public abstract t F(double d10);

    public abstract t H(long j10);

    public abstract t I(Boolean bool);

    public abstract t L(Number number);

    public abstract t M(String str);

    public final t P(xu.g gVar) {
        if (this.f32452h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        xu.f fVarX = X();
        try {
            gVar.K2(fVarX);
            if (fVarX != null) {
                fVarX.close();
            }
            return this;
        } catch (Throwable th2) {
            if (fVarX != null) {
                try {
                    fVarX.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract t U(boolean z10);

    public abstract xu.f X();

    public abstract t a();

    public final int b() {
        int iR = r();
        if (iR != 5 && iR != 3 && iR != 2 && iR != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f32453i;
        this.f32453i = this.f32446a;
        return i10;
    }

    public abstract t c();

    public final boolean d() {
        int i10 = this.f32446a;
        int[] iArr = this.b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new j("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f32447c;
        this.f32447c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f32448d;
        this.f32448d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof s)) {
            return true;
        }
        s sVar = (s) this;
        Object[] objArr = sVar.f32443j;
        sVar.f32443j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract t e();

    public final void f(int i10) {
        this.f32453i = i10;
    }

    public abstract t g();

    public final String getPath() {
        return n.a(this.f32446a, this.b, this.f32447c, this.f32448d);
    }

    public final String h() {
        String str = this.f32449e;
        return str != null ? str : "";
    }

    public final boolean j() {
        return this.f32451g;
    }

    public final boolean l() {
        return this.f32450f;
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
        int i10 = this.f32446a;
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
        this.f32452h = true;
    }

    public final void u(int i10) {
        int[] iArr = this.b;
        int i11 = this.f32446a;
        this.f32446a = i11 + 1;
        iArr[i11] = i10;
    }

    public final void v(int i10) {
        this.b[this.f32446a - 1] = i10;
    }

    public void w(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f32449e = str;
    }

    public final void y(boolean z10) {
        this.f32450f = z10;
    }
}
