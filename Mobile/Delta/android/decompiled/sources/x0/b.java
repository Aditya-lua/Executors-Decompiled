package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f35054a;
    public final p0.g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f35056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f35057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f35059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0.e0 f35060h;

    public b(T t8, p0.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, n0.e0 e0Var) {
        if (t8 == null) {
            throw new NullPointerException("Null data");
        }
        this.f35054a = t8;
        this.b = gVar;
        this.f35055c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f35056d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f35057e = rect;
        this.f35058f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f35059g = matrix;
        if (e0Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f35060h = e0Var;
    }

    @Override // x0.b0
    public n0.e0 a() {
        return this.f35060h;
    }

    @Override // x0.b0
    public Rect b() {
        return this.f35057e;
    }

    @Override // x0.b0
    public T c() {
        return this.f35054a;
    }

    @Override // x0.b0
    public p0.g d() {
        return this.b;
    }

    @Override // x0.b0
    public int e() {
        return this.f35055c;
    }

    public boolean equals(Object obj) {
        p0.g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f35054a.equals(b0Var.c()) && ((gVar = this.b) != null ? gVar.equals(b0Var.d()) : b0Var.d() == null) && this.f35055c == b0Var.e() && this.f35056d.equals(b0Var.h()) && this.f35057e.equals(b0Var.b()) && this.f35058f == b0Var.f() && this.f35059g.equals(b0Var.g()) && this.f35060h.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.b0
    public int f() {
        return this.f35058f;
    }

    @Override // x0.b0
    public Matrix g() {
        return this.f35059g;
    }

    @Override // x0.b0
    public Size h() {
        return this.f35056d;
    }

    public int hashCode() {
        int iHashCode = (this.f35054a.hashCode() ^ 1000003) * 1000003;
        p0.g gVar = this.b;
        return ((((((((((((iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f35055c) * 1000003) ^ this.f35056d.hashCode()) * 1000003) ^ this.f35057e.hashCode()) * 1000003) ^ this.f35058f) * 1000003) ^ this.f35059g.hashCode()) * 1000003) ^ this.f35060h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f35054a + ", exif=" + this.b + ", format=" + this.f35055c + ", size=" + this.f35056d + ", cropRect=" + this.f35057e + ", rotationDegrees=" + this.f35058f + ", sensorToBufferTransform=" + this.f35059g + ", cameraCaptureResult=" + this.f35060h + "}";
    }
}
