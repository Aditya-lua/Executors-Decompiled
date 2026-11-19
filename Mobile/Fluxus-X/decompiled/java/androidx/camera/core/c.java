package androidx.camera.core;

import g0.x0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import n0.j2;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f1171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1172w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f1173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f1174y;

    public class a implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f1175a;

        public a(b bVar) {
            this.f1175a = bVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            this.f1175a.close();
        }
    }

    public static class b extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WeakReference<c> f1176d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f1176d = new WeakReference<>(cVar);
            a(new androidx.camera.core.b.a() { // from class: g0.z0
                @Override // androidx.camera.core.b.a
                public final void a(androidx.camera.core.d dVar2) {
                    androidx.camera.core.c.b.c(this.f17036a, dVar2);
                }
            });
        }

        public static /* synthetic */ void c(b bVar, d dVar) {
            final c cVar = bVar.f1176d.get();
            if (cVar != null) {
                cVar.f1171v.execute(new Runnable() { // from class: g0.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.w();
                    }
                });
            }
        }
    }

    public c(Executor executor) {
        this.f1171v = executor;
    }

    @Override // g0.x0
    public d d(j2 j2Var) {
        return j2Var.b();
    }

    @Override // g0.x0
    public void f() {
        synchronized (this.f1172w) {
            try {
                d dVar = this.f1173x;
                if (dVar != null) {
                    dVar.close();
                    this.f1173x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.x0
    public void l(d dVar) {
        synchronized (this.f1172w) {
            try {
                if (!this.f17018u) {
                    dVar.close();
                    return;
                }
                if (this.f1174y == null) {
                    b bVar = new b(dVar, this);
                    this.f1174y = bVar;
                    n.j(e(bVar), new a(bVar), q0.c.b());
                } else {
                    if (dVar.L2().getTimestamp() <= this.f1174y.L2().getTimestamp()) {
                        dVar.close();
                    } else {
                        d dVar2 = this.f1173x;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                        this.f1173x = dVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w() {
        synchronized (this.f1172w) {
            try {
                this.f1174y = null;
                d dVar = this.f1173x;
                if (dVar != null) {
                    this.f1173x = null;
                    l(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
