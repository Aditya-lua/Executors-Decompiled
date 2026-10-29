package su;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p395qu.C10721f0;
import p395qu.C10725h0;

/* JADX INFO: renamed from: su.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b*\f\b\u0000\u0010\u001d\"\u00020\u00002\u00020\u0000¨\u0006\u001e"}, m31665d2 = {"", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "", "c", "(Z)Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Lsu/h;", "b", "(Ljava/lang/Runnable;JZ)Lsu/h;", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lsu/g;", "f", "Lsu/g;", "schedulerTimeSource", "TaskContext", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11461j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f40505a = C10721f0.m40844e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    public static final long f40506b = C10725h0.m40856f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f40507c = C10725h0.m40855e("kotlinx.coroutines.scheduler.core.pool.size", C7764d.m32078c(C10721f0.m40840a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    public static final int f40508d = C10725h0.m40855e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    public static final long f40509e = TimeUnit.SECONDS.toNanos(C10725h0.m40856f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    @NotNull
    public static AbstractC11458g f40510f = C11456e.f40496a;

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractRunnableC11459h m42918b(@NotNull Runnable runnable, long j10, boolean z10) {
        return new C11460i(runnable, j10, z10);
    }

    /* JADX INFO: renamed from: c */
    public static final String m42919c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
