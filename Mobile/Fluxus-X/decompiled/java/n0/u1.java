package n0;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f25161k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f25162l = g0.r1.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f25163m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f25164n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25165a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.c.a<Void> f25167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.x<Void> f25168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<Void> f25169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pe.x<Void> f25170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f25171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class<?> f25173j;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u1 f25174a;

        public a(String str, u1 u1Var) {
            super(str);
            this.f25174a = u1Var;
        }

        public u1 a() {
            return this.f25174a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public u1() {
        this(f25161k, 0);
    }

    public static /* synthetic */ Object a(u1 u1Var, y1.c.a aVar) {
        synchronized (u1Var.f25165a) {
            u1Var.f25167d = aVar;
        }
        return "DeferrableSurface-termination(" + u1Var + ")";
    }

    public static /* synthetic */ Object b(u1 u1Var, y1.c.a aVar) {
        synchronized (u1Var.f25165a) {
            u1Var.f25169f = aVar;
        }
        return "DeferrableSurface-close(" + u1Var + ")";
    }

    public static /* synthetic */ void c(u1 u1Var, String str) {
        u1Var.getClass();
        try {
            u1Var.f25168e.get();
            u1Var.n("Surface terminated", f25164n.decrementAndGet(), f25163m.get());
        } catch (Exception e10) {
            g0.r1.c("DeferrableSurface", "Unexpected surface termination for " + u1Var + "\nStack Trace:\n" + str);
            synchronized (u1Var.f25165a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", u1Var, Boolean.valueOf(u1Var.f25166c), Integer.valueOf(u1Var.b)), e10);
            }
        }
    }

    public void d() {
        y1.c.a<Void> aVar;
        synchronized (this.f25165a) {
            try {
                if (this.f25166c) {
                    aVar = null;
                } else {
                    this.f25166c = true;
                    this.f25169f.c(null);
                    if (this.b == 0) {
                        aVar = this.f25167d;
                        this.f25167d = null;
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
        synchronized (this.f25165a) {
            try {
                int i10 = this.b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.b = i11;
                if (i11 == 0 && this.f25166c) {
                    aVar = this.f25167d;
                    this.f25167d = null;
                } else {
                    aVar = null;
                }
                if (g0.r1.f("DeferrableSurface")) {
                    g0.r1.a("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.f25166c + " " + this);
                    if (this.b == 0) {
                        n("Surface no longer in use", f25164n.get(), f25163m.decrementAndGet());
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

    public pe.x<Void> f() {
        return r0.n.s(this.f25170g);
    }

    public Class<?> g() {
        return this.f25173j;
    }

    public Size h() {
        return this.f25171h;
    }

    public int i() {
        return this.f25172i;
    }

    public final pe.x<Surface> j() {
        synchronized (this.f25165a) {
            try {
                if (this.f25166c) {
                    return r0.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public pe.x<Void> k() {
        return r0.n.s(this.f25168e);
    }

    public void l() {
        synchronized (this.f25165a) {
            try {
                int i10 = this.b;
                if (i10 == 0 && this.f25166c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.b = i10 + 1;
                if (g0.r1.f("DeferrableSurface")) {
                    if (this.b == 1) {
                        n("New surface in use", f25164n.get(), f25163m.incrementAndGet());
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
        synchronized (this.f25165a) {
            z10 = this.f25166c;
        }
        return z10;
    }

    public final void n(String str, int i10, int i11) {
        if (!f25162l && g0.r1.f("DeferrableSurface")) {
            g0.r1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        g0.r1.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract pe.x<Surface> o();

    public void p(Class<?> cls) {
        this.f25173j = cls;
    }

    public u1(Size size, int i10) {
        this.f25165a = new Object();
        this.b = 0;
        this.f25166c = false;
        this.f25171h = size;
        this.f25172i = i10;
        pe.x<Void> xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: n0.r1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return u1.a(this.f25118a, aVar);
            }
        });
        this.f25168e = xVarA;
        this.f25170g = y1.c.a(new y1.c.InterfaceC0761c() { // from class: n0.s1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return u1.b(this.f25134a, aVar);
            }
        });
        if (g0.r1.f("DeferrableSurface")) {
            n("Surface created", f25164n.incrementAndGet(), f25163m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            xVarA.a(new Runnable() { // from class: n0.t1
                @Override // java.lang.Runnable
                public final void run() {
                    u1.c(this.f25157a, stackTraceString);
                }
            }, q0.c.b());
        }
    }
}
