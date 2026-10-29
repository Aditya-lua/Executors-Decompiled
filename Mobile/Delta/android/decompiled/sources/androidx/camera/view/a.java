package androidx.camera.view;

import androidx.p000lifecycle.d0;
import g0.r1;
import g0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.x;
import n0.a3;
import n0.e0;
import n0.o0;
import n0.p0;
import n0.u;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a3.a<p0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f1435a;
    public final d0<PreviewView.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PreviewView.e f1436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x<Void> f1438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1439f = false;

    /* JADX INFO: renamed from: androidx.camera.view.a$a, reason: collision with other inner class name */
    public class C0020a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1440a;
        public final /* synthetic */ t b;

        public C0020a(List list, t tVar) {
            this.f1440a = list;
            this.b = tVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            a.this.f1438e = null;
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            a.this.f1438e = null;
            if (this.f1440a.isEmpty()) {
                return;
            }
            Iterator it = this.f1440a.iterator();
            while (it.hasNext()) {
                ((o0) this.b).v((u) it.next());
            }
            this.f1440a.clear();
        }
    }

    public class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f1442a;
        public final /* synthetic */ t b;

        public b(y1.c.a aVar, t tVar) {
            this.f1442a = aVar;
            this.b = tVar;
        }

        @Override // n0.u
        public void b(int i10, e0 e0Var) {
            this.f1442a.c(null);
            ((o0) this.b).v(this);
        }
    }

    public a(o0 o0Var, d0<PreviewView.e> d0Var, c cVar) {
        this.f1435a = o0Var;
        this.b = d0Var;
        this.f1437d = cVar;
        synchronized (this) {
            this.f1436c = d0Var.f();
        }
    }

    public static /* synthetic */ Object b(a aVar, t tVar, List list, y1.c.a aVar2) {
        aVar.getClass();
        b bVar = aVar.new b(aVar2, tVar);
        list.add(bVar);
        ((o0) tVar).f(q0.c.b(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(a aVar, Void r8) {
        aVar.getClass();
        aVar.i(PreviewView.e.STREAMING);
        return null;
    }

    public final void e() {
        x<Void> xVar = this.f1438e;
        if (xVar != null) {
            xVar.cancel(false);
            this.f1438e = null;
        }
    }

    public void f() {
        e();
    }

    @Override // n0.a3.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(p0.a aVar) {
        if (aVar == p0.a.CLOSING || aVar == p0.a.CLOSED || aVar == p0.a.RELEASING || aVar == p0.a.RELEASED) {
            i(PreviewView.e.IDLE);
            if (this.f1439f) {
                this.f1439f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == p0.a.OPENING || aVar == p0.a.OPEN || aVar == p0.a.PENDING_OPEN) && !this.f1439f) {
            h(this.f1435a);
            this.f1439f = true;
        }
    }

    public final void h(t tVar) {
        i(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        r0.d dVarF = r0.d.c(j(tVar, arrayList)).g(new r0.a() { // from class: p1.o
            @Override // r0.a
            public final me.x apply(Object obj) {
                return this.f28181a.f1437d.i();
            }
        }, q0.c.b()).f(new t.a() { // from class: p1.p
            @Override // t.a
            public final Object apply(Object obj) {
                return androidx.camera.view.a.d(this.f28185a, (Void) obj);
            }
        }, q0.c.b());
        this.f1438e = dVarF;
        n.j(dVarF, new C0020a(arrayList, tVar), q0.c.b());
    }

    public void i(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (this.f1436c.equals(eVar)) {
                    return;
                }
                this.f1436c = eVar;
                r1.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.b.m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final x<Void> j(final t tVar, final List<u> list) {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: p1.q
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return androidx.camera.view.a.b(this.f28187a, tVar, list, aVar);
            }
        });
    }

    @Override // n0.a3.a
    public void onError(Throwable th2) {
        f();
        i(PreviewView.e.IDLE);
    }
}
