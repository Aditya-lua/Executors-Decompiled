package p7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import g7.h0;
import j7.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o7.o;
import r7.j;
import t7.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements i7.e, j7.a.b, m7.f {
    public Paint A;
    public float B;
    public BlurMaskFilter C;
    public h7.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f28960a = new Path();
    public final Matrix b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f28961c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f28962d = new h7.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f28963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f28964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f28965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f28966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f28967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f28968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f28969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f28970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f28971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f28972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f28973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f28974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f28975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j7.h f28976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j7.d f28977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f28978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f28979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<b> f28980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<j7.a<?, ?>> f28981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f28982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f28983y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f28984z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28985a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[o7.i.a.values().length];
            b = iArr;
            try {
                iArr[o7.i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[o7.i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[o7.i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[o7.i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f28985a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28985a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28985a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28985a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28985a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28985a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28985a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(h0 h0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f28963e = new h7.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f28964f = new h7.a(1, mode2);
        h7.a aVar = new h7.a(1);
        this.f28965g = aVar;
        this.f28966h = new h7.a(PorterDuff.Mode.CLEAR);
        this.f28967i = new RectF();
        this.f28968j = new RectF();
        this.f28969k = new RectF();
        this.f28970l = new RectF();
        this.f28971m = new RectF();
        this.f28973o = new Matrix();
        this.f28981w = new ArrayList();
        this.f28983y = true;
        this.B = 0.0f;
        this.f28974p = h0Var;
        this.f28975q = eVar;
        this.f28972n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f28982x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            j7.h hVar = new j7.h(eVar.h());
            this.f28976r = hVar;
            Iterator<j7.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (j7.a<Integer, Integer> aVar2 : this.f28976r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    public static b v(c cVar, e eVar, h0 h0Var, g7.i iVar) {
        switch (a.f28985a[eVar.g().ordinal()]) {
            case 1:
                return new g(h0Var, eVar, cVar, iVar);
            case 2:
                return new c(h0Var, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(h0Var, eVar);
            case 4:
                return new d(h0Var, eVar);
            case 5:
                return new f(h0Var, eVar);
            case 6:
                return new i(h0Var, eVar);
            default:
                t7.e.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    public j A() {
        return this.f28975q.d();
    }

    public e B() {
        return this.f28975q;
    }

    public boolean C() {
        j7.h hVar = this.f28976r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean D() {
        return this.f28978t != null;
    }

    public final void E(RectF rectF, Matrix matrix) {
        this.f28969k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (C()) {
            int size = this.f28976r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                o7.i iVar = this.f28976r.b().get(i10);
                Path pathH = this.f28976r.a().get(i10).h();
                if (pathH != null) {
                    this.f28960a.set(pathH);
                    this.f28960a.transform(matrix);
                    int i11 = a.b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f28960a.computeBounds(this.f28971m, false);
                    if (i10 == 0) {
                        this.f28969k.set(this.f28971m);
                    } else {
                        RectF rectF2 = this.f28969k;
                        rectF2.set(Math.min(rectF2.left, this.f28971m.left), Math.min(this.f28969k.top, this.f28971m.top), Math.max(this.f28969k.right, this.f28971m.right), Math.max(this.f28969k.bottom, this.f28971m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f28969k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F(RectF rectF, Matrix matrix) {
        if (D() && this.f28975q.i() != e.b.INVERT) {
            this.f28970l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f28978t.g(this.f28970l, matrix, true);
            if (rectF.intersect(this.f28970l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void G() {
        this.f28974p.invalidateSelf();
    }

    public final void H(float f10) {
        this.f28974p.J().n().a(this.f28975q.j(), f10);
    }

    public void I(j7.a<?, ?> aVar) {
        this.f28981w.remove(aVar);
    }

    public void J(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
    }

    public void K(b bVar) {
        this.f28978t = bVar;
    }

    public void L(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new h7.a();
        }
        this.f28984z = z10;
    }

    public void M(b bVar) {
        this.f28979u = bVar;
    }

    public void N(float f10) {
        if (g7.e.h()) {
            g7.e.b("BaseLayer#setProgress");
            g7.e.b("BaseLayer#setProgress.transform");
        }
        this.f28982x.j(f10);
        if (g7.e.h()) {
            g7.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f28976r != null) {
            if (g7.e.h()) {
                g7.e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f28976r.a().size(); i10++) {
                this.f28976r.a().get(i10).n(f10);
            }
            if (g7.e.h()) {
                g7.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f28977s != null) {
            if (g7.e.h()) {
                g7.e.b("BaseLayer#setProgress.inout");
            }
            this.f28977s.n(f10);
            if (g7.e.h()) {
                g7.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f28978t != null) {
            if (g7.e.h()) {
                g7.e.b("BaseLayer#setProgress.matte");
            }
            this.f28978t.N(f10);
            if (g7.e.h()) {
                g7.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (g7.e.h()) {
            g7.e.b("BaseLayer#setProgress.animations." + this.f28981w.size());
        }
        for (int i11 = 0; i11 < this.f28981w.size(); i11++) {
            this.f28981w.get(i11).n(f10);
        }
        if (g7.e.h()) {
            g7.e.c("BaseLayer#setProgress.animations." + this.f28981w.size());
            g7.e.c("BaseLayer#setProgress");
        }
    }

    public final void O(boolean z10) {
        if (z10 != this.f28983y) {
            this.f28983y = z10;
            G();
        }
    }

    public final void P() {
        if (this.f28975q.f().isEmpty()) {
            O(true);
            return;
        }
        j7.d dVar = new j7.d(this.f28975q.f());
        this.f28977s = dVar;
        dVar.m();
        this.f28977s.a(new j7.a.b() { // from class: p7.a
            @Override // j7.a.b
            public final void a() {
                b bVar = this.f28959a;
                bVar.O(bVar.f28977s.r() == 1.0f);
            }
        });
        O(this.f28977s.h().floatValue() == 1.0f);
        j(this.f28977s);
    }

    @Override // j7.a.b
    public void a() {
        G();
    }

    @Override // i7.c
    public void b(List<i7.c> list, List<i7.c> list2) {
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        b bVar = this.f28978t;
        if (bVar != null) {
            m7.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f28978t.getName(), i10)) {
                list.add(eVarA.i(this.f28978t));
            }
            if (eVar.g(this.f28978t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f28978t.J(eVar, eVar.e(this.f28978t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        Paint paint;
        Integer numH;
        g7.e.b(this.f28972n);
        if (!this.f28983y || this.f28975q.y()) {
            g7.e.c(this.f28972n);
            return;
        }
        s();
        if (g7.e.h()) {
            g7.e.b("Layer#parentMatrix");
        }
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.f28980v.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.f28980v.get(size).f28982x.f());
        }
        if (g7.e.h()) {
            g7.e.c("Layer#parentMatrix");
        }
        j7.a<?, Integer> aVarH = this.f28982x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!D() && !C() && w() == o7.h.NORMAL) {
            this.b.preConcat(this.f28982x.f());
            if (g7.e.h()) {
                g7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, iIntValue, bVar);
            if (g7.e.h()) {
                g7.e.c("Layer#drawLayer");
            }
            H(g7.e.c(this.f28972n));
            return;
        }
        if (g7.e.h()) {
            g7.e.b("Layer#computeBounds");
        }
        g(this.f28967i, this.b, false);
        F(this.f28967i, matrix);
        this.b.preConcat(this.f28982x.f());
        E(this.f28967i, this.b);
        this.f28968j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f28961c);
        if (!this.f28961c.isIdentity()) {
            Matrix matrix2 = this.f28961c;
            matrix2.invert(matrix2);
            this.f28961c.mapRect(this.f28968j);
        }
        if (!this.f28967i.intersect(this.f28968j)) {
            this.f28967i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (g7.e.h()) {
            g7.e.c("Layer#computeBounds");
        }
        if (this.f28967i.width() >= 1.0f && this.f28967i.height() >= 1.0f) {
            if (g7.e.h()) {
                g7.e.b("Layer#saveLayer");
            }
            this.f28962d.setAlpha(255);
            androidx.core.graphics.d.b(this.f28962d, w().b());
            m.n(canvas, this.f28967i, this.f28962d);
            if (g7.e.h()) {
                g7.e.c("Layer#saveLayer");
            }
            if (w() != o7.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.D == null) {
                    h7.a aVar = new h7.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f28967i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (g7.e.h()) {
                g7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, iIntValue, bVar);
            if (g7.e.h()) {
                g7.e.c("Layer#drawLayer");
            }
            if (C()) {
                p(canvas, this.b);
            }
            if (D()) {
                if (g7.e.h()) {
                    g7.e.b("Layer#drawMatte");
                    g7.e.b("Layer#saveLayer");
                }
                m.o(canvas, this.f28967i, this.f28965g, 19);
                if (g7.e.h()) {
                    g7.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f28978t.d(canvas, matrix, i10, null);
                if (g7.e.h()) {
                    g7.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (g7.e.h()) {
                    g7.e.c("Layer#restoreLayer");
                    g7.e.c("Layer#drawMatte");
                }
            }
            if (g7.e.h()) {
                g7.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (g7.e.h()) {
                g7.e.c("Layer#restoreLayer");
            }
        }
        if (this.f28984z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f28967i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f28967i, this.A);
        }
        H(g7.e.c(this.f28972n));
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        this.f28982x.c(t8, cVar);
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f28967i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f28973o.set(matrix);
        if (z10) {
            List<b> list = this.f28980v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f28973o.preConcat(this.f28980v.get(size).f28982x.f());
                }
            } else {
                b bVar = this.f28979u;
                if (bVar != null) {
                    this.f28973o.preConcat(bVar.f28982x.f());
                }
            }
        }
        this.f28973o.preConcat(this.f28982x.f());
    }

    @Override // i7.c
    public String getName() {
        return this.f28975q.j();
    }

    public void j(j7.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f28981w.add(aVar);
    }

    public final void k(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar, j7.a<Integer, Integer> aVar2) {
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        this.f28962d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f28960a, this.f28962d);
    }

    public final void l(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar, j7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f28967i, this.f28963e);
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        this.f28962d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f28960a, this.f28962d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar, j7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f28967i, this.f28962d);
        canvas.drawRect(this.f28967i, this.f28962d);
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        this.f28962d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f28960a, this.f28964f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar, j7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f28967i, this.f28963e);
        canvas.drawRect(this.f28967i, this.f28962d);
        this.f28964f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        canvas.drawPath(this.f28960a, this.f28964f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar, j7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f28967i, this.f28964f);
        canvas.drawRect(this.f28967i, this.f28962d);
        this.f28964f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        canvas.drawPath(this.f28960a, this.f28964f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        if (g7.e.h()) {
            g7.e.b("Layer#saveLayer");
        }
        m.o(canvas, this.f28967i, this.f28963e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (g7.e.h()) {
            g7.e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f28976r.b().size(); i10++) {
            o7.i iVar = this.f28976r.b().get(i10);
            j7.a<o, Path> aVar = this.f28976r.a().get(i10);
            j7.a<Integer, Integer> aVar2 = this.f28976r.c().get(i10);
            int i11 = a.b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f28962d.setColor(-16777216);
                        this.f28962d.setAlpha(255);
                        canvas.drawRect(this.f28967i, this.f28962d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f28962d.setAlpha(255);
                canvas.drawRect(this.f28967i, this.f28962d);
            }
        }
        if (g7.e.h()) {
            g7.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (g7.e.h()) {
            g7.e.c("Layer#restoreLayer");
        }
    }

    public final void q(Canvas canvas, Matrix matrix, j7.a<o, Path> aVar) {
        this.f28960a.set(aVar.h());
        this.f28960a.transform(matrix);
        canvas.drawPath(this.f28960a, this.f28964f);
    }

    public final boolean r() {
        if (this.f28976r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f28976r.b().size(); i10++) {
            if (this.f28976r.b().get(i10).a() != o7.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.f28980v != null) {
            return;
        }
        if (this.f28979u == null) {
            this.f28980v = Collections.EMPTY_LIST;
            return;
        }
        this.f28980v = new ArrayList();
        for (b bVar = this.f28979u; bVar != null; bVar = bVar.f28979u) {
            this.f28980v.add(bVar);
        }
    }

    public final void t(Canvas canvas) {
        if (g7.e.h()) {
            g7.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f28967i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f28966h);
        if (g7.e.h()) {
            g7.e.c("Layer#clearLayer");
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i10, t7.b bVar);

    public o7.h w() {
        return this.f28975q.a();
    }

    public o7.a y() {
        return this.f28975q.b();
    }

    public BlurMaskFilter z(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }
}
