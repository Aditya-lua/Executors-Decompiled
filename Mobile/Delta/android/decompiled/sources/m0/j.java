package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f24253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.f f24254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.f1.g f24255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.f1.h f24256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.f1.h f24257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f24258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f24259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f24262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f24263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<n0.u> f24264n;

    public j(Executor executor, g0.f1.f fVar, g0.f1.g gVar, g0.f1.h hVar, g0.f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f24253c = executor;
        this.f24254d = fVar;
        this.f24255e = gVar;
        this.f24256f = hVar;
        this.f24257g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f24258h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f24259i = matrix;
        this.f24260j = i10;
        this.f24261k = i11;
        this.f24262l = i12;
        this.f24263m = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f24264n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f24253c.equals(l1Var.g())) {
                l1Var.j();
                g0.f1.g gVar = this.f24255e;
                if (gVar != null ? gVar.equals(l1Var.l()) : l1Var.l() == null) {
                    g0.f1.h hVar = this.f24256f;
                    if (hVar != null ? hVar.equals(l1Var.m()) : l1Var.m() == null) {
                        g0.f1.h hVar2 = this.f24257g;
                        if (hVar2 != null ? hVar2.equals(l1Var.o()) : l1Var.o() == null) {
                            if (this.f24258h.equals(l1Var.i()) && this.f24259i.equals(l1Var.p()) && this.f24260j == l1Var.n() && this.f24261k == l1Var.k() && this.f24262l == l1Var.h() && this.f24263m == l1Var.t() && this.f24264n.equals(l1Var.q())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // m0.l1
    public Executor g() {
        return this.f24253c;
    }

    @Override // m0.l1
    public int h() {
        return this.f24262l;
    }

    public int hashCode() {
        int iHashCode = (((this.f24253c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        g0.f1.g gVar = this.f24255e;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        g0.f1.h hVar = this.f24256f;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        g0.f1.h hVar2 = this.f24257g;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f24258h.hashCode()) * 1000003) ^ this.f24259i.hashCode()) * 1000003) ^ this.f24260j) * 1000003) ^ this.f24261k) * 1000003) ^ this.f24262l) * 1000003) ^ (this.f24263m ? 1231 : 1237)) * 1000003) ^ this.f24264n.hashCode();
    }

    @Override // m0.l1
    public Rect i() {
        return this.f24258h;
    }

    @Override // m0.l1
    public g0.f1.f j() {
        return this.f24254d;
    }

    @Override // m0.l1
    public int k() {
        return this.f24261k;
    }

    @Override // m0.l1
    public g0.f1.g l() {
        return this.f24255e;
    }

    @Override // m0.l1
    public g0.f1.h m() {
        return this.f24256f;
    }

    @Override // m0.l1
    public int n() {
        return this.f24260j;
    }

    @Override // m0.l1
    public g0.f1.h o() {
        return this.f24257g;
    }

    @Override // m0.l1
    public Matrix p() {
        return this.f24259i;
    }

    @Override // m0.l1
    public List<n0.u> q() {
        return this.f24264n;
    }

    @Override // m0.l1
    public boolean t() {
        return this.f24263m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f24253c + ", inMemoryCallback=" + this.f24254d + ", onDiskCallback=" + this.f24255e + ", outputFileOptions=" + this.f24256f + ", secondaryOutputFileOptions=" + this.f24257g + ", cropRect=" + this.f24258h + ", sensorToBufferTransform=" + this.f24259i + ", rotationDegrees=" + this.f24260j + ", jpegQuality=" + this.f24261k + ", captureMode=" + this.f24262l + ", simultaneousCapture=" + this.f24263m + ", sessionConfigCameraCaptureCallbacks=" + this.f24264n + "}";
    }
}
