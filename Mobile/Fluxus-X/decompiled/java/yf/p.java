package yf;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ob.ze;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class p {
    public static final y3.f.a<Long> b = y3.i.f("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y3.f.a<Long> f37859c = y3.i.f("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y3.f.a<String> f37860d = y3.i.g("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf.c f37861a;

    public p(Context context, String str) {
        this.f37861a = new qf.c(context, "FirebaseHeartBeat" + str);
    }

    public static /* synthetic */ Unit a(long j10, y3.c cVar) {
        cVar.i(b, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(p pVar, String str, String str2, y3.f.a aVar, y3.c cVar) {
        pVar.getClass();
        y3.f.a<String> aVar2 = f37860d;
        if (((String) qf.d.a(cVar, aVar2, BuildConfig.FLAVOR)).equals(str)) {
            y3.f.a<Set<String>> aVarI = pVar.i(cVar, str);
            if (aVarI == null || aVarI.getName().equals(str2)) {
                return null;
            }
            pVar.q(cVar, aVar, str);
            return null;
        }
        y3.f.a<Long> aVar3 = f37859c;
        long jLongValue = ((Long) qf.d.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = pVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) qf.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
        cVar.i(aVar3, Long.valueOf(jLongValue + 1));
        cVar.i(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(p pVar, y3.c cVar) {
        pVar.getClass();
        long j10 = 0;
        for (Map.Entry<y3.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                y3.f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = pVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.i(key, ze.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.h(key);
                }
            }
        }
        if (j10 == 0) {
            cVar.h(f37859c);
            return null;
        }
        cVar.i(f37859c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(p pVar, String str, y3.c cVar) {
        pVar.getClass();
        cVar.i(f37860d, str);
        pVar.l(cVar, str);
        return null;
    }

    public final synchronized long e(y3.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) qf.d.a(cVar, f37859c, 0L)).longValue();
            String name = BuildConfig.FLAVOR;
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<y3.f.a<?>, Object> entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.i(y3.i.h(name), hashSet2);
            j10 = jLongValue - 1;
            cVar.i(f37859c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public synchronized void f() {
        this.f37861a.g(new Function1() { // from class: yf.n
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.c(this.f37857a, (y3.c) obj);
            }
        });
    }

    public synchronized List<q> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry<y3.f.a<?>, Object> entry : this.f37861a.h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(q.a(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String h(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized y3.f.a<Set<String>> i(y3.c cVar, String str) {
        for (Map.Entry<y3.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return y3.i.h(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean j(long j10, long j11) {
        return h(j10).equals(h(j11));
    }

    public synchronized void k() {
        final String strH = h(System.currentTimeMillis());
        this.f37861a.g(new Function1() { // from class: yf.m
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.d(this.f37856a, strH, (y3.c) obj);
            }
        });
    }

    public final synchronized void l(y3.c cVar, String str) {
        try {
            y3.f.a<Set<String>> aVarI = i(cVar, str);
            if (aVarI == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) qf.d.a(cVar, aVarI, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.h(aVarI);
            } else {
                cVar.i(aVarI, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean m(long j10) {
        return n(b, j10);
    }

    public synchronized boolean n(y3.f.a<Long> aVar, long j10) {
        if (j(((Long) this.f37861a.j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f37861a.k(aVar, Long.valueOf(j10));
        return true;
    }

    public synchronized void o(long j10, final String str) {
        final String strH = h(j10);
        final y3.f.a<Set<String>> aVarH = y3.i.h(str);
        this.f37861a.g(new Function1() { // from class: yf.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.b(this.f37853a, strH, str, aVarH, (y3.c) obj);
            }
        });
    }

    public synchronized void p(final long j10) {
        this.f37861a.g(new Function1() { // from class: yf.o
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.a(j10, (y3.c) obj);
            }
        });
    }

    public final synchronized void q(y3.c cVar, y3.f.a<Set<String>> aVar, String str) {
        l(cVar, str);
        HashSet hashSet = new HashSet((Collection) qf.d.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.i(aVar, hashSet);
    }
}
