package i8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20376a;
    public final c8.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8.d f20377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f20379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k8.b f20380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l8.a f20381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l8.a f20382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j8.c f20383i;

    public r(Context context, c8.e eVar, j8.d dVar, x xVar, Executor executor, k8.b bVar, l8.a aVar, l8.a aVar2, j8.c cVar) {
        this.f20376a = context;
        this.b = eVar;
        this.f20377c = dVar;
        this.f20378d = xVar;
        this.f20379e = executor;
        this.f20380f = bVar;
        this.f20381g = aVar;
        this.f20382h = aVar2;
        this.f20383i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, b8.o oVar, long j10) {
        rVar.f20377c.s1(iterable);
        rVar.f20377c.o2(oVar, rVar.f20381g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f20383i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f20377c.J(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, b8.o oVar, int i10) {
        rVar.f20378d.b(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, b8.o oVar, long j10) {
        rVar.f20377c.o2(oVar, rVar.f20381g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f20383i.d(((Integer) entry.getValue()).intValue(), e8.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final b8.o oVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            k8.b bVar = rVar.f20380f;
            final j8.d dVar = rVar.f20377c;
            Objects.requireNonNull(dVar);
            bVar.b(new k8.b.a() { // from class: i8.i
                @Override // k8.b.a
                public final Object execute() {
                    return Integer.valueOf(dVar.cleanUp());
                }
            });
            if (rVar.k()) {
                rVar.l(oVar, i10);
            } else {
                rVar.f20380f.b(new k8.b.a() { // from class: i8.j
                    @Override // k8.b.a
                    public final Object execute() {
                        return r.f(this.f20364a, oVar, i10);
                    }
                });
            }
        } catch (k8.a unused) {
            rVar.f20378d.b(oVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    public b8.i j(c8.m mVar) {
        k8.b bVar = this.f20380f;
        final j8.c cVar = this.f20383i;
        Objects.requireNonNull(cVar);
        return mVar.a(b8.i.a().i(this.f20381g.a()).k(this.f20382h.a()).j("GDT_CLIENT_METRICS").h(new b8.h(y7.c.b("proto"), ((e8.a) bVar.b(new k8.b.a() { // from class: i8.h
            @Override // k8.b.a
            public final Object execute() {
                return cVar.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20376a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public c8.g l(final b8.o oVar, int i10) {
        c8.g gVarB;
        c8.m mVarA = this.b.a(oVar.b());
        c8.g gVarE = c8.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f20380f.b(new k8.b.a() { // from class: i8.k
            @Override // k8.b.a
            public final Object execute() {
                return Boolean.valueOf(this.f20366a.f20377c.K(oVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f20380f.b(new k8.b.a() { // from class: i8.l
                @Override // k8.b.a
                public final Object execute() {
                    return this.f20367a.f20377c.d1(oVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVarA == null) {
                f8.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                gVarB = c8.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j8.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVarA));
                }
                gVarB = mVarA.b(c8.f.a().b(arrayList).c(oVar.c()).a());
            }
            gVarE = gVarB;
            if (gVarE.c() == c8.g.a.TRANSIENT_ERROR) {
                final b8.o oVar2 = oVar;
                this.f20380f.b(new k8.b.a() { // from class: i8.m
                    @Override // k8.b.a
                    public final Object execute() {
                        return r.b(this.f20368a, iterable, oVar2, j10);
                    }
                });
                this.f20378d.a(oVar2, i10 + 1, true);
                return gVarE;
            }
            b8.o oVar3 = oVar;
            this.f20380f.b(new k8.b.a() { // from class: i8.n
                @Override // k8.b.a
                public final Object execute() {
                    return r.e(this.f20371a, iterable);
                }
            });
            if (gVarE.c() == c8.g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (oVar3.e()) {
                    this.f20380f.b(new k8.b.a() { // from class: i8.o
                        @Override // k8.b.a
                        public final Object execute() {
                            return r.c(this.f20372a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == c8.g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((j8.k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f20380f.b(new k8.b.a() { // from class: i8.p
                    @Override // k8.b.a
                    public final Object execute() {
                        return r.h(this.f20373a, map);
                    }
                });
            }
            oVar = oVar3;
        }
        final b8.o oVar4 = oVar;
        this.f20380f.b(new k8.b.a() { // from class: i8.q
            @Override // k8.b.a
            public final Object execute() {
                return r.g(this.f20374a, oVar4, j10);
            }
        });
        return gVarE;
    }

    public void m(final b8.o oVar, final int i10, final Runnable runnable) {
        this.f20379e.execute(new Runnable() { // from class: i8.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f20359a, oVar, i10, runnable);
            }
        });
    }
}
