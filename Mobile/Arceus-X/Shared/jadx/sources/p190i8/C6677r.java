package p190i8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p028b8.AbstractC1261i;
import p028b8.AbstractC1267o;
import p028b8.C1260h;
import p044c8.AbstractC1560f;
import p044c8.AbstractC1561g;
import p044c8.InterfaceC1559e;
import p044c8.InterfaceC1567m;
import p097e8.C4881a;
import p097e8.C4883c;
import p122f8.C5488a;
import p212j8.AbstractC7058k;
import p212j8.InterfaceC7042c;
import p212j8.InterfaceC7044d;
import p241k8.C7489a;
import p241k8.InterfaceC7490b;
import p267l8.InterfaceC8011a;
import p569y7.C13116c;

/* JADX INFO: renamed from: i8.r */
/* JADX INFO: loaded from: classes.dex */
public class C6677r {

    /* JADX INFO: renamed from: a */
    public final Context f25735a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1559e f25736b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7044d f25737c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6683x f25738d;

    /* JADX INFO: renamed from: e */
    public final Executor f25739e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7490b f25740f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8011a f25741g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8011a f25742h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7042c f25743i;

    public C6677r(Context context, InterfaceC1559e interfaceC1559e, InterfaceC7044d interfaceC7044d, InterfaceC6683x interfaceC6683x, Executor executor, InterfaceC7490b interfaceC7490b, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, InterfaceC7042c interfaceC7042c) {
        this.f25735a = context;
        this.f25736b = interfaceC1559e;
        this.f25737c = interfaceC7044d;
        this.f25738d = interfaceC6683x;
        this.f25739e = executor;
        this.f25740f = interfaceC7490b;
        this.f25741g = interfaceC8011a;
        this.f25742h = interfaceC8011a2;
        this.f25743i = interfaceC7042c;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m28753b(C6677r c6677r, Iterable iterable, AbstractC1267o abstractC1267o, long j10) {
        c6677r.f25737c.mo29758t1(iterable);
        c6677r.f25737c.mo29757o2(abstractC1267o, c6677r.f25741g.mo33091a() + j10);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m28754c(C6677r c6677r) {
        c6677r.f25743i.mo29749a();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m28756e(C6677r c6677r, Iterable iterable) {
        c6677r.f25737c.mo29752J(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m28757f(C6677r c6677r, AbstractC1267o abstractC1267o, int i10) {
        c6677r.f25738d.mo28737b(abstractC1267o, i10 + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m28758g(C6677r c6677r, AbstractC1267o abstractC1267o, long j10) {
        c6677r.f25737c.mo29757o2(abstractC1267o, c6677r.f25741g.mo33091a() + j10);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m28759h(C6677r c6677r, Map map) {
        c6677r.getClass();
        for (Map.Entry entry : map.entrySet()) {
            c6677r.f25743i.mo29751d(((Integer) entry.getValue()).intValue(), C4883c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m28760i(final C6677r c6677r, final AbstractC1267o abstractC1267o, final int i10, Runnable runnable) {
        c6677r.getClass();
        try {
            InterfaceC7490b interfaceC7490b = c6677r.f25740f;
            final InterfaceC7044d interfaceC7044d = c6677r.f25737c;
            Objects.requireNonNull(interfaceC7044d);
            interfaceC7490b.mo29819b(new InterfaceC7490b.a() { // from class: i8.i
                @Override // p241k8.InterfaceC7490b.a
                public final Object execute() {
                    return Integer.valueOf(interfaceC7044d.cleanUp());
                }
            });
            if (c6677r.m28762k()) {
                c6677r.m28763l(abstractC1267o, i10);
            } else {
                c6677r.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.j
                    @Override // p241k8.InterfaceC7490b.a
                    public final Object execute() {
                        return C6677r.m28757f(this.f25716a, abstractC1267o, i10);
                    }
                });
            }
        } catch (C7489a unused) {
            c6677r.f25738d.mo28737b(abstractC1267o, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public AbstractC1261i m28761j(InterfaceC1567m interfaceC1567m) {
        InterfaceC7490b interfaceC7490b = this.f25740f;
        final InterfaceC7042c interfaceC7042c = this.f25743i;
        Objects.requireNonNull(interfaceC7042c);
        return interfaceC1567m.mo8177a(AbstractC1261i.m7022a().mo6993i(this.f25741g.mo33091a()).mo6995k(this.f25742h.mo33091a()).mo6994j("GDT_CLIENT_METRICS").mo6992h(new C1260h(C13116c.m48729b("proto"), ((C4881a) interfaceC7490b.mo29819b(new InterfaceC7490b.a() { // from class: i8.h
            @Override // p241k8.InterfaceC7490b.a
            public final Object execute() {
                return interfaceC7042c.mo29750c();
            }
        })).m23509f())).mo6988d());
    }

    /* JADX INFO: renamed from: k */
    public boolean m28762k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f25735a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC1561g m28763l(final AbstractC1267o abstractC1267o, int i10) {
        AbstractC1561g abstractC1561gMo8178b;
        InterfaceC1567m interfaceC1567mMo8159a = this.f25736b.mo8159a(abstractC1267o.mo7007b());
        AbstractC1561g abstractC1561gM8163e = AbstractC1561g.m8163e(0L);
        final long j10 = 0;
        while (((Boolean) this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.k
            @Override // p241k8.InterfaceC7490b.a
            public final Object execute() {
                return Boolean.valueOf(this.f25719a.f25737c.mo29753K(abstractC1267o));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.l
                @Override // p241k8.InterfaceC7490b.a
                public final Object execute() {
                    return this.f25721a.f25737c.mo29755e1(abstractC1267o);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC1561gM8163e;
            }
            if (interfaceC1567mMo8159a == null) {
                C5488a.m25128a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC1267o);
                abstractC1561gMo8178b = AbstractC1561g.m8161a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC7058k) it.next()).mo29746b());
                }
                if (abstractC1267o.m7041e()) {
                    arrayList.add(m28761j(interfaceC1567mMo8159a));
                }
                abstractC1561gMo8178b = interfaceC1567mMo8159a.mo8178b(AbstractC1560f.m8160a().mo8151b(arrayList).mo8152c(abstractC1267o.mo7008c()).mo8150a());
            }
            abstractC1561gM8163e = abstractC1561gMo8178b;
            if (abstractC1561gM8163e.mo8154c() == AbstractC1561g.a.TRANSIENT_ERROR) {
                final AbstractC1267o abstractC1267o2 = abstractC1267o;
                this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.m
                    @Override // p241k8.InterfaceC7490b.a
                    public final Object execute() {
                        return C6677r.m28753b(this.f25723a, iterable, abstractC1267o2, j10);
                    }
                });
                this.f25738d.mo28736a(abstractC1267o2, i10 + 1, true);
                return abstractC1561gM8163e;
            }
            AbstractC1267o abstractC1267o3 = abstractC1267o;
            this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.n
                @Override // p241k8.InterfaceC7490b.a
                public final Object execute() {
                    return C6677r.m28756e(this.f25727a, iterable);
                }
            });
            if (abstractC1561gM8163e.mo8154c() == AbstractC1561g.a.OK) {
                long jMax = Math.max(j10, abstractC1561gM8163e.mo8153b());
                if (abstractC1267o3.m7041e()) {
                    this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.o
                        @Override // p241k8.InterfaceC7490b.a
                        public final Object execute() {
                            return C6677r.m28754c(this.f25729a);
                        }
                    });
                }
                j10 = jMax;
            } else if (abstractC1561gM8163e.mo8154c() == AbstractC1561g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strMo6986j = ((AbstractC7058k) it2.next()).mo29746b().mo6986j();
                    if (map.containsKey(strMo6986j)) {
                        map.put(strMo6986j, Integer.valueOf(((Integer) map.get(strMo6986j)).intValue() + 1));
                    } else {
                        map.put(strMo6986j, 1);
                    }
                }
                this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.p
                    @Override // p241k8.InterfaceC7490b.a
                    public final Object execute() {
                        return C6677r.m28759h(this.f25730a, map);
                    }
                });
            }
            abstractC1267o = abstractC1267o3;
        }
        final AbstractC1267o abstractC1267o4 = abstractC1267o;
        this.f25740f.mo29819b(new InterfaceC7490b.a() { // from class: i8.q
            @Override // p241k8.InterfaceC7490b.a
            public final Object execute() {
                return C6677r.m28758g(this.f25732a, abstractC1267o4, j10);
            }
        });
        return abstractC1561gM8163e;
    }

    /* JADX INFO: renamed from: m */
    public void m28764m(final AbstractC1267o abstractC1267o, final int i10, final Runnable runnable) {
        this.f25739e.execute(new Runnable() { // from class: i8.g
            @Override // java.lang.Runnable
            public final void run() {
                C6677r.m28760i(this.f25710a, abstractC1267o, i10, runnable);
            }
        });
    }
}
