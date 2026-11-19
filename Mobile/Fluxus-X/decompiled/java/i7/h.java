package i7;

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
import g7.h0;
import g7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e, j7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f19181a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.b f19182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.g<LinearGradient> f19183d = new w1.g<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1.g<RadialGradient> f19184e = new w1.g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f19185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f19186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f19187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<m> f19188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o7.g f19189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j7.a<o7.d, o7.d> f19190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j7.a<Integer, Integer> f19191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j7.a<PointF, PointF> f19192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j7.a<PointF, PointF> f19193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j7.a<ColorFilter, ColorFilter> f19194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j7.q f19195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h0 f19196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j7.a<Float, Float> f19198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19199t;

    public h(h0 h0Var, g7.i iVar, p7.b bVar, o7.e eVar) {
        Path path = new Path();
        this.f19185f = path;
        this.f19186g = new h7.a(1);
        this.f19187h = new RectF();
        this.f19188i = new ArrayList();
        this.f19199t = 0.0f;
        this.f19182c = bVar;
        this.f19181a = eVar.f();
        this.b = eVar.i();
        this.f19196q = h0Var;
        this.f19189j = eVar.e();
        path.setFillType(eVar.c());
        this.f19197r = (int) (iVar.d() / 32.0f);
        j7.a<o7.d, o7.d> aVarA = eVar.d().a();
        this.f19190k = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        j7.a<Integer, Integer> aVarA2 = eVar.g().a();
        this.f19191l = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        j7.a<PointF, PointF> aVarA3 = eVar.h().a();
        this.f19192m = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
        j7.a<PointF, PointF> aVarA4 = eVar.b().a();
        this.f19193n = aVarA4;
        aVarA4.a(this);
        bVar.j(aVarA4);
        if (bVar.y() != null) {
            j7.d dVarA = bVar.y().a().a();
            this.f19198s = dVarA;
            dVarA.a(this);
            bVar.j(this.f19198s);
        }
    }

    private int[] h(int[] iArr) {
        j7.q qVar = this.f19195p;
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
        int iRound = Math.round(this.f19192m.f() * this.f19197r);
        int iRound2 = Math.round(this.f19193n.f() * this.f19197r);
        int iRound3 = Math.round(this.f19190k.f() * this.f19197r);
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
        LinearGradient linearGradientE = this.f19183d.e(j10);
        if (linearGradientE != null) {
            return linearGradientE;
        }
        PointF pointFH = this.f19192m.h();
        PointF pointFH2 = this.f19193n.h();
        o7.d dVarH = this.f19190k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f19183d.k(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradientE = this.f19184e.e(j10);
        if (radialGradientE != null) {
            return radialGradientE;
        }
        PointF pointFH = this.f19192m.h();
        PointF pointFH2 = this.f19193n.h();
        o7.d dVarH = this.f19190k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f19184e.k(j10, radialGradient);
        return radialGradient;
    }

    @Override // j7.a.b
    public void a() {
        this.f19196q.invalidateSelf();
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f19188i.add((m) cVar);
            }
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (this.b) {
            return;
        }
        if (g7.e.h()) {
            g7.e.b("GradientFillContent#draw");
        }
        this.f19185f.reset();
        for (int i11 = 0; i11 < this.f19188i.size(); i11++) {
            this.f19185f.addPath(this.f19188i.get(i11).x(), matrix);
        }
        this.f19185f.computeBounds(this.f19187h, false);
        Shader shaderK = this.f19189j == o7.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f19186g.setShader(shaderK);
        j7.a<ColorFilter, ColorFilter> aVar = this.f19194o;
        if (aVar != null) {
            this.f19186g.setColorFilter(aVar.h());
        }
        j7.a<Float, Float> aVar2 = this.f19198s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f19186g.setMaskFilter(null);
            } else if (fFloatValue != this.f19199t) {
                this.f19186g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f19199t = fFloatValue;
        }
        float fIntValue = this.f19191l.h().intValue() / 100.0f;
        this.f19186g.setAlpha(t7.j.c((int) (i10 * fIntValue), 0, 255));
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f19186g);
        }
        canvas.drawPath(this.f19185f, this.f19186g);
        if (g7.e.h()) {
            g7.e.c("GradientFillContent#draw");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.f17501d) {
            this.f19191l.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            j7.a<ColorFilter, ColorFilter> aVar = this.f19194o;
            if (aVar != null) {
                this.f19182c.I(aVar);
            }
            if (cVar == null) {
                this.f19194o = null;
                return;
            }
            j7.q qVar = new j7.q(cVar);
            this.f19194o = qVar;
            qVar.a(this);
            this.f19182c.j(this.f19194o);
            return;
        }
        if (t8 != o0.L) {
            if (t8 == o0.f17507j) {
                j7.a<Float, Float> aVar2 = this.f19198s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                j7.q qVar2 = new j7.q(cVar);
                this.f19198s = qVar2;
                qVar2.a(this);
                this.f19182c.j(this.f19198s);
                return;
            }
            return;
        }
        j7.q qVar3 = this.f19195p;
        if (qVar3 != null) {
            this.f19182c.I(qVar3);
        }
        if (cVar == null) {
            this.f19195p = null;
            return;
        }
        this.f19183d.a();
        this.f19184e.a();
        j7.q qVar4 = new j7.q(cVar);
        this.f19195p = qVar4;
        qVar4.a(this);
        this.f19182c.j(this.f19195p);
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f19185f.reset();
        for (int i10 = 0; i10 < this.f19188i.size(); i10++) {
            this.f19185f.addPath(this.f19188i.get(i10).x(), matrix);
        }
        this.f19185f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // i7.c
    public String getName() {
        return this.f19181a;
    }
}
