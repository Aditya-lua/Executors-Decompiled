package androidx.camera.view;

import androidx.camera.view.C0504a;
import androidx.p616lifecycle.C0949d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p140g0.InterfaceC5937t;
import p296n0.AbstractC8828u;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p436t.InterfaceC11464a;
import p563y1.C12997c;

/* JADX INFO: renamed from: androidx.camera.view.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0504a implements InterfaceC8722a3.a<InterfaceC8804p0.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8799o0 f1867a;

    /* JADX INFO: renamed from: b */
    public final C0949d0<PreviewView.EnumC0503e> f1868b;

    /* JADX INFO: renamed from: c */
    public PreviewView.EnumC0503e f1869c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0506c f1870d;

    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> f1871e;

    /* JADX INFO: renamed from: f */
    public boolean f1872f = false;

    /* JADX INFO: renamed from: androidx.camera.view.a$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f1873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5937t f1874b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(List list, InterfaceC5937t interfaceC5937t) {
            this.f1873a = list;
            this.f1874b = interfaceC5937t;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C0504a.this.f1871e = null;
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C0504a.this.f1871e = null;
            if (this.f1873a.isEmpty()) {
                return;
            }
            Iterator it = this.f1873a.iterator();
            while (it.hasNext()) {
                ((InterfaceC8799o0) this.f1874b).mo35057v((AbstractC8828u) it.next());
            }
            this.f1873a.clear();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.a$b */
    public class b extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f1876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5937t f1877b;

        public b(C12997c.a aVar, InterfaceC5937t interfaceC5937t) {
            this.f1876a = aVar;
            this.f1877b = interfaceC5937t;
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            this.f1876a.m48314c(null);
            ((InterfaceC8799o0) this.f1877b).mo35057v(this);
        }
    }

    public C0504a(InterfaceC8799o0 interfaceC8799o0, C0949d0<PreviewView.EnumC0503e> c0949d0, AbstractC0506c abstractC0506c) {
        this.f1867a = interfaceC8799o0;
        this.f1868b = c0949d0;
        this.f1870d = abstractC0506c;
        synchronized (this) {
            this.f1869c = c0949d0.mo4854f();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m2364b(C0504a c0504a, InterfaceC5937t interfaceC5937t, List list, C12997c.a aVar) {
        c0504a.getClass();
        b bVar = c0504a.new b(aVar, interfaceC5937t);
        list.add(bVar);
        ((InterfaceC8799o0) interfaceC5937t).mo35044f(C10417c.m40081b(), bVar);
        return "waitForCaptureResult";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m2366d(C0504a c0504a, Void r8) {
        c0504a.getClass();
        c0504a.m2372i(PreviewView.EnumC0503e.STREAMING);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2368e() {
        InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.f1871e;
        if (interfaceFutureC9440x != null) {
            interfaceFutureC9440x.cancel(false);
            this.f1871e = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2369f() {
        m2368e();
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
    @Override // p296n0.InterfaceC8722a3.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo2367a(InterfaceC8804p0.a aVar) {
        if (aVar == InterfaceC8804p0.a.CLOSING || aVar == InterfaceC8804p0.a.CLOSED || aVar == InterfaceC8804p0.a.RELEASING || aVar == InterfaceC8804p0.a.RELEASED) {
            m2372i(PreviewView.EnumC0503e.IDLE);
            if (this.f1872f) {
                this.f1872f = false;
                m2368e();
                return;
            }
            return;
        }
        if ((aVar == InterfaceC8804p0.a.OPENING || aVar == InterfaceC8804p0.a.OPEN || aVar == InterfaceC8804p0.a.PENDING_OPEN) && !this.f1872f) {
            m2371h(this.f1867a);
            this.f1872f = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2371h(InterfaceC5937t interfaceC5937t) {
        m2372i(PreviewView.EnumC0503e.IDLE);
        ArrayList arrayList = new ArrayList();
        C10763d c10763dM40976f = C10763d.m40973c(m2373j(interfaceC5937t, arrayList)).m40977g(new InterfaceC10760a() { // from class: p1.o
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return this.f36492a.f1870d.mo2402i();
            }
        }, C10417c.m40081b()).m40976f(new InterfaceC11464a() { // from class: p1.p
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return C0504a.m2366d(this.f36497a, (Void) obj);
            }
        }, C10417c.m40081b());
        this.f1871e = c10763dM40976f;
        C10773n.m40987j(c10763dM40976f, new a(arrayList, interfaceC5937t), C10417c.m40081b());
    }

    /* JADX INFO: renamed from: i */
    public void m2372i(PreviewView.EnumC0503e enumC0503e) {
        synchronized (this) {
            try {
                if (this.f1869c.equals(enumC0503e)) {
                    return;
                }
                this.f1869c = enumC0503e;
                C5931r1.m26561a("StreamStateObserver", "Update Preview stream state to " + enumC0503e);
                this.f1868b.mo4861m(enumC0503e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceFutureC9440x<Void> m2373j(final InterfaceC5937t interfaceC5937t, final List<AbstractC8828u> list) {
        return C12997c.m48311a(new C12997c.c() { // from class: p1.q
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C0504a.m2364b(this.f36499a, interfaceC5937t, list, aVar);
            }
        });
    }

    @Override // p296n0.InterfaceC8722a3.a
    public void onError(Throwable th2) {
        m2369f();
        m2372i(PreviewView.EnumC0503e.IDLE);
    }
}
