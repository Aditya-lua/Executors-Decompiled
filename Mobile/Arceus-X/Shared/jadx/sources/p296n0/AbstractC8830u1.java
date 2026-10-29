package p296n0;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p366q0.C10417c;
import p397r0.C10773n;
import p563y1.C12997c;

/* JADX INFO: renamed from: n0.u1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8830u1 {

    /* JADX INFO: renamed from: k */
    public static final Size f32107k = new Size(0, 0);

    /* JADX INFO: renamed from: l */
    public static final boolean f32108l = C5931r1.m26566f("DeferrableSurface");

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f32109m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n */
    public static final AtomicInteger f32110n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Object f32111a;

    /* JADX INFO: renamed from: b */
    public int f32112b;

    /* JADX INFO: renamed from: c */
    public boolean f32113c;

    /* JADX INFO: renamed from: d */
    public C12997c.a<Void> f32114d;

    /* JADX INFO: renamed from: e */
    public final InterfaceFutureC9440x<Void> f32115e;

    /* JADX INFO: renamed from: f */
    public C12997c.a<Void> f32116f;

    /* JADX INFO: renamed from: g */
    public final InterfaceFutureC9440x<Void> f32117g;

    /* JADX INFO: renamed from: h */
    public final Size f32118h;

    /* JADX INFO: renamed from: i */
    public final int f32119i;

    /* JADX INFO: renamed from: j */
    public Class<?> f32120j;

    /* JADX INFO: renamed from: n0.u1$a */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a */
        public AbstractC8830u1 f32121a;

        public a(String str, AbstractC8830u1 abstractC8830u1) {
            super(str);
            this.f32121a = abstractC8830u1;
        }

        /* JADX INFO: renamed from: a */
        public AbstractC8830u1 m35442a() {
            return this.f32121a;
        }
    }

    /* JADX INFO: renamed from: n0.u1$b */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC8830u1() {
        this(f32107k, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m35427a(AbstractC8830u1 abstractC8830u1, C12997c.a aVar) {
        synchronized (abstractC8830u1.f32111a) {
            abstractC8830u1.f32114d = aVar;
        }
        return "DeferrableSurface-termination(" + abstractC8830u1 + ")";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m35428b(AbstractC8830u1 abstractC8830u1, C12997c.a aVar) {
        synchronized (abstractC8830u1.f32111a) {
            abstractC8830u1.f32116f = aVar;
        }
        return "DeferrableSurface-close(" + abstractC8830u1 + ")";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m35429c(AbstractC8830u1 abstractC8830u1, String str) {
        abstractC8830u1.getClass();
        try {
            abstractC8830u1.f32115e.get();
            abstractC8830u1.m35440n("Surface terminated", f32110n.decrementAndGet(), f32109m.get());
        } catch (Exception e10) {
            C5931r1.m26563c("DeferrableSurface", "Unexpected surface termination for " + abstractC8830u1 + "\nStack Trace:\n" + str);
            synchronized (abstractC8830u1.f32111a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC8830u1, Boolean.valueOf(abstractC8830u1.f32113c), Integer.valueOf(abstractC8830u1.f32112b)), e10);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo35430d() {
        C12997c.a<Void> aVar;
        synchronized (this.f32111a) {
            try {
                if (this.f32113c) {
                    aVar = null;
                } else {
                    this.f32113c = true;
                    this.f32116f.m48314c(null);
                    if (this.f32112b == 0) {
                        aVar = this.f32114d;
                        this.f32114d = null;
                    } else {
                        aVar = null;
                    }
                    if (C5931r1.m26566f("DeferrableSurface")) {
                        C5931r1.m26561a("DeferrableSurface", "surface closed,  useCount=" + this.f32112b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.m48314c(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m35431e() {
        C12997c.a<Void> aVar;
        synchronized (this.f32111a) {
            try {
                int i10 = this.f32112b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f32112b = i11;
                if (i11 == 0 && this.f32113c) {
                    aVar = this.f32114d;
                    this.f32114d = null;
                } else {
                    aVar = null;
                }
                if (C5931r1.m26566f("DeferrableSurface")) {
                    C5931r1.m26561a("DeferrableSurface", "use count-1,  useCount=" + this.f32112b + " closed=" + this.f32113c + " " + this);
                    if (this.f32112b == 0) {
                        m35440n("Surface no longer in use", f32110n.get(), f32109m.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.m48314c(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<Void> m35432f() {
        return C10773n.m40996s(this.f32117g);
    }

    /* JADX INFO: renamed from: g */
    public Class<?> m35433g() {
        return this.f32120j;
    }

    /* JADX INFO: renamed from: h */
    public Size m35434h() {
        return this.f32118h;
    }

    /* JADX INFO: renamed from: i */
    public int m35435i() {
        return this.f32119i;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceFutureC9440x<Surface> m35436j() {
        synchronized (this.f32111a) {
            try {
                if (this.f32113c) {
                    return C10773n.m40991n(new a("DeferrableSurface already closed.", this));
                }
                return mo26666o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public InterfaceFutureC9440x<Void> m35437k() {
        return C10773n.m40996s(this.f32115e);
    }

    /* JADX INFO: renamed from: l */
    public void m35438l() {
        synchronized (this.f32111a) {
            try {
                int i10 = this.f32112b;
                if (i10 == 0 && this.f32113c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f32112b = i10 + 1;
                if (C5931r1.m26566f("DeferrableSurface")) {
                    if (this.f32112b == 1) {
                        m35440n("New surface in use", f32110n.get(), f32109m.incrementAndGet());
                    }
                    C5931r1.m26561a("DeferrableSurface", "use count+1, useCount=" + this.f32112b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m35439m() {
        boolean z10;
        synchronized (this.f32111a) {
            z10 = this.f32113c;
        }
        return z10;
    }

    /* JADX INFO: renamed from: n */
    public final void m35440n(String str, int i10, int i11) {
        if (!f32108l && C5931r1.m26566f("DeferrableSurface")) {
            C5931r1.m26561a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C5931r1.m26561a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    /* JADX INFO: renamed from: o */
    public abstract InterfaceFutureC9440x<Surface> mo26666o();

    /* JADX INFO: renamed from: p */
    public void m35441p(Class<?> cls) {
        this.f32120j = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC8830u1(Size size, int i10) {
        this.f32111a = new Object();
        this.f32112b = 0;
        this.f32113c = false;
        this.f32118h = size;
        this.f32119i = i10;
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: n0.r1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return AbstractC8830u1.m35427a(this.f32054a, aVar);
            }
        });
        this.f32115e = interfaceFutureC9440xM48311a;
        this.f32117g = C12997c.m48311a(new C12997c.c() { // from class: n0.s1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return AbstractC8830u1.m35428b(this.f32074a, aVar);
            }
        });
        if (C5931r1.m26566f("DeferrableSurface")) {
            m35440n("Surface created", f32110n.incrementAndGet(), f32109m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            interfaceFutureC9440xM48311a.mo37173a(new Runnable() { // from class: n0.t1
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8830u1.m35429c(this.f32101a, stackTraceString);
                }
            }, C10417c.m40081b());
        }
    }
}
