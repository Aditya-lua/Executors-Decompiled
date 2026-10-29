package p281m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
import p140g0.C5883f1;
import p296n0.AbstractC8828u;

/* JADX INFO: renamed from: m0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8299j extends AbstractC8307l1 {

    /* JADX INFO: renamed from: c */
    public final Executor f30635c;

    /* JADX INFO: renamed from: d */
    public final C5883f1.f f30636d;

    /* JADX INFO: renamed from: e */
    public final C5883f1.g f30637e;

    /* JADX INFO: renamed from: f */
    public final C5883f1.h f30638f;

    /* JADX INFO: renamed from: g */
    public final C5883f1.h f30639g;

    /* JADX INFO: renamed from: h */
    public final Rect f30640h;

    /* JADX INFO: renamed from: i */
    public final Matrix f30641i;

    /* JADX INFO: renamed from: j */
    public final int f30642j;

    /* JADX INFO: renamed from: k */
    public final int f30643k;

    /* JADX INFO: renamed from: l */
    public final int f30644l;

    /* JADX INFO: renamed from: m */
    public final boolean f30645m;

    /* JADX INFO: renamed from: n */
    public final List<AbstractC8828u> f30646n;

    public C8299j(Executor executor, C5883f1.f fVar, C5883f1.g gVar, C5883f1.h hVar, C5883f1.h hVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List<AbstractC8828u> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f30635c = executor;
        this.f30636d = fVar;
        this.f30637e = gVar;
        this.f30638f = hVar;
        this.f30639g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f30640h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f30641i = matrix;
        this.f30642j = i10;
        this.f30643k = i11;
        this.f30644l = i12;
        this.f30645m = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f30646n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8307l1) {
            AbstractC8307l1 abstractC8307l1 = (AbstractC8307l1) obj;
            if (this.f30635c.equals(abstractC8307l1.mo33735g())) {
                abstractC8307l1.mo33738j();
                C5883f1.g gVar = this.f30637e;
                if (gVar != null ? gVar.equals(abstractC8307l1.mo33740l()) : abstractC8307l1.mo33740l() == null) {
                    C5883f1.h hVar = this.f30638f;
                    if (hVar != null ? hVar.equals(abstractC8307l1.mo33741m()) : abstractC8307l1.mo33741m() == null) {
                        C5883f1.h hVar2 = this.f30639g;
                        if (hVar2 != null ? hVar2.equals(abstractC8307l1.mo33743o()) : abstractC8307l1.mo33743o() == null) {
                            if (this.f30640h.equals(abstractC8307l1.mo33737i()) && this.f30641i.equals(abstractC8307l1.mo33744p()) && this.f30642j == abstractC8307l1.mo33742n() && this.f30643k == abstractC8307l1.mo33739k() && this.f30644l == abstractC8307l1.mo33736h() && this.f30645m == abstractC8307l1.mo33746t() && this.f30646n.equals(abstractC8307l1.mo33745q())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: g */
    public Executor mo33735g() {
        return this.f30635c;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: h */
    public int mo33736h() {
        return this.f30644l;
    }

    public int hashCode() {
        int iHashCode = (((this.f30635c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        C5883f1.g gVar = this.f30637e;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        C5883f1.h hVar = this.f30638f;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        C5883f1.h hVar2 = this.f30639g;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f30640h.hashCode()) * 1000003) ^ this.f30641i.hashCode()) * 1000003) ^ this.f30642j) * 1000003) ^ this.f30643k) * 1000003) ^ this.f30644l) * 1000003) ^ (this.f30645m ? 1231 : 1237)) * 1000003) ^ this.f30646n.hashCode();
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: i */
    public Rect mo33737i() {
        return this.f30640h;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: j */
    public C5883f1.f mo33738j() {
        return this.f30636d;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: k */
    public int mo33739k() {
        return this.f30643k;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: l */
    public C5883f1.g mo33740l() {
        return this.f30637e;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: m */
    public C5883f1.h mo33741m() {
        return this.f30638f;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: n */
    public int mo33742n() {
        return this.f30642j;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: o */
    public C5883f1.h mo33743o() {
        return this.f30639g;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: p */
    public Matrix mo33744p() {
        return this.f30641i;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: q */
    public List<AbstractC8828u> mo33745q() {
        return this.f30646n;
    }

    @Override // p281m0.AbstractC8307l1
    /* JADX INFO: renamed from: t */
    public boolean mo33746t() {
        return this.f30645m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f30635c + ", inMemoryCallback=" + this.f30636d + ", onDiskCallback=" + this.f30637e + ", outputFileOptions=" + this.f30638f + ", secondaryOutputFileOptions=" + this.f30639g + ", cropRect=" + this.f30640h + ", sensorToBufferTransform=" + this.f30641i + ", rotationDegrees=" + this.f30642j + ", jpegQuality=" + this.f30643k + ", captureMode=" + this.f30644l + ", simultaneousCapture=" + this.f30645m + ", sessionConfigCameraCaptureCallbacks=" + this.f30646n + "}";
    }
}
