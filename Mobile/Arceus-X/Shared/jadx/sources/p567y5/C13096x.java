package p567y5;

import android.content.Context;
import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p007a6.C0078f;
import p120f6.C5390j0;
import p120f6.InterfaceC5393k0;
import p120f6.WorkGenerationalId;
import p146g6.C6042v;
import p536x5.AbstractC12732w;
import p536x5.InterfaceC12690b;

/* JADX INFO: renamed from: y5.x */
/* JADX INFO: loaded from: classes.dex */
public class C13096x {

    /* JADX INFO: renamed from: a */
    public static final String f46324a = AbstractC12732w.m47443i("Schedulers");

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48685b(List list, WorkGenerationalId workGenerationalId, C1115a c1115a, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC13090u) it.next()).mo194b(workGenerationalId.getWorkSpecId());
        }
        m48689f(c1115a, workDatabase, list);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC13090u m48686c(Context context, WorkDatabase workDatabase, C1115a c1115a) {
        C0078f c0078f = new C0078f(context, workDatabase, c1115a);
        C6042v.m26859c(context, SystemJobService.class, true);
        AbstractC12732w.m47441e().mo47444a(f46324a, "Created SystemJobScheduler and enabled SystemJobService");
        return c0078f;
    }

    /* JADX INFO: renamed from: d */
    public static void m48687d(InterfaceC5393k0 interfaceC5393k0, InterfaceC12690b interfaceC12690b, List<C5390j0> list) {
        if (list.size() > 0) {
            long jMo47323a = interfaceC12690b.mo47323a();
            Iterator<C5390j0> it = list.iterator();
            while (it.hasNext()) {
                interfaceC5393k0.mo24793q(it.next().id, jMo47323a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m48688e(final List<InterfaceC13090u> list, C13085s c13085s, final Executor executor, final WorkDatabase workDatabase, final C1115a c1115a) {
        c13085s.m48663e(new InterfaceC13043e() { // from class: y5.v
            @Override // p567y5.InterfaceC13043e
            /* JADX INFO: renamed from: d */
            public final void mo6396d(WorkGenerationalId workGenerationalId, boolean z10) {
                executor.execute(new Runnable() { // from class: y5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13096x.m48685b(list, workGenerationalId, c1115a, workDatabase);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m48689f(C1115a c1115a, WorkDatabase workDatabase, List<InterfaceC13090u> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabase.mo6350c0();
        workDatabase.m47272i();
        try {
            List<C5390j0> listMo24800x = interfaceC5393k0Mo6350c0.mo24800x();
            m48687d(interfaceC5393k0Mo6350c0, c1115a.getClock(), listMo24800x);
            List<C5390j0> listMo24796t = interfaceC5393k0Mo6350c0.mo24796t(c1115a.getMaxSchedulerLimit());
            m48687d(interfaceC5393k0Mo6350c0, c1115a.getClock(), listMo24796t);
            if (listMo24800x != null) {
                listMo24796t.addAll(listMo24800x);
            }
            List<C5390j0> listMo24791o = interfaceC5393k0Mo6350c0.mo24791o(MlKitException.CODE_SCANNER_UNAVAILABLE);
            workDatabase.m47267V();
            workDatabase.m47275p();
            if (listMo24796t.size() > 0) {
                C5390j0[] c5390j0Arr = (C5390j0[]) listMo24796t.toArray(new C5390j0[listMo24796t.size()]);
                for (InterfaceC13090u interfaceC13090u : list) {
                    if (interfaceC13090u.mo195c()) {
                        interfaceC13090u.mo193a(c5390j0Arr);
                    }
                }
            }
            if (listMo24791o.size() > 0) {
                C5390j0[] c5390j0Arr2 = (C5390j0[]) listMo24791o.toArray(new C5390j0[listMo24791o.size()]);
                for (InterfaceC13090u interfaceC13090u2 : list) {
                    if (!interfaceC13090u2.mo195c()) {
                        interfaceC13090u2.mo193a(c5390j0Arr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.m47275p();
            throw th2;
        }
    }
}
