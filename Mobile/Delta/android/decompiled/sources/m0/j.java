package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f23603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.f f23604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.f1.g f23605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.f1.h f23606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.f1.h f23607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f23608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f23609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f23612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f23613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<n0.u> f23614n;

    public j(Executor executor, g0.f1.f fVar, g0.f1.g gVar, g0.f1.h hVar, g0.f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f23603c = executor;
        this.f23604d = fVar;
        this.f23605e = gVar;
        this.f23606f = hVar;
        this.f23607g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f23608h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f23609i = matrix;
        this.f23610j = i10;
        this.f23611k = i11;
        this.f23612l = i12;
        this.f23613m = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f23614n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f23603c.equals(l1Var.g())) {
                l1Var.j();
                g0.f1.g gVar = this.f23605e;
                if (gVar != null ? gVar.equals(l1Var.l()) : l1Var.l() == null) {
                    g0.f1.h hVar = this.f23606f;
                    if (hVar != null ? hVar.equals(l1Var.m()) : l1Var.m() == null) {
                        g0.f1.h hVar2 = this.f23607g;
                        if (hVar2 != null ? hVar2.equals(l1Var.o()) : l1Var.o() == null) {
                            if (this.f23608h.equals(l1Var.i()) && this.f23609i.equals(l1Var.p()) && this.f23610j == l1Var.n() && this.f23611k == l1Var.k() && this.f23612l == l1Var.h() && this.f23613m == l1Var.t() && this.f23614n.equals(l1Var.q())) {
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
        return this.f23603c;
    }

    @Override // m0.l1
    public int h() {
        return this.f23612l;
    }

    public int hashCode() {
        int iHashCode = (((this.f23603c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        g0.f1.g gVar = this.f23605e;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        g0.f1.h hVar = this.f23606f;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        g0.f1.h hVar2 = this.f23607g;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f23608h.hashCode()) * 1000003) ^ this.f23609i.hashCode()) * 1000003) ^ this.f23610j) * 1000003) ^ this.f23611k) * 1000003) ^ this.f23612l) * 1000003) ^ (this.f23613m ? 1231 : 1237)) * 1000003) ^ this.f23614n.hashCode();
    }

    @Override // m0.l1
    public Rect i() {
        return this.f23608h;
    }

    @Override // m0.l1
    public g0.f1.f j() {
        return this.f23604d;
    }

    @Override // m0.l1
    public int k() {
        return this.f23611k;
    }

    @Override // m0.l1
    public g0.f1.g l() {
        return this.f23605e;
    }

    @Override // m0.l1
    public g0.f1.h m() {
        return this.f23606f;
    }

    @Override // m0.l1
    public int n() {
        return this.f23610j;
    }

    @Override // m0.l1
    public g0.f1.h o() {
        return this.f23607g;
    }

    @Override // m0.l1
    public Matrix p() {
        return this.f23609i;
    }

    @Override // m0.l1
    public List<n0.u> q() {
        return this.f23614n;
    }

    @Override // m0.l1
    public boolean t() {
        return this.f23613m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f23603c + ", inMemoryCallback=" + this.f23604d + ", onDiskCallback=" + this.f23605e + ", outputFileOptions=" + this.f23606f + ", secondaryOutputFileOptions=" + this.f23607g + ", cropRect=" + this.f23608h + ", sensorToBufferTransform=" + this.f23609i + ", rotationDegrees=" + this.f23610j + ", jpegQuality=" + this.f23611k + ", captureMode=" + this.f23612l + ", simultaneousCapture=" + this.f23613m + ", sessionConfigCameraCaptureCallbacks=" + this.f23614n + "}";
    }
}
