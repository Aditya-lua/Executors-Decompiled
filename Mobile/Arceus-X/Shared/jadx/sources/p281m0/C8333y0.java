package p281m0;

import android.graphics.Bitmap;
import androidx.camera.core.InterfaceC0494d;
import java.util.Objects;
import ne.InterfaceFutureC9440x;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p347p0.C10110z;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: m0.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C8333y0 implements InterfaceC8274a1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC8307l1 f30729a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8307l1.a f30730b;

    /* JADX INFO: renamed from: e */
    public C12997c.a<Void> f30733e;

    /* JADX INFO: renamed from: f */
    public C12997c.a<Void> f30734f;

    /* JADX INFO: renamed from: i */
    public InterfaceFutureC9440x<Void> f30737i;

    /* JADX INFO: renamed from: g */
    public boolean f30735g = false;

    /* JADX INFO: renamed from: h */
    public boolean f30736h = false;

    /* JADX INFO: renamed from: c */
    public final InterfaceFutureC9440x<Void> f30731c = C12997c.m48311a(new C12997c.c() { // from class: m0.w0
        @Override // p563y1.C12997c.c
        /* JADX INFO: renamed from: a */
        public final Object mo22051a(C12997c.a aVar) {
            return C8333y0.m33861j(this.f30710a, aVar);
        }
    });

    /* JADX INFO: renamed from: d */
    public final InterfaceFutureC9440x<Void> f30732d = C12997c.m48311a(new C12997c.c() { // from class: m0.x0
        @Override // p563y1.C12997c.c
        /* JADX INFO: renamed from: a */
        public final Object mo22051a(C12997c.a aVar) {
            return C8333y0.m33862k(this.f30727a, aVar);
        }
    });

    public C8333y0(AbstractC8307l1 abstractC8307l1, AbstractC8307l1.a aVar) {
        this.f30729a = abstractC8307l1;
        this.f30730b = aVar;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m33861j(C8333y0 c8333y0, C12997c.a aVar) {
        c8333y0.f30733e = aVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m33862k(C8333y0 c8333y0, C12997c.a aVar) {
        c8333y0.f30734f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: a */
    public void mo33662a(int i10) {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        this.f30729a.m33775w(i10);
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: b */
    public void mo33663b(Bitmap bitmap) {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        this.f30729a.m33777y(bitmap);
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: c */
    public void mo33664c() {
        C10110z.m39008b();
        if (this.f30735g || this.f30736h) {
            return;
        }
        this.f30736h = true;
        this.f30729a.mo33738j();
        C5883f1.g gVarMo33740l = this.f30729a.mo33740l();
        if (gVarMo33740l != null) {
            gVarMo33740l.m26430c();
        }
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: d */
    public void mo33665d(C5883f1.i iVar) {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        m33866o();
        m33869r();
        this.f30729a.m33770A(iVar);
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: e */
    public void mo33666e(C5891h1 c5891h1) {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        m33866o();
        m33869r();
        m33870s(c5891h1);
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: f */
    public void mo33667f(C5891h1 c5891h1) {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        boolean zM33771f = this.f30729a.m33771f();
        if (!zM33771f) {
            m33870s(c5891h1);
        }
        m33869r();
        this.f30733e.m48317f(c5891h1);
        if (zM33771f) {
            this.f30730b.mo33721f(this.f30729a);
        }
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: g */
    public void mo33668g(InterfaceC0494d interfaceC0494d) {
        C10110z.m39008b();
        if (this.f30735g) {
            interfaceC0494d.close();
            return;
        }
        m33866o();
        m33869r();
        this.f30729a.m33778z(interfaceC0494d);
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: h */
    public boolean mo33669h() {
        return this.f30735g;
    }

    @Override // p281m0.InterfaceC8274a1
    /* JADX INFO: renamed from: i */
    public void mo33670i() {
        C10110z.m39008b();
        if (this.f30735g) {
            return;
        }
        if (!this.f30736h) {
            mo33664c();
        }
        this.f30733e.m48314c(null);
    }

    /* JADX INFO: renamed from: l */
    public final void m33863l(C5891h1 c5891h1) {
        C10110z.m39008b();
        this.f30735g = true;
        InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.f30737i;
        Objects.requireNonNull(interfaceFutureC9440x);
        interfaceFutureC9440x.cancel(true);
        this.f30733e.m48317f(c5891h1);
        this.f30734f.m48314c(null);
    }

    /* JADX INFO: renamed from: m */
    public void m33864m(C5891h1 c5891h1) {
        C10110z.m39008b();
        if (this.f30732d.isDone()) {
            return;
        }
        m33863l(c5891h1);
        m33870s(c5891h1);
    }

    /* JADX INFO: renamed from: n */
    public void m33865n() {
        C10110z.m39008b();
        if (this.f30732d.isDone()) {
            return;
        }
        m33863l(new C5891h1(3, "The request is aborted silently and retried.", null));
        this.f30730b.mo33721f(this.f30729a);
    }

    /* JADX INFO: renamed from: o */
    public final void m33866o() {
        C12637g.m47078j(this.f30731c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* JADX INFO: renamed from: p */
    public InterfaceFutureC9440x<Void> m33867p() {
        C10110z.m39008b();
        return this.f30731c;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceFutureC9440x<Void> m33868q() {
        C10110z.m39008b();
        return this.f30732d;
    }

    /* JADX INFO: renamed from: r */
    public final void m33869r() {
        if (!this.f30729a.mo33746t() || this.f30729a.m33773s()) {
            if (!this.f30729a.mo33746t()) {
                C12637g.m47078j(!this.f30732d.isDone(), "The callback can only complete once.");
            }
            this.f30734f.m48314c(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m33870s(C5891h1 c5891h1) {
        C10110z.m39008b();
        this.f30729a.m33776x(c5891h1);
    }

    /* JADX INFO: renamed from: t */
    public void m33871t(InterfaceFutureC9440x<Void> interfaceFutureC9440x) {
        C10110z.m39008b();
        C12637g.m47078j(this.f30737i == null, "CaptureRequestFuture can only be set once.");
        this.f30737i = interfaceFutureC9440x;
    }
}
