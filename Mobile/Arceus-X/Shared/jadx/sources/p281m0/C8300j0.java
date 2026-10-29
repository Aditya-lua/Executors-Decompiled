package p281m0;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.InterfaceC0494d;
import java.util.concurrent.Executor;
import p021b1.C1201l;
import p140g0.C5892h2;
import p296n0.C8857z3;
import p296n0.InterfaceC8775j2;
import p424s0.C11142c;
import p533x2.C12637g;

/* JADX INFO: renamed from: m0.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C8300j0 implements InterfaceC8775j2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8775j2 f30647a;

    /* JADX INFO: renamed from: b */
    public C8327v0 f30648b;

    public C8300j0(InterfaceC8775j2 interfaceC8775j2) {
        this.f30647a = interfaceC8775j2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33747a(C8300j0 c8300j0, InterfaceC8775j2.a aVar, InterfaceC8775j2 interfaceC8775j2) {
        c8300j0.getClass();
        aVar.mo26326a(c8300j0);
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: b */
    public InterfaceC0494d mo2208b() {
        return m33750j(this.f30647a.mo2208b());
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: c */
    public int mo2209c() {
        return this.f30647a.mo2209c();
    }

    @Override // p296n0.InterfaceC8775j2
    public void close() {
        this.f30647a.close();
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: d */
    public void mo2210d() {
        this.f30647a.mo2210d();
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: e */
    public int mo2211e() {
        return this.f30647a.mo2211e();
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: f */
    public void mo2212f(final InterfaceC8775j2.a aVar, Executor executor) {
        this.f30647a.mo2212f(new InterfaceC8775j2.a() { // from class: m0.i0
            @Override // p296n0.InterfaceC8775j2.a
            /* JADX INFO: renamed from: a */
            public final void mo26326a(InterfaceC8775j2 interfaceC8775j2) {
                C8300j0.m33747a(this.f30631a, aVar, interfaceC8775j2);
            }
        }, executor);
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: g */
    public InterfaceC0494d mo2213g() {
        return m33750j(this.f30647a.mo2213g());
    }

    @Override // p296n0.InterfaceC8775j2
    public int getHeight() {
        return this.f30647a.getHeight();
    }

    @Override // p296n0.InterfaceC8775j2
    public Surface getSurface() {
        return this.f30647a.getSurface();
    }

    @Override // p296n0.InterfaceC8775j2
    public int getWidth() {
        return this.f30647a.getWidth();
    }

    /* JADX INFO: renamed from: h */
    public void m33748h(C8327v0 c8327v0) {
        C12637g.m47078j(this.f30648b == null, "Pending request should be null");
        this.f30648b = c8327v0;
    }

    /* JADX INFO: renamed from: i */
    public void m33749i() {
        this.f30648b = null;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0494d m33750j(InterfaceC0494d interfaceC0494d) {
        if (interfaceC0494d == null) {
            return null;
        }
        C8857z3 c8857z3M35562b = this.f30648b == null ? C8857z3.m35562b() : C8857z3.m35561a(new Pair(this.f30648b.m33812j(), this.f30648b.m33811i().get(0)));
        this.f30648b = null;
        return new C5892h2(interfaceC0494d, new Size(interfaceC0494d.getWidth(), interfaceC0494d.getHeight()), new C11142c(new C1201l(c8857z3M35562b, interfaceC0494d.mo2192H2().getTimestamp())));
    }
}
