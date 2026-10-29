package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f34556a;
    public final p0.g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f34558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f34559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f34561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0.e0 f34562h;

    public b(T t8, p0.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, n0.e0 e0Var) {
        if (t8 == null) {
            throw new NullPointerException("Null data");
        }
        this.f34556a = t8;
        this.b = gVar;
        this.f34557c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f34558d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f34559e = rect;
        this.f34560f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f34561g = matrix;
        if (e0Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f34562h = e0Var;
    }

    @Override // x0.b0
    public n0.e0 a() {
        return this.f34562h;
    }

    @Override // x0.b0
    public Rect b() {
        return this.f34559e;
    }

    @Override // x0.b0
    public T c() {
        return this.f34556a;
    }

    @Override // x0.b0
    public p0.g d() {
        return this.b;
    }

    @Override // x0.b0
    public int e() {
        return this.f34557c;
    }

    public boolean equals(Object obj) {
        p0.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f34556a.equals(b0Var.c()) && ((gVar = this.b) != null ? gVar.equals(b0Var.d()) : b0Var.d() == null) && this.f34557c == b0Var.e() && this.f34558d.equals(b0Var.h()) && this.f34559e.equals(b0Var.b()) && this.f34560f == b0Var.f() && this.f34561g.equals(b0Var.g()) && this.f34562h.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.b0
    public int f() {
        return this.f34560f;
    }

    @Override // x0.b0
    public Matrix g() {
        return this.f34561g;
    }

    @Override // x0.b0
    public Size h() {
        return this.f34558d;
    }

    public int hashCode() {
        int iHashCode = (this.f34556a.hashCode() ^ 1000003) * 1000003;
        p0.g gVar = this.b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f34557c) * 1000003) ^ this.f34558d.hashCode()) * 1000003) ^ this.f34559e.hashCode()) * 1000003) ^ this.f34560f) * 1000003) ^ this.f34561g.hashCode()) * 1000003) ^ this.f34562h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f34556a + ", exif=" + this.b + ", format=" + this.f34557c + ", size=" + this.f34558d + ", cropRect=" + this.f34559e + ", rotationDegrees=" + this.f34560f + ", sensorToBufferTransform=" + this.f34561g + ", cameraCaptureResult=" + this.f34562h + "}";
    }
}
