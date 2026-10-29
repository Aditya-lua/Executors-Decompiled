package p348p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Rational;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ne.InterfaceFutureC9440x;
import p002a1.C0052a;
import p002a1.C0054c;
import p064d1.C4406k;
import p115f1.AbstractC5241b2;
import p115f1.C5235a0;
import p115f1.C5251e1;
import p115f1.C5284p1;
import p115f1.C5289r0;
import p140g0.AbstractC5913n;
import p140g0.AbstractC5947v1;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5902k0;
import p140g0.C5910m0;
import p140g0.C5914n0;
import p140g0.C5931r1;
import p140g0.C5942u0;
import p140g0.C5945v;
import p140g0.C5956x2;
import p140g0.C5960y2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5909m;
import p140g0.InterfaceC5937t;
import p140g0.InterfaceC5964z2;
import p296n0.AbstractC8827t3;
import p296n0.InterfaceC8769i2;
import p347p0.C10084a;
import p347p0.C10087c;
import p347p0.C10090f;
import p347p0.C10097m;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p398r1.C10776a;
import p436t.InterfaceC11464a;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: p1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10127i {

    /* JADX INFO: renamed from: Q */
    public static final C5883f1.j f36430Q = new a();

    /* JADX INFO: renamed from: A */
    public int f36431A;

    /* JADX INFO: renamed from: B */
    public boolean f36432B;

    /* JADX INFO: renamed from: C */
    public boolean f36433C;

    /* JADX INFO: renamed from: D */
    public b f36434D;

    /* JADX INFO: renamed from: E */
    public final C10131k<InterfaceC5964z2> f36435E;

    /* JADX INFO: renamed from: F */
    public final C10131k<Integer> f36436F;

    /* JADX INFO: renamed from: G */
    public final C0949d0<C10132k0> f36437G;

    /* JADX INFO: renamed from: H */
    public final AbstractC0940a0<Integer> f36438H;

    /* JADX INFO: renamed from: I */
    public final C10137n<Boolean> f36439I;

    /* JADX INFO: renamed from: J */
    public final C10137n<Float> f36440J;

    /* JADX INFO: renamed from: K */
    public final C10137n<Float> f36441K;

    /* JADX INFO: renamed from: L */
    public final Set<AbstractC5913n> f36442L;

    /* JADX INFO: renamed from: M */
    public final Context f36443M;

    /* JADX INFO: renamed from: N */
    public final InterfaceFutureC9440x<Void> f36444N;

    /* JADX INFO: renamed from: O */
    public final Map<C10776a.a, C10776a> f36445O;

    /* JADX INFO: renamed from: P */
    public long f36446P;

    /* JADX INFO: renamed from: a */
    public C5945v f36447a;

    /* JADX INFO: renamed from: b */
    public int f36448b;

    /* JADX INFO: renamed from: c */
    public C5864a2 f36449c;

    /* JADX INFO: renamed from: d */
    public C0054c f36450d;

    /* JADX INFO: renamed from: e */
    public C5883f1 f36451e;

    /* JADX INFO: renamed from: f */
    public C0054c f36452f;

    /* JADX INFO: renamed from: g */
    public Executor f36453g;

    /* JADX INFO: renamed from: h */
    public Executor f36454h;

    /* JADX INFO: renamed from: i */
    public Executor f36455i;

    /* JADX INFO: renamed from: j */
    public C5942u0.a f36456j;

    /* JADX INFO: renamed from: k */
    public C5942u0 f36457k;

    /* JADX INFO: renamed from: l */
    public C0054c f36458l;

    /* JADX INFO: renamed from: m */
    public C5284p1<C5289r0> f36459m;

    /* JADX INFO: renamed from: n */
    public C5251e1 f36460n;

    /* JADX INFO: renamed from: o */
    public Map<InterfaceC12631a<AbstractC5241b2>, C5251e1> f36461o;

    /* JADX INFO: renamed from: p */
    public C5235a0 f36462p;

    /* JADX INFO: renamed from: q */
    public int f36463q;

    /* JADX INFO: renamed from: r */
    public C5902k0 f36464r;

    /* JADX INFO: renamed from: s */
    public C5902k0 f36465s;

    /* JADX INFO: renamed from: t */
    public Range<Integer> f36466t;

    /* JADX INFO: renamed from: u */
    public InterfaceC5905l f36467u;

    /* JADX INFO: renamed from: v */
    public InterfaceC10151y f36468v;

    /* JADX INFO: renamed from: w */
    public C5960y2 f36469w;

    /* JADX INFO: renamed from: x */
    public C5864a2.c f36470x;

    /* JADX INFO: renamed from: y */
    public final C10114b0 f36471y;

    /* JADX INFO: renamed from: z */
    public final C10114b0.b f36472z;

    /* JADX INFO: renamed from: p1.i$a */
    public class a implements C5883f1.j {
        @Override // p140g0.C5883f1.j
        /* JADX INFO: renamed from: a */
        public void mo26438a(long j10, C5883f1.k kVar) {
            kVar.mo26439a();
        }

        @Override // p140g0.C5883f1.j
        public void clear() {
        }
    }

    /* JADX INFO: renamed from: p1.i$b */
    public static class b implements InterfaceC10762c<C5914n0> {

        /* JADX INFO: renamed from: b */
        public final PointF f36474b;

        /* JADX INFO: renamed from: c */
        public final C0949d0<C10132k0> f36475c;

        /* JADX INFO: renamed from: a */
        public boolean f36473a = false;

        /* JADX INFO: renamed from: d */
        public final Object f36476d = new Object();

        public b(PointF pointF, C0949d0<C10132k0> c0949d0) {
            this.f36474b = pointF;
            this.f36475c = c0949d0;
        }

        /* JADX INFO: renamed from: a */
        public void m39075a() {
            synchronized (this.f36476d) {
                this.f36473a = true;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C5914n0 c5914n0) {
            synchronized (this.f36476d) {
                try {
                    if (this.f36473a) {
                        return;
                    }
                    if (c5914n0 == null) {
                        return;
                    }
                    C5931r1.m26561a("CameraController", "Tap-to-focus onSuccess: " + c5914n0.m26549c());
                    this.f36475c.mo4861m(new C10132k0(c5914n0.m26549c() ? 2 : 3, this.f36474b));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m39077c() {
            synchronized (this.f36476d) {
                try {
                    if (this.f36473a) {
                        return;
                    }
                    C5931r1.m26561a("CameraController", "Tap-to-focus reset.");
                    this.f36475c.mo4861m(new C10132k0(0, null));
                    this.f36473a = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            synchronized (this.f36476d) {
                try {
                    if (this.f36473a) {
                        return;
                    }
                    if (!(th2 instanceof InterfaceC5909m.a)) {
                        C5931r1.m26562b("CameraController", "Tap-to-focus failed.", th2);
                        this.f36475c.mo4861m(new C10132k0(4, this.f36474b));
                    } else {
                        C5931r1.m26562b("CameraController", "Tap-to-focus canceled", th2);
                        this.f36475c.mo4861m(new C10132k0(0, null));
                        m39075a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p1.i$c */
    @Deprecated
    public static final class c {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC10127i(Context context) {
        this(context, C10773n.m41001x(C4406k.m22137e(context), new InterfaceC11464a() { // from class: p1.e
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return new C10152z((C4406k) obj);
            }
        }, C10417c.m40081b()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m39026a(AbstractC10127i abstractC10127i, InterfaceC10151y interfaceC10151y) {
        abstractC10127i.f36468v = interfaceC10151y;
        abstractC10127i.m39043P();
        abstractC10127i.m39039L();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39027b(AbstractC10127i abstractC10127i, int i10) {
        abstractC10127i.f36431A = i10;
        abstractC10127i.f36457k.m26602u0(i10);
        abstractC10127i.f36451e.m26379R0(i10);
        abstractC10127i.f36459m.m24398c1(i10);
    }

    /* JADX INFO: renamed from: A */
    public void m39028A(float f10) {
        if (!m39068t()) {
            C5931r1.m26572l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.f36432B) {
            C5931r1.m26561a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        C5931r1.m26561a("CameraController", "Pinch to zoom with scale: " + f10);
        InterfaceC5964z2 interfaceC5964z2Mo4854f = m39067s().mo4854f();
        if (interfaceC5964z2Mo4854f == null) {
            return;
        }
        m39036I(Math.min(Math.max(interfaceC5964z2Mo4854f.mo26763d() * m39037J(f10), interfaceC5964z2Mo4854f.mo26762c()), interfaceC5964z2Mo4854f.mo26760a()));
    }

    /* JADX INFO: renamed from: B */
    public void m39029B(AbstractC5947v1 abstractC5947v1, float f10, float f11) {
        if (!m39068t()) {
            C5931r1.m26572l("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!this.f36433C) {
            C5931r1.m26561a("CameraController", "Tap to focus disabled. ");
            return;
        }
        PointF pointF = new PointF(f10, f11);
        C5910m0 c5910m0M39054f = m39054f(abstractC5947v1, pointF);
        C5931r1.m26561a("CameraController", "Tap to focus started: " + f10 + ", " + f11);
        b bVar = this.f36434D;
        if (bVar != null) {
            bVar.m39075a();
        }
        this.f36437G.mo4861m(new C10132k0(1, pointF));
        final b bVar2 = new b(pointF, this.f36437G);
        this.f36434D = bVar2;
        C10773n.m40987j(this.f36467u.mo22073c().mo26527o(c5910m0M39054f), bVar2, C10417c.m40081b());
        long millis = TimeUnit.NANOSECONDS.toMillis(this.f36446P);
        C5931r1.m26561a("CameraController", "Tap to focus auto cancel duration: " + millis + " ms");
        if (millis > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p1.d
                @Override // java.lang.Runnable
                public final void run() {
                    bVar2.m39077c();
                }
            }, millis);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m39030C(C5942u0.a aVar, C5942u0.a aVar2) {
        if (Objects.equals(aVar == null ? null : aVar.mo23122c(), aVar2 != null ? aVar2.mo23122c() : null)) {
            return;
        }
        m39045R(Integer.valueOf(this.f36457k.m26594m0()), Integer.valueOf(this.f36457k.m26595n0()), Integer.valueOf(this.f36457k.m26597p0()));
        m39039L();
    }

    /* JADX INFO: renamed from: D */
    public void m39031D(Executor executor, C5942u0.a aVar) {
        C10110z.m39008b();
        C5942u0.a aVar2 = this.f36456j;
        if (aVar2 == aVar && this.f36454h == executor) {
            return;
        }
        this.f36454h = executor;
        this.f36456j = aVar;
        this.f36457k.m26601t0(executor, aVar);
        m39030C(aVar2, aVar);
    }

    /* JADX INFO: renamed from: E */
    public void m39032E(C0054c c0054c) {
        C10110z.m39008b();
        if (this.f36458l == c0054c) {
            return;
        }
        this.f36458l = c0054c;
        m39045R(Integer.valueOf(this.f36457k.m26594m0()), Integer.valueOf(this.f36457k.m26595n0()), Integer.valueOf(this.f36457k.m26597p0()));
        m39039L();
    }

    /* JADX INFO: renamed from: F */
    public void m39033F(int i10) {
        C10110z.m39008b();
        if (i10 == 3) {
            Integer numM26629d = this.f36447a.m26629d();
            if (numM26629d != null && numM26629d.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            m39050W();
        }
        this.f36451e.m26375N0(i10);
    }

    /* JADX INFO: renamed from: G */
    public InterfaceFutureC9440x<Void> m39034G(float f10) {
        C10110z.m39008b();
        return !m39068t() ? this.f36440J.m39083c(Float.valueOf(f10)) : this.f36467u.mo22073c().mo26525e(f10);
    }

    /* JADX INFO: renamed from: H */
    public void m39035H(C10776a c10776a) {
        C10776a c10776aM39064p = m39064p();
        this.f36445O.put(c10776a.m41011a(), c10776a);
        C10776a c10776aM39064p2 = m39064p();
        if (c10776aM39064p2 == null || c10776aM39064p2.equals(c10776aM39064p)) {
            return;
        }
        m39050W();
    }

    /* JADX INFO: renamed from: I */
    public InterfaceFutureC9440x<Void> m39036I(float f10) {
        C10110z.m39008b();
        return !m39068t() ? this.f36441K.m39083c(Float.valueOf(f10)) : this.f36467u.mo22073c().mo26526g(f10);
    }

    /* JADX INFO: renamed from: J */
    public final float m39037J(float f10) {
        return f10 > 1.0f ? ((f10 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f10) * 2.0f);
    }

    /* JADX INFO: renamed from: K */
    public abstract InterfaceC5905l mo39038K();

    /* JADX INFO: renamed from: L */
    public void m39039L() {
        m39040M(null);
    }

    /* JADX INFO: renamed from: M */
    public void m39040M(Runnable runnable) {
        try {
            this.f36467u = mo39038K();
            if (!m39068t()) {
                C5931r1.m26561a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f36435E.m39078r(this.f36467u.mo22074d().mo26586z());
            this.f36436F.m39078r(this.f36467u.mo22074d().mo26584p());
            this.f36439I.m39082b(new InterfaceC11464a() { // from class: p1.a
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return this.f36396a.m39060l(((Boolean) obj).booleanValue());
                }
            });
            this.f36440J.m39082b(new InterfaceC11464a() { // from class: p1.b
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return this.f36400a.m39034G(((Float) obj).floatValue());
                }
            });
            this.f36441K.m39082b(new InterfaceC11464a() { // from class: p1.c
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return this.f36410a.m39036I(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e10) {
            if (runnable != null) {
                runnable.run();
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m39041N() {
        if (this.f36471y.m39014a(C10417c.m40084e(), this.f36472z)) {
            return;
        }
        C5931r1.m26572l("CameraController", "The device cannot detect rotation changes.");
    }

    /* JADX INFO: renamed from: O */
    public final void m39042O() {
        this.f36471y.m39015c(this.f36472z);
    }

    /* JADX INFO: renamed from: P */
    public final void m39043P() {
        m39047T();
        m39046S(Integer.valueOf(m39062n()));
        m39045R(Integer.valueOf(this.f36457k.m26594m0()), Integer.valueOf(this.f36457k.m26595n0()), Integer.valueOf(this.f36457k.m26597p0()));
        m39048U();
    }

    /* JADX INFO: renamed from: Q */
    public final void m39044Q() {
        if (m39069u()) {
            this.f36468v.mo39090c(this.f36449c, this.f36451e, this.f36457k, this.f36459m);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m39045R(Integer num, Integer num2, Integer num3) {
        C5942u0.a aVar;
        C10110z.m39008b();
        if (m39069u()) {
            this.f36468v.mo39090c(this.f36457k);
        }
        C5942u0 c5942u0M39055g = m39055g(num, num2, num3);
        this.f36457k = c5942u0M39055g;
        Executor executor = this.f36454h;
        if (executor == null || (aVar = this.f36456j) == null) {
            return;
        }
        c5942u0M39055g.m26601t0(executor, aVar);
    }

    /* JADX INFO: renamed from: S */
    public final void m39046S(Integer num) {
        if (m39069u()) {
            this.f36468v.mo39090c(this.f36451e);
        }
        int iM26393w0 = this.f36451e.m26393w0();
        this.f36451e = m39056h(num);
        m39033F(iM26393w0);
    }

    /* JADX INFO: renamed from: T */
    public final void m39047T() {
        if (m39069u()) {
            this.f36468v.mo39090c(this.f36449c);
        }
        C5864a2 c5864a2M39057i = m39057i();
        this.f36449c = c5864a2M39057i;
        C5864a2.c cVar = this.f36470x;
        if (cVar != null) {
            c5864a2M39057i.m26293q0(cVar);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m39048U() {
        if (m39069u()) {
            this.f36468v.mo39090c(this.f36459m);
        }
        this.f36459m = m39059k();
    }

    /* JADX INFO: renamed from: V */
    public void m39049V(Matrix matrix) {
        C10110z.m39008b();
        C5942u0.a aVar = this.f36456j;
        if (aVar != null && aVar.mo23123d() == 1) {
            this.f36456j.mo23125f(matrix);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m39050W() {
        C10776a c10776aM39064p = m39064p();
        if (c10776aM39064p == null) {
            C5931r1.m26561a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.f36451e.m26376O0(f36430Q);
            return;
        }
        this.f36451e.m26376O0(c10776aM39064p.m41012b());
        C5931r1.m26561a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + c10776aM39064p.m41011a().name());
    }

    @SuppressLint({"MissingPermission", "WrongConstant"})
    /* JADX INFO: renamed from: c */
    public void m39051c(C5864a2.c cVar, C5960y2 c5960y2) {
        C10110z.m39008b();
        if (this.f36470x != cVar) {
            this.f36470x = cVar;
            this.f36449c.m26293q0(cVar);
        }
        boolean z10 = this.f36469w == null || m39066r(c5960y2) != m39066r(this.f36469w);
        this.f36469w = c5960y2;
        m39041N();
        if (z10) {
            m39043P();
        }
        m39039L();
    }

    /* JADX INFO: renamed from: d */
    public void m39052d() {
        C10110z.m39008b();
        InterfaceC10151y interfaceC10151y = this.f36468v;
        if (interfaceC10151y != null) {
            interfaceC10151y.mo39090c(this.f36449c, this.f36451e, this.f36457k, this.f36459m);
        }
        this.f36449c.m26293q0(null);
        this.f36467u = null;
        this.f36470x = null;
        this.f36469w = null;
        m39042O();
    }

    /* JADX INFO: renamed from: e */
    public final void m39053e(InterfaceC8769i2.a<?> aVar, C0054c c0054c, c cVar) {
        C0052a c0052aM39066r;
        if (c0054c != null) {
            aVar.mo24411b(c0054c);
            return;
        }
        C5960y2 c5960y2 = this.f36469w;
        if (c5960y2 == null || (c0052aM39066r = m39066r(c5960y2)) == null) {
            return;
        }
        aVar.mo24411b(new C0054c.a().m118d(c0052aM39066r).m116a());
    }

    /* JADX INFO: renamed from: f */
    public final C5910m0 m39054f(AbstractC5947v1 abstractC5947v1, PointF pointF) {
        C5910m0.a aVarM26533a = new C5910m0.a(abstractC5947v1.m26637c(pointF.x, pointF.y, 0.16666667f), 1).m26533a(abstractC5947v1.m26637c(pointF.x, pointF.y, 0.25f), 2);
        long j10 = this.f36446P;
        return (j10 > 0 ? aVarM26533a.m26537e(j10, TimeUnit.NANOSECONDS) : aVarM26533a.m26535c()).m26534b();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: g */
    public final C5942u0 m39055g(Integer num, Integer num2, Integer num3) {
        C5942u0.c cVar = new C5942u0.c();
        if (num != null) {
            cVar.m26608j(num.intValue());
        }
        if (num2 != null) {
            cVar.m26612n(num2.intValue());
        }
        if (num3 != null) {
            cVar.m26613o(num3.intValue());
        }
        m39053e(cVar, this.f36458l, null);
        Executor executor = this.f36455i;
        if (executor != null) {
            cVar.m26607i(executor);
        }
        int i10 = this.f36431A;
        if (i10 != -1) {
            cVar.mo24412c(i10);
        }
        return cVar.m26605f();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: h */
    public final C5883f1 m39056h(Integer num) {
        C5883f1.b bVar = new C5883f1.b();
        if (num != null) {
            bVar.m26402i(num.intValue());
        }
        m39053e(bVar, this.f36452f, null);
        Executor executor = this.f36453g;
        if (executor != null) {
            bVar.m26405l(executor);
        }
        int i10 = this.f36431A;
        if (i10 != -1) {
            bVar.mo24412c(i10);
        }
        return bVar.m26400f();
    }

    /* JADX INFO: renamed from: i */
    public final C5864a2 m39057i() {
        C5864a2.a aVar = new C5864a2.a();
        m39053e(aVar, this.f36450d, null);
        aVar.m26301j(this.f36465s);
        return aVar.m26298f();
    }

    /* JADX INFO: renamed from: j */
    public C5956x2 m39058j() {
        if (!m39069u()) {
            C5931r1.m26561a("CameraController", "Camera not initialized.");
            return null;
        }
        if (!m39072x()) {
            C5931r1.m26561a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        m39044Q();
        C5956x2.a aVarM26744b = new C5956x2.a().m26744b(this.f36449c);
        if (m39071w()) {
            aVarM26744b.m26744b(this.f36451e);
        }
        if (m39070v()) {
            aVarM26744b.m26744b(this.f36457k);
        }
        if (m39074z()) {
            aVarM26744b.m26744b(this.f36459m);
        }
        aVarM26744b.m26747e(this.f36469w);
        Iterator<AbstractC5913n> it = this.f36442L.iterator();
        while (it.hasNext()) {
            aVarM26744b.m26743a(it.next());
        }
        return aVarM26744b.m26745c();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final C5284p1<C5289r0> m39059k() {
        int iM39065q;
        C5289r0.i iVarM24530f = new C5289r0.i().m24530f(this.f36462p);
        C5960y2 c5960y2 = this.f36469w;
        if (c5960y2 != null && this.f36462p == C5289r0.f20471s0 && (iM39065q = m39065q(c5960y2)) != -1) {
            iVarM24530f.m24528d(iM39065q);
        }
        C5284p1.d dVarM24417k = new C5284p1.d(iVarM24530f.m24527c()).m24423q(this.f36466t).m24418l(this.f36463q).m24417k(this.f36464r);
        int i10 = this.f36431A;
        if (i10 != -1) {
            dVarM24417k.mo24412c(i10);
        }
        return dVarM24417k.m24414f();
    }

    /* JADX INFO: renamed from: l */
    public InterfaceFutureC9440x<Void> m39060l(boolean z10) {
        C10110z.m39008b();
        return !m39068t() ? this.f36439I.m39083c(Boolean.valueOf(z10)) : this.f36467u.mo22073c().mo26524c(z10);
    }

    /* JADX INFO: renamed from: m */
    public int m39061m() {
        C10110z.m39008b();
        return this.f36451e.m26393w0();
    }

    /* JADX INFO: renamed from: n */
    public int m39062n() {
        C10110z.m39008b();
        return this.f36451e.m26392v0();
    }

    /* JADX INFO: renamed from: o */
    public final String m39063o(C5945v c5945v) {
        if (c5945v == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder("CameraSelector{");
        Integer numM26629d = c5945v.m26629d();
        if (numM26629d != null) {
            int iIntValue = numM26629d.intValue();
            if (iIntValue == 0) {
                sb2.append("lensFacing=FRONT");
            } else if (iIntValue == 1) {
                sb2.append("lensFacing=BACK");
            } else if (iIntValue != 2) {
                sb2.append("lensFacing=UNKNOWN(");
                sb2.append(numM26629d);
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

    /* JADX INFO: renamed from: p */
    public C10776a m39064p() {
        Map<C10776a.a, C10776a> map = this.f36445O;
        C10776a.a aVar = C10776a.a.SCREEN_FLASH_VIEW;
        if (map.get(aVar) != null) {
            return this.f36445O.get(aVar);
        }
        Map<C10776a.a, C10776a> map2 = this.f36445O;
        C10776a.a aVar2 = C10776a.a.PREVIEW_VIEW;
        if (map2.get(aVar2) != null) {
            return this.f36445O.get(aVar2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    /* JADX INFO: renamed from: q */
    public final int m39065q(C5960y2 c5960y2) {
        int iMo6749d;
        boolean z10;
        int iM38902a;
        Rational rationalM26751a;
        int iM38903b = c5960y2 == null ? 0 : C10087c.m38903b(c5960y2.m26753c());
        try {
            InterfaceC10151y interfaceC10151y = this.f36468v;
            if (interfaceC10151y != null) {
                InterfaceC5937t interfaceC5937tMo39088a = interfaceC10151y.mo39088a(this.f36447a);
                iMo6749d = interfaceC5937tMo39088a.mo6749d();
                try {
                    if (interfaceC5937tMo39088a.mo26583i() != 1) {
                        z10 = false;
                    }
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    C5931r1.m26573m("CameraController", "Failed to retrieve CameraInfo for selector: " + m39063o(this.f36447a), e);
                }
                iM38902a = C10087c.m38902a(iM38903b, iMo6749d, z10);
                rationalM26751a = c5960y2.m26751a();
                if (iM38902a != 90 || iM38902a == 270) {
                    rationalM26751a = new Rational(rationalM26751a.getDenominator(), rationalM26751a.getNumerator());
                }
                if (rationalM26751a.equals(C10084a.f36314a)) {
                    return 0;
                }
                if (rationalM26751a.equals(C10084a.f36316c)) {
                    return 1;
                }
                return -1;
            }
            iMo6749d = 0;
        } catch (IllegalArgumentException e11) {
            e = e11;
            iMo6749d = 0;
        }
        z10 = true;
        iM38902a = C10087c.m38902a(iM38903b, iMo6749d, z10);
        rationalM26751a = c5960y2.m26751a();
        if (iM38902a != 90) {
            rationalM26751a = new Rational(rationalM26751a.getDenominator(), rationalM26751a.getNumerator());
        } else {
            rationalM26751a = new Rational(rationalM26751a.getDenominator(), rationalM26751a.getNumerator());
        }
        if (rationalM26751a.equals(C10084a.f36314a)) {
            return 0;
        }
        if (rationalM26751a.equals(C10084a.f36316c)) {
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final C0052a m39066r(C5960y2 c5960y2) {
        int iM39065q = m39065q(c5960y2);
        if (iM39065q != -1) {
            return new C0052a(iM39065q, 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC0940a0<InterfaceC5964z2> m39067s() {
        C10110z.m39008b();
        return this.f36435E;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m39068t() {
        return this.f36467u != null;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m39069u() {
        return this.f36468v != null;
    }

    /* JADX INFO: renamed from: v */
    public boolean m39070v() {
        C10110z.m39008b();
        return m39073y(2);
    }

    /* JADX INFO: renamed from: w */
    public boolean m39071w() {
        C10110z.m39008b();
        return m39073y(1);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m39072x() {
        return (this.f36470x == null || this.f36469w == null) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m39073y(int i10) {
        return (i10 & this.f36448b) != 0;
    }

    /* JADX INFO: renamed from: z */
    public boolean m39074z() {
        C10110z.m39008b();
        return m39073y(4);
    }

    public AbstractC10127i(Context context, InterfaceFutureC9440x<InterfaceC10151y> interfaceFutureC9440x) {
        this.f36447a = C5945v.f22638d;
        this.f36448b = 3;
        this.f36460n = null;
        this.f36461o = new HashMap();
        this.f36462p = C5289r0.f20471s0;
        this.f36463q = 0;
        C5902k0 c5902k0 = C5902k0.f22549c;
        this.f36464r = c5902k0;
        this.f36465s = c5902k0;
        this.f36466t = AbstractC8827t3.f32104a;
        this.f36431A = -1;
        this.f36432B = true;
        this.f36433C = true;
        this.f36435E = new C10131k<>();
        this.f36436F = new C10131k<>();
        C0949d0<C10132k0> c0949d0 = new C0949d0<>(new C10132k0(0, null));
        this.f36437G = c0949d0;
        this.f36438H = C10097m.m38987a(c0949d0, new InterfaceC11464a() { // from class: p1.f
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return Integer.valueOf(((C10132k0) obj).getFocusState());
            }
        });
        this.f36439I = new C10137n<>();
        this.f36440J = new C10137n<>();
        this.f36441K = new C10137n<>();
        this.f36442L = new HashSet();
        this.f36445O = new HashMap();
        this.f36446P = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context contextM38911a = C10090f.m38911a(context);
        this.f36443M = contextM38911a;
        this.f36449c = m39057i();
        this.f36451e = m39056h(null);
        this.f36457k = m39055g(null, null, null);
        this.f36459m = m39059k();
        this.f36444N = C10773n.m41001x(interfaceFutureC9440x, new InterfaceC11464a() { // from class: p1.g
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return AbstractC10127i.m39026a(this.f36424a, (InterfaceC10151y) obj);
            }
        }, C10417c.m40084e());
        this.f36471y = new C10114b0(contextM38911a);
        this.f36472z = new C10114b0.b() { // from class: p1.h
            @Override // p348p1.C10114b0.b
            /* JADX INFO: renamed from: a */
            public final void mo39016a(int i10) {
                AbstractC10127i.m39027b(this.f36426a, i10);
            }
        };
    }
}
