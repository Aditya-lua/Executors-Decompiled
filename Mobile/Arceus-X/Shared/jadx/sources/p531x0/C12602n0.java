package p531x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ne.InterfaceFutureC9440x;
import p140g0.C5948v2;
import p140g0.InterfaceC5900j2;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: x0.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C12602n0 {

    /* JADX INFO: renamed from: a */
    public final int f44851a;

    /* JADX INFO: renamed from: b */
    public final Matrix f44852b;

    /* JADX INFO: renamed from: c */
    public final boolean f44853c;

    /* JADX INFO: renamed from: d */
    public final Rect f44854d;

    /* JADX INFO: renamed from: e */
    public final boolean f44855e;

    /* JADX INFO: renamed from: f */
    public final int f44856f;

    /* JADX INFO: renamed from: g */
    public final AbstractC8827t3 f44857g;

    /* JADX INFO: renamed from: h */
    public int f44858h;

    /* JADX INFO: renamed from: i */
    public int f44859i;

    /* JADX INFO: renamed from: k */
    public C5948v2 f44861k;

    /* JADX INFO: renamed from: l */
    public a f44862l;

    /* JADX INFO: renamed from: j */
    public boolean f44860j = false;

    /* JADX INFO: renamed from: m */
    public final Set<Runnable> f44863m = new HashSet();

    /* JADX INFO: renamed from: n */
    public boolean f44864n = false;

    /* JADX INFO: renamed from: o */
    public final List<InterfaceC12631a<C5948v2.h>> f44865o = new ArrayList();

    /* JADX INFO: renamed from: x0.n0$a */
    public static class a extends AbstractC8830u1 {

        /* JADX INFO: renamed from: o */
        public final InterfaceFutureC9440x<Surface> f44866o;

        /* JADX INFO: renamed from: p */
        public C12997c.a<Surface> f44867p;

        /* JADX INFO: renamed from: q */
        public AbstractC8830u1 f44868q;

        /* JADX INFO: renamed from: r */
        public C12608q0 f44869r;

        public a(Size size, int i10) {
            super(size, i10);
            this.f44866o = C12997c.m48311a(new C12997c.c() { // from class: x0.l0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C12602n0.a.m46970r(this.f44846a, aVar);
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m46969q(a aVar) {
            C12608q0 c12608q0 = aVar.f44869r;
            if (c12608q0 != null) {
                c12608q0.m46979f();
            }
            if (aVar.f44868q == null) {
                aVar.f44867p.m48315d();
            }
            aVar.f44868q = null;
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ Object m46970r(a aVar, C12997c.a aVar2) {
            aVar.f44867p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // p296n0.AbstractC8830u1
        /* JADX INFO: renamed from: d */
        public void mo35430d() {
            super.mo35430d();
            C10110z.m39011e(new Runnable() { // from class: x0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C12602n0.a.m46969q(this.f44842a);
                }
            });
        }

        @Override // p296n0.AbstractC8830u1
        /* JADX INFO: renamed from: o */
        public InterfaceFutureC9440x<Surface> mo26666o() {
            return this.f44866o;
        }

        /* JADX INFO: renamed from: s */
        public boolean m46971s() {
            C10110z.m39008b();
            return this.f44868q == null && !m35439m();
        }

        /* JADX INFO: renamed from: t */
        public void m46972t(C12608q0 c12608q0) {
            C12637g.m47078j(this.f44869r == null, "Consumer can only be linked once.");
            this.f44869r = c12608q0;
        }

        /* JADX INFO: renamed from: u */
        public boolean m46973u(final AbstractC8830u1 abstractC8830u1, Runnable runnable) {
            C10110z.m39008b();
            C12637g.m47075g(abstractC8830u1);
            AbstractC8830u1 abstractC8830u2 = this.f44868q;
            if (abstractC8830u2 == abstractC8830u1) {
                return false;
            }
            C12637g.m47078j(abstractC8830u2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            C12637g.m47070b(m35434h().equals(abstractC8830u1.m35434h()), String.format("The provider's size(%s) must match the parent(%s)", m35434h(), abstractC8830u1.m35434h()));
            C12637g.m47070b(m35435i() == abstractC8830u1.m35435i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(m35435i()), Integer.valueOf(abstractC8830u1.m35435i())));
            C12637g.m47078j(!m35439m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f44868q = abstractC8830u1;
            C10773n.m40997t(abstractC8830u1.m35436j(), this.f44867p);
            abstractC8830u1.m35438l();
            m35437k().mo37173a(new Runnable() { // from class: x0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC8830u1.m35431e();
                }
            }, C10417c.m40081b());
            abstractC8830u1.m35432f().mo37173a(runnable, C10417c.m40084e());
            return true;
        }
    }

    public C12602n0(int i10, int i11, AbstractC8827t3 abstractC8827t3, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f44856f = i10;
        this.f44851a = i11;
        this.f44857g = abstractC8827t3;
        this.f44852b = matrix;
        this.f44853c = z10;
        this.f44854d = rect;
        this.f44859i = i12;
        this.f44858h = i13;
        this.f44855e = z11;
        this.f44862l = new a(abstractC8827t3.mo35395f(), i11);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46943a(final C12602n0 c12602n0) {
        c12602n0.getClass();
        C10417c.m40084e().execute(new Runnable() { // from class: x0.i0
            @Override // java.lang.Runnable
            public final void run() {
                C12602n0.m46944b(this.f44837a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46944b(C12602n0 c12602n0) {
        if (c12602n0.f44864n) {
            return;
        }
        c12602n0.m46964v();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m46945c(C12602n0 c12602n0, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (c12602n0.f44859i != i10) {
            c12602n0.f44859i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (c12602n0.f44858h != i11) {
            c12602n0.f44858h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            c12602n0.m46966x();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceFutureC9440x m46946d(C12602n0 c12602n0, final a aVar, int i10, InterfaceC5900j2.a aVar2, InterfaceC5900j2.a aVar3, Surface surface) {
        c12602n0.getClass();
        C12637g.m47075g(surface);
        try {
            aVar.m35438l();
            C12608q0 c12608q0 = new C12608q0(surface, c12602n0.m46962t(), i10, c12602n0.f44857g.mo35395f(), aVar2, aVar3, c12602n0.f44852b);
            c12608q0.m46978e().mo37173a(new Runnable() { // from class: x0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.m35431e();
                }
            }, C10417c.m40081b());
            aVar.m46972t(c12608q0);
            return C10773n.m40993p(c12608q0);
        } catch (AbstractC8830u1.a e10) {
            return C10773n.m40991n(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m46947e(Runnable runnable) {
        C10110z.m39008b();
        m46950h();
        this.f44863m.add(runnable);
    }

    /* JADX INFO: renamed from: f */
    public void m46948f(InterfaceC12631a<C5948v2.h> interfaceC12631a) {
        C12637g.m47075g(interfaceC12631a);
        this.f44865o.add(interfaceC12631a);
    }

    /* JADX INFO: renamed from: g */
    public final void m46949g() {
        C12637g.m47078j(!this.f44860j, "Consumer can only be linked once.");
        this.f44860j = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m46950h() {
        C12637g.m47078j(!this.f44864n, "Edge is already closed.");
    }

    /* JADX INFO: renamed from: i */
    public final void m46951i() {
        C10110z.m39008b();
        this.f44862l.mo35430d();
        this.f44864n = true;
        this.f44865o.clear();
        this.f44863m.clear();
    }

    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<InterfaceC5900j2> m46952j(final int i10, final InterfaceC5900j2.a aVar, final InterfaceC5900j2.a aVar2) {
        C10110z.m39008b();
        m46950h();
        m46949g();
        final a aVar3 = this.f44862l;
        return C10773n.m41002y(aVar3.m35436j(), new InterfaceC10760a() { // from class: x0.g0
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return C12602n0.m46946d(this.f44826a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, C10417c.m40084e());
    }

    /* JADX INFO: renamed from: k */
    public C5948v2 m46953k(InterfaceC8804p0 interfaceC8804p0) {
        return m46954l(interfaceC8804p0, true);
    }

    /* JADX INFO: renamed from: l */
    public C5948v2 m46954l(InterfaceC8804p0 interfaceC8804p0, boolean z10) {
        C10110z.m39008b();
        m46950h();
        C5948v2 c5948v2 = new C5948v2(this.f44857g.mo35395f(), interfaceC8804p0, z10, this.f44857g.mo35391b(), this.f44857g.mo35396g(), this.f44857g.mo35392c(), new Runnable() { // from class: x0.e0
            @Override // java.lang.Runnable
            public final void run() {
                C12602n0.m46943a(this.f44816a);
            }
        });
        try {
            final AbstractC8830u1 abstractC8830u1M26652n = c5948v2.m26652n();
            a aVar = this.f44862l;
            Objects.requireNonNull(aVar);
            if (aVar.m46973u(abstractC8830u1M26652n, new RunnableC12582d0(aVar))) {
                InterfaceFutureC9440x<Void> interfaceFutureC9440xM35437k = aVar.m35437k();
                Objects.requireNonNull(abstractC8830u1M26652n);
                interfaceFutureC9440xM35437k.mo37173a(new Runnable() { // from class: x0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC8830u1M26652n.mo35430d();
                    }
                }, C10417c.m40081b());
            }
            this.f44861k = c5948v2;
            m46966x();
            return c5948v2;
        } catch (RuntimeException e10) {
            c5948v2.m26664z();
            throw e10;
        } catch (AbstractC8830u1.a e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m46955m() {
        C10110z.m39008b();
        m46950h();
        this.f44862l.mo35430d();
    }

    /* JADX INFO: renamed from: n */
    public Rect m46956n() {
        return this.f44854d;
    }

    /* JADX INFO: renamed from: o */
    public AbstractC8830u1 m46957o() {
        C10110z.m39008b();
        m46950h();
        m46949g();
        return this.f44862l;
    }

    /* JADX INFO: renamed from: p */
    public int m46958p() {
        return this.f44851a;
    }

    /* JADX INFO: renamed from: q */
    public int m46959q() {
        return this.f44859i;
    }

    /* JADX INFO: renamed from: r */
    public Matrix m46960r() {
        return this.f44852b;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC8827t3 m46961s() {
        return this.f44857g;
    }

    /* JADX INFO: renamed from: t */
    public int m46962t() {
        return this.f44856f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f44856f + ", format=" + this.f44851a + ", resolution=" + this.f44857g.mo35395f() + ", cropRect=" + this.f44854d + ", rotationDegrees=" + this.f44859i + ", mirroring=" + this.f44855e + ", sensorToBufferTransform= " + this.f44852b + ", rotationInTransform= " + C10085a0.m38879g(this.f44852b) + ", isMirrorInTransform= " + C10085a0.m38884l(this.f44852b) + ", isClosed=" + this.f44864n + '}';
    }

    /* JADX INFO: renamed from: u */
    public boolean m46963u() {
        return this.f44853c;
    }

    /* JADX INFO: renamed from: v */
    public void m46964v() {
        C10110z.m39008b();
        m46950h();
        if (this.f44862l.m46971s()) {
            return;
        }
        this.f44860j = false;
        this.f44862l.mo35430d();
        this.f44862l = new a(this.f44857g.mo35395f(), this.f44851a);
        Iterator<Runnable> it = this.f44863m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m46965w() {
        return this.f44855e;
    }

    /* JADX INFO: renamed from: x */
    public final void m46966x() {
        C10110z.m39008b();
        C5948v2.h hVarM26671g = C5948v2.h.m26671g(this.f44854d, this.f44859i, this.f44858h, m46963u(), this.f44852b, this.f44855e);
        C5948v2 c5948v2 = this.f44861k;
        if (c5948v2 != null) {
            c5948v2.m26663y(hVarM26671g);
        }
        Iterator<InterfaceC12631a<C5948v2.h>> it = this.f44865o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarM26671g);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m46967y(AbstractC8830u1 abstractC8830u1) {
        C10110z.m39008b();
        m46950h();
        a aVar = this.f44862l;
        Objects.requireNonNull(aVar);
        aVar.m46973u(abstractC8830u1, new RunnableC12582d0(aVar));
    }

    /* JADX INFO: renamed from: z */
    public void m46968z(final int i10, final int i11) {
        C10110z.m39011e(new Runnable() { // from class: x0.h0
            @Override // java.lang.Runnable
            public final void run() {
                C12602n0.m46945c(this.f44831a, i10, i11);
            }
        });
    }
}
