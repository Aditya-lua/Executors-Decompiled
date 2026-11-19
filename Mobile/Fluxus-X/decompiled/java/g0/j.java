package g0;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class j extends v2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16856a;
    public final Surface b;

    public j(int i10, Surface surface) {
        this.f16856a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    @Override // g0.v2.g
    public int a() {
        return this.f16856a;
    }

    @Override // g0.v2.g
    public Surface b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2.g) {
            v2.g gVar = (v2.g) obj;
            if (this.f16856a == gVar.a() && this.b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16856a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f16856a + ", surface=" + this.b + "}";
    }
}
