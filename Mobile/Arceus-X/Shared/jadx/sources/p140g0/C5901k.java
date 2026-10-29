package p140g0;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: g0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5901k extends C5948v2.h {

    /* JADX INFO: renamed from: a */
    public final Rect f22543a;

    /* JADX INFO: renamed from: b */
    public final int f22544b;

    /* JADX INFO: renamed from: c */
    public final int f22545c;

    /* JADX INFO: renamed from: d */
    public final boolean f22546d;

    /* JADX INFO: renamed from: e */
    public final Matrix f22547e;

    /* JADX INFO: renamed from: f */
    public final boolean f22548f;

    public C5901k(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f22543a = rect;
        this.f22544b = i10;
        this.f22545c = i11;
        this.f22546d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f22547e = matrix;
        this.f22548f = z11;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: a */
    public Rect mo26509a() {
        return this.f22543a;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: b */
    public int mo26510b() {
        return this.f22544b;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: c */
    public Matrix mo26511c() {
        return this.f22547e;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: d */
    public int mo26512d() {
        return this.f22545c;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: e */
    public boolean mo26513e() {
        return this.f22546d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5948v2.h) {
            C5948v2.h hVar = (C5948v2.h) obj;
            if (this.f22543a.equals(hVar.mo26509a()) && this.f22544b == hVar.mo26510b() && this.f22545c == hVar.mo26512d() && this.f22546d == hVar.mo26513e() && this.f22547e.equals(hVar.mo26511c()) && this.f22548f == hVar.mo26514f()) {
                return true;
            }
        }
        return false;
    }

    @Override // p140g0.C5948v2.h
    /* JADX INFO: renamed from: f */
    public boolean mo26514f() {
        return this.f22548f;
    }

    public int hashCode() {
        return ((((((((((this.f22543a.hashCode() ^ 1000003) * 1000003) ^ this.f22544b) * 1000003) ^ this.f22545c) * 1000003) ^ (this.f22546d ? 1231 : 1237)) * 1000003) ^ this.f22547e.hashCode()) * 1000003) ^ (this.f22548f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f22543a + ", getRotationDegrees=" + this.f22544b + ", getTargetRotation=" + this.f22545c + ", hasCameraTransform=" + this.f22546d + ", getSensorToBufferTransform=" + this.f22547e + ", isMirroring=" + this.f22548f + "}";
    }
}
