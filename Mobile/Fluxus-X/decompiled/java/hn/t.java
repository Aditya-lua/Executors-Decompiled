package hn;

import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18397h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18391a = 0;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f18392c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18393d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18398i = -1;

    public static t r(ew.f fVar) {
        return new p(fVar);
    }

    public final void A(boolean z10) {
        this.f18395f = z10;
    }

    public final void E(boolean z10) {
        this.f18396g = z10;
    }

    public abstract t I(double d10);

    public abstract t K(long j10);

    public final t L(ew.g gVar) {
        if (this.f18397h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + x());
        }
        ew.f fVarY = Y();
        try {
            gVar.a0(fVarY);
            if (fVarY != null) {
                fVarY.close();
            }
            return this;
        } catch (Throwable th2) {
            if (fVarY != null) {
                try {
                    fVarY.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract t N(Boolean bool);

    public abstract t O(Number number);

    public abstract t Q(String str);

    public abstract t T(boolean z10);

    public abstract ew.f Y();

    public abstract t a();

    public final int b() {
        int iS = s();
        if (iS != 5 && iS != 3 && iS != 2 && iS != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f18398i;
        this.f18398i = this.f18391a;
        return i10;
    }

    public abstract t c();

    public final boolean d() {
        int i10 = this.f18391a;
        int[] iArr = this.b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new j("Nesting too deep at " + x() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f18392c;
        this.f18392c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f18393d;
        this.f18393d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof s)) {
            return true;
        }
        s sVar = (s) this;
        Object[] objArr = sVar.f18388j;
        sVar.f18388j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract t e();

    public final void f(int i10) {
        this.f18398i = i10;
    }

    public abstract t g();

    public final String h() {
        String str = this.f18394e;
        return str != null ? str : BuildConfig.FLAVOR;
    }

    public final boolean k() {
        return this.f18396g;
    }

    public final boolean m() {
        return this.f18395f;
    }

    public final t n(Object obj) {
        if (obj instanceof Map) {
            c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                o((String) key);
                n(entry.getValue());
            }
            g();
            return this;
        }
        if (obj instanceof List) {
            a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n(it.next());
            }
            e();
            return this;
        }
        if (obj instanceof String) {
            Q((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            T(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            I(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            K(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            O((Number) obj);
            return this;
        }
        if (obj == null) {
            p();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public abstract t o(String str);

    public abstract t p();

    public final int s() {
        int i10 = this.f18391a;
        if (i10 != 0) {
            return this.b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void u() {
        int iS = s();
        if (iS != 5 && iS != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f18397h = true;
    }

    public final void w(int i10) {
        int[] iArr = this.b;
        int i11 = this.f18391a;
        this.f18391a = i11 + 1;
        iArr[i11] = i10;
    }

    public final String x() {
        return n.a(this.f18391a, this.b, this.f18392c, this.f18393d);
    }

    public final void y(int i10) {
        this.b[this.f18391a - 1] = i10;
    }

    public void z(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f18394e = str;
    }
}
