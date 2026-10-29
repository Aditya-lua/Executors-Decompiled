package androidx.work;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7864g1;
import p256ku.C7931v1;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12714n;
import p536x5.AbstractC12729u0;
import p536x5.C12692c;
import p536x5.C12700g;
import p536x5.C12709k0;
import p536x5.C12727t0;
import p536x5.C12736y;
import p536x5.InterfaceC12690b;
import p536x5.InterfaceC12707j0;
import p536x5.InterfaceC12711l0;
import p567y5.C13040d;

/* JADX INFO: renamed from: androidx.work.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Y2\u00020\u0001:\u0003\n\u0015\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001f\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101R\u001f\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u001f\u00109\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00101R\u001f\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b:\u00101R\u0019\u0010?\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b\u0015\u0010>R\u001a\u0010D\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020E8G¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b7\u0010HR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\b3\u0010HR\u0017\u0010K\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b:\u0010G\u001a\u0004\b(\u0010HR\u0017\u0010L\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u001f\u0010G\u001a\u0004\b\u0010\u0010HR\u0017\u0010M\u001a\u00020E8G¢\u0006\f\n\u0004\b8\u0010G\u001a\u0004\b/\u0010HR\u0017\u0010O\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010\bR\u001a\u0010S\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\bP\u0010N\u0012\u0004\bQ\u0010RR\u0017\u0010X\u001a\u00020T8G¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bF\u0010W¨\u0006Z"}, m31665d2 = {"Landroidx/work/a;", "", "Landroidx/work/a$a;", "builder", "<init>", "(Landroidx/work/a$a;)V", "", "s", "()Z", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "o", "()Lkotlin/coroutines/CoroutineContext;", "workerCoroutineContext", "c", "m", "taskExecutor", "Lx5/b;", "Lx5/b;", "()Lx5/b;", "clock", "Lx5/u0;", "e", "Lx5/u0;", "q", "()Lx5/u0;", "workerFactory", "Lx5/n;", "f", "Lx5/n;", "()Lx5/n;", "inputMergerFactory", "Lx5/j0;", "g", "Lx5/j0;", "k", "()Lx5/j0;", "runnableScheduler", "Lx2/a;", "", "h", "Lx2/a;", "()Lx2/a;", "initializationExceptionHandler", "i", "l", "schedulingExceptionHandler", "Lx5/t0;", "j", "r", "workerInitializationExceptionHandler", "p", "workerExecutionExceptionHandler", "", "Ljava/lang/String;", "()Ljava/lang/String;", "defaultProcessName", "", "J", "getRemoteSessionTimeoutMillis", "()J", "remoteSessionTimeoutMillis", "", "n", "I", "()I", "minimumLoggingLevel", "minJobSchedulerId", "maxJobSchedulerId", "contentUriTriggerWorkersLimit", "maxSchedulerLimit", "Z", "isUsingDefaultTaskExecutor", "t", "isMarkingJobsAsImportantWhileForeground$annotations", "()V", "isMarkingJobsAsImportantWhileForeground", "Lx5/l0;", "u", "Lx5/l0;", "()Lx5/l0;", "tracer", "v", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1115a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext workerCoroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor taskExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12690b clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12729u0 workerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12714n inputMergerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12707j0 runnableScheduler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC12631a<Throwable> initializationExceptionHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC12631a<Throwable> schedulingExceptionHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC12631a<C12727t0> workerInitializationExceptionHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC12631a<C12727t0> workerExecutionExceptionHandler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String defaultProcessName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final long remoteSessionTimeoutMillis;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int minimumLoggingLevel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int minJobSchedulerId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int maxJobSchedulerId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int contentUriTriggerWorkersLimit;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int maxSchedulerLimit;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean isUsingDefaultTaskExecutor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final boolean isMarkingJobsAsImportantWhileForeground;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12711l0 tracer;

    /* JADX INFO: renamed from: androidx.work.a$a */
    @Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R$\u00108\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b\u0018\u00105\"\u0004\b6\u00107R$\u0010?\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b3\u0010B\"\u0004\bC\u0010DR*\u0010I\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR*\u0010N\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010A\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR*\u0010R\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010DR$\u0010Y\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\b(\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b[\u0010]\"\u0004\b^\u0010_R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010a\u001a\u0004\b@\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010a\u001a\u0004\bT\u0010b\"\u0004\be\u0010dR\"\u0010h\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010a\u001a\u0004\bK\u0010b\"\u0004\bg\u0010dR\"\u0010k\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010a\u001a\u0004\bO\u0010b\"\u0004\bj\u0010dR\"\u0010m\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\b \u0010b\"\u0004\bl\u0010dR\"\u0010s\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010o\u001a\u0004\bF\u0010p\"\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010u\u001a\u0004\bi\u0010v\"\u0004\bw\u0010x¨\u0006z"}, m31665d2 = {"Landroidx/work/a$a;", "", "<init>", "()V", "", "loggingLevel", "w", "(I)Landroidx/work/a$a;", "Lx2/a;", "", "exceptionHandler", "v", "(Lx2/a;)Landroidx/work/a$a;", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "e", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "executor", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "r", "()Lkotlin/coroutines/CoroutineContext;", "setWorkerContext$work_runtime_release", "(Lkotlin/coroutines/CoroutineContext;)V", "workerContext", "Lx5/u0;", "c", "Lx5/u0;", "t", "()Lx5/u0;", "setWorkerFactory$work_runtime_release", "(Lx5/u0;)V", "workerFactory", "Lx5/n;", "d", "Lx5/n;", "g", "()Lx5/n;", "setInputMergerFactory$work_runtime_release", "(Lx5/n;)V", "inputMergerFactory", "p", "setTaskExecutor$work_runtime_release", "taskExecutor", "Lx5/b;", "f", "Lx5/b;", "()Lx5/b;", "setClock$work_runtime_release", "(Lx5/b;)V", "clock", "Lx5/j0;", "Lx5/j0;", "n", "()Lx5/j0;", "setRunnableScheduler$work_runtime_release", "(Lx5/j0;)V", "runnableScheduler", "h", "Lx2/a;", "()Lx2/a;", "setInitializationExceptionHandler$work_runtime_release", "(Lx2/a;)V", "initializationExceptionHandler", "i", "o", "setSchedulingExceptionHandler$work_runtime_release", "schedulingExceptionHandler", "Lx5/t0;", "j", "u", "setWorkerInitializationExceptionHandler$work_runtime_release", "workerInitializationExceptionHandler", "k", "s", "setWorkerExecutionExceptionHandler$work_runtime_release", "workerExecutionExceptionHandler", "", "l", "Ljava/lang/String;", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "", "m", "J", "()J", "setRemoteSessionTimeoutMillis$work_runtime_release", "(J)V", "remoteSessionTimeoutMillis", "I", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "setMinJobSchedulerId$work_runtime_release", "minJobSchedulerId", "setMaxJobSchedulerId$work_runtime_release", "maxJobSchedulerId", "q", "setMaxSchedulerLimit$work_runtime_release", "maxSchedulerLimit", "setContentUriTriggerWorkersLimit$work_runtime_release", "contentUriTriggerWorkersLimit", "", "Z", "()Z", "setMarkJobsAsImportantWhileForeground$work_runtime_release", "(Z)V", "markJobsAsImportantWhileForeground", "Lx5/l0;", "Lx5/l0;", "()Lx5/l0;", "setTracer$work_runtime_release", "(Lx5/l0;)V", "tracer", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Executor executor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext workerContext;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public AbstractC12729u0 workerFactory;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public AbstractC12714n inputMergerFactory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public Executor taskExecutor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12690b clock;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12707j0 runnableScheduler;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12631a<Throwable> initializationExceptionHandler;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12631a<Throwable> schedulingExceptionHandler;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12631a<C12727t0> workerInitializationExceptionHandler;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12631a<C12727t0> workerExecutionExceptionHandler;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public String defaultProcessName;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public int minJobSchedulerId;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public InterfaceC12711l0 tracer;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public long remoteSessionTimeoutMillis = 600000;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public int loggingLevel = 4;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public int maxJobSchedulerId = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public int maxSchedulerLimit = 20;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public int contentUriTriggerWorkersLimit = 8;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public boolean markJobsAsImportantWhileForeground = true;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1115a m6287a() {
            return new C1115a(this);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC12690b getClock() {
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
        /* JADX INFO: renamed from: f */
        public final InterfaceC12631a<Throwable> m6292f() {
            return this.initializationExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC12714n getInputMergerFactory() {
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
        public final InterfaceC12707j0 getRunnableScheduler() {
            return this.runnableScheduler;
        }

        @Nullable
        /* JADX INFO: renamed from: o */
        public final InterfaceC12631a<Throwable> m6301o() {
            return this.schedulingExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final Executor getTaskExecutor() {
            return this.taskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final InterfaceC12711l0 getTracer() {
            return this.tracer;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final CoroutineContext getWorkerContext() {
            return this.workerContext;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final InterfaceC12631a<C12727t0> m6305s() {
            return this.workerExecutionExceptionHandler;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final AbstractC12729u0 getWorkerFactory() {
            return this.workerFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: u */
        public final InterfaceC12631a<C12727t0> m6307u() {
            return this.workerInitializationExceptionHandler;
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final a m6308v(@NotNull InterfaceC12631a<Throwable> exceptionHandler) {
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.initializationExceptionHandler = exceptionHandler;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final a m6309w(int loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31665d2 = {"Landroidx/work/a$c;", "", "Landroidx/work/a;", "b", "()Landroidx/work/a;", "workManagerConfiguration", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public interface c {
        @NotNull
        /* JADX INFO: renamed from: b */
        C1115a mo6310b();
    }

    /* JADX DEBUG: Class process forced to load method for inline: x5.c.a(kotlin.coroutines.CoroutineContext):java.util.concurrent.Executor */
    public C1115a(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CoroutineContext workerContext = builder.getWorkerContext();
        Executor executor = builder.getExecutor();
        if (executor == null) {
            executor = workerContext != null ? C12692c.m47327d(workerContext) : null;
            if (executor == null) {
                executor = C12692c.m47328e(false);
            }
        }
        this.executor = executor;
        if (workerContext == null) {
            workerContext = builder.getExecutor() != null ? C7931v1.m32925b(executor) : C7864g1.m32643a();
        }
        this.workerCoroutineContext = workerContext;
        this.isUsingDefaultTaskExecutor = builder.getTaskExecutor() == null;
        Executor taskExecutor = builder.getTaskExecutor();
        this.taskExecutor = taskExecutor == null ? C12692c.m47328e(true) : taskExecutor;
        InterfaceC12690b clock = builder.getClock();
        this.clock = clock == null ? new C12709k0() : clock;
        AbstractC12729u0 workerFactory = builder.getWorkerFactory();
        this.workerFactory = workerFactory == null ? C12700g.f45255a : workerFactory;
        AbstractC12714n inputMergerFactory = builder.getInputMergerFactory();
        this.inputMergerFactory = inputMergerFactory == null ? C12736y.f45351a : inputMergerFactory;
        InterfaceC12707j0 runnableScheduler = builder.getRunnableScheduler();
        this.runnableScheduler = runnableScheduler == null ? new C13040d() : runnableScheduler;
        this.minimumLoggingLevel = builder.getLoggingLevel();
        this.minJobSchedulerId = builder.getMinJobSchedulerId();
        this.maxJobSchedulerId = builder.getMaxJobSchedulerId();
        this.maxSchedulerLimit = builder.getMaxSchedulerLimit();
        this.initializationExceptionHandler = builder.m6292f();
        this.schedulingExceptionHandler = builder.m6301o();
        this.workerInitializationExceptionHandler = builder.m6307u();
        this.workerExecutionExceptionHandler = builder.m6305s();
        this.defaultProcessName = builder.getDefaultProcessName();
        this.remoteSessionTimeoutMillis = builder.getRemoteSessionTimeoutMillis();
        this.contentUriTriggerWorkersLimit = builder.getContentUriTriggerWorkersLimit();
        this.isMarkingJobsAsImportantWhileForeground = builder.getMarkJobsAsImportantWhileForeground();
        InterfaceC12711l0 tracer = builder.getTracer();
        this.tracer = tracer == null ? C12692c.m47329f() : tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC12690b getClock() {
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
    /* JADX INFO: renamed from: e */
    public final InterfaceC12631a<Throwable> m6272e() {
        return this.initializationExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC12714n getInputMergerFactory() {
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
    public final InterfaceC12707j0 getRunnableScheduler() {
        return this.runnableScheduler;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final InterfaceC12631a<Throwable> m6279l() {
        return this.schedulingExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Executor getTaskExecutor() {
        return this.taskExecutor;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC12711l0 getTracer() {
        return this.tracer;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoroutineContext getWorkerCoroutineContext() {
        return this.workerCoroutineContext;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final InterfaceC12631a<C12727t0> m6283p() {
        return this.workerExecutionExceptionHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final AbstractC12729u0 getWorkerFactory() {
        return this.workerFactory;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final InterfaceC12631a<C12727t0> m6285r() {
        return this.workerInitializationExceptionHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsMarkingJobsAsImportantWhileForeground() {
        return this.isMarkingJobsAsImportantWhileForeground;
    }
}
