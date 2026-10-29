package n0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceConfig f24654a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f24655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f24656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j4.b> f24657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f24658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range<Integer> f24660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24661i;

    public h(SurfaceConfig surfaceConfig, int i10, Size size, g0.k0 k0Var, List<j4.b> list, n1 n1Var, int i11, Range<Integer> range, boolean z10) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f24654a = surfaceConfig;
        this.b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f24655c = size;
        if (k0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f24656d = k0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f24657e = list;
        this.f24658f = n1Var;
        this.f24659g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f24660h = range;
        this.f24661i = z10;
    }

    @Override // n0.g
    public List<j4.b> b() {
        return this.f24657e;
    }

    @Override // n0.g
    public g0.k0 c() {
        return this.f24656d;
    }

    @Override // n0.g
    public int d() {
        return this.b;
    }

    @Override // n0.g
    public n1 e() {
        return this.f24658f;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f24654a.equals(gVar.h()) && this.b == gVar.d() && this.f24655c.equals(gVar.g()) && this.f24656d.equals(gVar.c()) && this.f24657e.equals(gVar.b()) && ((n1Var = this.f24658f) != null ? n1Var.equals(gVar.e()) : gVar.e() == null) && this.f24659g == gVar.f() && this.f24660h.equals(gVar.i()) && this.f24661i == gVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.g
    public int f() {
        return this.f24659g;
    }

    @Override // n0.g
    public Size g() {
        return this.f24655c;
    }

    @Override // n0.g
    public SurfaceConfig h() {
        return this.f24654a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f24654a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24655c.hashCode()) * 1000003) ^ this.f24656d.hashCode()) * 1000003) ^ this.f24657e.hashCode()) * 1000003;
        n1 n1Var = this.f24658f;
        return ((((((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ this.f24659g) * 1000003) ^ this.f24660h.hashCode()) * 1000003) ^ (this.f24661i ? 1231 : 1237);
    }

    @Override // n0.g
    public Range<Integer> i() {
        return this.f24660h;
    }

    @Override // n0.g
    public boolean j() {
        return this.f24661i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f24654a + ", imageFormat=" + this.b + ", size=" + this.f24655c + ", dynamicRange=" + this.f24656d + ", captureTypes=" + this.f24657e + ", implementationOptions=" + this.f24658f + ", sessionType=" + this.f24659g + ", targetFrameRate=" + this.f24660h + ", strictFrameRateRequired=" + this.f24661i + "}";
    }
}
