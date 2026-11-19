package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f22613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.f f22614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.f1.g f22615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.f1.h f22616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.f1.h f22617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f22618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f22619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f22622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f22623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<n0.u> f22624n;

    public j(Executor executor, g0.f1.f fVar, g0.f1.g gVar, g0.f1.h hVar, g0.f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<n0.u> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f22613c = executor;
        this.f22614d = fVar;
        this.f22615e = gVar;
        this.f22616f = hVar;
        this.f22617g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f22618h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f22619i = matrix;
        this.f22620j = i10;
        this.f22621k = i11;
        this.f22622l = i12;
        this.f22623m = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f22624n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f22613c.equals(l1Var.g())) {
                l1Var.j();
                g0.f1.g gVar = this.f22615e;
                if (gVar != null ? gVar.equals(l1Var.l()) : l1Var.l() == null) {
                    g0.f1.h hVar = this.f22616f;
                    if (hVar != null ? hVar.equals(l1Var.m()) : l1Var.m() == null) {
                        g0.f1.h hVar2 = this.f22617g;
                        if (hVar2 != null ? hVar2.equals(l1Var.o()) : l1Var.o() == null) {
                            if (this.f22618h.equals(l1Var.i()) && this.f22619i.equals(l1Var.p()) && this.f22620j == l1Var.n() && this.f22621k == l1Var.k() && this.f22622l == l1Var.h() && this.f22623m == l1Var.t() && this.f22624n.equals(l1Var.q())) {
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
        return this.f22613c;
    }

    @Override // m0.l1
    public int h() {
        return this.f22622l;
    }

    public int hashCode() {
        int iHashCode = (((this.f22613c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        g0.f1.g gVar = this.f22615e;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        g0.f1.h hVar = this.f22616f;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        g0.f1.h hVar2 = this.f22617g;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f22618h.hashCode()) * 1000003) ^ this.f22619i.hashCode()) * 1000003) ^ this.f22620j) * 1000003) ^ this.f22621k) * 1000003) ^ this.f22622l) * 1000003) ^ (this.f22623m ? 1231 : 1237)) * 1000003) ^ this.f22624n.hashCode();
    }

    @Override // m0.l1
    public Rect i() {
        return this.f22618h;
    }

    @Override // m0.l1
    public g0.f1.f j() {
        return this.f22614d;
    }

    @Override // m0.l1
    public int k() {
        return this.f22621k;
    }

    @Override // m0.l1
    public g0.f1.g l() {
        return this.f22615e;
    }

    @Override // m0.l1
    public g0.f1.h m() {
        return this.f22616f;
    }

    @Override // m0.l1
    public int n() {
        return this.f22620j;
    }

    @Override // m0.l1
    public g0.f1.h o() {
        return this.f22617g;
    }

    @Override // m0.l1
    public Matrix p() {
        return this.f22619i;
    }

    @Override // m0.l1
    public List<n0.u> q() {
        return this.f22624n;
    }

    @Override // m0.l1
    public boolean t() {
        return this.f22623m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f22613c + ", inMemoryCallback=" + this.f22614d + ", onDiskCallback=" + this.f22615e + ", outputFileOptions=" + this.f22616f + ", secondaryOutputFileOptions=" + this.f22617g + ", cropRect=" + this.f22618h + ", sensorToBufferTransform=" + this.f22619i + ", rotationDegrees=" + this.f22620j + ", jpegQuality=" + this.f22621k + ", captureMode=" + this.f22622l + ", simultaneousCapture=" + this.f22623m + ", sessionConfigCameraCaptureCallbacks=" + this.f22624n + "}";
    }
}
