package h7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import f7.h0;
import f7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    public i7.q A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f18643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w1.g<LinearGradient> f18645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1.g<RadialGradient> f18646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f18647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n7.g f18648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i7.a<n7.d, n7.d> f18650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i7.a<PointF, PointF> f18651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i7.a<PointF, PointF> f18652z;

    public i(h0 h0Var, o7.b bVar, n7.f fVar) {
        super(h0Var, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f18645s = new w1.g<>();
        this.f18646t = new w1.g<>();
        this.f18647u = new RectF();
        this.f18643q = fVar.j();
        this.f18648v = fVar.f();
        this.f18644r = fVar.n();
        this.f18649w = (int) (h0Var.J().d() / 32.0f);
        i7.a<n7.d, n7.d> aVarA = fVar.e().a();
        this.f18650x = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        i7.a<PointF, PointF> aVarA2 = fVar.l().a();
        this.f18651y = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        i7.a<PointF, PointF> aVarA3 = fVar.d().a();
        this.f18652z = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h7.a, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.L) {
            i7.q qVar = this.A;
            if (qVar != null) {
                this.f18582f.H(qVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.A = qVar2;
            qVar2.a(this);
            this.f18582f.j(this.A);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f18643q;
    }

    @Override // h7.a, h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f18644r) {
            return;
        }
        e(this.f18647u, matrix, false);
        this.f18585i.setShader(this.f18648v == n7.g.LINEAR ? m() : n());
        super.i(canvas, matrix, i10, bVar);
    }

    public final int[] k(int[] iArr) {
        i7.q qVar = this.A;
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
        int iRound = Math.round(this.f18651y.f() * this.f18649w);
        int iRound2 = Math.round(this.f18652z.f() * this.f18649w);
        int iRound3 = Math.round(this.f18650x.f() * this.f18649w);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    public final LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientE = this.f18645s.e(jL);
        if (linearGradientE != null) {
            return linearGradientE;
        }
        PointF pointFH = this.f18651y.h();
        PointF pointFH2 = this.f18652z.h();
        n7.d dVarH = this.f18650x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f18645s.i(jL, linearGradient);
        return linearGradient;
    }

    public final RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientE = this.f18646t.e(jL);
        if (radialGradientE != null) {
            return radialGradientE;
        }
        PointF pointFH = this.f18651y.h();
        PointF pointFH2 = this.f18652z.h();
        n7.d dVarH = this.f18650x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f18646t.i(jL, radialGradient);
        return radialGradient;
    }
}
