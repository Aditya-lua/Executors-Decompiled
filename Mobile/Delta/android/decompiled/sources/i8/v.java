package i8;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20394a;
    public final j8.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f20395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.b f20396d;

    public v(Executor executor, j8.d dVar, x xVar, k8.b bVar) {
        this.f20394a = executor;
        this.b = dVar;
        this.f20395c = xVar;
        this.f20396d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<b8.o> it = vVar.b.g0().iterator();
        while (it.hasNext()) {
            vVar.f20395c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f20394a.execute(new Runnable() { // from class: i8.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f20392a;
                vVar.f20396d.b(new k8.b.a() { // from class: i8.u
                    @Override // k8.b.a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
