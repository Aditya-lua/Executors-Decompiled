package androidx.work;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.v1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.g;
import x5.j0;
import x5.k0;
import x5.l0;
import x5.n;
import x5.t0;
import x5.u0;
import x5.y;
import y5.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0003\n\u0015\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u001f\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u001f\u00109\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00101R\u001f\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b:\u00101R\u0019\u0010?\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b\u0015\u0010>R\u001a\u0010D\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020E8G¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b7\u0010HR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\b3\u0010HR\u0017\u0010K\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b(\u0010HR\u0017\u0010L\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u001f\u0010G\u001a\u0004\b\u0010\u0010HR\u0017\u0010M\u001a\u00020E8G¢\u0006\f\n\u0004\b8\u0010G\u001a\u0004\b/\u0010HR\u0017\u0010O\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010\bR\u001a\u0010S\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u0010N\u0012\u0004\bQ\u0010RR\u0017\u0010X\u001a\u00020T8G¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bF\u0010W¨\u0006Z"}, d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "", "s", "()Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "c", "m", "taskExecutor", "Lx5/b;", "Lx5/b;", "()Lx5/b;", "clock", "Lx5/u0;", "e", "Lx5/u0;", "q", "()Lx5/u0;", "workerFactory", "Lx5/n;", "f", "Lx5/n;", "()Lx5/n;", "inputMergerFactory", "Lx5/j0;", "g", "Lx5/j0;", "k", "()Lx5/j0;", "runnableScheduler", "Lx2/a;", "", "h", "Lx2/a;", "()Lx2/a;", "initializationExceptionHandler", "i", "l", "schedulingExceptionHandler", "Lx5/t0;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "J", "getRemoteSessionTimeoutMillis", "()J", "remoteSessionTimeoutMillis", "", "n", "I", "()I", "minimumLoggingLevel", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "Z", "isUsingDefaultTaskExecutor", "t", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Lx5/l0;", "u", "Lx5/l0;", "()Lx5/l0;", "tracer", "v", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext workerCoroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor taskExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x5.b clock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u0 workerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n inputMergerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 runnableScheduler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x2.a<Throwable> initializationExceptionHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x2.a<Throwable> schedulingExceptionHandler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x2.a<t0> workerInitializationExceptionHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x2.a<t0> workerExecutionExceptionHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String defaultProcessName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final long remoteSessionTimeoutMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int minimumLoggingLevel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int minJobSchedulerId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int maxJobSchedulerId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final int contentUriTriggerWorkersLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int maxSchedulerLimit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final boolean isUsingDefaultTaskExecutor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final boolean isMarkingJobsAsImportantWhileForeground;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 tracer;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R$\u00108\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b\u0018\u00105\"\u0004\b6\u00107R$\u0010?\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b3\u0010B\"\u0004\bC\u0010DR*\u0010I\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR*\u0010N\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010A\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR*\u0010R\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010DR$\u0010Y\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\b(\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]\"\u0004\b^\u0010_R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010a\u001a\u0004\b@\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010a\u001a\u0004\bT\u0010b\"\u0004\be\u0010dR\"\u0010h\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010a\u001a\u0004\bK\u0010b\"\u0004\bg\u0010dR\"\u0010k\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010a\u001a\u0004\bO\u0010b\"\u0004\bj\u0010dR\"\u0010m\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\b \u0010b\"\u0004\bl\u0010dR\"\u0010s\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010o\u001a\u0004\bF\u0010p\"\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010u\u001a\u0004\bi\u0010v\"\u0004\bw\u0010x¨\u0006z"}, d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "", "loggingLevel", "w", "(I)Landroidx/work/a$a;", "Lx2/a;", "", "exceptionHandler", "v", "(Lx2/a;)Landroidx/work/a$a;", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "r", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerContext", "Lx5/u0;", "c", "Lx5/u0;", "t", "()Lx5/u0;", "setWorkerFactory$work_runtime_release", "(Lx5/u0;)V", "workerFactory", "Lx5/n;", "d", "Lx5/n;", "g", "()Lx5/n;", "setInputMergerFactory$work_runtime_release", "(Lx5/n;)V", "inputMergerFactory", "p", "setTaskExecutor$work_runtime_release", "taskExecutor", "Lx5/b;", "f", "Lx5/b;", "()Lx5/b;", "setClock$work_runtime_release", "(Lx5/b;)V", "clock", "Lx5/j0;", "Lx5/j0;", "n", "()Lx5/j0;", "setRunnableScheduler$work_runtime_release", "(Lx5/j0;)V", "runnableScheduler", "h", "Lx2/a;", "()Lx2/a;", "setInitializationExceptionHandler$work_runtime_release", "(Lx2/a;)V", "initializationExceptionHandler", "i", "o", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Lx5/t0;", "j", "u", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "s", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "m", "J", "()J", "setRemoteSessionTimeoutMillis$work_runtime_release", "(J)V", "remoteSessionTimeoutMillis", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "q", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Lx5/l0;", "Lx5/l0;", "()Lx5/l0;", "setTracer$work_runtime_release", "(Lx5/l0;)V", "tracer", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0063a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Executor executor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext workerContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public u0 workerFactory;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public n inputMergerFactory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Executor taskExecutor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x5.b clock;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public j0 runnableScheduler;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x2.a<Throwable> initializationExceptionHandler;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x2.a<Throwable> schedulingExceptionHandler;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x2.a<t0> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x2.a<t0> workerExecutionExceptionHandler;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String defaultProcessName;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public int minJobSchedulerId;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public l0 tracer;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public long remoteSessionTimeoutMillis = 600000;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public int loggingLevel = 4;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public int maxJobSchedulerId = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public int maxSchedulerLimit = 20;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public int contentUriTriggerWorkersLimit = 8;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public boolean markJobsAsImportantWhileForeground = true;

        @NotNull
        public final a a() {
            return new a(this);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final x5.b getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getContentUriTriggerWorkersLimit() {
            return this.contentUriTriggerWorkersLimit;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultProcessName() {
            return this.defaultProcessName;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        @Nullable
        public final x2.a<Throwable> f() {
            return this.initializationExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final n getInputMergerFactory() {
            return this.inputMergerFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getLoggingLevel() {
            return this.loggingLevel;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getMarkJobsAsImportantWhileForeground() {
            return this.markJobsAsImportantWhileForeground;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getMaxJobSchedulerId() {
            return this.maxJobSchedulerId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getMaxSchedulerLimit() {
            return this.maxSchedulerLimit;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getMinJobSchedulerId() {
            return this.minJobSchedulerId;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final long getRemoteSessionTimeoutMillis() {
            return this.remoteSessionTimeoutMillis;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final j0 getRunnableScheduler() {
            return this.runnableScheduler;
        }

        @Nullable
        public final x2.a<Throwable> o() {
            return this.schedulingExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final l0 getTracer() {
            return this.tracer;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        @Nullable
        public final x2.a<t0> s() {
            return this.workerExecutionExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final u0 getWorkerFactory() {
            return this.workerFactory;
        }

        @Nullable
        public final x2.a<t0> u() {
            return this.workerInitializationExceptionHandler;
        }

        @NotNull
        public final C0063a v(@NotNull x2.a<Throwable> exceptionHandler) {
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        @NotNull
        public final C0063a w(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/a$c;", "", "Landroidx/work/a;", "b", "()Landroidx/work/a;", "workManagerConfiguration", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        @NotNull
        a b();
    }

    public a(@NotNull C0063a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CoroutineContext workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? x5.c.d(workerContext) : null;
            if (executor == null) {
                executor = x5.c.e(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = builder.getExecutor() != null ? v1.b(executor) : g1.a();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? x5.c.e(true) : taskExecutor;
        x5.b clock = builder.getClock();
        this.clock = clock == null ? new k0() : clock;
        u0 workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? g.f34942a : workerFactory;
        n inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? y.f35021a : inputMergerFactory;
        j0 runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new d() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.f();
        this.schedulingExceptionHandler = builder.o();
        this.workerInitializationExceptionHandler = builder.u();
        this.workerExecutionExceptionHandler = builder.s();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.remoteSessionTimeoutMillis = builder.getRemoteSessionTimeoutMillis();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        l0 tracer = builder.getTracer();
        this.tracer = tracer == null ? x5.c.f() : tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final x5.b getClock() {
        return this.clock;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getContentUriTriggerWorkersLimit() {
        return this.contentUriTriggerWorkersLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultProcessName() {
        return this.defaultProcessName;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final x2.a<Throwable> e() {
        return this.initializationExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final n getInputMergerFactory() {
        return this.inputMergerFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxJobSchedulerId() {
        return this.maxJobSchedulerId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxSchedulerLimit() {
        return this.maxSchedulerLimit;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinJobSchedulerId() {
        return this.minJobSchedulerId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMinimumLoggingLevel() {
        return this.minimumLoggingLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final j0 getRunnableScheduler() {
        return this.runnableScheduler;
    }

    @Nullable
    public final x2.a<Throwable> l() {
        return this.schedulingExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final l0 getTracer() {
        return this.tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    @Nullable
    public final x2.a<t0> p() {
        return this.workerExecutionExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final u0 getWorkerFactory() {
        return this.workerFactory;
    }

    @Nullable
    public final x2.a<t0> r() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
