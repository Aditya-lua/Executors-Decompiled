package h8;

import b8.o;
import b8.t;
import c8.m;
import i8.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import y7.j;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f18721f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f18722a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8.e f18723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.d f18724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k8.b f18725e;

    public c(Executor executor, c8.e eVar, x xVar, j8.d dVar, k8.b bVar) {
        this.b = executor;
        this.f18723c = eVar;
        this.f18722a = xVar;
        this.f18724d = dVar;
        this.f18725e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, b8.i iVar) {
        cVar.f18724d.U0(oVar, iVar);
        cVar.f18722a.b(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, j jVar, b8.i iVar) {
        cVar.getClass();
        try {
            m mVarA = cVar.f18723c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f18721f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final b8.i iVarA = mVarA.a(iVar);
                cVar.f18725e.b(new k8.b.a() { // from class: h8.b
                    @Override // k8.b.a
                    public final Object execute() {
                        return c.b(this.f18719a, oVar, iVarA);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f18721f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // h8.e
    public void a(final o oVar, final b8.i iVar, final j jVar) {
        this.b.execute(new Runnable() { // from class: h8.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f18716a, oVar, jVar, iVar);
            }
        });
    }
}
