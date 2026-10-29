package h7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import f7.h0;
import f7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e, i7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f18624a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.b f18625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.g<LinearGradient> f18626d = new w1.g<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.g<RadialGradient> f18627e = new w1.g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f18628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f18629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f18630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<m> f18631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n7.g f18632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i7.a<n7.d, n7.d> f18633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i7.a<Integer, Integer> f18634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i7.a<PointF, PointF> f18635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i7.a<PointF, PointF> f18636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f18637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i7.q f18638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0 f18639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i7.a<Float, Float> f18641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18642t;

    public h(h0 h0Var, f7.i iVar, o7.b bVar, n7.e eVar) {
        Path path = new Path();
        this.f18628f = path;
        this.f18629g = new g7.a(1);
        this.f18630h = new RectF();
        this.f18631i = new ArrayList();
        this.f18642t = 0.0f;
        this.f18625c = bVar;
        this.f18624a = eVar.f();
        this.b = eVar.i();
        this.f18639q = h0Var;
        this.f18632j = eVar.e();
        path.setFillType(eVar.c());
        this.f18640r = (int) (iVar.d() / 32.0f);
        i7.a<n7.d, n7.d> aVarA = eVar.d().a();
        this.f18633k = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        i7.a<Integer, Integer> aVarA2 = eVar.g().a();
        this.f18634l = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        i7.a<PointF, PointF> aVarA3 = eVar.h().a();
        this.f18635m = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
        i7.a<PointF, PointF> aVarA4 = eVar.b().a();
        this.f18636n = aVarA4;
        aVarA4.a(this);
        bVar.j(aVarA4);
        if (bVar.x() != null) {
            i7.d dVarA = bVar.x().a().a();
            this.f18641s = dVarA;
            dVarA.a(this);
            bVar.j(this.f18641s);
        }
    }

    private int[] f(int[] iArr) {
        i7.q qVar = this.f18638p;
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

    private int j() {
        int iRound = Math.round(this.f18635m.f() * this.f18640r);
        int iRound2 = Math.round(this.f18636n.f() * this.f18640r);
        int iRound3 = Math.round(this.f18633k.f() * this.f18640r);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        LinearGradient linearGradientE = this.f18626d.e(j10);
        if (linearGradientE != null) {
            return linearGradientE;
        }
        PointF pointFH = this.f18635m.h();
        PointF pointFH2 = this.f18636n.h();
        n7.d dVarH = this.f18633k.h();
        int[] iArrF = f(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrF.length < 2) {
            iArr = new int[]{iArrF[0], iArrF[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrF;
        }
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f18626d.i(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradientE = this.f18627e.e(j10);
        if (radialGradientE != null) {
            return radialGradientE;
        }
        PointF pointFH = this.f18635m.h();
        PointF pointFH2 = this.f18636n.h();
        n7.d dVarH = this.f18633k.h();
        int[] iArrF = f(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrF.length < 2) {
            iArr = new int[]{iArrF[0], iArrF[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrF;
        }
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f18627e.i(j10, radialGradient);
        return radialGradient;
    }

    @Override // i7.a.b
    public void a() {
        this.f18639q.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f18631i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16422d) {
            this.f18634l.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f18637o;
            if (aVar != null) {
                this.f18625c.H(aVar);
            }
            if (cVar == null) {
                this.f18637o = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f18637o = qVar;
            qVar.a(this);
            this.f18625c.j(this.f18637o);
            return;
        }
        if (t8 != o0.L) {
            if (t8 == o0.f16428j) {
                i7.a<Float, Float> aVar2 = this.f18641s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                i7.q qVar2 = new i7.q(cVar);
                this.f18641s = qVar2;
                qVar2.a(this);
                this.f18625c.j(this.f18641s);
                return;
            }
            return;
        }
        i7.q qVar3 = this.f18638p;
        if (qVar3 != null) {
            this.f18625c.H(qVar3);
        }
        if (cVar == null) {
            this.f18638p = null;
            return;
        }
        this.f18626d.a();
        this.f18627e.a();
        i7.q qVar4 = new i7.q(cVar);
        this.f18638p = qVar4;
        qVar4.a(this);
        this.f18625c.j(this.f18638p);
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f18628f.reset();
        for (int i10 = 0; i10 < this.f18631i.size(); i10++) {
            this.f18628f.addPath(this.f18631i.get(i10).getPath(), matrix);
        }
        this.f18628f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h7.c
    public String getName() {
        return this.f18624a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.b) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("GradientFillContent#draw");
        }
        this.f18628f.reset();
        for (int i11 = 0; i11 < this.f18631i.size(); i11++) {
            this.f18628f.addPath(this.f18631i.get(i11).getPath(), matrix);
        }
        this.f18628f.computeBounds(this.f18630h, false);
        Shader shaderK = this.f18632j == n7.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f18629g.setShader(shaderK);
        i7.a<ColorFilter, ColorFilter> aVar = this.f18637o;
        if (aVar != null) {
            this.f18629g.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f18641s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f18629g.setMaskFilter(null);
            } else if (fFloatValue != this.f18642t) {
                this.f18629g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f18642t = fFloatValue;
        }
        float fIntValue = this.f18634l.h().intValue() / 100.0f;
        this.f18629g.setAlpha(s7.j.c((int) (i10 * fIntValue), 0, 255));
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f18629g);
        }
        canvas.drawPath(this.f18628f, this.f18629g);
        if (f7.e.h()) {
            f7.e.c("GradientFillContent#draw");
        }
    }
}
