package i8;

import c8.o;
import c8.t;
import d8.m;
import j8.x;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import z7.j;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f19278f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f19279a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.e f19280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k8.d f19281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l8.b f19282e;

    public c(Executor executor, d8.e eVar, x xVar, k8.d dVar, l8.b bVar) {
        this.b = executor;
        this.f19280c = eVar;
        this.f19279a = xVar;
        this.f19281d = dVar;
        this.f19282e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, c8.i iVar) {
        cVar.f19281d.S1(oVar, iVar);
        cVar.f19279a.b(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, j jVar, c8.i iVar) {
        cVar.getClass();
        try {
            m mVarA = cVar.f19280c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f19278f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final c8.i iVarB = mVarA.b(iVar);
                cVar.f19282e.b(new l8.b.a() { // from class: i8.b
                    @Override // l8.b.a
                    public final Object j() {
                        return c.b(this.f19276a, oVar, iVarB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e10) {
            f19278f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // i8.e
    public void a(final o oVar, final c8.i iVar, final j jVar) {
        this.b.execute(new Runnable() { // from class: i8.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f19273a, oVar, jVar, iVar);
            }
        });
    }
}
