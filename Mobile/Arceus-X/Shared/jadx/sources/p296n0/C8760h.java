package p296n0;

import android.util.Range;
import android.util.Size;
import java.util.List;
import p140g0.C5902k0;

/* JADX INFO: renamed from: n0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8760h extends AbstractC8754g {

    /* JADX INFO: renamed from: a */
    public final SurfaceConfig f31845a;

    /* JADX INFO: renamed from: b */
    public final int f31846b;

    /* JADX INFO: renamed from: c */
    public final Size f31847c;

    /* JADX INFO: renamed from: d */
    public final C5902k0 f31848d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC8777j4.b> f31849e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8795n1 f31850f;

    /* JADX INFO: renamed from: g */
    public final int f31851g;

    /* JADX INFO: renamed from: h */
    public final Range<Integer> f31852h;

    /* JADX INFO: renamed from: i */
    public final boolean f31853i;

    public C8760h(SurfaceConfig surfaceConfig, int i10, Size size, C5902k0 c5902k0, List<InterfaceC8777j4.b> list, InterfaceC8795n1 interfaceC8795n1, int i11, Range<Integer> range, boolean z10) {
        if (surfaceConfig == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f31845a = surfaceConfig;
        this.f31846b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f31847c = size;
        if (c5902k0 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f31848d = c5902k0;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f31849e = list;
        this.f31850f = interfaceC8795n1;
        this.f31851g = i11;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.f31852h = range;
        this.f31853i = z10;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: b */
    public List<InterfaceC8777j4.b> mo35095b() {
        return this.f31849e;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: c */
    public C5902k0 mo35096c() {
        return this.f31848d;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: d */
    public int mo35097d() {
        return this.f31846b;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: e */
    public InterfaceC8795n1 mo35098e() {
        return this.f31850f;
    }

    public boolean equals(Object obj) {
        InterfaceC8795n1 interfaceC8795n1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8754g) {
            AbstractC8754g abstractC8754g = (AbstractC8754g) obj;
            if (this.f31845a.equals(abstractC8754g.mo35101h()) && this.f31846b == abstractC8754g.mo35097d() && this.f31847c.equals(abstractC8754g.mo35100g()) && this.f31848d.equals(abstractC8754g.mo35096c()) && this.f31849e.equals(abstractC8754g.mo35095b()) && ((interfaceC8795n1 = this.f31850f) != null ? interfaceC8795n1.equals(abstractC8754g.mo35098e()) : abstractC8754g.mo35098e() == null) && this.f31851g == abstractC8754g.mo35099f() && this.f31852h.equals(abstractC8754g.mo35102i()) && this.f31853i == abstractC8754g.mo35103j()) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: f */
    public int mo35099f() {
        return this.f31851g;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: g */
    public Size mo35100g() {
        return this.f31847c;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: h */
    public SurfaceConfig mo35101h() {
        return this.f31845a;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f31845a.hashCode() ^ 1000003) * 1000003) ^ this.f31846b) * 1000003) ^ this.f31847c.hashCode()) * 1000003) ^ this.f31848d.hashCode()) * 1000003) ^ this.f31849e.hashCode()) * 1000003;
        InterfaceC8795n1 interfaceC8795n1 = this.f31850f;
        return ((((((iHashCode ^ (interfaceC8795n1 == null ? 0 : interfaceC8795n1.hashCode())) * 1000003) ^ this.f31851g) * 1000003) ^ this.f31852h.hashCode()) * 1000003) ^ (this.f31853i ? 1231 : 1237);
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: i */
    public Range<Integer> mo35102i() {
        return this.f31852h;
    }

    @Override // p296n0.AbstractC8754g
    /* JADX INFO: renamed from: j */
    public boolean mo35103j() {
        return this.f31853i;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f31845a + ", imageFormat=" + this.f31846b + ", size=" + this.f31847c + ", dynamicRange=" + this.f31848d + ", captureTypes=" + this.f31849e + ", implementationOptions=" + this.f31850f + ", sessionType=" + this.f31851g + ", targetFrameRate=" + this.f31852h + ", strictFrameRateRequired=" + this.f31853i + "}";
    }
}
