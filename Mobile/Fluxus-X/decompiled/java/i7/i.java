package i7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import g7.h0;
import g7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    public j7.q A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f19200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f19201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w1.g<LinearGradient> f19202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1.g<RadialGradient> f19203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f19204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o7.g f19205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j7.a<o7.d, o7.d> f19207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j7.a<PointF, PointF> f19208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j7.a<PointF, PointF> f19209z;

    public i(h0 h0Var, p7.b bVar, o7.f fVar) {
        super(h0Var, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f19202s = new w1.g<>();
        this.f19203t = new w1.g<>();
        this.f19204u = new RectF();
        this.f19200q = fVar.j();
        this.f19205v = fVar.f();
        this.f19201r = fVar.n();
        this.f19206w = (int) (h0Var.J().d() / 32.0f);
        j7.a<o7.d, o7.d> aVarA = fVar.e().a();
        this.f19207x = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        j7.a<PointF, PointF> aVarA2 = fVar.l().a();
        this.f19208y = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        j7.a<PointF, PointF> aVarA3 = fVar.d().a();
        this.f19209z = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
    }

    @Override // i7.a, i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (this.f19201r) {
            return;
        }
        g(this.f19204u, matrix, false);
        this.f19142i.setShader(this.f19205v == o7.g.LINEAR ? m() : n());
        super.d(canvas, matrix, i10, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.a, m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        super.e(t8, cVar);
        if (t8 == o0.L) {
            j7.q qVar = this.A;
            if (qVar != null) {
                this.f19139f.I(qVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            j7.q qVar2 = new j7.q(cVar);
            this.A = qVar2;
            qVar2.a(this);
            this.f19139f.j(this.A);
        }
    }

    @Override // i7.c
    public String getName() {
        return this.f19200q;
    }

    public final int[] k(int[] iArr) {
        j7.q qVar = this.A;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    public final int l() {
        int iRound = Math.round(this.f19208y.f() * this.f19206w);
        int iRound2 = Math.round(this.f19209z.f() * this.f19206w);
        int iRound3 = Math.round(this.f19207x.f() * this.f19206w);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    public final LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientE = this.f19202s.e(jL);
        if (linearGradientE != null) {
            return linearGradientE;
        }
        PointF pointFH = this.f19208y.h();
        PointF pointFH2 = this.f19209z.h();
        o7.d dVarH = this.f19207x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f19202s.k(jL, linearGradient);
        return linearGradient;
    }

    public final RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientE = this.f19203t.e(jL);
        if (radialGradientE != null) {
            return radialGradientE;
        }
        PointF pointFH = this.f19208y.h();
        PointF pointFH2 = this.f19209z.h();
        o7.d dVarH = this.f19207x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f19203t.k(jL, radialGradient);
        return radialGradient;
    }
}
