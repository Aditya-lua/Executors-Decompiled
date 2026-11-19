package g0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f16838a;
    public final Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.p0 f16839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16841e;

    public h(Size size, Rect rect, n0.p0 p0Var, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f16838a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.f16839c = p0Var;
        this.f16840d = i10;
        this.f16841e = z10;
    }

    @Override // g0.j2.a
    public n0.p0 a() {
        return this.f16839c;
    }

    @Override // g0.j2.a
    public Rect b() {
        return this.b;
    }

    @Override // g0.j2.a
    public Size c() {
        return this.f16838a;
    }

    @Override // g0.j2.a
    public boolean d() {
        return this.f16841e;
    }

    @Override // g0.j2.a
    public int e() {
        return this.f16840d;
    }

    public boolean equals(Object obj) {
        n0.p0 p0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2.a) {
            j2.a aVar = (j2.a) obj;
            if (this.f16838a.equals(aVar.c()) && this.b.equals(aVar.b()) && ((p0Var = this.f16839c) != null ? p0Var.equals(aVar.a()) : aVar.a() == null) && this.f16840d == aVar.e() && this.f16841e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f16838a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n0.p0 p0Var = this.f16839c;
        return ((((iHashCode ^ (p0Var == null ? 0 : p0Var.hashCode())) * 1000003) ^ this.f16840d) * 1000003) ^ (this.f16841e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f16838a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.f16839c + ", rotationDegrees=" + this.f16840d + ", mirroring=" + this.f16841e + "}";
    }
}
