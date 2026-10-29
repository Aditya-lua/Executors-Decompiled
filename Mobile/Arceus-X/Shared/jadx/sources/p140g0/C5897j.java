package p140g0;

import android.view.Surface;

/* JADX INFO: renamed from: g0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5897j extends C5948v2.g {

    /* JADX INFO: renamed from: a */
    public final int f22535a;

    /* JADX INFO: renamed from: b */
    public final Surface f22536b;

    public C5897j(int i10, Surface surface) {
        this.f22535a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f22536b = surface;
    }

    @Override // p140g0.C5948v2.g
    /* JADX INFO: renamed from: a */
    public int mo26499a() {
        return this.f22535a;
    }

    @Override // p140g0.C5948v2.g
    /* JADX INFO: renamed from: b */
    public Surface mo26500b() {
        return this.f22536b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5948v2.g) {
            C5948v2.g gVar = (C5948v2.g) obj;
            if (this.f22535a == gVar.mo26499a() && this.f22536b.equals(gVar.mo26500b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22535a ^ 1000003) * 1000003) ^ this.f22536b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f22535a + ", surface=" + this.f22536b + "}";
    }
}
