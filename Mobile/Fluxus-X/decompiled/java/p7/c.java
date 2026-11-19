package p7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import g7.h0;
import g7.o0;
import j7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t7.l;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    public j7.a<Float, Float> E;
    public final List<b> F;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final l J;
    public final l.a K;
    public float L;
    public boolean M;
    public j7.c N;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28986a;

        static {
            int[] iArr = new int[e.b.values().length];
            f28986a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28986a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(h0 h0Var, e eVar, List<e> list, g7.i iVar) {
        int i10;
        b bVar;
        super(h0Var, eVar);
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new l();
        this.K = new l.a();
        this.M = true;
        n7.b bVarV = eVar.v();
        if (bVarV != null) {
            j7.d dVarA = bVarV.a();
            this.E = dVarA;
            j(dVarA);
            this.E.a(this);
        } else {
            this.E = null;
        }
        w1.g gVar = new w1.g(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarV2 = b.v(this, eVar2, h0Var, iVar);
            if (bVarV2 != null) {
                gVar.k(bVarV2.B().e(), bVarV2);
                if (bVar2 != null) {
                    bVar2.K(bVarV2);
                    bVar2 = null;
                } else {
                    this.F.add(0, bVarV2);
                    int i11 = a.f28986a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = bVarV2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < gVar.p(); i10++) {
            b bVar3 = (b) gVar.e(gVar.i(i10));
            if (bVar3 != null && (bVar = (b) gVar.e(bVar3.B().k())) != null) {
                bVar3.M(bVar);
            }
        }
        if (A() != null) {
            this.N = new j7.c(this, this, A());
        }
    }

    @Override // p7.b
    public void J(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            this.F.get(i11).c(eVar, i10, list, eVar2);
        }
    }

    @Override // p7.b
    public void L(boolean z10) {
        super.L(z10);
        Iterator<b> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().L(z10);
        }
    }

    @Override // p7.b
    public void N(float f10) {
        if (g7.e.h()) {
            g7.e.b("CompositionLayer#setProgress");
        }
        this.L = f10;
        super.N(f10);
        if (this.E != null) {
            f10 = ((this.E.h().floatValue() * this.f28975q.c().i()) - this.f28975q.c().p()) / (this.f28974p.J().e() + 0.01f);
        }
        if (this.E == null) {
            f10 -= this.f28975q.s();
        }
        if (this.f28975q.w() != 0.0f && !"__container".equals(this.f28975q.j())) {
            f10 /= this.f28975q.w();
        }
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).N(f10);
        }
        if (g7.e.h()) {
            g7.e.c("CompositionLayer#setProgress");
        }
    }

    public float Q() {
        return this.L;
    }

    public void R(boolean z10) {
        this.M = z10;
    }

    @Override // p7.b, m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        j7.c cVar2;
        j7.c cVar3;
        j7.c cVar4;
        j7.c cVar5;
        j7.c cVar6;
        super.e(t8, cVar);
        if (t8 == o0.E) {
            if (cVar == null) {
                j7.a<Float, Float> aVar = this.E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.E = qVar;
            qVar.a(this);
            j(this.E);
            return;
        }
        if (t8 == o0.f17502e && (cVar6 = this.N) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t8 == o0.G && (cVar5 = this.N) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t8 == o0.H && (cVar4 = this.N) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t8 == o0.I && (cVar3 = this.N) != null) {
            cVar3.e(cVar);
        } else {
            if (t8 != o0.J || (cVar2 = this.N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // p7.b, i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.F.get(size).g(this.G, this.f28973o, true);
            rectF.union(this.G);
        }
    }

    @Override // p7.b
    public void u(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        Canvas canvasJ;
        if (g7.e.h()) {
            g7.e.b("CompositionLayer#draw");
        }
        boolean z10 = false;
        boolean z11 = (bVar == null && this.N == null) ? false : true;
        if ((this.f28974p.f0() && this.F.size() > 1 && i10 != 255) || (z11 && this.f28974p.g0())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        j7.c cVar = this.N;
        if (cVar != null) {
            bVar = cVar.b(matrix, i11);
        }
        if (this.M || !"__container".equals(this.f28975q.j())) {
            this.H.set(0.0f, 0.0f, this.f28975q.m(), this.f28975q.l());
            matrix.mapRect(this.H);
        } else {
            this.H.setEmpty();
            Iterator<b> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().g(this.I, matrix, true);
                this.H.union(this.I);
            }
        }
        if (z10) {
            this.K.f();
            l.a aVar = this.K;
            aVar.f32193a = i10;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            }
            canvasJ = this.J.j(canvas, this.H, this.K);
        } else {
            canvasJ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.H)) {
            for (int size = this.F.size() - 1; size >= 0; size--) {
                this.F.get(size).d(canvasJ, matrix, i11, bVar);
            }
        }
        if (z10) {
            this.J.e();
        }
        canvas.restore();
        if (g7.e.h()) {
            g7.e.c("CompositionLayer#draw");
        }
    }
}
