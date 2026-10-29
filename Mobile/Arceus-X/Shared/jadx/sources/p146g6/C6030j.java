package p146g6;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p120f6.C5362a;
import p120f6.C5390j0;
import p120f6.C5430x;
import p120f6.InterfaceC5365b;
import p120f6.InterfaceC5393k0;
import p536x5.AbstractC12721q0;
import p536x5.AbstractC12732w;
import p536x5.C12717o0;
import p536x5.EnumC12706j;
import p567y5.C13047f0;
import p567y5.C13048f1;
import p567y5.C13096x;

/* JADX INFO: renamed from: g6.j */
/* JADX INFO: loaded from: classes.dex */
public class C6030j {

    /* JADX INFO: renamed from: a */
    public static final String f23310a = AbstractC12732w.m47443i("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public static boolean m26825a(C13047f0 c13047f0) {
        C13048f1 c13048f1M48573h = c13047f0.m48573h();
        WorkDatabase workDatabaseM48589u = c13048f1M48573h.m48589u();
        workDatabaseM48589u.m47272i();
        try {
            C6031k.m26831a(workDatabaseM48589u, c13048f1M48573h.m48584n(), c13047f0);
            boolean zM26829e = m26829e(c13047f0);
            workDatabaseM48589u.m47267V();
            return zM26829e;
        } finally {
            workDatabaseM48589u.m47275p();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m26826b(C13047f0 c13047f0) {
        if (!c13047f0.m48574i()) {
            if (m26825a(c13047f0)) {
                m26830f(c13047f0);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + c13047f0 + ")");
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m26827c(C13047f0 c13047f0) {
        boolean zM26828d = m26828d(c13047f0.m48573h(), c13047f0.m48572g(), (String[]) C13047f0.m48566m(c13047f0).toArray(new String[0]), c13047f0.m48570e(), c13047f0.m48568c());
        c13047f0.m48576l();
        return zM26828d;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX INFO: renamed from: d */
    public static boolean m26828d(C13048f1 c13048f1, List<? extends AbstractC12721q0> list, String[] strArr, String str, EnumC12706j enumC12706j) {
        boolean z10;
        boolean z11;
        boolean z12;
        C13048f1 c13048f2;
        WorkDatabase workDatabase;
        boolean z13;
        String[] strArr2 = strArr;
        long jMo47323a = c13048f1.m48584n().getClock().mo47323a();
        WorkDatabase workDatabaseM48589u = c13048f1.m48589u();
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str2 : strArr2) {
                C5390j0 c5390j0Mo24787k = workDatabaseM48589u.mo6350c0().mo24787k(str2);
                if (c5390j0Mo24787k == null) {
                    AbstractC12732w.m47441e().mo47446c(f23310a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                C12717o0.c cVar = c5390j0Mo24787k.state;
                z12 &= cVar == C12717o0.c.SUCCEEDED;
                if (cVar == C12717o0.c.FAILED) {
                    z11 = true;
                } else if (cVar == C12717o0.c.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z14) {
            c13048f2 = c13048f1;
            workDatabase = workDatabaseM48589u;
            z13 = false;
        } else {
            List<C5390j0.IdAndState> listMo24794r = workDatabaseM48589u.mo6350c0().mo24794r(str);
            if (listMo24794r.isEmpty()) {
                c13048f2 = c13048f1;
                workDatabase = workDatabaseM48589u;
            } else if (enumC12706j == EnumC12706j.APPEND || enumC12706j == EnumC12706j.APPEND_OR_REPLACE) {
                c13048f2 = c13048f1;
                InterfaceC5365b interfaceC5365bMo6345X = workDatabaseM48589u.mo6345X();
                List arrayList = new ArrayList();
                for (C5390j0.IdAndState idAndState : listMo24794r) {
                    if (!interfaceC5365bMo6345X.mo24712d(idAndState.id)) {
                        C12717o0.c cVar2 = idAndState.state;
                        boolean z15 = (cVar2 == C12717o0.c.SUCCEEDED) & z12;
                        if (cVar2 == C12717o0.c.FAILED) {
                            z11 = true;
                        } else if (cVar2 == C12717o0.c.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(idAndState.id);
                        z12 = z15;
                    }
                    workDatabaseM48589u = workDatabaseM48589u;
                }
                workDatabase = workDatabaseM48589u;
                if (enumC12706j == EnumC12706j.APPEND_OR_REPLACE && (z10 || z11)) {
                    InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabase.mo6350c0();
                    Iterator<C5390j0.IdAndState> it = interfaceC5393k0Mo6350c0.mo24794r(str).iterator();
                    while (it.hasNext()) {
                        interfaceC5393k0Mo6350c0.mo24777a(it.next().id);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
            } else {
                if (enumC12706j == EnumC12706j.KEEP) {
                    Iterator<C5390j0.IdAndState> it2 = listMo24794r.iterator();
                    while (it2.hasNext()) {
                        C12717o0.c cVar3 = it2.next().state;
                        if (cVar3 == C12717o0.c.ENQUEUED || cVar3 == C12717o0.c.RUNNING) {
                            return false;
                        }
                    }
                }
                c13048f2 = c13048f1;
                C6027h.m26816m(str, c13048f2);
                InterfaceC5393k0 interfaceC5393k0Mo6350c1 = workDatabaseM48589u.mo6350c0();
                Iterator<C5390j0.IdAndState> it3 = listMo24794r.iterator();
                while (it3.hasNext()) {
                    interfaceC5393k0Mo6350c1.mo24777a(it3.next().id);
                }
                workDatabase = workDatabaseM48589u;
                z13 = true;
            }
            z13 = false;
        }
        Iterator<? extends AbstractC12721q0> it4 = list.iterator();
        while (it4.hasNext()) {
            AbstractC12721q0 next = it4.next();
            C5390j0 workSpec = next.getWorkSpec();
            if (!z14 || z12) {
                workSpec.lastEnqueueTime = jMo47323a;
            } else if (z11) {
                workSpec.state = C12717o0.c.FAILED;
            } else if (z10) {
                workSpec.state = C12717o0.c.CANCELLED;
            } else {
                workSpec.state = C12717o0.c.BLOCKED;
            }
            if (workSpec.state == C12717o0.c.ENQUEUED) {
                z13 = true;
            }
            workDatabase.mo6350c0().mo24784h(C6031k.m26833c(c13048f2.m48587s(), workSpec));
            if (z14) {
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabase.mo6345X().mo24711c(new C5362a(next.m47405b(), strArr2[i10]));
                    i10++;
                    it4 = it4;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            Iterator<? extends AbstractC12721q0> it5 = it4;
            workDatabase.mo6351d0().m24883d(next.m47405b(), next.m47406c());
            if (!zIsEmpty) {
                workDatabase.mo6348a0().mo24717a(new C5430x(str, next.m47405b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z13;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m26829e(C13047f0 c13047f0) {
        List<C13047f0> listM48571f = c13047f0.m48571f();
        boolean zM26829e = false;
        if (listM48571f != null) {
            for (C13047f0 c13047f1 : listM48571f) {
                if (c13047f1.m48575k()) {
                    AbstractC12732w.m47441e().mo47451k(f23310a, "Already enqueued work ids (" + TextUtils.join(", ", c13047f1.m48569d()) + ")");
                } else {
                    zM26829e |= m26829e(c13047f1);
                }
            }
        }
        return m26827c(c13047f0) | zM26829e;
    }

    /* JADX INFO: renamed from: f */
    public static void m26830f(C13047f0 c13047f0) {
        C13048f1 c13048f1M48573h = c13047f0.m48573h();
        C13096x.m48689f(c13048f1M48573h.m48584n(), c13048f1M48573h.m48589u(), c13048f1M48573h.m48587s());
    }
}
