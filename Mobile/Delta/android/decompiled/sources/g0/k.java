package g0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f17464a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f17467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17468f;

    public k(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f17464a = rect;
        this.b = i10;
        this.f17465c = i11;
        this.f17466d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f17467e = matrix;
        this.f17468f = z11;
    }

    @Override // g0.v2.h
    public Rect a() {
        return this.f17464a;
    }

    @Override // g0.v2.h
    public int b() {
        return this.b;
    }

    @Override // g0.v2.h
    public Matrix c() {
        return this.f17467e;
    }

    @Override // g0.v2.h
    public int d() {
        return this.f17465c;
    }

    @Override // g0.v2.h
    public boolean e() {
        return this.f17466d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2.h) {
            v2.h hVar = (v2.h) obj;
            if (this.f17464a.equals(hVar.a()) && this.b == hVar.b() && this.f17465c == hVar.d() && this.f17466d == hVar.e() && this.f17467e.equals(hVar.c()) && this.f17468f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.v2.h
    public boolean f() {
        return this.f17468f;
    }

    public int hashCode() {
        return ((((((((((this.f17464a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f17465c) * 1000003) ^ (this.f17466d ? 1231 : 1237)) * 1000003) ^ this.f17467e.hashCode()) * 1000003) ^ (this.f17468f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f17464a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.f17465c + ", hasCameraTransform=" + this.f17466d + ", getSensorToBufferTransform=" + this.f17467e + ", isMirroring=" + this.f17468f + "}";
    }
}
