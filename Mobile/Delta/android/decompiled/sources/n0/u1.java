package n0;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f24863k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f24864l = g0.r1.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f24865m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f24866n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24867a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.c.a<Void> f24869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final me.x<Void> f24870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<Void> f24871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final me.x<Void> f24872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f24873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class<?> f24875j;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f24876a;

        public a(String str, u1 u1Var) {
            super(str);
            this.f24876a = u1Var;
        }

        public u1 a() {
            return this.f24876a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public u1() {
        this(f24863k, 0);
    }

    public static /* synthetic */ Object a(u1 u1Var, y1.c.a aVar) {
        synchronized (u1Var.f24867a) {
            u1Var.f24869d = aVar;
        }
        return "DeferrableSurface-termination(" + u1Var + ")";
    }

    public static /* synthetic */ Object b(u1 u1Var, y1.c.a aVar) {
        synchronized (u1Var.f24867a) {
            u1Var.f24871f = aVar;
        }
        return "DeferrableSurface-close(" + u1Var + ")";
    }

    public static /* synthetic */ void c(u1 u1Var, String str) {
        u1Var.getClass();
        try {
            u1Var.f24870e.get();
            u1Var.n("Surface terminated", f24866n.decrementAndGet(), f24865m.get());
        } catch (Exception e10) {
            g0.r1.c("DeferrableSurface", "Unexpected surface termination for " + u1Var + "\nStack Trace:\n" + str);
            synchronized (u1Var.f24867a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", u1Var, Boolean.valueOf(u1Var.f24868c), Integer.valueOf(u1Var.b)), e10);
            }
        }
    }

    public void d() {
        y1.c.a<Void> aVar;
        synchronized (this.f24867a) {
            try {
                if (this.f24868c) {
                    aVar = null;
                } else {
                    this.f24868c = true;
                    this.f24871f.c(null);
                    if (this.b == 0) {
                        aVar = this.f24869d;
                        this.f24869d = null;
                    } else {
                        aVar = null;
                    }
                    if (g0.r1.f("DeferrableSurface")) {
                        g0.r1.a("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        y1.c.a<Void> aVar;
        synchronized (this.f24867a) {
            try {
                int i10 = this.b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.b = i11;
                if (i11 == 0 && this.f24868c) {
                    aVar = this.f24869d;
                    this.f24869d = null;
                } else {
                    aVar = null;
                }
                if (g0.r1.f("DeferrableSurface")) {
                    g0.r1.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.f24868c + " " + this);
                    if (this.b == 0) {
                        n("Surface no longer in use", f24866n.get(), f24865m.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public me.x<Void> f() {
        return r0.n.s(this.f24872g);
    }

    public Class<?> g() {
        return this.f24875j;
    }

    public Size h() {
        return this.f24873h;
    }

    public int i() {
        return this.f24874i;
    }

    public final me.x<Surface> j() {
        synchronized (this.f24867a) {
            try {
                if (this.f24868c) {
                    return r0.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public me.x<Void> k() {
        return r0.n.s(this.f24870e);
    }

    public void l() {
        synchronized (this.f24867a) {
            try {
                int i10 = this.b;
                if (i10 == 0 && this.f24868c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.b = i10 + 1;
                if (g0.r1.f("DeferrableSurface")) {
                    if (this.b == 1) {
                        n("New surface in use", f24866n.get(), f24865m.incrementAndGet());
                    }
                    g0.r1.a("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f24867a) {
            z10 = this.f24868c;
        }
        return z10;
    }

    public final void n(String str, int i10, int i11) {
        if (!f24864l && g0.r1.f("DeferrableSurface")) {
            g0.r1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        g0.r1.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract me.x<Surface> o();

    public void p(Class<?> cls) {
        this.f24875j = cls;
    }

    public u1(Size size, int i10) {
        this.f24867a = new Object();
        this.b = 0;
        this.f24868c = false;
        this.f24873h = size;
        this.f24874i = i10;
        me.x<Void> xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: n0.r1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return u1.a(this.f24820a, aVar);
            }
        });
        this.f24870e = xVarA;
        this.f24872g = y1.c.a(new y1.c.InterfaceC0650c() { // from class: n0.s1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return u1.b(this.f24836a, aVar);
            }
        });
        if (g0.r1.f("DeferrableSurface")) {
            n("Surface created", f24866n.incrementAndGet(), f24865m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            xVarA.a(new Runnable() { // from class: n0.t1
                @Override // java.lang.Runnable
                public final void run() {
                    u1.c(this.f24859a, stackTraceString);
                }
            }, q0.c.b());
        }
    }
}
