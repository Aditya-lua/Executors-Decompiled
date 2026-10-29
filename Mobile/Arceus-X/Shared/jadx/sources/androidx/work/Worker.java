package androidx.work;

import android.content.Context;
import androidx.work.Worker;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import p536x5.C12708k;
import p536x5.C12739z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Landroidx/work/Worker;", "Landroidx/work/c;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "d", "()Landroidx/work/c$a;", "Lne/x;", "startWork", "()Lne/x;", "Lx5/k;", "getForegroundInfoAsync", "e", "()Lx5/k;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class Worker extends AbstractC1117c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* JADX INFO: renamed from: f */
    public static final C12708k m6251f(Worker worker) {
        return worker.m6254e();
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC1117c.a m6252g(Worker worker) {
        return worker.mo6253d();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract AbstractC1117c.a mo6253d();

    @NotNull
    /* JADX INFO: renamed from: e */
    public C12708k m6254e() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.AbstractC1117c
    @NotNull
    public InterfaceFutureC9440x<C12708k> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return C12739z0.m47463e(backgroundExecutor, new Function0() { // from class: x5.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Worker.m6251f(this.f45324a);
            }
        });
    }

    @Override // androidx.work.AbstractC1117c
    @NotNull
    public final InterfaceFutureC9440x<AbstractC1117c.a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return C12739z0.m47463e(backgroundExecutor, new Function0() { // from class: x5.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Worker.m6252g(this.f45322a);
            }
        });
    }
}
