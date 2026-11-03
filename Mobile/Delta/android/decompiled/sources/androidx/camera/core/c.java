package androidx.camera.core;

import g0.x0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import n0.j2;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f1209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1210w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f1211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f1212y;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f1213a;

        public a(b bVar) {
            this.f1213a = bVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            this.f1213a.close();
        }
    }

    public static class b extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WeakReference<c> f1214d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f1214d = new WeakReference<>(cVar);
            a(new androidx.camera.core.b.a() { // from class: g0.z0
                @Override // androidx.camera.core.b.a
                public final void a(androidx.camera.core.d dVar2) {
                    androidx.camera.core.c.b.c(this.f18178a, dVar2);
                }
            });
        }

        public static /* synthetic */ void c(b bVar, d dVar) {
            final c cVar = bVar.f1214d.get();
            if (cVar != null) {
                cVar.f1209v.execute(new Runnable() { // from class: g0.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.w();
                    }
                });
            }
        }
    }

    public c(Executor executor) {
        this.f1209v = executor;
    }

    @Override // g0.x0
    public d d(j2 j2Var) {
        return j2Var.b();
    }

    @Override // g0.x0
    public void f() {
        synchronized (this.f1210w) {
            try {
                d dVar = this.f1211x;
                if (dVar != null) {
                    dVar.close();
                    this.f1211x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.x0
    public void l(d dVar) {
        synchronized (this.f1210w) {
            try {
                if (!this.f18160u) {
                    dVar.close();
                    return;
                }
                if (this.f1212y == null) {
                    b bVar = new b(dVar, this);
                    this.f1212y = bVar;
                    n.j(e(bVar), new a(bVar), q0.c.b());
                } else {
                    if (dVar.I2().getTimestamp() <= this.f1212y.I2().getTimestamp()) {
                        dVar.close();
                    } else {
                        d dVar2 = this.f1211x;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                        this.f1211x = dVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w() {
        synchronized (this.f1210w) {
            try {
                this.f1212y = null;
                d dVar = this.f1211x;
                if (dVar != null) {
                    this.f1211x = null;
                    l(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
