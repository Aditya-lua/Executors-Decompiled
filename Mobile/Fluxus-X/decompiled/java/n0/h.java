package n0;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceConfig f24952a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f24953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.k0 f24954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j4.b> f24955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f24956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Range<Integer> f24958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24959i;

    public h(SurfaceConfig surfaceConfig, int i10, Size size, g0.k0 k0Var, List<j4.b> list, n1 n1Var, int i11, Range<Integer> range, boolean z10) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f24952a = surfaceConfig;
        this.b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f24953c = size;
        if (k0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f24954d = k0Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f24955e = list;
        this.f24956f = n1Var;
        this.f24957g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f24958h = range;
        this.f24959i = z10;
    }

    @Override // n0.g
    public List<j4.b> b() {
        return this.f24955e;
    }

    @Override // n0.g
    public g0.k0 c() {
        return this.f24954d;
    }

    @Override // n0.g
    public int d() {
        return this.b;
    }

    @Override // n0.g
    public n1 e() {
        return this.f24956f;
    }

    public boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f24952a.equals(gVar.h()) && this.b == gVar.d() && this.f24953c.equals(gVar.g()) && this.f24954d.equals(gVar.c()) && this.f24955e.equals(gVar.b()) && ((n1Var = this.f24956f) != null ? n1Var.equals(gVar.e()) : gVar.e() == null) && this.f24957g == gVar.f() && this.f24958h.equals(gVar.i()) && this.f24959i == gVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.g
    public int f() {
        return this.f24957g;
    }

    @Override // n0.g
    public Size g() {
        return this.f24953c;
    }

    @Override // n0.g
    public SurfaceConfig h() {
        return this.f24952a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f24952a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f24953c.hashCode()) * 1000003) ^ this.f24954d.hashCode()) * 1000003) ^ this.f24955e.hashCode()) * 1000003;
        n1 n1Var = this.f24956f;
        return ((((((iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003) ^ this.f24957g) * 1000003) ^ this.f24958h.hashCode()) * 1000003) ^ (this.f24959i ? 1231 : 1237);
    }

    @Override // n0.g
    public Range<Integer> i() {
        return this.f24958h;
    }

    @Override // n0.g
    public boolean j() {
        return this.f24959i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f24952a + ", imageFormat=" + this.b + ", size=" + this.f24953c + ", dynamicRange=" + this.f24954d + ", captureTypes=" + this.f24955e + ", implementationOptions=" + this.f24956f + ", sessionType=" + this.f24957g + ", targetFrameRate=" + this.f24958h + ", strictFrameRateRequired=" + this.f24959i + "}";
    }
}
