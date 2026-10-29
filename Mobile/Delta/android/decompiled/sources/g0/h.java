package g0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f17441a;
    public final Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0.p0 f17442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17444e;

    public h(Size size, Rect rect, n0.p0 p0Var, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f17441a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.f17442c = p0Var;
        this.f17443d = i10;
        this.f17444e = z10;
    }

    @Override // g0.j2.a
    public n0.p0 a() {
        return this.f17442c;
    }

    @Override // g0.j2.a
    public Rect b() {
        return this.b;
    }

    @Override // g0.j2.a
    public Size c() {
        return this.f17441a;
    }

    @Override // g0.j2.a
    public boolean d() {
        return this.f17444e;
    }

    @Override // g0.j2.a
    public int e() {
        return this.f17443d;
    }

    public boolean equals(Object obj) {
        n0.p0 p0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2.a) {
            j2.a aVar = (j2.a) obj;
            if (this.f17441a.equals(aVar.c()) && this.b.equals(aVar.b()) && ((p0Var = this.f17442c) != null ? p0Var.equals(aVar.a()) : aVar.a() == null) && this.f17443d == aVar.e() && this.f17444e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f17441a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n0.p0 p0Var = this.f17442c;
        return ((((iHashCode ^ (p0Var == null ? 0 : p0Var.hashCode())) * 1000003) ^ this.f17443d) * 1000003) ^ (this.f17444e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f17441a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.f17442c + ", rotationDegrees=" + this.f17443d + ", mirroring=" + this.f17444e + "}";
    }
}
