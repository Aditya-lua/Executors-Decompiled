package j8;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20196a;
    public final k8.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f20197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l8.b f20198d;

    public v(Executor executor, k8.d dVar, x xVar, l8.b bVar) {
        this.f20196a = executor;
        this.b = dVar;
        this.f20197c = xVar;
        this.f20198d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator<c8.o> it = vVar.b.j0().iterator();
        while (it.hasNext()) {
            vVar.f20197c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f20196a.execute(new Runnable() { // from class: j8.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f20194a;
                vVar.f20198d.b(new l8.b.a() { // from class: j8.u
                    @Override // l8.b.a
                    public final Object j() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
