package g0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f18003a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f18006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18007f;

    public k(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f18003a = rect;
        this.b = i10;
        this.f18004c = i11;
        this.f18005d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f18006e = matrix;
        this.f18007f = z11;
    }

    @Override // g0.v2.h
    public Rect a() {
        return this.f18003a;
    }

    @Override // g0.v2.h
    public int b() {
        return this.b;
    }

    @Override // g0.v2.h
    public Matrix c() {
        return this.f18006e;
    }

    @Override // g0.v2.h
    public int d() {
        return this.f18004c;
    }

    @Override // g0.v2.h
    public boolean e() {
        return this.f18005d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2.h) {
            v2.h hVar = (v2.h) obj;
            if (this.f18003a.equals(hVar.a()) && this.b == hVar.b() && this.f18004c == hVar.d() && this.f18005d == hVar.e() && this.f18006e.equals(hVar.c()) && this.f18007f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.v2.h
    public boolean f() {
        return this.f18007f;
    }

    public int hashCode() {
        return ((((((((((this.f18003a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f18004c) * 1000003) ^ (this.f18005d ? 1231 : 1237)) * 1000003) ^ this.f18006e.hashCode()) * 1000003) ^ (this.f18007f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f18003a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.f18004c + ", hasCameraTransform=" + this.f18005d + ", getSensorToBufferTransform=" + this.f18006e + ", isMirroring=" + this.f18007f + "}";
    }
}
