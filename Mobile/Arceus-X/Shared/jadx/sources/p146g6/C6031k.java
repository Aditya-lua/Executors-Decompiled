package p146g6;

import androidx.work.C1115a;
import androidx.work.C1116b;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.C5390j0;
import p536x5.AbstractC12721q0;
import p567y5.C13047f0;
import p567y5.InterfaceC13090u;

/* JADX INFO: renamed from: g6.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "Ly5/f0;", "continuation", "", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ly5/f0;)V", "Lf6/j0;", "workSpec", "b", "(Lf6/j0;)Lf6/j0;", "", "Ly5/u;", "schedulers", "c", "(Ljava/util/List;Lf6/j0;)Lf6/j0;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6031k {
    /* JADX INFO: renamed from: a */
    public static final void m26831a(@NotNull WorkDatabase workDatabase, @NotNull C1115a configuration, @NotNull C13047f0 continuation) {
        int i10;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List listM31897p = C7699p.m31897p(continuation);
        int i11 = 0;
        while (!listM31897p.isEmpty()) {
            C13047f0 c13047f0 = (C13047f0) C7708u.m31927H(listM31897p);
            List<? extends AbstractC12721q0> listM48572g = c13047f0.m48572g();
            Intrinsics.checkNotNullExpressionValue(listM48572g, "getWork(...)");
            List<? extends AbstractC12721q0> list = listM48572g;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((AbstractC12721q0) it.next()).getWorkSpec().constraints.m47340g() && (i10 = i10 + 1) < 0) {
                        C7699p.m31900s();
                    }
                }
            }
            i11 += i10;
            List<C13047f0> listM48571f = c13047f0.m48571f();
            if (listM48571f != null) {
                listM31897p.addAll(listM48571f);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iMo24775A = workDatabase.mo6350c0().mo24775A();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iMo24775A + i11 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iMo24775A + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C5390j0 m26832b(@NotNull C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean zM6319h = workSpec.input.m6319h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zM6319h2 = workSpec.input.m6319h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zM6319h3 = workSpec.input.m6319h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zM6319h || !zM6319h2 || !zM6319h3) {
            return workSpec;
        }
        return C5390j0.m24750e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new C1116b.a().m6324c(workSpec.input).m6329h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).m6322a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C5390j0 m26833c(@NotNull List<? extends InterfaceC13090u> schedulers, @NotNull C5390j0 workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return m26832b(workSpec);
    }
}
