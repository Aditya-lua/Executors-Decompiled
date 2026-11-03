package n0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceConfig f25475a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f25476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f25477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j4.b> f25478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f25479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range<Integer> f25481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25482i;

    public h(SurfaceConfig surfaceConfig, int i10, Size size, g0.k0 k0Var, List<j4.b> list, n1 n1Var, int i11, Range<Integer> range, boolean z10) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f25475a = surfaceConfig;
        this.b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f25476c = size;
        if (k0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f25477d = k0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f25478e = list;
        this.f25479f = n1Var;
        this.f25480g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f25481h = range;
        this.f25482i = z10;
    }

    @Override // n0.g
    public List<j4.b> b() {
        return this.f25478e;
    }

    @Override // n0.g
    public g0.k0 c() {
        return this.f25477d;
    }

    @Override // n0.g
    public int d() {
        return this.b;
    }

    @Override // n0.g
    public n1 e() {
        return this.f25479f;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f25475a.equals(gVar.h()) && this.b == gVar.d() && this.f25476c.equals(gVar.g()) && this.f25477d.equals(gVar.c()) && this.f25478e.equals(gVar.b()) && ((n1Var = this.f25479f) != null ? n1Var.equals(gVar.e()) : gVar.e() == null) && this.f25480g == gVar.f() && this.f25481h.equals(gVar.i()) && this.f25482i == gVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.g
    public int f() {
        return this.f25480g;
    }

    @Override // n0.g
    public Size g() {
        return this.f25476c;
    }

    @Override // n0.g
    public SurfaceConfig h() {
        return this.f25475a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f25475a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f25476c.hashCode()) * 1000003) ^ this.f25477d.hashCode()) * 1000003) ^ this.f25478e.hashCode()) * 1000003;
        n1 n1Var = this.f25479f;
        return ((((((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ this.f25480g) * 1000003) ^ this.f25481h.hashCode()) * 1000003) ^ (this.f25482i ? 1231 : 1237);
    }

    @Override // n0.g
    public Range<Integer> i() {
        return this.f25481h;
    }

    @Override // n0.g
    public boolean j() {
        return this.f25482i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f25475a + ", imageFormat=" + this.b + ", size=" + this.f25476c + ", dynamicRange=" + this.f25477d + ", captureTypes=" + this.f25478e + ", implementationOptions=" + this.f25479f + ", sessionType=" + this.f25480g + ", targetFrameRate=" + this.f25481h + ", strictFrameRateRequired=" + this.f25482i + "}";
    }
}
