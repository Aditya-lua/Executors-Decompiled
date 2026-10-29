package p281m0;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC0492b;
import androidx.camera.core.C0495e;
import androidx.camera.core.C0496f;
import androidx.camera.core.InterfaceC0494d;
import java.util.List;
import java.util.Objects;
import p140g0.C5891h1;
import p140g0.C5915n1;
import p140g0.C5931r1;
import p140g0.InterfaceC5911m1;
import p296n0.AbstractC8828u;
import p296n0.AbstractC8830u1;
import p296n0.C8781k2;
import p296n0.C8833v;
import p296n0.InterfaceC8775j2;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p531x0.C12615u;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: m0.x */
/* JADX INFO: loaded from: classes.dex */
public class C8330x {

    /* JADX INFO: renamed from: b */
    public C0496f f30712b;

    /* JADX INFO: renamed from: c */
    public C0496f f30713c;

    /* JADX INFO: renamed from: d */
    public C0496f f30714d;

    /* JADX INFO: renamed from: e */
    public C8325u0.a f30715e;

    /* JADX INFO: renamed from: f */
    public c f30716f;

    /* JADX INFO: renamed from: a */
    public C8327v0 f30711a = null;

    /* JADX INFO: renamed from: g */
    public C8300j0 f30717g = null;

    /* JADX INFO: renamed from: m0.x$a */
    public class a extends AbstractC8828u {
        public a() {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m33843e(a aVar) {
            C8327v0 c8327v0 = C8330x.this.f30711a;
            if (c8327v0 != null) {
                c8327v0.m33818p();
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: d */
        public void mo33844d(int i10) {
            C10417c.m40084e().execute(new Runnable() { // from class: m0.w
                @Override // java.lang.Runnable
                public final void run() {
                    C8330x.a.m33843e(this.f30709a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0.x$b */
    public class b implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8327v0 f30719a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(C8327v0 c8327v0) {
            this.f30719a = c8327v0;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C10110z.m39008b();
            if (this.f30719a == C8330x.this.f30711a) {
                C5931r1.m26572l("CaptureNode", "request aborted, id=" + C8330x.this.f30711a.m33807e());
                if (C8330x.this.f30717g != null) {
                    C8330x.this.f30717g.m33749i();
                }
                C8330x.this.f30711a = null;
            }
        }
    }

    /* JADX INFO: renamed from: m0.x$c */
    public static abstract class c {

        /* JADX INFO: renamed from: b */
        public AbstractC8828u f30722b;

        /* JADX INFO: renamed from: c */
        public AbstractC8830u1 f30723c;

        /* JADX INFO: renamed from: d */
        public AbstractC8830u1 f30724d;

        /* JADX INFO: renamed from: a */
        public AbstractC8828u f30721a = new a();

        /* JADX INFO: renamed from: e */
        public AbstractC8830u1 f30725e = null;

        /* JADX INFO: renamed from: m0.x$c$a */
        public class a extends AbstractC8828u {
            public a() {
            }
        }

        /* JADX INFO: renamed from: n */
        public static c m33846n(Size size, int i10, List<Integer> list, boolean z10, InterfaceC5911m1 interfaceC5911m1, AbstractC8303k0 abstractC8303k0) {
            return new C8275b(size, i10, list, z10, interfaceC5911m1, abstractC8303k0, new C12615u(), new C12615u());
        }

        /* JADX INFO: renamed from: a */
        public AbstractC8828u m33847a() {
            return this.f30721a;
        }

        /* JADX INFO: renamed from: b */
        public abstract C12615u<InterfaceC8277b1.a> mo33671b();

        /* JADX INFO: renamed from: c */
        public abstract InterfaceC5911m1 mo33672c();

        /* JADX INFO: renamed from: d */
        public abstract int mo33673d();

        /* JADX INFO: renamed from: e */
        public abstract List<Integer> mo33674e();

        /* JADX INFO: renamed from: f */
        public abstract AbstractC8303k0 mo33675f();

        /* JADX INFO: renamed from: g */
        public AbstractC8830u1 m33848g() {
            return this.f30725e;
        }

        /* JADX INFO: renamed from: h */
        public abstract C12615u<C8327v0> mo33676h();

        /* JADX INFO: renamed from: i */
        public AbstractC8828u m33849i() {
            return this.f30722b;
        }

        /* JADX INFO: renamed from: j */
        public AbstractC8830u1 m33850j() {
            return this.f30724d;
        }

        /* JADX INFO: renamed from: k */
        public abstract Size mo33677k();

        /* JADX INFO: renamed from: l */
        public AbstractC8830u1 m33851l() {
            AbstractC8830u1 abstractC8830u1 = this.f30723c;
            Objects.requireNonNull(abstractC8830u1);
            return abstractC8830u1;
        }

        /* JADX INFO: renamed from: m */
        public abstract boolean mo33678m();

        /* JADX INFO: renamed from: o */
        public void m33852o(AbstractC8828u abstractC8828u) {
            this.f30721a = abstractC8828u;
        }

        /* JADX INFO: renamed from: p */
        public void m33853p(Surface surface, Size size, int i10) {
            this.f30725e = new C8781k2(surface, size, i10);
        }

        /* JADX INFO: renamed from: q */
        public void m33854q(AbstractC8828u abstractC8828u) {
            this.f30722b = abstractC8828u;
        }

        /* JADX INFO: renamed from: r */
        public void m33855r(Surface surface) {
            C12637g.m47078j(this.f30724d == null, "The secondary surface is already set.");
            this.f30724d = new C8781k2(surface, mo33677k(), mo33673d());
        }

        /* JADX INFO: renamed from: s */
        public void m33856s(Surface surface) {
            C12637g.m47078j(this.f30723c == null, "The surface is already set.");
            this.f30723c = new C8781k2(surface, mo33677k(), mo33673d());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33824a(C8330x c8330x, InterfaceC8775j2 interfaceC8775j2) {
        c8330x.getClass();
        try {
            InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
            if (interfaceC0494dMo2208b != null) {
                c8330x.m33834k(interfaceC0494dMo2208b);
                return;
            }
            C8327v0 c8327v0 = c8330x.f30711a;
            if (c8327v0 != null) {
                c8330x.m33839p(InterfaceC8277b1.a.m33690c(c8327v0.m33807e(), new C5891h1(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            C8327v0 c8327v1 = c8330x.f30711a;
            if (c8327v1 != null) {
                c8330x.m33839p(InterfaceC8277b1.a.m33690c(c8327v1.m33807e(), new C5891h1(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m33825b(C8330x c8330x, C8327v0 c8327v0) {
        c8330x.m33835l(c8327v0);
        c8330x.f30717g.m33748h(c8327v0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m33827d(C0496f c0496f) {
        if (c0496f != null) {
            c0496f.m2225j();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m33828e(C8330x c8330x, InterfaceC8775j2 interfaceC8775j2) {
        c8330x.getClass();
        try {
            InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
            if (interfaceC0494dMo2208b != null) {
                c8330x.m33836m(interfaceC0494dMo2208b);
            }
        } catch (IllegalStateException e10) {
            C5931r1.m26564d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m33829f(C0496f c0496f) {
        if (c0496f != null) {
            c0496f.m2225j();
        }
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC8775j2 m33831h(InterfaceC5911m1 interfaceC5911m1, int i10, int i11, int i12) {
        return interfaceC5911m1 != null ? interfaceC5911m1.m26538a(i10, i11, i12, 4, 0L) : C5915n1.m26550a(i10, i11, i12, 4);
    }

    /* JADX INFO: renamed from: i */
    public int m33832i() {
        C10110z.m39008b();
        C12637g.m47078j(this.f30712b != null, "The ImageReader is not initialized.");
        return this.f30712b.m2224i();
    }

    /* JADX INFO: renamed from: j */
    public final void m33833j(InterfaceC0494d interfaceC0494d) {
        C8327v0 c8327v0;
        C8327v0 c8327v1;
        C10110z.m39008b();
        C8325u0.a aVar = this.f30715e;
        Objects.requireNonNull(aVar);
        aVar.mo33727a().accept(C8325u0.b.m33802c(this.f30711a, interfaceC0494d));
        C8327v0 c8327v2 = this.f30711a;
        c cVar = this.f30716f;
        boolean z10 = cVar != null && cVar.mo33674e().size() > 1;
        if (z10 && (c8327v1 = this.f30711a) != null) {
            c8327v1.m33813k().m33774u(interfaceC0494d.getFormat(), true);
        }
        if (!z10 || ((c8327v0 = this.f30711a) != null && c8327v0.m33813k().m33773s())) {
            this.f30711a = null;
        }
        c8327v2.m33821s();
    }

    /* JADX INFO: renamed from: k */
    public void m33834k(InterfaceC0494d interfaceC0494d) {
        C10110z.m39008b();
        if (this.f30711a == null) {
            C5931r1.m26572l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC0494d);
            interfaceC0494d.close();
            return;
        }
        if (((Integer) interfaceC0494d.mo2192H2().mo26441c().m35564d(this.f30711a.m33812j())) != null) {
            m33833j(interfaceC0494d);
        } else {
            C5931r1.m26572l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            interfaceC0494d.close();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m33835l(C8327v0 c8327v0) {
        C10110z.m39008b();
        C12637g.m47078j(c8327v0.m33811i().size() == 1, "only one capture stage is supported.");
        C12637g.m47078j(m33832i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f30711a = c8327v0;
        C10773n.m40987j(c8327v0.m33803a(), new b(c8327v0), C10417c.m40081b());
    }

    /* JADX INFO: renamed from: m */
    public final void m33836m(InterfaceC0494d interfaceC0494d) {
        if (this.f30711a == null) {
            C5931r1.m26572l("CaptureNode", "Postview image is closed due to request completed or aborted");
            interfaceC0494d.close();
        } else {
            C8325u0.a aVar = this.f30715e;
            Objects.requireNonNull(aVar);
            aVar.mo33730d().accept(C8325u0.b.m33802c(this.f30711a, interfaceC0494d));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m33837n() {
        C10110z.m39008b();
        c cVar = this.f30716f;
        Objects.requireNonNull(cVar);
        C0496f c0496f = this.f30712b;
        Objects.requireNonNull(c0496f);
        m33838o(cVar, c0496f, this.f30713c, this.f30714d);
    }

    /* JADX INFO: renamed from: o */
    public final void m33838o(c cVar, final C0496f c0496f, final C0496f c0496f2, final C0496f c0496f3) {
        cVar.m33851l().mo35430d();
        cVar.m33851l().m35437k().mo37173a(new Runnable() { // from class: m0.s
            @Override // java.lang.Runnable
            public final void run() {
                c0496f.m2225j();
            }
        }, C10417c.m40084e());
        if (cVar.m33848g() != null) {
            cVar.m33848g().mo35430d();
            cVar.m33848g().m35437k().mo37173a(new Runnable() { // from class: m0.t
                @Override // java.lang.Runnable
                public final void run() {
                    C8330x.m33829f(c0496f3);
                }
            }, C10417c.m40084e());
        }
        if (cVar.mo33674e().size() <= 1 || cVar.m33850j() == null) {
            return;
        }
        cVar.m33850j().mo35430d();
        cVar.m33850j().m35437k().mo37173a(new Runnable() { // from class: m0.u
            @Override // java.lang.Runnable
            public final void run() {
                C8330x.m33827d(c0496f2);
            }
        }, C10417c.m40084e());
    }

    /* JADX INFO: renamed from: p */
    public void m33839p(InterfaceC8277b1.a aVar) {
        C10110z.m39008b();
        C8327v0 c8327v0 = this.f30711a;
        if (c8327v0 == null || c8327v0.m33807e() != aVar.mo33692b()) {
            return;
        }
        this.f30711a.m33816n(aVar.mo33691a());
    }

    /* JADX INFO: renamed from: q */
    public final void m33840q(InterfaceC8775j2 interfaceC8775j2) {
        interfaceC8775j2.mo2212f(new InterfaceC8775j2.a() { // from class: m0.v
            @Override // p296n0.InterfaceC8775j2.a
            /* JADX INFO: renamed from: a */
            public final void mo26326a(InterfaceC8775j2 interfaceC8775j3) {
                C8330x.m33824a(this.f30695a, interfaceC8775j3);
            }
        }, C10417c.m40084e());
    }

    /* JADX INFO: renamed from: r */
    public void m33841r(AbstractC0492b.a aVar) {
        C10110z.m39008b();
        C12637g.m47078j(this.f30712b != null, "The ImageReader is not initialized.");
        this.f30712b.m2226k(aVar);
    }

    /* JADX INFO: renamed from: s */
    public C8325u0.a m33842s(c cVar) {
        InterfaceC12631a<C8327v0> interfaceC12631a;
        InterfaceC8775j2 interfaceC8775j2;
        C0495e c0495e;
        InterfaceC8775j2 interfaceC8775j3;
        C12637g.m47078j(this.f30716f == null && this.f30712b == null, "CaptureNode does not support recreation yet.");
        this.f30716f = cVar;
        Size sizeMo33677k = cVar.mo33677k();
        int iMo33673d = cVar.mo33673d();
        boolean zMo33678m = cVar.mo33678m();
        AbstractC8828u aVar = new a();
        boolean z10 = cVar.mo33674e().size() > 1;
        AbstractC8828u abstractC8828uM35460b = null;
        if (zMo33678m || cVar.mo33672c() != null) {
            C8300j0 c8300j0 = new C8300j0(m33831h(cVar.mo33672c(), sizeMo33677k.getWidth(), sizeMo33677k.getHeight(), iMo33673d));
            this.f30717g = c8300j0;
            interfaceC12631a = new InterfaceC12631a() { // from class: m0.p
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    C8330x.m33825b(this.f30663a, (C8327v0) obj);
                }
            };
            interfaceC8775j2 = c8300j0;
            c0495e = null;
        } else {
            if (z10) {
                C0495e c0495e2 = new C0495e(sizeMo33677k.getWidth(), sizeMo33677k.getHeight(), 256, 4);
                AbstractC8828u abstractC8828uM35460b2 = C8833v.m35460b(aVar, c0495e2.m2216m());
                c0495e = new C0495e(sizeMo33677k.getWidth(), sizeMo33677k.getHeight(), 32, 4);
                AbstractC8828u[] abstractC8828uArr = {aVar, c0495e.m2216m()};
                aVar = abstractC8828uM35460b2;
                abstractC8828uM35460b = C8833v.m35460b(abstractC8828uArr);
                interfaceC8775j3 = c0495e2;
            } else {
                C0495e c0495e3 = new C0495e(sizeMo33677k.getWidth(), sizeMo33677k.getHeight(), iMo33673d, 4);
                aVar = C8833v.m35460b(aVar, c0495e3.m2216m());
                interfaceC8775j3 = c0495e3;
                c0495e = null;
            }
            interfaceC12631a = new InterfaceC12631a() { // from class: m0.o
                @Override // p533x2.InterfaceC12631a
                public final void accept(Object obj) {
                    this.f30660a.m33835l((C8327v0) obj);
                }
            };
            interfaceC8775j2 = interfaceC8775j3;
        }
        cVar.m33852o(aVar);
        if (z10 && abstractC8828uM35460b != null) {
            cVar.m33854q(abstractC8828uM35460b);
        }
        Surface surface = interfaceC8775j2.getSurface();
        Objects.requireNonNull(surface);
        cVar.m33856s(surface);
        this.f30712b = new C0496f(interfaceC8775j2);
        m33840q(interfaceC8775j2);
        AbstractC8303k0 abstractC8303k0Mo33675f = cVar.mo33675f();
        if (abstractC8303k0Mo33675f != null) {
            InterfaceC8775j2 interfaceC8775j2M33831h = m33831h(cVar.mo33672c(), abstractC8303k0Mo33675f.mo33715c().getWidth(), abstractC8303k0Mo33675f.mo33715c().getHeight(), abstractC8303k0Mo33675f.mo33714b());
            interfaceC8775j2M33831h.mo2212f(new InterfaceC8775j2.a() { // from class: m0.q
                @Override // p296n0.InterfaceC8775j2.a
                /* JADX INFO: renamed from: a */
                public final void mo26326a(InterfaceC8775j2 interfaceC8775j4) {
                    C8330x.m33828e(this.f30666a, interfaceC8775j4);
                }
            }, C10417c.m40084e());
            this.f30714d = new C0496f(interfaceC8775j2M33831h);
            cVar.m33853p(interfaceC8775j2M33831h.getSurface(), abstractC8303k0Mo33675f.mo33715c(), abstractC8303k0Mo33675f.mo33714b());
        }
        if (z10 && c0495e != null) {
            cVar.m33855r(c0495e.getSurface());
            this.f30713c = new C0496f(c0495e);
            m33840q(c0495e);
        }
        cVar.mo33676h().m47004a(interfaceC12631a);
        cVar.mo33671b().m47004a(new InterfaceC12631a() { // from class: m0.r
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                this.f30669a.m33839p((InterfaceC8277b1.a) obj);
            }
        });
        C8325u0.a aVarM33801e = C8325u0.a.m33801e(cVar.mo33673d(), cVar.mo33674e());
        this.f30715e = aVarM33801e;
        return aVarM33801e;
    }
}
