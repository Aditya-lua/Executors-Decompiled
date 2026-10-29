package y5;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly5/s;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Ly5/u;", "schedulers", "Lf6/j0;", "newWorkSpec", "", "", "tags", "Lx5/p0$b;", "h", "(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;", "Ly5/f1;", "name", "Lx5/q0;", "workRequest", "Lx5/a0;", "e", "(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m1 {
    @NotNull
    public static final x5.a0 e(@NotNull final f1 f1Var, @NotNull final String name, @NotNull final x5.q0 workRequest) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        x5.l0 tracer = f1Var.n().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        h6.a aVarC = f1Var.v().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "getSerialTaskExecutor(...)");
        return x5.e0.c(tracer, str, aVarC, new Function0() { // from class: y5.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.f(f1Var, name, workRequest);
            }
        });
    }

    public static final Unit f(final f1 f1Var, final String str, final x5.q0 q0Var) {
        Function0 function0 = new Function0() { // from class: y5.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m1.g(q0Var, f1Var, str);
            }
        };
        f6.k0 k0VarC0 = f1Var.u().c0();
        List<f6.j0.IdAndState> listR = k0VarC0.r(str);
        if (listR.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        f6.j0.IdAndState idAndState = (f6.j0.IdAndState) CollectionsKt.firstOrNull(listR);
        if (idAndState == null) {
            function0.invoke();
            return Unit.f22483a;
        }
        f6.j0 j0VarK = k0VarC0.k(idAndState.id);
        if (j0VarK == null) {
            throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found");
        }
        if (!j0VarK.o()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == x5.o0.c.CANCELLED) {
            k0VarC0.a(idAndState.id);
            function0.invoke();
            return Unit.f22483a;
        }
        f6.j0 j0VarE = f6.j0.e(q0Var.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
        s sVarR = f1Var.r();
        Intrinsics.checkNotNullExpressionValue(sVarR, "getProcessor(...)");
        WorkDatabase workDatabaseU = f1Var.u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseU, "getWorkDatabase(...)");
        androidx.work.a aVarN = f1Var.n();
        Intrinsics.checkNotNullExpressionValue(aVarN, "<get-configuration>(...)");
        List<u> listS = f1Var.s();
        Intrinsics.checkNotNullExpressionValue(listS, "getSchedulers(...)");
        h(sVarR, workDatabaseU, aVarN, listS, j0VarE, q0Var.c());
        return Unit.f22483a;
    }

    public static final Unit g(x5.q0 q0Var, f1 f1Var, String str) {
        g6.j.b(new f0(f1Var, str, x5.j.KEEP, kotlin.collections.o.d(q0Var)));
        return Unit.f22483a;
    }

    public static final x5.p0.b h(s sVar, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends u> list, final f6.j0 j0Var, final Set<String> set) {
        final String str = j0Var.id;
        final f6.j0 j0VarK = workDatabase.c0().k(str);
        if (j0VarK == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (j0VarK.state.b()) {
            return x5.p0.b.NOT_APPLIED;
        }
        if (j0VarK.o() ^ j0Var.o()) {
            Function1 function1 = new Function1() { // from class: y5.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1.i((f6.j0) obj);
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) function1.invoke(j0VarK)) + " Worker to " + ((String) function1.invoke(j0Var)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = sVar.k(str);
        if (!zK) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((u) it.next()).b(str);
            }
        }
        workDatabase.R(new Runnable() { // from class: y5.l1
            @Override // java.lang.Runnable
            public final void run() {
                m1.j(workDatabase, j0VarK, j0Var, list, str, set, zK);
            }
        });
        if (!zK) {
            x.f(aVar, workDatabase, list);
        }
        return zK ? x5.p0.b.APPLIED_FOR_NEXT_RUN : x5.p0.b.APPLIED_IMMEDIATELY;
    }

    public static final String i(f6.j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.o() ? "Periodic" : "OneTime";
    }

    public static final void j(WorkDatabase workDatabase, f6.j0 j0Var, f6.j0 j0Var2, List list, String str, Set set, boolean z10) {
        f6.k0 k0VarC0 = workDatabase.c0();
        f6.q1 q1VarD0 = workDatabase.d0();
        f6.j0 j0VarE = f6.j0.e(j0Var2, null, j0Var.state, null, null, null, null, 0L, 0L, 0L, null, j0Var.runAttemptCount, null, 0L, j0Var.lastEnqueueTime, 0L, 0L, false, null, j0Var.getPeriodCount(), j0Var.getGeneration() + 1, j0Var.getNextScheduleTimeOverride(), j0Var.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (j0Var2.getNextScheduleTimeOverrideGeneration() == 1) {
            j0VarE.q(j0Var2.getNextScheduleTimeOverride());
            j0VarE.r(j0VarE.getNextScheduleTimeOverrideGeneration() + 1);
        }
        k0VarC0.g(g6.k.c(list, j0VarE));
        q1VarD0.b(str);
        q1VarD0.d(str, set);
        if (z10) {
            return;
        }
        k0VarC0.q(str, -1L);
        workDatabase.b0().a(str);
    }
}
