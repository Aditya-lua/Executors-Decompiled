package wf;

import android.content.Context;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p306nb.C9261qe;
import p330of.C9729c;
import p330of.C9730d;
import p534x3.AbstractC12645f;
import p534x3.C12642c;
import p534x3.C12648i;

/* JADX INFO: renamed from: wf.p */
/* JADX INFO: loaded from: classes2.dex */
public class C12417p {

    /* JADX INFO: renamed from: b */
    public static final AbstractC12645f.a<Long> f44394b = C12648i.m47117f("fire-global");

    /* JADX INFO: renamed from: c */
    public static final AbstractC12645f.a<Long> f44395c = C12648i.m47117f("fire-count");

    /* JADX INFO: renamed from: d */
    public static final AbstractC12645f.a<String> f44396d = C12648i.m47118g("last-used-date");

    /* JADX INFO: renamed from: a */
    public final C9729c f44397a;

    public C12417p(Context context, String str) {
        this.f44397a = new C9729c(context, "FirebaseHeartBeat" + str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m46494a(long j10, C12642c c12642c) {
        c12642c.m47094i(f44394b, Long.valueOf(j10));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m46495b(C12417p c12417p, String str, String str2, AbstractC12645f.a aVar, C12642c c12642c) {
        c12417p.getClass();
        AbstractC12645f.a<String> aVar2 = f44396d;
        if (((String) C9730d.m38501a(c12642c, aVar2, "")).equals(str)) {
            AbstractC12645f.a<Set<String>> aVarM46502i = c12417p.m46502i(c12642c, str);
            if (aVarM46502i == null || aVarM46502i.getName().equals(str2)) {
                return null;
            }
            c12417p.m46510q(c12642c, aVar, str);
            return null;
        }
        AbstractC12645f.a<Long> aVar3 = f44395c;
        long jLongValue = ((Long) C9730d.m38501a(c12642c, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = c12417p.m46498e(c12642c);
        }
        HashSet hashSet = new HashSet((Collection) C9730d.m38501a(c12642c, aVar, new HashSet()));
        hashSet.add(str);
        c12642c.m47094i(aVar, hashSet);
        c12642c.m47094i(aVar3, Long.valueOf(jLongValue + 1));
        c12642c.m47094i(aVar2, str);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m46496c(C12417p c12417p, C12642c c12642c) {
        c12417p.getClass();
        long j10 = 0;
        for (Map.Entry<AbstractC12645f.a<?>, Object> entry : c12642c.mo47088a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                AbstractC12645f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strM46501h = c12417p.m46501h(System.currentTimeMillis());
                if (set.contains(strM46501h)) {
                    c12642c.m47094i(key, C9261qe.m36724a(new Object[]{strM46501h}));
                    j10++;
                } else {
                    c12642c.m47093h(key);
                }
            }
        }
        if (j10 == 0) {
            c12642c.m47093h(f44395c);
            return null;
        }
        c12642c.m47094i(f44395c, Long.valueOf(j10));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m46497d(C12417p c12417p, String str, C12642c c12642c) {
        c12417p.getClass();
        c12642c.m47094i(f44396d, str);
        c12417p.m46505l(c12642c, str);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m46498e(C12642c c12642c) {
        long j10;
        try {
            long jLongValue = ((Long) C9730d.m38501a(c12642c, f44395c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<AbstractC12645f.a<?>, Object> entry : c12642c.mo47088a().entrySet()) {
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
            c12642c.m47094i(C12648i.m47119h(name), hashSet2);
            j10 = jLongValue - 1;
            c12642c.m47094i(f44395c, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m46499f() {
        this.f44397a.m38494g(new Function1() { // from class: wf.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12417p.m46496c(this.f44392a, (C12642c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public synchronized List<AbstractC12418q> m46500g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strM46501h = m46501h(System.currentTimeMillis());
            for (Map.Entry<AbstractC12645f.a<?>, Object> entry : this.f44397a.m38495h().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM46501h);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AbstractC12418q.m46511a(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            m46509p(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized String m46501h(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized AbstractC12645f.a<Set<String>> m46502i(C12642c c12642c, String str) {
        for (Map.Entry<AbstractC12645f.a<?>, Object> entry : c12642c.mo47088a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return C12648i.m47119h(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m46503j(long j10, long j11) {
        return m46501h(j10).equals(m46501h(j11));
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m46504k() {
        final String strM46501h = m46501h(System.currentTimeMillis());
        this.f44397a.m38494g(new Function1() { // from class: wf.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12417p.m46497d(this.f44390a, strM46501h, (C12642c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m46505l(C12642c c12642c, String str) {
        try {
            AbstractC12645f.a<Set<String>> aVarM46502i = m46502i(c12642c, str);
            if (aVarM46502i == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) C9730d.m38501a(c12642c, aVarM46502i, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c12642c.m47093h(aVarM46502i);
            } else {
                c12642c.m47094i(aVarM46502i, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized boolean m46506m(long j10) {
        return m46507n(f44394b, j10);
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean m46507n(AbstractC12645f.a<Long> aVar, long j10) {
        if (m46503j(((Long) this.f44397a.m38497j(aVar, -1L)).longValue(), j10)) {
            return false;
        }
        this.f44397a.m38498k(aVar, Long.valueOf(j10));
        return true;
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m46508o(long j10, final String str) {
        final String strM46501h = m46501h(j10);
        final AbstractC12645f.a<Set<String>> aVarM47119h = C12648i.m47119h(str);
        this.f44397a.m38494g(new Function1() { // from class: wf.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12417p.m46495b(this.f44386a, strM46501h, str, aVarM47119h, (C12642c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m46509p(final long j10) {
        this.f44397a.m38494g(new Function1() { // from class: wf.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12417p.m46494a(j10, (C12642c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m46510q(C12642c c12642c, AbstractC12645f.a<Set<String>> aVar, String str) {
        m46505l(c12642c, str);
        HashSet hashSet = new HashSet((Collection) C9730d.m38501a(c12642c, aVar, new HashSet()));
        hashSet.add(str);
        c12642c.m47094i(aVar, hashSet);
    }
}
