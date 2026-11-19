package g0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class k extends v2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f16861a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix f16864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16865f;

    public k(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f16861a = rect;
        this.b = i10;
        this.f16862c = i11;
        this.f16863d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f16864e = matrix;
        this.f16865f = z11;
    }

    @Override // g0.v2.h
    public Rect a() {
        return this.f16861a;
    }

    @Override // g0.v2.h
    public int b() {
        return this.b;
    }

    @Override // g0.v2.h
    public Matrix c() {
        return this.f16864e;
    }

    @Override // g0.v2.h
    public int d() {
        return this.f16862c;
    }

    @Override // g0.v2.h
    public boolean e() {
        return this.f16863d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2.h) {
            v2.h hVar = (v2.h) obj;
            if (this.f16861a.equals(hVar.a()) && this.b == hVar.b() && this.f16862c == hVar.d() && this.f16863d == hVar.e() && this.f16864e.equals(hVar.c()) && this.f16865f == hVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.v2.h
    public boolean f() {
        return this.f16865f;
    }

    public int hashCode() {
        return ((((((((((this.f16861a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f16862c) * 1000003) ^ (this.f16863d ? 1231 : 1237)) * 1000003) ^ this.f16864e.hashCode()) * 1000003) ^ (this.f16865f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f16861a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.f16862c + ", hasCameraTransform=" + this.f16863d + ", getSensorToBufferTransform=" + this.f16864e + ", isMirroring=" + this.f16865f + "}";
    }
}
