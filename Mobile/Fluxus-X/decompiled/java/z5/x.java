package z5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.mlkit.common.MlKitException;
import g6.WorkGenerationalId;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39126a = y5.w.i("Schedulers");

    public static /* synthetic */ void b(List list, WorkGenerationalId workGenerationalId, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u) it.next()).b(workGenerationalId.getWorkSpecId());
        }
        f(aVar, workDatabase, list);
    }

    public static u c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        b6.f fVar = new b6.f(context, workDatabase, aVar);
        h6.v.c(context, SystemJobService.class, true);
        y5.w.e().a(f39126a, "Created SystemJobScheduler and enabled SystemJobService");
        return fVar;
    }

    public static void d(g6.k0 k0Var, y5.b bVar, List<g6.j0> list) {
        if (list.size() > 0) {
            long jA = bVar.a();
            Iterator<g6.j0> it = list.iterator();
            while (it.hasNext()) {
                k0Var.q(it.next().id, jA);
            }
        }
    }

    public static void e(final List<u> list, s sVar, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        sVar.e(new e() { // from class: z5.v
            @Override // z5.e
            public final void a(WorkGenerationalId workGenerationalId, boolean z10) {
                executor.execute(new Runnable() { // from class: z5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.b(list, workGenerationalId, aVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List<u> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        g6.k0 k0VarC0 = workDatabase.c0();
        workDatabase.i();
        try {
            List<g6.j0> listX = k0VarC0.x();
            d(k0VarC0, aVar.getClock(), listX);
            List<g6.j0> listT = k0VarC0.t(aVar.getMaxSchedulerLimit());
            d(k0VarC0, aVar.getClock(), listT);
            if (listX != null) {
                listT.addAll(listX);
            }
            List<g6.j0> listM = k0VarC0.m(MlKitException.CODE_SCANNER_UNAVAILABLE);
            workDatabase.V();
            workDatabase.p();
            if (listT.size() > 0) {
                g6.j0[] j0VarArr = (g6.j0[]) listT.toArray(new g6.j0[listT.size()]);
                for (u uVar : list) {
                    if (uVar.d()) {
                        uVar.e(j0VarArr);
                    }
                }
            }
            if (listM.size() > 0) {
                g6.j0[] j0VarArr2 = (g6.j0[]) listM.toArray(new g6.j0[listM.size()]);
                for (u uVar2 : list) {
                    if (!uVar2.d()) {
                        uVar2.e(j0VarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.p();
            throw th2;
        }
    }
}
