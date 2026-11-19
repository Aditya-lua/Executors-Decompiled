package j8;

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
    public final Context f20178a;
    public final d8.e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k8.d f20179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f20181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l8.b f20182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m8.a f20183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m8.a f20184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k8.c f20185i;

    public r(Context context, d8.e eVar, k8.d dVar, x xVar, Executor executor, l8.b bVar, m8.a aVar, m8.a aVar2, k8.c cVar) {
        this.f20178a = context;
        this.b = eVar;
        this.f20179c = dVar;
        this.f20180d = xVar;
        this.f20181e = executor;
        this.f20182f = bVar;
        this.f20183g = aVar;
        this.f20184h = aVar2;
        this.f20185i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, c8.o oVar, long j10) {
        rVar.f20179c.t1(iterable);
        rVar.f20179c.k2(oVar, rVar.f20183g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f20185i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f20179c.M(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, c8.o oVar, int i10) {
        rVar.f20180d.b(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, c8.o oVar, long j10) {
        rVar.f20179c.k2(oVar, rVar.f20183g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f20185i.d(((Integer) entry.getValue()).intValue(), f8.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final c8.o oVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            l8.b bVar = rVar.f20182f;
            final k8.d dVar = rVar.f20179c;
            Objects.requireNonNull(dVar);
            bVar.b(new l8.b.a() { // from class: j8.i
                @Override // l8.b.a
                public final Object j() {
                    return Integer.valueOf(dVar.cleanUp());
                }
            });
            if (rVar.k()) {
                rVar.l(oVar, i10);
            } else {
                rVar.f20182f.b(new l8.b.a() { // from class: j8.j
                    @Override // l8.b.a
                    public final Object j() {
                        return r.f(this.f20166a, oVar, i10);
                    }
                });
            }
        } catch (l8.a unused) {
            rVar.f20180d.b(oVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    public c8.i j(d8.m mVar) {
        l8.b bVar = this.f20182f;
        final k8.c cVar = this.f20185i;
        Objects.requireNonNull(cVar);
        return mVar.b(c8.i.a().i(this.f20183g.a()).k(this.f20184h.a()).j("GDT_CLIENT_METRICS").h(new c8.h(z7.c.b("proto"), ((f8.a) bVar.b(new l8.b.a() { // from class: j8.h
            @Override // l8.b.a
            public final Object j() {
                return cVar.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20178a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public d8.g l(final c8.o oVar, int i10) {
        d8.g gVarA;
        d8.m mVarA = this.b.a(oVar.b());
        d8.g gVarE = d8.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f20182f.b(new l8.b.a() { // from class: j8.k
            @Override // l8.b.a
            public final Object j() {
                return Boolean.valueOf(this.f20168a.f20179c.o2(oVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f20182f.b(new l8.b.a() { // from class: j8.l
                @Override // l8.b.a
                public final Object j() {
                    return this.f20169a.f20179c.q1(oVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVarA == null) {
                g8.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                gVarA = d8.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k8.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVarA));
                }
                gVarA = mVarA.a(d8.f.a().b(arrayList).c(oVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == d8.g.a.TRANSIENT_ERROR) {
                final c8.o oVar2 = oVar;
                this.f20182f.b(new l8.b.a() { // from class: j8.m
                    @Override // l8.b.a
                    public final Object j() {
                        return r.b(this.f20170a, iterable, oVar2, j10);
                    }
                });
                this.f20180d.a(oVar2, i10 + 1, true);
                return gVarE;
            }
            c8.o oVar3 = oVar;
            this.f20182f.b(new l8.b.a() { // from class: j8.n
                @Override // l8.b.a
                public final Object j() {
                    return r.e(this.f20173a, iterable);
                }
            });
            if (gVarE.c() == d8.g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (oVar3.e()) {
                    this.f20182f.b(new l8.b.a() { // from class: j8.o
                        @Override // l8.b.a
                        public final Object j() {
                            return r.c(this.f20174a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == d8.g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((k8.k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f20182f.b(new l8.b.a() { // from class: j8.p
                    @Override // l8.b.a
                    public final Object j() {
                        return r.h(this.f20175a, map);
                    }
                });
            }
            oVar = oVar3;
        }
        final c8.o oVar4 = oVar;
        this.f20182f.b(new l8.b.a() { // from class: j8.q
            @Override // l8.b.a
            public final Object j() {
                return r.g(this.f20176a, oVar4, j10);
            }
        });
        return gVarE;
    }

    public void m(final c8.o oVar, final int i10, final Runnable runnable) {
        this.f20181e.execute(new Runnable() { // from class: j8.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f20161a, oVar, i10, runnable);
            }
        });
    }
}
