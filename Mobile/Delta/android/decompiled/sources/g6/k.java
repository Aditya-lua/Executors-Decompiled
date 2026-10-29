package g6;

import androidx.work.impl.WorkDatabase;
import f6.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "Ly5/f0;", "continuation", "", "a", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ly5/f0;)V", "Lf6/j0;", "workSpec", "b", "(Lf6/j0;)Lf6/j0;", "", "Ly5/u;", "schedulers", "c", "(Ljava/util/List;Lf6/j0;)Lf6/j0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final void a(@NotNull WorkDatabase workDatabase, @NotNull androidx.work.a configuration, @NotNull y5.f0 continuation) {
        int i10;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List listP = kotlin.collections.p.p(continuation);
        int i11 = 0;
        while (!listP.isEmpty()) {
            y5.f0 f0Var = (y5.f0) kotlin.collections.u.H(listP);
            List<? extends q0> listG = f0Var.g();
            Intrinsics.checkNotNullExpressionValue(listG, "getWork(...)");
            List<? extends q0> list = listG;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((q0) it.next()).getWorkSpec().constraints.g() && (i10 = i10 + 1) < 0) {
                        kotlin.collections.p.s();
                    }
                }
            }
            i11 += i10;
            List<y5.f0> listF = f0Var.f();
            if (listF != null) {
                listP.addAll(listF);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iA = workDatabase.c0().A();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iA + i11 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iA + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    public static final j0 b(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean zH = workSpec.input.h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zH2 = workSpec.input.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zH3 = workSpec.input.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zH || !zH2 || !zH3) {
            return workSpec;
        }
        return j0.e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new androidx.work.b.a().c(workSpec.input).h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.workerClassName).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    @NotNull
    public static final j0 c(@NotNull List<? extends y5.u> schedulers, @NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return b(workSpec);
    }
}
