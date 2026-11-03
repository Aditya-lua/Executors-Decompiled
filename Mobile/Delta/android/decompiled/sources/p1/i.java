package p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Rational;
import f1.b2;
import f1.e1;
import f1.p1;
import f1.r0;
import g0.a2;
import g0.f1;
import g0.r1;
import g0.u0;
import g0.v1;
import g0.x2;
import g0.y2;
import g0.z2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n0.i2;
import n0.t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final f1.j Q = new a();
    public int A;
    public boolean B;
    public boolean C;
    public b D;
    public final k<z2> E;
    public final k<Integer> F;
    public final androidx.p000lifecycle.d0<k0> G;
    public final androidx.p000lifecycle.a0<Integer> H;
    public final n<Boolean> I;
    public final n<Float> J;
    public final n<Float> K;
    public final Set<g0.n> L;
    public final Context M;
    public final ne.x<Void> N;
    public final Map<r1.a.EnumC0528a, r1.a> O;
    public long P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0.v f28362a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f28363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1.c f28364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f28365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1.c f28366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f28367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f28368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f28369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u0.a f28370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f28371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a1.c f28372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p1<r0> f28373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e1 f28374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map<x2.a<b2>, e1> f28375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f1.a0 f28376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g0.k0 f28378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g0.k0 f28379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Range<Integer> f28380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g0.l f28381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f28382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y2 f28383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2.c f28384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b0 f28385y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b0.b f28386z;

    public class a implements f1.j {
        @Override // g0.f1.j
        public void a(long j10, f1.k kVar) {
            kVar.a();
        }

        @Override // g0.f1.j
        public void clear() {
        }
    }

    public static class b implements r0.c<g0.n0> {
        public final PointF b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.p000lifecycle.d0<k0> f28388c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28387a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f28389d = new Object();

        public b(PointF pointF, androidx.p000lifecycle.d0<k0> d0Var) {
            this.b = pointF;
            this.f28388c = d0Var;
        }

        public void a() {
            synchronized (this.f28389d) {
                this.f28387a = true;
            }
        }

        @Override // r0.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(g0.n0 n0Var) {
            synchronized (this.f28389d) {
                try {
                    if (this.f28387a) {
                        return;
                    }
                    if (n0Var == null) {
                        return;
                    }
                    r1.a("CameraController", "Tap-to-focus onSuccess: " + n0Var.c());
                    this.f28388c.m(new k0(n0Var.c() ? 2 : 3, this.b));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c() {
            synchronized (this.f28389d) {
                try {
                    if (this.f28387a) {
                        return;
                    }
                    r1.a("CameraController", "Tap-to-focus reset.");
                    this.f28388c.m(new k0(0, null));
                    this.f28387a = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            synchronized (this.f28389d) {
                try {
                    if (this.f28387a) {
                        return;
                    }
                    if (!(th2 instanceof g0.m.a)) {
                        r1.b("CameraController", "Tap-to-focus failed.", th2);
                        this.f28388c.m(new k0(4, this.b));
                    } else {
                        r1.b("CameraController", "Tap-to-focus canceled", th2);
                        this.f28388c.m(new k0(0, null));
                        a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Deprecated
    public static final class c {
    }

    public i(Context context) {
        this(context, r0.n.x(d1.k.e(context), new t.a() { // from class: p1.e
            @Override // t.a
            public final Object apply(Object obj) {
                return new z((d1.k) obj);
            }
        }, q0.c.b()));
    }

    public static /* synthetic */ Void a(i iVar, y yVar) {
        iVar.f28382v = yVar;
        iVar.P();
        iVar.L();
        return null;
    }

    public static /* synthetic */ void b(i iVar, int i10) {
        iVar.A = i10;
        iVar.f28371k.u0(i10);
        iVar.f28365e.R0(i10);
        iVar.f28373m.c1(i10);
    }

    public void A(float f10) {
        if (!t()) {
            r1.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.B) {
            r1.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        r1.a("CameraController", "Pinch to zoom with scale: " + f10);
        z2 z2VarF = s().f();
        if (z2VarF == null) {
            return;
        }
        I(Math.min(Math.max(z2VarF.d() * J(f10), z2VarF.c()), z2VarF.a()));
    }

    public void B(v1 v1Var, float f10, float f11) {
        if (!t()) {
            r1.l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.C) {
            r1.a("CameraController", "Tap to focus disabled. ");
            return;
        }
        PointF pointF = new PointF(f10, f11);
        g0.m0 m0VarF = f(v1Var, pointF);
        r1.a("CameraController", "Tap to focus started: " + f10 + ", " + f11);
        b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
        this.G.m(new k0(1, pointF));
        final b bVar2 = new b(pointF, this.G);
        this.D = bVar2;
        r0.n.j(this.f28381u.c().o(m0VarF), bVar2, q0.c.b());
        long millis = TimeUnit.NANOSECONDS.toMillis(this.P);
        r1.a("CameraController", "Tap to focus auto cancel duration: " + millis + " ms");
        if (millis > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p1.d
                @Override // java.lang.Runnable
                public final void run() {
                    bVar2.c();
                }
            }, millis);
        }
    }

    public final void C(u0.a aVar, u0.a aVar2) {
        if (Objects.equals(aVar == null ? null : aVar.c(), aVar2 != null ? aVar2.c() : null)) {
            return;
        }
        R(Integer.valueOf(this.f28371k.m0()), Integer.valueOf(this.f28371k.n0()), Integer.valueOf(this.f28371k.p0()));
        L();
    }

    public void D(Executor executor, u0.a aVar) {
        p0.z.b();
        u0.a aVar2 = this.f28370j;
        if (aVar2 == aVar && this.f28368h == executor) {
            return;
        }
        this.f28368h = executor;
        this.f28370j = aVar;
        this.f28371k.t0(executor, aVar);
        C(aVar2, aVar);
    }

    public void E(a1.c cVar) {
        p0.z.b();
        if (this.f28372l == cVar) {
            return;
        }
        this.f28372l = cVar;
        R(Integer.valueOf(this.f28371k.m0()), Integer.valueOf(this.f28371k.n0()), Integer.valueOf(this.f28371k.p0()));
        L();
    }

    public void F(int i10) {
        p0.z.b();
        if (i10 == 3) {
            Integer numD = this.f28362a.d();
            if (numD != null && numD.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            W();
        }
        this.f28365e.N0(i10);
    }

    public ne.x<Void> G(float f10) {
        p0.z.b();
        return !t() ? this.J.c(Float.valueOf(f10)) : this.f28381u.c().e(f10);
    }

    public void H(r1.a aVar) {
        r1.a aVarP = p();
        this.O.put(aVar.a(), aVar);
        r1.a aVarP2 = p();
        if (aVarP2 == null || aVarP2.equals(aVarP)) {
            return;
        }
        W();
    }

    public ne.x<Void> I(float f10) {
        p0.z.b();
        return !t() ? this.K.c(Float.valueOf(f10)) : this.f28381u.c().g(f10);
    }

    public final float J(float f10) {
        return f10 > 1.0f ? ((f10 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f10) * 2.0f);
    }

    public abstract g0.l K();

    public void L() {
        M(null);
    }

    public void M(Runnable runnable) {
        try {
            this.f28381u = K();
            if (!t()) {
                r1.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.E.r(this.f28381u.d().z());
            this.F.r(this.f28381u.d().p());
            this.I.b(new t.a() { // from class: p1.a
                @Override // t.a
                public final Object apply(Object obj) {
                    return this.f28337a.l(((Boolean) obj).booleanValue());
                }
            });
            this.J.b(new t.a() { // from class: p1.b
                @Override // t.a
                public final Object apply(Object obj) {
                    return this.f28340a.G(((Float) obj).floatValue());
                }
            });
            this.K.b(new t.a() { // from class: p1.c
                @Override // t.a
                public final Object apply(Object obj) {
                    return this.f28347a.I(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e10) {
            if (runnable != null) {
                runnable.run();
            }
            throw e10;
        }
    }

    public final void N() {
        if (this.f28385y.a(q0.c.e(), this.f28386z)) {
            return;
        }
        r1.l("CameraController", "The device cannot detect rotation changes.");
    }

    public final void O() {
        this.f28385y.c(this.f28386z);
    }

    public final void P() {
        T();
        S(Integer.valueOf(n()));
        R(Integer.valueOf(this.f28371k.m0()), Integer.valueOf(this.f28371k.n0()), Integer.valueOf(this.f28371k.p0()));
        U();
    }

    public final void Q() {
        if (u()) {
            this.f28382v.c(this.f28363c, this.f28365e, this.f28371k, this.f28373m);
        }
    }

    public final void R(Integer num, Integer num2, Integer num3) {
        u0.a aVar;
        p0.z.b();
        if (u()) {
            this.f28382v.c(this.f28371k);
        }
        u0 u0VarG = g(num, num2, num3);
        this.f28371k = u0VarG;
        Executor executor = this.f28368h;
        if (executor == null || (aVar = this.f28370j) == null) {
            return;
        }
        u0VarG.t0(executor, aVar);
    }

    public final void S(Integer num) {
        if (u()) {
            this.f28382v.c(this.f28365e);
        }
        int iW0 = this.f28365e.w0();
        this.f28365e = h(num);
        F(iW0);
    }

    public final void T() {
        if (u()) {
            this.f28382v.c(this.f28363c);
        }
        a2 a2VarI = i();
        this.f28363c = a2VarI;
        a2.c cVar = this.f28384x;
        if (cVar != null) {
            a2VarI.q0(cVar);
        }
    }

    public final void U() {
        if (u()) {
            this.f28382v.c(this.f28373m);
        }
        this.f28373m = k();
    }

    public void V(Matrix matrix) {
        p0.z.b();
        u0.a aVar = this.f28370j;
        if (aVar != null && aVar.d() == 1) {
            this.f28370j.e(matrix);
        }
    }

    public void W() {
        r1.a aVarP = p();
        if (aVarP == null) {
            r1.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.f28365e.O0(Q);
            return;
        }
        this.f28365e.O0(aVarP.b());
        r1.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + aVarP.a().name());
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    public void c(a2.c cVar, y2 y2Var) {
        p0.z.b();
        if (this.f28384x != cVar) {
            this.f28384x = cVar;
            this.f28363c.q0(cVar);
        }
        boolean z10 = this.f28383w == null || r(y2Var) != r(this.f28383w);
        this.f28383w = y2Var;
        N();
        if (z10) {
            P();
        }
        L();
    }

    public void d() {
        p0.z.b();
        y yVar = this.f28382v;
        if (yVar != null) {
            yVar.c(this.f28363c, this.f28365e, this.f28371k, this.f28373m);
        }
        this.f28363c.q0(null);
        this.f28381u = null;
        this.f28384x = null;
        this.f28383w = null;
        O();
    }

    public final void e(i2.a<?> aVar, a1.c cVar, c cVar2) {
        a1.a aVarR;
        if (cVar != null) {
            aVar.b(cVar);
            return;
        }
        y2 y2Var = this.f28383w;
        if (y2Var == null || (aVarR = r(y2Var)) == null) {
            return;
        }
        aVar.b(new a1.c.a().d(aVarR).a());
    }

    public final g0.m0 f(v1 v1Var, PointF pointF) {
        g0.m0.a aVarA = new g0.m0.a(v1Var.c(pointF.x, pointF.y, 0.16666667f), 1).a(v1Var.c(pointF.x, pointF.y, 0.25f), 2);
        long j10 = this.P;
        return (j10 > 0 ? aVarA.e(j10, TimeUnit.NANOSECONDS) : aVarA.c()).b();
    }

    @SuppressLint({"WrongConstant"})
    public final u0 g(Integer num, Integer num2, Integer num3) {
        u0.c cVar = new u0.c();
        if (num != null) {
            cVar.j(num.intValue());
        }
        if (num2 != null) {
            cVar.n(num2.intValue());
        }
        if (num3 != null) {
            cVar.o(num3.intValue());
        }
        e(cVar, this.f28372l, null);
        Executor executor = this.f28369i;
        if (executor != null) {
            cVar.i(executor);
        }
        int i10 = this.A;
        if (i10 != -1) {
            cVar.c(i10);
        }
        return cVar.f();
    }

    @SuppressLint({"WrongConstant"})
    public final f1 h(Integer num) {
        f1.b bVar = new f1.b();
        if (num != null) {
            bVar.i(num.intValue());
        }
        e(bVar, this.f28366f, null);
        Executor executor = this.f28367g;
        if (executor != null) {
            bVar.l(executor);
        }
        int i10 = this.A;
        if (i10 != -1) {
            bVar.c(i10);
        }
        return bVar.f();
    }

    public final a2 i() {
        a2.a aVar = new a2.a();
        e(aVar, this.f28364d, null);
        aVar.j(this.f28379s);
        return aVar.f();
    }

    public x2 j() {
        if (!u()) {
            r1.a("CameraController", "Camera not initialized.");
            return null;
        }
        if (!x()) {
            r1.a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        Q();
        x2.a aVarB = new x2.a().b(this.f28363c);
        if (w()) {
            aVarB.b(this.f28365e);
        }
        if (v()) {
            aVarB.b(this.f28371k);
        }
        if (z()) {
            aVarB.b(this.f28373m);
        }
        aVarB.e(this.f28383w);
        Iterator<g0.n> it = this.L.iterator();
        while (it.hasNext()) {
            aVarB.a(it.next());
        }
        return aVarB.c();
    }

    @SuppressLint({"WrongConstant"})
    public final p1<r0> k() {
        int iQ;
        r0.i iVarF = new r0.i().f(this.f28376p);
        y2 y2Var = this.f28383w;
        if (y2Var != null && this.f28376p == r0.f16532s0 && (iQ = q(y2Var)) != -1) {
            iVarF.d(iQ);
        }
        p1.d dVarK = new p1.d(iVarF.c()).q(this.f28380t).l(this.f28377q).k(this.f28378r);
        int i10 = this.A;
        if (i10 != -1) {
            dVarK.c(i10);
        }
        return dVarK.f();
    }

    public ne.x<Void> l(boolean z10) {
        p0.z.b();
        return !t() ? this.I.c(Boolean.valueOf(z10)) : this.f28381u.c().c(z10);
    }

    public int m() {
        p0.z.b();
        return this.f28365e.w0();
    }

    public int n() {
        p0.z.b();
        return this.f28365e.v0();
    }

    public final String o(g0.v vVar) {
        if (vVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder("CameraSelector{");
        Integer numD = vVar.d();
        if (numD != null) {
            int iIntValue = numD.intValue();
            if (iIntValue == 0) {
                sb2.append("lensFacing=FRONT");
            } else if (iIntValue == 1) {
                sb2.append("lensFacing=BACK");
            } else if (iIntValue != 2) {
                sb2.append("lensFacing=UNKNOWN(");
                sb2.append(numD);
                sb2.append(")");
            } else {
                sb2.append("lensFacing=EXTERNAL");
            }
        } else {
            sb2.append("lensFacing=NOT_SPECIFIED");
        }
        sb2.append("}");
        return sb2.toString();
    }

    public r1.a p() {
        Map<r1.a.EnumC0528a, r1.a> map = this.O;
        r1.a.EnumC0528a enumC0528a = r1.a.EnumC0528a.SCREEN_FLASH_VIEW;
        if (map.get(enumC0528a) != null) {
            return this.O.get(enumC0528a);
        }
        Map<r1.a.EnumC0528a, r1.a> map2 = this.O;
        r1.a.EnumC0528a enumC0528a2 = r1.a.EnumC0528a.PREVIEW_VIEW;
        if (map2.get(enumC0528a2) != null) {
            return this.O.get(enumC0528a2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    public final int q(y2 y2Var) {
        int iD;
        boolean z10;
        int iA;
        Rational rationalA;
        int iB = y2Var == null ? 0 : p0.c.b(y2Var.c());
        try {
            y yVar = this.f28382v;
            if (yVar != null) {
                g0.t tVarA = yVar.a(this.f28362a);
                iD = tVarA.d();
                try {
                    if (tVarA.i() != 1) {
                        z10 = false;
                    }
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    r1.m("CameraController", "Failed to retrieve CameraInfo for selector: " + o(this.f28362a), e);
                }
                iA = p0.c.a(iB, iD, z10);
                rationalA = y2Var.a();
                if (iA != 90 || iA == 270) {
                    rationalA = new Rational(rationalA.getDenominator(), rationalA.getNumerator());
                }
                if (rationalA.equals(p0.a.f28270a)) {
                    return 0;
                }
                if (rationalA.equals(p0.a.f28271c)) {
                    return 1;
                }
                return -1;
            }
            iD = 0;
        } catch (IllegalArgumentException e11) {
            e = e11;
            iD = 0;
        }
        z10 = true;
        iA = p0.c.a(iB, iD, z10);
        rationalA = y2Var.a();
        if (iA != 90) {
            rationalA = new Rational(rationalA.getDenominator(), rationalA.getNumerator());
        } else {
            rationalA = new Rational(rationalA.getDenominator(), rationalA.getNumerator());
        }
        if (rationalA.equals(p0.a.f28270a)) {
            return 0;
        }
        if (rationalA.equals(p0.a.f28271c)) {
            return 1;
        }
        return -1;
    }

    public final a1.a r(y2 y2Var) {
        int iQ = q(y2Var);
        if (iQ != -1) {
            return new a1.a(iQ, 1);
        }
        return null;
    }

    public androidx.p000lifecycle.a0<z2> s() {
        p0.z.b();
        return this.E;
    }

    public final boolean t() {
        return this.f28381u != null;
    }

    public final boolean u() {
        return this.f28382v != null;
    }

    public boolean v() {
        p0.z.b();
        return y(2);
    }

    public boolean w() {
        p0.z.b();
        return y(1);
    }

    public final boolean x() {
        return (this.f28384x == null || this.f28383w == null) ? false : true;
    }

    public final boolean y(int i10) {
        return (i10 & this.b) != 0;
    }

    public boolean z() {
        p0.z.b();
        return y(4);
    }

    public i(Context context, ne.x<y> xVar) {
        this.f28362a = g0.v.f18073d;
        this.b = 3;
        this.f28374n = null;
        this.f28375o = new HashMap();
        this.f28376p = r0.f16532s0;
        this.f28377q = 0;
        g0.k0 k0Var = g0.k0.f18008c;
        this.f28378r = k0Var;
        this.f28379s = k0Var;
        this.f28380t = t3.f25682a;
        this.A = -1;
        this.B = true;
        this.C = true;
        this.E = new k<>();
        this.F = new k<>();
        androidx.p000lifecycle.d0<k0> d0Var = new androidx.p000lifecycle.d0<>(new k0(0, null));
        this.G = d0Var;
        this.H = p0.m.a(d0Var, new t.a() { // from class: p1.f
            @Override // t.a
            public final Object apply(Object obj) {
                return Integer.valueOf(((k0) obj).getFocusState());
            }
        });
        this.I = new n<>();
        this.J = new n<>();
        this.K = new n<>();
        this.L = new HashSet();
        this.O = new HashMap();
        this.P = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context contextA = p0.f.a(context);
        this.M = contextA;
        this.f28363c = i();
        this.f28365e = h(null);
        this.f28371k = g(null, null, null);
        this.f28373m = k();
        this.N = r0.n.x(xVar, new t.a() { // from class: p1.g
            @Override // t.a
            public final Object apply(Object obj) {
                return i.a(this.f28357a, (y) obj);
            }
        }, q0.c.e());
        this.f28385y = new b0(contextA);
        this.f28386z = new b0.b() { // from class: p1.h
            @Override // p1.b0.b
            public final void a(int i10) {
                i.b(this.f28359a, i10);
            }
        };
    }
}
