package o7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import f7.h0;
import i7.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n7.o;
import q7.j;
import s7.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements h7.e, i7.a.b, l7.f {
    public Paint A;
    public float B;
    public BlurMaskFilter C;
    public g7.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f27224a = new Path();
    public final Matrix b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f27225c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f27226d = new g7.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f27227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f27228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f27229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f27230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f27231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f27232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f27233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f27234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f27235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f27236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f27237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f27238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f27239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i7.h f27240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i7.d f27241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f27242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f27243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<b> f27244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<i7.a<?, ?>> f27245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f27246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27247y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f27248z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27249a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[n7.i.a.values().length];
            b = iArr;
            try {
                iArr[n7.i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[n7.i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[n7.i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[n7.i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f27249a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27249a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27249a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27249a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27249a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27249a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27249a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(h0 h0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f27227e = new g7.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f27228f = new g7.a(1, mode2);
        g7.a aVar = new g7.a(1);
        this.f27229g = aVar;
        this.f27230h = new g7.a(PorterDuff.Mode.CLEAR);
        this.f27231i = new RectF();
        this.f27232j = new RectF();
        this.f27233k = new RectF();
        this.f27234l = new RectF();
        this.f27235m = new RectF();
        this.f27237o = new Matrix();
        this.f27245w = new ArrayList();
        this.f27247y = true;
        this.B = 0.0f;
        this.f27238p = h0Var;
        this.f27239q = eVar;
        this.f27236n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f27246x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            i7.h hVar = new i7.h(eVar.h());
            this.f27240r = hVar;
            Iterator<i7.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (i7.a<Integer, Integer> aVar2 : this.f27240r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    public static b v(c cVar, e eVar, h0 h0Var, f7.i iVar) {
        switch (a.f27249a[eVar.g().ordinal()]) {
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
                s7.e.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    public e A() {
        return this.f27239q;
    }

    public boolean B() {
        i7.h hVar = this.f27240r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean C() {
        return this.f27242t != null;
    }

    public final void D(RectF rectF, Matrix matrix) {
        this.f27233k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f27240r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                n7.i iVar = this.f27240r.b().get(i10);
                Path pathH = this.f27240r.a().get(i10).h();
                if (pathH != null) {
                    this.f27224a.set(pathH);
                    this.f27224a.transform(matrix);
                    int i11 = a.b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f27224a.computeBounds(this.f27235m, false);
                    if (i10 == 0) {
                        this.f27233k.set(this.f27235m);
                    } else {
                        RectF rectF2 = this.f27233k;
                        rectF2.set(Math.min(rectF2.left, this.f27235m.left), Math.min(this.f27233k.top, this.f27235m.top), Math.max(this.f27233k.right, this.f27235m.right), Math.max(this.f27233k.bottom, this.f27235m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f27233k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void E(RectF rectF, Matrix matrix) {
        if (C() && this.f27239q.i() != e.b.INVERT) {
            this.f27234l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f27242t.e(this.f27234l, matrix, true);
            if (rectF.intersect(this.f27234l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F() {
        this.f27238p.invalidateSelf();
    }

    public final void G(float f10) {
        this.f27238p.J().n().a(this.f27239q.j(), f10);
    }

    public void H(i7.a<?, ?> aVar) {
        this.f27245w.remove(aVar);
    }

    public void I(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
    }

    public void J(b bVar) {
        this.f27242t = bVar;
    }

    public void K(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new g7.a();
        }
        this.f27248z = z10;
    }

    public void L(b bVar) {
        this.f27243u = bVar;
    }

    public void M(float f10) {
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress");
            f7.e.b("BaseLayer#setProgress.transform");
        }
        this.f27246x.j(f10);
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f27240r != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f27240r.a().size(); i10++) {
                this.f27240r.a().get(i10).n(f10);
            }
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f27241s != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.inout");
            }
            this.f27241s.n(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f27242t != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.matte");
            }
            this.f27242t.M(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress.animations." + this.f27245w.size());
        }
        for (int i11 = 0; i11 < this.f27245w.size(); i11++) {
            this.f27245w.get(i11).n(f10);
        }
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.animations." + this.f27245w.size());
            f7.e.c("BaseLayer#setProgress");
        }
    }

    public final void N(boolean z10) {
        if (z10 != this.f27247y) {
            this.f27247y = z10;
            F();
        }
    }

    public final void O() {
        if (this.f27239q.f().isEmpty()) {
            N(true);
            return;
        }
        i7.d dVar = new i7.d(this.f27239q.f());
        this.f27241s = dVar;
        dVar.m();
        this.f27241s.a(new i7.a.b() { // from class: o7.a
            @Override // i7.a.b
            public final void a() {
                b bVar = this.f27223a;
                bVar.N(bVar.f27241s.r() == 1.0f);
            }
        });
        N(this.f27241s.h().floatValue() == 1.0f);
        j(this.f27241s);
    }

    @Override // i7.a.b
    public void a() {
        F();
    }

    @Override // h7.c
    public void b(List<h7.c> list, List<h7.c> list2) {
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        this.f27246x.c(t8, cVar);
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f27231i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f27237o.set(matrix);
        if (z10) {
            List<b> list = this.f27244v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f27237o.preConcat(this.f27244v.get(size).f27246x.f());
                }
            } else {
                b bVar = this.f27243u;
                if (bVar != null) {
                    this.f27237o.preConcat(bVar.f27246x.f());
                }
            }
        }
        this.f27237o.preConcat(this.f27246x.f());
    }

    @Override // h7.c
    public String getName() {
        return this.f27239q.j();
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        b bVar = this.f27242t;
        if (bVar != null) {
            l7.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f27242t.getName(), i10)) {
                list.add(eVarA.i(this.f27242t));
            }
            if (eVar.g(this.f27242t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f27242t.I(eVar, eVar.e(this.f27242t.getName(), i10) + i10, list, eVarA);
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
                I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Paint paint;
        Integer numH;
        f7.e.b(this.f27236n);
        if (!this.f27247y || this.f27239q.y()) {
            f7.e.c(this.f27236n);
            return;
        }
        s();
        if (f7.e.h()) {
            f7.e.b("Layer#parentMatrix");
        }
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.f27244v.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.f27244v.get(size).f27246x.f());
        }
        if (f7.e.h()) {
            f7.e.c("Layer#parentMatrix");
        }
        i7.a<?, Integer> aVarH = this.f27246x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == n7.h.NORMAL) {
            this.b.preConcat(this.f27246x.f());
            if (f7.e.h()) {
                f7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, iIntValue, bVar);
            if (f7.e.h()) {
                f7.e.c("Layer#drawLayer");
            }
            G(f7.e.c(this.f27236n));
            return;
        }
        if (f7.e.h()) {
            f7.e.b("Layer#computeBounds");
        }
        e(this.f27231i, this.b, false);
        E(this.f27231i, matrix);
        this.b.preConcat(this.f27246x.f());
        D(this.f27231i, this.b);
        this.f27232j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f27225c);
        if (!this.f27225c.isIdentity()) {
            Matrix matrix2 = this.f27225c;
            matrix2.invert(matrix2);
            this.f27225c.mapRect(this.f27232j);
        }
        if (!this.f27231i.intersect(this.f27232j)) {
            this.f27231i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#computeBounds");
        }
        if (this.f27231i.width() >= 1.0f && this.f27231i.height() >= 1.0f) {
            if (f7.e.h()) {
                f7.e.b("Layer#saveLayer");
            }
            this.f27226d.setAlpha(255);
            androidx.core.graphics.d.b(this.f27226d, w().b());
            m.n(canvas, this.f27231i, this.f27226d);
            if (f7.e.h()) {
                f7.e.c("Layer#saveLayer");
            }
            if (w() != n7.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.D == null) {
                    g7.a aVar = new g7.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f27231i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (f7.e.h()) {
                f7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, iIntValue, bVar);
            if (f7.e.h()) {
                f7.e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.b);
            }
            if (C()) {
                if (f7.e.h()) {
                    f7.e.b("Layer#drawMatte");
                    f7.e.b("Layer#saveLayer");
                }
                m.o(canvas, this.f27231i, this.f27229g, 19);
                if (f7.e.h()) {
                    f7.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f27242t.i(canvas, matrix, i10, null);
                if (f7.e.h()) {
                    f7.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (f7.e.h()) {
                    f7.e.c("Layer#restoreLayer");
                    f7.e.c("Layer#drawMatte");
                }
            }
            if (f7.e.h()) {
                f7.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (f7.e.h()) {
                f7.e.c("Layer#restoreLayer");
            }
        }
        if (this.f27248z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f27231i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f27231i, this.A);
        }
        G(f7.e.c(this.f27236n));
    }

    public void j(i7.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f27245w.add(aVar);
    }

    public final void k(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        this.f27226d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27224a, this.f27226d);
    }

    public final void l(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27231i, this.f27227e);
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        this.f27226d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27224a, this.f27226d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27231i, this.f27226d);
        canvas.drawRect(this.f27231i, this.f27226d);
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        this.f27226d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27224a, this.f27228f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27231i, this.f27227e);
        canvas.drawRect(this.f27231i, this.f27226d);
        this.f27228f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        canvas.drawPath(this.f27224a, this.f27228f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27231i, this.f27228f);
        canvas.drawRect(this.f27231i, this.f27226d);
        this.f27228f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        canvas.drawPath(this.f27224a, this.f27228f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        if (f7.e.h()) {
            f7.e.b("Layer#saveLayer");
        }
        m.o(canvas, this.f27231i, this.f27227e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f27240r.b().size(); i10++) {
            n7.i iVar = this.f27240r.b().get(i10);
            i7.a<o, Path> aVar = this.f27240r.a().get(i10);
            i7.a<Integer, Integer> aVar2 = this.f27240r.c().get(i10);
            int i11 = a.b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f27226d.setColor(-16777216);
                        this.f27226d.setAlpha(255);
                        canvas.drawRect(this.f27231i, this.f27226d);
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
                this.f27226d.setAlpha(255);
                canvas.drawRect(this.f27231i, this.f27226d);
            }
        }
        if (f7.e.h()) {
            f7.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (f7.e.h()) {
            f7.e.c("Layer#restoreLayer");
        }
    }

    public final void q(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar) {
        this.f27224a.set(aVar.h());
        this.f27224a.transform(matrix);
        canvas.drawPath(this.f27224a, this.f27228f);
    }

    public final boolean r() {
        if (this.f27240r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27240r.b().size(); i10++) {
            if (this.f27240r.b().get(i10).a() != n7.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.f27244v != null) {
            return;
        }
        if (this.f27243u == null) {
            this.f27244v = Collections.EMPTY_LIST;
            return;
        }
        this.f27244v = new ArrayList();
        for (b bVar = this.f27243u; bVar != null; bVar = bVar.f27243u) {
            this.f27244v.add(bVar);
        }
    }

    public final void t(Canvas canvas) {
        if (f7.e.h()) {
            f7.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f27231i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f27230h);
        if (f7.e.h()) {
            f7.e.c("Layer#clearLayer");
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar);

    public n7.h w() {
        return this.f27239q.a();
    }

    public n7.a x() {
        return this.f27239q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.B == f10) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f10;
        return blurMaskFilter;
    }

    public j z() {
        return this.f27239q.d();
    }
}
