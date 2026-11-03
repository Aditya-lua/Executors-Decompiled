package i8;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20510a;
    public final j8.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f20511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.b f20512d;

    public v(Executor executor, j8.d dVar, x xVar, k8.b bVar) {
        this.f20510a = executor;
        this.b = dVar;
        this.f20511c = xVar;
        this.f20512d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<b8.o> it = vVar.b.e0().iterator();
        while (it.hasNext()) {
            vVar.f20511c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f20510a.execute(new Runnable() { // from class: i8.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f20508a;
                vVar.f20512d.b(new k8.b.a() { // from class: i8.u
                    @Override // k8.b.a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
