package p567y5;

import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.C5390j0;
import p120f6.InterfaceC5393k0;
import p120f6.InterfaceC5412q1;
import p146g6.C6030j;
import p146g6.C6031k;
import p161h6.InterfaceExecutorC6291a;
import p536x5.AbstractC12719p0;
import p536x5.AbstractC12721q0;
import p536x5.C12697e0;
import p536x5.C12717o0;
import p536x5.EnumC12706j;
import p536x5.InterfaceC12689a0;
import p536x5.InterfaceC12711l0;

/* JADX INFO: renamed from: y5.m1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Ly5/s;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Ly5/u;", "schedulers", "Lf6/j0;", "newWorkSpec", "", "", "tags", "Lx5/p0$b;", "h", "(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;", "Ly5/f1;", "name", "Lx5/q0;", "workRequest", "Lx5/a0;", "e", "(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13069m1 {
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC12689a0 m48607e(@NotNull final C13048f1 c13048f1, @NotNull final String name, @NotNull final AbstractC12721q0 workRequest) {
        Intrinsics.checkNotNullParameter(c13048f1, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        InterfaceC12711l0 tracer = c13048f1.m48584n().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        InterfaceExecutorC6291a interfaceExecutorC6291aMo27572c = c13048f1.m48590v().mo27572c();
        Intrinsics.checkNotNullExpressionValue(interfaceExecutorC6291aMo27572c, "getSerialTaskExecutor(...)");
        return C12697e0.m47355c(tracer, str, interfaceExecutorC6291aMo27572c, new Function0() { // from class: y5.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13069m1.m48608f(c13048f1, name, workRequest);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m48608f(final C13048f1 c13048f1, final String str, final AbstractC12721q0 abstractC12721q0) {
        Function0 function0 = new Function0() { // from class: y5.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13069m1.m48609g(abstractC12721q0, c13048f1, str);
            }
        };
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = c13048f1.m48589u().mo6350c0();
        List<C5390j0.IdAndState> listMo24794r = interfaceC5393k0Mo6350c0.mo24794r(str);
        if (listMo24794r.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        C5390j0.IdAndState idAndState = (C5390j0.IdAndState) CollectionsKt.firstOrNull(listMo24794r);
        if (idAndState == null) {
            function0.invoke();
            return Unit.f29331a;
        }
        C5390j0 c5390j0Mo24787k = interfaceC5393k0Mo6350c0.mo24787k(idAndState.id);
        if (c5390j0Mo24787k == null) {
            throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + str + "\", wasn't found");
        }
        if (!c5390j0Mo24787k.m24762o()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (idAndState.state == C12717o0.c.CANCELLED) {
            interfaceC5393k0Mo6350c0.mo24777a(idAndState.id);
            function0.invoke();
            return Unit.f29331a;
        }
        C5390j0 c5390j0M24750e = C5390j0.m24750e(abstractC12721q0.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554430, null);
        C13085s c13085sM48586r = c13048f1.m48586r();
        Intrinsics.checkNotNullExpressionValue(c13085sM48586r, "getProcessor(...)");
        WorkDatabase workDatabaseM48589u = c13048f1.m48589u();
        Intrinsics.checkNotNullExpressionValue(workDatabaseM48589u, "getWorkDatabase(...)");
        C1115a c1115aM48584n = c13048f1.m48584n();
        Intrinsics.checkNotNullExpressionValue(c1115aM48584n, "<get-configuration>(...)");
        List<InterfaceC13090u> listM48587s = c13048f1.m48587s();
        Intrinsics.checkNotNullExpressionValue(listM48587s, "getSchedulers(...)");
        m48610h(c13085sM48586r, workDatabaseM48589u, c1115aM48584n, listM48587s, c5390j0M24750e, abstractC12721q0.m47406c());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m48609g(AbstractC12721q0 abstractC12721q0, C13048f1 c13048f1, String str) {
        C6030j.m26826b(new C13047f0(c13048f1, str, EnumC12706j.KEEP, C7697o.m31878d(abstractC12721q0)));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC12719p0.b m48610h(C13085s c13085s, final WorkDatabase workDatabase, C1115a c1115a, final List<? extends InterfaceC13090u> list, final C5390j0 c5390j0, final Set<String> set) {
        final String str = c5390j0.id;
        final C5390j0 c5390j0Mo24787k = workDatabase.mo6350c0().mo24787k(str);
        if (c5390j0Mo24787k == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (c5390j0Mo24787k.state.m47391b()) {
            return AbstractC12719p0.b.NOT_APPLIED;
        }
        if (c5390j0Mo24787k.m24762o() ^ c5390j0.m24762o()) {
            Function1 function1 = new Function1() { // from class: y5.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C13069m1.m48611i((C5390j0) obj);
                }
            };
            throw new UnsupportedOperationException("Can't update " + ((String) function1.invoke(c5390j0Mo24787k)) + " Worker to " + ((String) function1.invoke(c5390j0)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zM48668k = c13085s.m48668k(str);
        if (!zM48668k) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC13090u) it.next()).mo194b(str);
            }
        }
        workDatabase.m47266R(new Runnable() { // from class: y5.l1
            @Override // java.lang.Runnable
            public final void run() {
                C13069m1.m48612j(workDatabase, c5390j0Mo24787k, c5390j0, list, str, set, zM48668k);
            }
        });
        if (!zM48668k) {
            C13096x.m48689f(c1115a, workDatabase, list);
        }
        return zM48668k ? AbstractC12719p0.b.APPLIED_FOR_NEXT_RUN : AbstractC12719p0.b.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: renamed from: i */
    public static final String m48611i(C5390j0 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return spec.m24762o() ? "Periodic" : "OneTime";
    }

    /* JADX INFO: renamed from: j */
    public static final void m48612j(WorkDatabase workDatabase, C5390j0 c5390j0, C5390j0 c5390j1, List list, String str, Set set, boolean z10) {
        InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabase.mo6350c0();
        InterfaceC5412q1 interfaceC5412q1Mo6351d0 = workDatabase.mo6351d0();
        C5390j0 c5390j0M24750e = C5390j0.m24750e(c5390j1, null, c5390j0.state, null, null, null, null, 0L, 0L, 0L, null, c5390j0.runAttemptCount, null, 0L, c5390j0.lastEnqueueTime, 0L, 0L, false, null, c5390j0.getPeriodCount(), c5390j0.getGeneration() + 1, c5390j0.getNextScheduleTimeOverride(), c5390j0.getNextScheduleTimeOverrideGeneration(), 0, null, null, 29613053, null);
        if (c5390j1.getNextScheduleTimeOverrideGeneration() == 1) {
            c5390j0M24750e.m24764q(c5390j1.getNextScheduleTimeOverride());
            c5390j0M24750e.m24765r(c5390j0M24750e.getNextScheduleTimeOverrideGeneration() + 1);
        }
        interfaceC5393k0Mo6350c0.mo24783g(C6031k.m26833c(list, c5390j0M24750e));
        interfaceC5412q1Mo6351d0.mo24881b(str);
        interfaceC5412q1Mo6351d0.m24883d(str, set);
        if (z10) {
            return;
        }
        interfaceC5393k0Mo6350c0.mo24793q(str, -1L);
        workDatabase.mo6349b0().mo24723a(str);
    }
}
