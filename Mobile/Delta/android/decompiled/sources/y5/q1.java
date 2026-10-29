package y5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f6.WorkGenerationalId;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.h2;
import ku.v1;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002/)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001d\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010UR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\bW\u0010^¨\u0006`"}, d2 = {"Ly5/q1;", "", "Ly5/q1$a;", "builder", "<init>", "(Ly5/q1$a;)V", "Lme/x;", "", "r", "()Lme/x;", "", "stopReason", "", "p", "(I)V", "Landroidx/work/c$a;", "result", "A", "(Landroidx/work/c$a;)Z", "Ly5/q1$b;", "x", "(Lnt/b;)Ljava/lang/Object;", "t", "s", "w", "(I)Z", "o", "C", "()Z", "", "workSpecId", "q", "(Ljava/lang/String;)V", "u", "v", "B", "", "tags", "l", "(Ljava/util/List;)Ljava/lang/String;", "Lf6/j0;", "a", "Lf6/j0;", "n", "()Lf6/j0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "d", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/c;", "e", "Landroidx/work/c;", "builderWorker", "Lh6/b;", "f", "Lh6/b;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Lx5/b;", "h", "Lx5/b;", "clock", "Le6/a;", "i", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/k0;", "k", "Lf6/k0;", "workSpecDao", "Lf6/b;", "Lf6/b;", "dependencyDao", "m", "Ljava/util/List;", "workDescription", "Lku/a0;", "Lku/a0;", "workerJob", "Lf6/w;", "()Lf6/w;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.j0 workSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters.a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final androidx.work.c builderWorker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h6.b workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.work.a configuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x5.b clock;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e6.a foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.k0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f6.b dependencyDao;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String workDescription;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.a0 workerJob;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Ly5/q1$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lh6/b;", "workTaskExecutor", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/j0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Le6/a;Landroidx/work/impl/WorkDatabase;Lf6/j0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Ly5/q1$a;", "Ly5/q1;", "a", "()Ly5/q1;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "Lh6/b;", "i", "()Lh6/b;", "Le6/a;", "d", "()Le6/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Lf6/j0;", "h", "()Lf6/j0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/c;", "Landroidx/work/c;", "j", "()Landroidx/work/c;", "setWorker", "(Landroidx/work/c;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final androidx.work.a configuration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final h6.b workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e6.a foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f6.j0 workSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context appContext;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public androidx.work.c worker;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public WorkerParameters.a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public a(@NotNull Context context, @NotNull androidx.work.a configuration, @NotNull h6.b workTaskExecutor, @NotNull e6.a foregroundProcessor, @NotNull WorkDatabase workDatabase, @NotNull f6.j0 workSpec, @NotNull List<String> tags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.a();
        }

        @NotNull
        public final q1 a() {
            return new q1(this);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final androidx.work.a getConfiguration() {
            return this.configuration;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final e6.a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        public final List<String> f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final f6.j0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final h6.b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final androidx.work.c getWorker() {
            return this.worker;
        }

        @NotNull
        public final a k(@Nullable WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ly5/q1$b;", "", "<init>", "()V", "c", "a", "b", "Ly5/q1$b$a;", "Ly5/q1$b$b;", "Ly5/q1$b$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$a;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final androidx.work.c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull androidx.work.c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.c.a getResult() {
                return this.result;
            }

            public /* synthetic */ a(androidx.work.c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new androidx.work.c.a.C0065a() : aVar);
            }
        }

        /* JADX INFO: renamed from: y5.q1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$b;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0654b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final androidx.work.c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654b(@NotNull androidx.work.c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final androidx.work.c.a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ly5/q1$b$c;", "Ly5/q1$b;", "", "reason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final int reason;

            public c(int i10) {
                super(null);
                this.reason = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35688t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Ly5/q1$b;", "<anonymous>", "(Lku/p0;)Ly5/q1$b;"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super b>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35690t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q1 f35691u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f35691u = q1Var;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f35691u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f35690t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                q1 q1Var = this.f35691u;
                this.f35690t = 1;
                Object objX = q1Var.x(this);
                return objX == objE ? objE : objX;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super b> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        public static final Boolean r(b bVar, q1 q1Var) {
            boolean zW;
            if (bVar instanceof b.C0654b) {
                zW = q1Var.t(((b.C0654b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                zW = q1Var.s(((b.a) bVar).getResult());
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new jt.l();
                }
                zW = q1Var.w(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(zW);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return q1.this.new c(bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            final b aVar;
            Object objE = ot.c.e();
            int i10 = this.f35688t;
            int i11 = 1;
            androidx.work.c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    ku.a0 a0Var = q1.this.workerJob;
                    a aVar3 = new a(q1.this, null);
                    this.f35688t = 1;
                    obj = ku.i.g(a0Var, aVar3, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                aVar = (b) obj;
            } catch (h1 e10) {
                aVar = new b.c(e10.getReason());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                x5.w.e().d(s1.f35714a, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = q1.this.workDatabase;
            final q1 q1Var = q1.this;
            Object objP = workDatabase.P(new Callable() { // from class: y5.r1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return q1.c.r(aVar, q1Var);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objP, "runInTransaction(...)");
            return objP;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Boolean> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {296}, m = "runWorker")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35692t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35693u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35695w;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35693u = obj;
            this.f35695w |= Integer.MIN_VALUE;
            return q1.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {297, HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<ku.p0, nt.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35696t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f35698v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ x5.l f35699w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.work.c cVar, x5.l lVar, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f35698v = cVar;
            this.f35699w = lVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return q1.this.new e(this.f35698v, this.f35699w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e eVar;
            Object objE = ot.c.e();
            int i10 = this.f35696t;
            if (i10 == 0) {
                jt.o.b(obj);
                Context context = q1.this.appContext;
                f6.j0 workSpec = q1.this.getWorkSpec();
                androidx.work.c cVar = this.f35698v;
                x5.l lVar = this.f35699w;
                h6.b bVar = q1.this.workTaskExecutor;
                this.f35696t = 1;
                eVar = this;
                if (g6.c0.b(context, workSpec, cVar, lVar, bVar, eVar) != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            eVar = this;
            String str = s1.f35714a;
            q1 q1Var = q1.this;
            x5.w.e().a(str, "Starting work for " + q1Var.getWorkSpec().workerClassName);
            me.x<androidx.work.c.a> xVarStartWork = eVar.f35698v.startWork();
            Intrinsics.checkNotNullExpressionValue(xVarStartWork, "startWork(...)");
            androidx.work.c cVar2 = eVar.f35698v;
            eVar.f35696t = 2;
            Object objD = s1.d(xVarStartWork, cVar2, this);
            return objD == objE ? objE : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super androidx.work.c.a> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public q1(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        f6.j0 workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        androidx.work.a configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.c0();
        this.dependencyDao = workDatabase.X();
        List<String> listF = builder.f();
        this.tags = listF;
        this.workDescription = l(listF);
        this.workerJob = h2.b(null, 1, null);
    }

    public static final Boolean D(q1 q1Var) {
        boolean z10;
        if (q1Var.workSpecDao.j(q1Var.workSpecId) == x5.o0.c.ENQUEUED) {
            q1Var.workSpecDao.c(x5.o0.c.RUNNING, q1Var.workSpecId);
            q1Var.workSpecDao.z(q1Var.workSpecId);
            q1Var.workSpecDao.e(q1Var.workSpecId, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final Boolean y(q1 q1Var) {
        f6.j0 j0Var = q1Var.workSpec;
        if (j0Var.state != x5.o0.c.ENQUEUED) {
            String str = s1.f35714a;
            x5.w.e().a(str, q1Var.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!j0Var.o() && !q1Var.workSpec.n()) || q1Var.clock.a() >= q1Var.workSpec.c()) {
            return Boolean.FALSE;
        }
        x5.w.e().a(s1.f35714a, "Delaying execution for " + q1Var.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    public static final Unit z(androidx.work.c cVar, boolean z10, String str, q1 q1Var, Throwable th2) {
        if (th2 instanceof h1) {
            cVar.stop(((h1) th2).getReason());
        }
        if (z10 && str != null) {
            q1Var.configuration.getTracer().b(str, q1Var.workSpec.hashCode());
        }
        return Unit.f22483a;
    }

    public final boolean A(@NotNull androidx.work.c.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        q(this.workSpecId);
        androidx.work.b bVarE = ((androidx.work.c.a.C0065a) result).e();
        Intrinsics.checkNotNullExpressionValue(bVarE, "getOutputData(...)");
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.u(this.workSpecId, bVarE);
        return false;
    }

    public final boolean B(androidx.work.c.a result) {
        this.workSpecDao.c(x5.o0.c.SUCCEEDED, this.workSpecId);
        Intrinsics.d(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.b bVarE = ((androidx.work.c.a.C0066c) result).e();
        Intrinsics.checkNotNullExpressionValue(bVarE, "getOutputData(...)");
        this.workSpecDao.u(this.workSpecId, bVarE);
        long jA = this.clock.a();
        for (String str : this.dependencyDao.a(this.workSpecId)) {
            if (this.workSpecDao.j(str) == x5.o0.c.BLOCKED && this.dependencyDao.b(str)) {
                String str2 = s1.f35714a;
                x5.w.e().f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.c(x5.o0.c.ENQUEUED, str);
                this.workSpecDao.v(str, jA);
            }
        }
        return false;
    }

    public final boolean C() {
        Object objP = this.workDatabase.P(new Callable() { // from class: y5.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q1.D(this.f35660a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objP, "runInTransaction(...)");
        return ((Boolean) objP).booleanValue();
    }

    public final String l(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.m0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    @NotNull
    public final WorkGenerationalId m() {
        return f6.o1.a(this.workSpec);
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final f6.j0 getWorkSpec() {
        return this.workSpec;
    }

    public final boolean o(androidx.work.c.a result) {
        if (result instanceof androidx.work.c.a.C0066c) {
            String str = s1.f35714a;
            x5.w.e().f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.o() ? v() : B(result);
        }
        if (result instanceof androidx.work.c.a.b) {
            String str2 = s1.f35714a;
            x5.w.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return u(-256);
        }
        String str3 = s1.f35714a;
        x5.w.e().f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            return v();
        }
        if (result == null) {
            result = new androidx.work.c.a.C0065a();
        }
        return A(result);
    }

    public final void p(int stopReason) {
        this.workerJob.c(new h1(stopReason));
    }

    public final void q(String workSpecId) {
        List listP = kotlin.collections.p.p(workSpecId);
        while (!listP.isEmpty()) {
            String str = (String) kotlin.collections.u.H(listP);
            if (this.workSpecDao.j(str) != x5.o0.c.CANCELLED) {
                this.workSpecDao.c(x5.o0.c.FAILED, str);
            }
            listP.addAll(this.dependencyDao.a(str));
        }
    }

    @NotNull
    public final me.x<Boolean> r() {
        return x5.u.k(this.workTaskExecutor.b().plus(h2.b(null, 1, null)), null, new c(null), 2, null);
    }

    public final boolean s(androidx.work.c.a result) {
        String str = s1.f35714a;
        x5.w.e().f(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.o()) {
            v();
            return false;
        }
        A(result);
        return false;
    }

    public final boolean t(androidx.work.c.a result) {
        x5.o0.c cVarJ = this.workSpecDao.j(this.workSpecId);
        this.workDatabase.b0().a(this.workSpecId);
        if (cVarJ == null) {
            return false;
        }
        if (cVarJ == x5.o0.c.RUNNING) {
            return o(result);
        }
        if (cVarJ.b()) {
            return false;
        }
        return u(-512);
    }

    public final boolean u(int stopReason) {
        this.workSpecDao.c(x5.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.v(this.workSpecId, this.clock.a());
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.q(this.workSpecId, -1L);
        this.workSpecDao.e(this.workSpecId, stopReason);
        return true;
    }

    public final boolean v() {
        this.workSpecDao.v(this.workSpecId, this.clock.a());
        this.workSpecDao.c(x5.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.y(this.workSpecId);
        this.workSpecDao.B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.b(this.workSpecId);
        this.workSpecDao.q(this.workSpecId, -1L);
        return false;
    }

    public final boolean w(int stopReason) {
        if (Intrinsics.c(this.workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            String str = s1.f35714a;
            x5.w.e().a(str, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            u(stopReason);
            return true;
        }
        x5.o0.c cVarJ = this.workSpecDao.j(this.workSpecId);
        if (cVarJ == null || cVarJ.b()) {
            String str2 = s1.f35714a;
            x5.w.e().a(str2, "Status for " + this.workSpecId + " is " + cVarJ + " ; not doing any work");
            return false;
        }
        String str3 = s1.f35714a;
        x5.w.e().a(str3, "Status for " + this.workSpecId + " is " + cVarJ + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.c(x5.o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.e(this.workSpecId, stopReason);
        this.workSpecDao.q(this.workSpecId, -1L);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0216  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(nt.b<? super b> bVar) {
        d dVar;
        androidx.work.b bVarA;
        WorkerParameters workerParameters;
        x2.a<x5.t0> aVarP;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f35695w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f35695w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objG = dVar.f35693u;
        Object objE = ot.c.e();
        int i11 = dVar.f35695w;
        int i12 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            if (i11 == 0) {
                jt.o.b(objG);
                final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
                final String traceTag = this.workSpec.getTraceTag();
                if (zIsEnabled && traceTag != null) {
                    this.configuration.getTracer().c(traceTag, this.workSpec.hashCode());
                }
                int i13 = 0;
                if (((Boolean) this.workDatabase.P(new Callable() { // from class: y5.n1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return q1.y(this.f35652a);
                    }
                })).booleanValue()) {
                    return new b.c(i13, i12, defaultConstructorMarker);
                }
                if (this.workSpec.o()) {
                    bVarA = this.workSpec.input;
                } else {
                    x5.m mVarB = this.configuration.getInputMergerFactory().b(this.workSpec.inputMergerClassName);
                    if (mVarB == null) {
                        String str = s1.f35714a;
                        x5.w.e().c(str, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                        return new b.a(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
                    }
                    bVarA = mVarB.a(CollectionsKt.w0(kotlin.collections.o.d(this.workSpec.input), this.workSpecDao.n(this.workSpecId)));
                }
                androidx.work.b bVar2 = bVarA;
                UUID uuidFromString = UUID.fromString(this.workSpecId);
                List<String> list = this.tags;
                WorkerParameters.a aVar = this.runtimeExtras;
                f6.j0 j0Var = this.workSpec;
                WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, bVar2, list, aVar, j0Var.runAttemptCount, j0Var.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new g6.g0(this.workDatabase, this.workTaskExecutor), new g6.e0(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
                final androidx.work.c cVarB = this.builderWorker;
                if (cVarB == null) {
                    try {
                        cVarB = this.configuration.getWorkerFactory().b(this.appContext, this.workSpec.workerClassName, workerParameters2);
                    } catch (Throwable th2) {
                        String str2 = s1.f35714a;
                        x5.w.e().c(str2, "Could not create Worker " + this.workSpec.workerClassName);
                        x2.a<x5.t0> aVarR = this.configuration.r();
                        if (aVarR != null) {
                            g6.h0.a(aVarR, new x5.t0(this.workSpec.workerClassName, workerParameters2, th2), s1.f35714a);
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                }
                cVarB.setUsed();
                CoroutineContext.Element element = dVar.getContext().get(d2.INSTANCE);
                Intrinsics.checkNotNull(element);
                d2 d2Var = (d2) element;
                d2Var.q(new Function1() { // from class: y5.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q1.z(cVarB, zIsEnabled, traceTag, this, (Throwable) obj);
                    }
                });
                if (!C()) {
                    return new b.c(0, 1, null);
                }
                int i14 = 0;
                int i15 = 1;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (d2Var.isCancelled()) {
                    return new b.c(i14, i15, defaultConstructorMarker2);
                }
                x5.l lVarB = workerParameters2.b();
                Intrinsics.checkNotNullExpressionValue(lVarB, "getForegroundUpdater(...)");
                Executor executorA = this.workTaskExecutor.a();
                Intrinsics.checkNotNullExpressionValue(executorA, "getMainThreadExecutor(...)");
                ku.l0 l0VarB = v1.b(executorA);
                try {
                    e eVar = new e(cVarB, lVarB, null);
                    dVar.f35692t = workerParameters2;
                    dVar.f35695w = 1;
                    objG = ku.i.g(l0VarB, eVar, dVar);
                    if (objG == objE) {
                        return objE;
                    }
                    workerParameters = workerParameters2;
                } catch (Throwable th3) {
                    th = th3;
                    workerParameters = workerParameters2;
                    String str3 = s1.f35714a;
                    x5.w.e().d(str3, this.workDescription + " failed because it threw an exception/error", th);
                    aVarP = this.configuration.p();
                    if (aVarP != null) {
                        g6.h0.a(aVarP, new x5.t0(this.workSpec.workerClassName, workerParameters, th), s1.f35714a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workerParameters = (WorkerParameters) dVar.f35692t;
                try {
                    jt.o.b(objG);
                } catch (Throwable th4) {
                    th = th4;
                    String str4 = s1.f35714a;
                    x5.w.e().d(str4, this.workDescription + " failed because it threw an exception/error", th);
                    aVarP = this.configuration.p();
                    if (aVarP != null) {
                        g6.h0.a(aVarP, new x5.t0(this.workSpec.workerClassName, workerParameters, th), s1.f35714a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            androidx.work.c.a aVar2 = (androidx.work.c.a) objG;
            Intrinsics.checkNotNull(aVar2);
            return new b.C0654b(aVar2);
        } catch (CancellationException e10) {
            String str5 = s1.f35714a;
            x5.w.e().g(str5, this.workDescription + " was cancelled", e10);
            throw e10;
        }
    }
}
