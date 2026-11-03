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
    public final Path f27789a = new Path();
    public final Matrix b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f27790c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f27791d = new g7.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f27792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f27793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f27794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f27795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f27796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f27797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f27798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f27799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f27800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f27801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f27802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f27803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f27804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i7.h f27805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i7.d f27806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f27807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f27808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<b> f27809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List<i7.a<?, ?>> f27810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f27811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f27813z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27814a;
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
            f27814a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27814a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27814a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27814a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27814a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27814a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27814a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(h0 h0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f27792e = new g7.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f27793f = new g7.a(1, mode2);
        g7.a aVar = new g7.a(1);
        this.f27794g = aVar;
        this.f27795h = new g7.a(PorterDuff.Mode.CLEAR);
        this.f27796i = new RectF();
        this.f27797j = new RectF();
        this.f27798k = new RectF();
        this.f27799l = new RectF();
        this.f27800m = new RectF();
        this.f27802o = new Matrix();
        this.f27810w = new ArrayList();
        this.f27812y = true;
        this.B = 0.0f;
        this.f27803p = h0Var;
        this.f27804q = eVar;
        this.f27801n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f27811x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            i7.h hVar = new i7.h(eVar.h());
            this.f27805r = hVar;
            Iterator<i7.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (i7.a<Integer, Integer> aVar2 : this.f27805r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    public static b v(c cVar, e eVar, h0 h0Var, f7.i iVar) {
        switch (a.f27814a[eVar.g().ordinal()]) {
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
        return this.f27804q;
    }

    public boolean B() {
        i7.h hVar = this.f27805r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public boolean C() {
        return this.f27807t != null;
    }

    public final void D(RectF rectF, Matrix matrix) {
        this.f27798k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f27805r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                n7.i iVar = this.f27805r.b().get(i10);
                Path pathH = this.f27805r.a().get(i10).h();
                if (pathH != null) {
                    this.f27789a.set(pathH);
                    this.f27789a.transform(matrix);
                    int i11 = a.b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f27789a.computeBounds(this.f27800m, false);
                    if (i10 == 0) {
                        this.f27798k.set(this.f27800m);
                    } else {
                        RectF rectF2 = this.f27798k;
                        rectF2.set(Math.min(rectF2.left, this.f27800m.left), Math.min(this.f27798k.top, this.f27800m.top), Math.max(this.f27798k.right, this.f27800m.right), Math.max(this.f27798k.bottom, this.f27800m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f27798k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void E(RectF rectF, Matrix matrix) {
        if (C() && this.f27804q.i() != e.b.INVERT) {
            this.f27799l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f27807t.e(this.f27799l, matrix, true);
            if (rectF.intersect(this.f27799l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void F() {
        this.f27803p.invalidateSelf();
    }

    public final void G(float f10) {
        this.f27803p.J().n().a(this.f27804q.j(), f10);
    }

    public void H(i7.a<?, ?> aVar) {
        this.f27810w.remove(aVar);
    }

    public void I(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
    }

    public void J(b bVar) {
        this.f27807t = bVar;
    }

    public void K(boolean z10) {
        if (z10 && this.A == null) {
            this.A = new g7.a();
        }
        this.f27813z = z10;
    }

    public void L(b bVar) {
        this.f27808u = bVar;
    }

    public void M(float f10) {
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress");
            f7.e.b("BaseLayer#setProgress.transform");
        }
        this.f27811x.j(f10);
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f27805r != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f27805r.a().size(); i10++) {
                this.f27805r.a().get(i10).n(f10);
            }
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f27806s != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.inout");
            }
            this.f27806s.n(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f27807t != null) {
            if (f7.e.h()) {
                f7.e.b("BaseLayer#setProgress.matte");
            }
            this.f27807t.M(f10);
            if (f7.e.h()) {
                f7.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (f7.e.h()) {
            f7.e.b("BaseLayer#setProgress.animations." + this.f27810w.size());
        }
        for (int i11 = 0; i11 < this.f27810w.size(); i11++) {
            this.f27810w.get(i11).n(f10);
        }
        if (f7.e.h()) {
            f7.e.c("BaseLayer#setProgress.animations." + this.f27810w.size());
            f7.e.c("BaseLayer#setProgress");
        }
    }

    public final void N(boolean z10) {
        if (z10 != this.f27812y) {
            this.f27812y = z10;
            F();
        }
    }

    public final void O() {
        if (this.f27804q.f().isEmpty()) {
            N(true);
            return;
        }
        i7.d dVar = new i7.d(this.f27804q.f());
        this.f27806s = dVar;
        dVar.m();
        this.f27806s.a(new i7.a.b() { // from class: o7.a
            @Override // i7.a.b
            public final void a() {
                b bVar = this.f27788a;
                bVar.N(bVar.f27806s.r() == 1.0f);
            }
        });
        N(this.f27806s.h().floatValue() == 1.0f);
        j(this.f27806s);
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
        this.f27811x.c(t8, cVar);
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f27796i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f27802o.set(matrix);
        if (z10) {
            List<b> list = this.f27809v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f27802o.preConcat(this.f27809v.get(size).f27811x.f());
                }
            } else {
                b bVar = this.f27808u;
                if (bVar != null) {
                    this.f27802o.preConcat(bVar.f27811x.f());
                }
            }
        }
        this.f27802o.preConcat(this.f27811x.f());
    }

    @Override // h7.c
    public String getName() {
        return this.f27804q.j();
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        b bVar = this.f27807t;
        if (bVar != null) {
            l7.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f27807t.getName(), i10)) {
                list.add(eVarA.i(this.f27807t));
            }
            if (eVar.g(this.f27807t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f27807t.I(eVar, eVar.e(this.f27807t.getName(), i10) + i10, list, eVarA);
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
        f7.e.b(this.f27801n);
        if (!this.f27812y || this.f27804q.y()) {
            f7.e.c(this.f27801n);
            return;
        }
        s();
        if (f7.e.h()) {
            f7.e.b("Layer#parentMatrix");
        }
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.f27809v.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.f27809v.get(size).f27811x.f());
        }
        if (f7.e.h()) {
            f7.e.c("Layer#parentMatrix");
        }
        i7.a<?, Integer> aVarH = this.f27811x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == n7.h.NORMAL) {
            this.b.preConcat(this.f27811x.f());
            if (f7.e.h()) {
                f7.e.b("Layer#drawLayer");
            }
            u(canvas, this.b, iIntValue, bVar);
            if (f7.e.h()) {
                f7.e.c("Layer#drawLayer");
            }
            G(f7.e.c(this.f27801n));
            return;
        }
        if (f7.e.h()) {
            f7.e.b("Layer#computeBounds");
        }
        e(this.f27796i, this.b, false);
        E(this.f27796i, matrix);
        this.b.preConcat(this.f27811x.f());
        D(this.f27796i, this.b);
        this.f27797j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f27790c);
        if (!this.f27790c.isIdentity()) {
            Matrix matrix2 = this.f27790c;
            matrix2.invert(matrix2);
            this.f27790c.mapRect(this.f27797j);
        }
        if (!this.f27796i.intersect(this.f27797j)) {
            this.f27796i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#computeBounds");
        }
        if (this.f27796i.width() >= 1.0f && this.f27796i.height() >= 1.0f) {
            if (f7.e.h()) {
                f7.e.b("Layer#saveLayer");
            }
            this.f27791d.setAlpha(255);
            androidx.core.graphics.d.b(this.f27791d, w().b());
            m.n(canvas, this.f27796i, this.f27791d);
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
                RectF rectF = this.f27796i;
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
                m.o(canvas, this.f27796i, this.f27794g, 19);
                if (f7.e.h()) {
                    f7.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f27807t.i(canvas, matrix, i10, null);
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
        if (this.f27813z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f27796i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f27796i, this.A);
        }
        G(f7.e.c(this.f27801n));
    }

    public void j(i7.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f27810w.add(aVar);
    }

    public final void k(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        this.f27791d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27789a, this.f27791d);
    }

    public final void l(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27796i, this.f27792e);
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        this.f27791d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27789a, this.f27791d);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27796i, this.f27791d);
        canvas.drawRect(this.f27796i, this.f27791d);
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        this.f27791d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f27789a, this.f27793f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27796i, this.f27792e);
        canvas.drawRect(this.f27796i, this.f27791d);
        this.f27793f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        canvas.drawPath(this.f27789a, this.f27793f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix, i7.a<o, Path> aVar, i7.a<Integer, Integer> aVar2) {
        m.n(canvas, this.f27796i, this.f27793f);
        canvas.drawRect(this.f27796i, this.f27791d);
        this.f27793f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        canvas.drawPath(this.f27789a, this.f27793f);
        canvas.restore();
    }

    public final void p(Canvas canvas, Matrix matrix) {
        if (f7.e.h()) {
            f7.e.b("Layer#saveLayer");
        }
        m.o(canvas, this.f27796i, this.f27792e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (f7.e.h()) {
            f7.e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f27805r.b().size(); i10++) {
            n7.i iVar = this.f27805r.b().get(i10);
            i7.a<o, Path> aVar = this.f27805r.a().get(i10);
            i7.a<Integer, Integer> aVar2 = this.f27805r.c().get(i10);
            int i11 = a.b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f27791d.setColor(-16777216);
                        this.f27791d.setAlpha(255);
                        canvas.drawRect(this.f27796i, this.f27791d);
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
                this.f27791d.setAlpha(255);
                canvas.drawRect(this.f27796i, this.f27791d);
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
        this.f27789a.set(aVar.h());
        this.f27789a.transform(matrix);
        canvas.drawPath(this.f27789a, this.f27793f);
    }

    public final boolean r() {
        if (this.f27805r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27805r.b().size(); i10++) {
            if (this.f27805r.b().get(i10).a() != n7.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void s() {
        if (this.f27809v != null) {
            return;
        }
        if (this.f27808u == null) {
            this.f27809v = Collections.EMPTY_LIST;
            return;
        }
        this.f27809v = new ArrayList();
        for (b bVar = this.f27808u; bVar != null; bVar = bVar.f27808u) {
            this.f27809v.add(bVar);
        }
    }

    public final void t(Canvas canvas) {
        if (f7.e.h()) {
            f7.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f27796i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f27795h);
        if (f7.e.h()) {
            f7.e.c("Layer#clearLayer");
        }
    }

    public abstract void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar);

    public n7.h w() {
        return this.f27804q.a();
    }

    public n7.a x() {
        return this.f27804q.b();
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
        return this.f27804q.d();
    }
}
