package androidx.camera.core;

import androidx.camera.core.C0493c;
import androidx.camera.core.InterfaceC0494d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p140g0.AbstractC5954x0;
import p296n0.InterfaceC8775j2;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;

/* JADX INFO: renamed from: androidx.camera.core.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0493c extends AbstractC5954x0 {

    /* JADX INFO: renamed from: v */
    public final Executor f1783v;

    /* JADX INFO: renamed from: w */
    public final Object f1784w = new Object();

    /* JADX INFO: renamed from: x */
    public InterfaceC0494d f1785x;

    /* JADX INFO: renamed from: y */
    public b f1786y;

    /* JADX INFO: renamed from: androidx.camera.core.c$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f1787a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(b bVar) {
            this.f1787a = bVar;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            this.f1787a.close();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.c$b */
    public static class b extends AbstractC0492b {

        /* JADX INFO: renamed from: d */
        public final WeakReference<C0493c> f1789d;

        public b(InterfaceC0494d interfaceC0494d, C0493c c0493c) {
            super(interfaceC0494d);
            this.f1789d = new WeakReference<>(c0493c);
            m2195a(new AbstractC0492b.a() { // from class: g0.z0
                @Override // androidx.camera.core.AbstractC0492b.a
                /* JADX INFO: renamed from: a */
                public final void mo2197a(InterfaceC0494d interfaceC0494d2) {
                    C0493c.b.m2203c(this.f22764a, interfaceC0494d2);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m2203c(b bVar, InterfaceC0494d interfaceC0494d) {
            final C0493c c0493c = bVar.f1789d.get();
            if (c0493c != null) {
                c0493c.f1783v.execute(new Runnable() { // from class: g0.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0493c.m2201w();
                    }
                });
            }
        }
    }

    public C0493c(Executor executor) {
        this.f1783v = executor;
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: d */
    public InterfaceC0494d mo2198d(InterfaceC8775j2 interfaceC8775j2) {
        return interfaceC8775j2.mo2208b();
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: f */
    public void mo2199f() {
        synchronized (this.f1784w) {
            try {
                InterfaceC0494d interfaceC0494d = this.f1785x;
                if (interfaceC0494d != null) {
                    interfaceC0494d.close();
                    this.f1785x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: l */
    public void mo2200l(InterfaceC0494d interfaceC0494d) {
        synchronized (this.f1784w) {
            try {
                if (!this.f22738u) {
                    interfaceC0494d.close();
                    return;
                }
                if (this.f1786y == null) {
                    b bVar = new b(interfaceC0494d, this);
                    this.f1786y = bVar;
                    C10773n.m40987j(m26727e(bVar), new a(bVar), C10417c.m40081b());
                } else {
                    if (interfaceC0494d.mo2192H2().getTimestamp() <= this.f1786y.mo2192H2().getTimestamp()) {
                        interfaceC0494d.close();
                    } else {
                        InterfaceC0494d interfaceC0494d2 = this.f1785x;
                        if (interfaceC0494d2 != null) {
                            interfaceC0494d2.close();
                        }
                        this.f1785x = interfaceC0494d;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2201w() {
        synchronized (this.f1784w) {
            try {
                this.f1786y = null;
                InterfaceC0494d interfaceC0494d = this.f1785x;
                if (interfaceC0494d != null) {
                    this.f1785x = null;
                    mo2200l(interfaceC0494d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
