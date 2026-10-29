package p567y5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1115a;
import androidx.work.C1116b;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p095e6.InterfaceC4845a;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.InterfaceC5365b;
import p120f6.InterfaceC5393k0;
import p120f6.WorkGenerationalId;
import p146g6.C6018c0;
import p146g6.C6022e0;
import p146g6.C6026g0;
import p146g6.C6028h0;
import p161h6.InterfaceC6292b;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7870h2;
import p256ku.C7872i;
import p256ku.C7931v1;
import p256ku.InterfaceC7833a0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12712m;
import p536x5.AbstractC12732w;
import p536x5.C12717o0;
import p536x5.C12727t0;
import p536x5.C12728u;
import p536x5.InterfaceC12690b;
import p536x5.InterfaceC12710l;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: y5.q1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002/)B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0012J\u001d\u0010&\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010UR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u0011\u0010_\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\bW\u0010^¨\u0006`"}, m31665d2 = {"Ly5/q1;", "", "Ly5/q1$a;", "builder", "<init>", "(Ly5/q1$a;)V", "Lne/x;", "", "r", "()Lne/x;", "", "stopReason", "", "p", "(I)V", "Landroidx/work/c$a;", "result", "A", "(Landroidx/work/c$a;)Z", "Ly5/q1$b;", "x", "(Lnt/b;)Ljava/lang/Object;", "t", "s", "w", "(I)Z", "o", "C", "()Z", "", "workSpecId", "q", "(Ljava/lang/String;)V", "u", "v", "B", "", "tags", "l", "(Ljava/util/List;)Ljava/lang/String;", "Lf6/j0;", "a", "Lf6/j0;", "n", "()Lf6/j0;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "d", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/c;", "e", "Landroidx/work/c;", "builderWorker", "Lh6/b;", "f", "Lh6/b;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "Lx5/b;", "h", "Lx5/b;", "clock", "Le6/a;", "i", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/k0;", "k", "Lf6/k0;", "workSpecDao", "Lf6/b;", "Lf6/b;", "dependencyDao", "m", "Ljava/util/List;", "workDescription", "Lku/a0;", "Lku/a0;", "workerJob", "Lf6/w;", "()Lf6/w;", "workGenerationalId", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13081q1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C5390j0 workSpec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String workSpecId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters.C1114a runtimeExtras;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final AbstractC1117c builderWorker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6292b workTaskExecutor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C1115a configuration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12690b clock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4845a foregroundProcessor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final WorkDatabase workDatabase;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5393k0 workSpecDao;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5365b dependencyDao;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String workDescription;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7833a0 workerJob;

    /* JADX INFO: renamed from: y5.q1$a */
    @Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, m31665d2 = {"Ly5/q1$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lh6/b;", "workTaskExecutor", "Le6/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lf6/j0;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Le6/a;Landroidx/work/impl/WorkDatabase;Lf6/j0;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)Ly5/q1$a;", "Ly5/q1;", "a", "()Ly5/q1;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "Lh6/b;", "i", "()Lh6/b;", "Le6/a;", "d", "()Le6/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Lf6/j0;", "h", "()Lf6/j0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/c;", "Landroidx/work/c;", "j", "()Landroidx/work/c;", "setWorker", "(Landroidx/work/c;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C1115a configuration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC6292b workTaskExecutor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC4845a foregroundProcessor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final WorkDatabase workDatabase;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final C5390j0 workSpec;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<String> tags;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context appContext;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public AbstractC1117c worker;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public WorkerParameters.C1114a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public a(@NotNull Context context, @NotNull C1115a configuration, @NotNull InterfaceC6292b workTaskExecutor, @NotNull InterfaceC4845a foregroundProcessor, @NotNull WorkDatabase workDatabase, @NotNull C5390j0 workSpec, @NotNull List<String> tags) {
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
            this.runtimeExtras = new WorkerParameters.C1114a();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C13081q1 m48643a() {
            return new C13081q1(this);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1115a getConfiguration() {
            return this.configuration;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC4845a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final WorkerParameters.C1114a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<String> m48648f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final C5390j0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final InterfaceC6292b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final AbstractC1117c getWorker() {
            return this.worker;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final a m48653k(@Nullable WorkerParameters.C1114a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: y5.q1$b */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Ly5/q1$b;", "", "<init>", "()V", "c", "a", "b", "Ly5/q1$b$a;", "Ly5/q1$b$b;", "Ly5/q1$b$c;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: y5.q1$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/q1$b$a;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC1117c.a result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull AbstractC1117c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC1117c.a getResult() {
                return this.result;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
              (wrap androidx.work.c$a:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap androidx.work.c$a:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: androidx.work.c.a.a.<init>():void type: CONSTRUCTOR) : (r1v0 androidx.work.c$a))
             A[MD:(androidx.work.c$a):void (m)] (LINE:2) call: y5.q1.b.a.<init>(androidx.work.c$a):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public /* synthetic */ a(AbstractC1117c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new AbstractC1117c.a.C14089a() : aVar);
            }
        }

        /* JADX INFO: renamed from: y5.q1$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/q1$b$b;", "Ly5/q1$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class C14286b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final AbstractC1117c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14286b(@NotNull AbstractC1117c.a result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC1117c.a getResult() {
                return this.result;
            }
        }

        /* JADX INFO: renamed from: y5.q1$b$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/q1$b$c;", "Ly5/q1$b;", "", "reason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final int reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public c(int i10) {
                super(null);
                this.reason = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
              (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap int:0x0004: SGET  A[WRAPPED] androidx.core.view.InputDeviceCompat.SOURCE_ANY int) : (r1v0 int))
             A[MD:(int):void (m)] (LINE:2) call: y5.q1.b.c.<init>(int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? InputDeviceCompat.SOURCE_ANY : i10);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: y5.q1.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: y5.q1$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.WorkerWrapper$launch$1", m39664f = "WorkerWrapper.kt", m39665l = {98}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46279t;

        /* JADX INFO: renamed from: y5.q1$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Ly5/q1$b;", "<anonymous>", "(Lku/p0;)Ly5/q1$b;"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", m39664f = "WorkerWrapper.kt", m39665l = {98}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super b>, Object> {

            /* JADX INFO: renamed from: t */
            public int f46281t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C13081q1 f46282u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C13081q1 c13081q1, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f46282u = c13081q1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f46282u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f46281t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                C13081q1 c13081q1 = this.f46282u;
                this.f46281t = 1;
                Object objM48642x = c13081q1.m48642x(this);
                return objM48642x == objM38805e ? objM38805e : objM48642x;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super b> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        /* JADX INFO: renamed from: r */
        public static final Boolean m48658r(b bVar, C13081q1 c13081q1) {
            boolean zM48641w;
            if (bVar instanceof b.C14286b) {
                zM48641w = c13081q1.m48638t(((b.C14286b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                zM48641w = c13081q1.m48637s(((b.a) bVar).getResult());
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new C7345l();
                }
                zM48641w = c13081q1.m48641w(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(zM48641w);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13081q1.this.new c(interfaceC9557b);
        }

        /* JADX DEBUG: Class process forced to load method for inline: y5.s1.a():java.lang.String */
        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            final b aVar;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46279t;
            int i11 = 1;
            AbstractC1117c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC7833a0 interfaceC7833a0 = C13081q1.this.workerJob;
                    a aVar3 = new a(C13081q1.this, null);
                    this.f46279t = 1;
                    obj = C7872i.m32684g(interfaceC7833a0, aVar3, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                aVar = (b) obj;
            } catch (C13054h1 e10) {
                aVar = new b.c(e10.getReason());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                AbstractC12732w.m47441e().mo47447d(C13087s1.f46308a, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = C13081q1.this.workDatabase;
            final C13081q1 c13081q1 = C13081q1.this;
            Object objM47264P = workDatabase.m47264P(new Callable() { // from class: y5.r1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C13081q1.c.m48658r(aVar, c13081q1);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objM47264P, "runInTransaction(...)");
            return objM47264P;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: y5.q1$d */
    @InterfaceC10344f(m39663c = "androidx.work.impl.WorkerWrapper", m39664f = "WorkerWrapper.kt", m39665l = {296}, m39666m = "runWorker")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f46283t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f46284u;

        /* JADX INFO: renamed from: w */
        public int f46286w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46284u = obj;
            this.f46286w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13081q1.this.m48642x(this);
        }
    }

    /* JADX INFO: renamed from: y5.q1$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", m39664f = "WorkerWrapper.kt", m39665l = {297, HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46287t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC1117c f46289v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC12710l f46290w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC1117c abstractC1117c, InterfaceC12710l interfaceC12710l, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f46289v = abstractC1117c;
            this.f46290w = interfaceC12710l;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13081q1.this.new e(this.f46289v, this.f46290w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e eVar;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46287t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Context context = C13081q1.this.appContext;
                C5390j0 workSpec = C13081q1.this.getWorkSpec();
                AbstractC1117c abstractC1117c = this.f46289v;
                InterfaceC12710l interfaceC12710l = this.f46290w;
                InterfaceC6292b interfaceC6292b = C13081q1.this.workTaskExecutor;
                this.f46287t = 1;
                eVar = this;
                if (C6018c0.m26799b(context, workSpec, abstractC1117c, interfaceC12710l, interfaceC6292b, eVar) != objM38805e) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            eVar = this;
            String str = C13087s1.f46308a;
            C13081q1 c13081q1 = C13081q1.this;
            AbstractC12732w.m47441e().mo47444a(str, "Starting work for " + c13081q1.getWorkSpec().workerClassName);
            InterfaceFutureC9440x<AbstractC1117c.a> interfaceFutureC9440xStartWork = eVar.f46289v.startWork();
            Intrinsics.checkNotNullExpressionValue(interfaceFutureC9440xStartWork, "startWork(...)");
            AbstractC1117c abstractC1117c2 = eVar.f46289v;
            eVar.f46287t = 2;
            Object objM48680d = C13087s1.m48680d(interfaceFutureC9440xStartWork, abstractC1117c2, this);
            return objM48680d == objM38805e ? objM38805e : objM48680d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C13081q1(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        C5390j0 workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        C1115a configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.mo6350c0();
        this.dependencyDao = workDatabase.mo6345X();
        List<String> listM48648f = builder.m48648f();
        this.tags = listM48648f;
        this.workDescription = m48630l(listM48648f);
        this.workerJob = C7870h2.m32666b(null, 1, null);
    }

    /* JADX INFO: renamed from: D */
    public static final Boolean m48613D(C13081q1 c13081q1) {
        boolean z10;
        if (c13081q1.workSpecDao.mo24786j(c13081q1.workSpecId) == C12717o0.c.ENQUEUED) {
            c13081q1.workSpecDao.mo24779c(C12717o0.c.RUNNING, c13081q1.workSpecId);
            c13081q1.workSpecDao.mo24802z(c13081q1.workSpecId);
            c13081q1.workSpecDao.mo24781e(c13081q1.workSpecId, InputDeviceCompat.SOURCE_ANY);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: y */
    public static final Boolean m48625y(C13081q1 c13081q1) {
        C5390j0 c5390j0 = c13081q1.workSpec;
        if (c5390j0.state != C12717o0.c.ENQUEUED) {
            String str = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47444a(str, c13081q1.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!c5390j0.m24762o() && !c13081q1.workSpec.m24761n()) || c13081q1.clock.mo47323a() >= c13081q1.workSpec.m24751c()) {
            return Boolean.FALSE;
        }
        AbstractC12732w.m47441e().mo47444a(C13087s1.f46308a, "Delaying execution for " + c13081q1.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m48626z(AbstractC1117c abstractC1117c, boolean z10, String str, C13081q1 c13081q1, Throwable th2) {
        if (th2 instanceof C13054h1) {
            abstractC1117c.stop(((C13054h1) th2).getReason());
        }
        if (z10 && str != null) {
            c13081q1.configuration.getTracer().mo47331b(str, c13081q1.workSpec.hashCode());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m48627A(@NotNull AbstractC1117c.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        m48635q(this.workSpecId);
        C1116b c1116bM6343e = ((AbstractC1117c.a.C14089a) result).m6343e();
        Intrinsics.checkNotNullExpressionValue(c1116bM6343e, "getOutputData(...)");
        this.workSpecDao.mo24776B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo24797u(this.workSpecId, c1116bM6343e);
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m48628B(AbstractC1117c.a result) {
        this.workSpecDao.mo24779c(C12717o0.c.SUCCEEDED, this.workSpecId);
        Intrinsics.m31981d(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        C1116b c1116bM6344e = ((AbstractC1117c.a.c) result).m6344e();
        Intrinsics.checkNotNullExpressionValue(c1116bM6344e, "getOutputData(...)");
        this.workSpecDao.mo24797u(this.workSpecId, c1116bM6344e);
        long jMo47323a = this.clock.mo47323a();
        for (String str : this.dependencyDao.mo24709a(this.workSpecId)) {
            if (this.workSpecDao.mo24786j(str) == C12717o0.c.BLOCKED && this.dependencyDao.mo24710b(str)) {
                String str2 = C13087s1.f46308a;
                AbstractC12732w.m47441e().mo47448f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.mo24779c(C12717o0.c.ENQUEUED, str);
                this.workSpecDao.mo24798v(str, jMo47323a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m48629C() {
        Object objM47264P = this.workDatabase.m47264P(new Callable() { // from class: y5.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C13081q1.m48613D(this.f46248a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objM47264P, "runInTransaction(...)");
        return ((Boolean) objM47264P).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final String m48630l(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.m31715m0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final WorkGenerationalId m48631m() {
        return C5406o1.m24872a(this.workSpec);
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C5390j0 getWorkSpec() {
        return this.workSpec;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m48633o(AbstractC1117c.a result) {
        if (result instanceof AbstractC1117c.a.c) {
            String str = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47448f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.m24762o() ? m48640v() : m48628B(result);
        }
        if (result instanceof AbstractC1117c.a.b) {
            String str2 = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47448f(str2, "Worker result RETRY for " + this.workDescription);
            return m48639u(InputDeviceCompat.SOURCE_ANY);
        }
        String str3 = C13087s1.f46308a;
        AbstractC12732w.m47441e().mo47448f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.m24762o()) {
            return m48640v();
        }
        if (result == null) {
            result = new AbstractC1117c.a.C14089a();
        }
        return m48627A(result);
    }

    /* JADX INFO: renamed from: p */
    public final void m48634p(int stopReason) {
        this.workerJob.mo32597c(new C13054h1(stopReason));
    }

    /* JADX INFO: renamed from: q */
    public final void m48635q(String workSpecId) {
        List listM31897p = C7699p.m31897p(workSpecId);
        while (!listM31897p.isEmpty()) {
            String str = (String) C7708u.m31927H(listM31897p);
            if (this.workSpecDao.mo24786j(str) != C12717o0.c.CANCELLED) {
                this.workSpecDao.mo24779c(C12717o0.c.FAILED, str);
            }
            listM31897p.addAll(this.dependencyDao.mo24709a(str));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: x5.u.k(kotlin.coroutines.CoroutineContext, ku.r0, kotlin.jvm.functions.Function2, int, java.lang.Object):ne.x */
    @NotNull
    /* JADX INFO: renamed from: r */
    public final InterfaceFutureC9440x<Boolean> m48636r() {
        return C12728u.m47434k(this.workTaskExecutor.mo27571b().plus(C7870h2.m32666b(null, 1, null)), null, new c(null), 2, null);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m48637s(AbstractC1117c.a result) {
        String str = C13087s1.f46308a;
        AbstractC12732w.m47441e().mo47448f(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.m24762o()) {
            m48640v();
            return false;
        }
        m48627A(result);
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m48638t(AbstractC1117c.a result) {
        C12717o0.c cVarMo24786j = this.workSpecDao.mo24786j(this.workSpecId);
        this.workDatabase.mo6349b0().mo24723a(this.workSpecId);
        if (cVarMo24786j == null) {
            return false;
        }
        if (cVarMo24786j == C12717o0.c.RUNNING) {
            return m48633o(result);
        }
        if (cVarMo24786j.m47391b()) {
            return false;
        }
        return m48639u(-512);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m48639u(int stopReason) {
        this.workSpecDao.mo24779c(C12717o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo24798v(this.workSpecId, this.clock.mo47323a());
        this.workSpecDao.mo24776B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo24793q(this.workSpecId, -1L);
        this.workSpecDao.mo24781e(this.workSpecId, stopReason);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m48640v() {
        this.workSpecDao.mo24798v(this.workSpecId, this.clock.mo47323a());
        this.workSpecDao.mo24779c(C12717o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo24801y(this.workSpecId);
        this.workSpecDao.mo24776B(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.mo24778b(this.workSpecId);
        this.workSpecDao.mo24793q(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m48641w(int stopReason) {
        if (Intrinsics.m31980c(this.workSpec.getBackOffOnSystemInterruptions(), Boolean.TRUE)) {
            String str = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47444a(str, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            m48639u(stopReason);
            return true;
        }
        C12717o0.c cVarMo24786j = this.workSpecDao.mo24786j(this.workSpecId);
        if (cVarMo24786j == null || cVarMo24786j.m47391b()) {
            String str2 = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47444a(str2, "Status for " + this.workSpecId + " is " + cVarMo24786j + " ; not doing any work");
            return false;
        }
        String str3 = C13087s1.f46308a;
        AbstractC12732w.m47441e().mo47444a(str3, "Status for " + this.workSpecId + " is " + cVarMo24786j + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.mo24779c(C12717o0.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.mo24781e(this.workSpecId, stopReason);
        this.workSpecDao.mo24793q(this.workSpecId, -1L);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: java.lang.Object[] */
    /* JADX WARN: Code duplicated, block: B:66:0x0216  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final Object m48642x(InterfaceC9557b<? super b> interfaceC9557b) {
        d dVar;
        C1116b c1116bMo6247a;
        WorkerParameters workerParameters;
        InterfaceC12631a<C12727t0> interfaceC12631aM6283p;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f46286w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f46286w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objM32684g = dVar.f46284u;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f46286w;
        int i12 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM32684g);
                final boolean zIsEnabled = this.configuration.getTracer().isEnabled();
                final String traceTag = this.workSpec.getTraceTag();
                if (zIsEnabled && traceTag != null) {
                    this.configuration.getTracer().mo47332c(traceTag, this.workSpec.hashCode());
                }
                int i13 = 0;
                if (((Boolean) this.workDatabase.m47264P(new Callable() { // from class: y5.n1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C13081q1.m48625y(this.f46238a);
                    }
                })).booleanValue()) {
                    return new b.c(i13, i12, defaultConstructorMarker);
                }
                if (this.workSpec.m24762o()) {
                    c1116bMo6247a = this.workSpec.input;
                } else {
                    AbstractC12712m abstractC12712mM47388b = this.configuration.getInputMergerFactory().m47388b(this.workSpec.inputMergerClassName);
                    if (abstractC12712mM47388b == null) {
                        String str = C13087s1.f46308a;
                        AbstractC12732w.m47441e().mo47446c(str, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                        return new b.a(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
                    }
                    c1116bMo6247a = abstractC12712mM47388b.mo6247a(CollectionsKt.m31725w0(C7697o.m31878d(this.workSpec.input), this.workSpecDao.mo24790n(this.workSpecId)));
                }
                C1116b c1116b = c1116bMo6247a;
                UUID uuidFromString = UUID.fromString(this.workSpecId);
                List<String> list = this.tags;
                WorkerParameters.C1114a c1114a = this.runtimeExtras;
                C5390j0 c5390j0 = this.workSpec;
                WorkerParameters workerParameters2 = new WorkerParameters(uuidFromString, c1116b, list, c1114a, c5390j0.runAttemptCount, c5390j0.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new C6026g0(this.workDatabase, this.workTaskExecutor), new C6022e0(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
                final AbstractC1117c abstractC1117cM47439b = this.builderWorker;
                if (abstractC1117cM47439b == null) {
                    try {
                        abstractC1117cM47439b = this.configuration.getWorkerFactory().m47439b(this.appContext, this.workSpec.workerClassName, workerParameters2);
                    } catch (Throwable th2) {
                        String str2 = C13087s1.f46308a;
                        AbstractC12732w.m47441e().mo47446c(str2, "Could not create Worker " + this.workSpec.workerClassName);
                        InterfaceC12631a<C12727t0> interfaceC12631aM6285r = this.configuration.m6285r();
                        if (interfaceC12631aM6285r != null) {
                            C6028h0.m26823a(interfaceC12631aM6285r, new C12727t0(this.workSpec.workerClassName, workerParameters2, th2), C13087s1.f46308a);
                        }
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                }
                abstractC1117cM47439b.setUsed();
                CoroutineContext.Element element = dVar.getContext().get(InterfaceC7850d2.INSTANCE);
                Intrinsics.checkNotNull(element);
                InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) element;
                interfaceC7850d2.mo32601q(new Function1() { // from class: y5.o1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C13081q1.m48626z(abstractC1117cM47439b, zIsEnabled, traceTag, this, (Throwable) obj);
                    }
                });
                if (!m48629C()) {
                    return new b.c(0, 1, null);
                }
                int i14 = 0;
                int i15 = 1;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (interfaceC7850d2.isCancelled()) {
                    return new b.c(i14, i15, defaultConstructorMarker2);
                }
                InterfaceC12710l interfaceC12710lM6256b = workerParameters2.m6256b();
                Intrinsics.checkNotNullExpressionValue(interfaceC12710lM6256b, "getForegroundUpdater(...)");
                Executor executorMo27570a = this.workTaskExecutor.mo27570a();
                Intrinsics.checkNotNullExpressionValue(executorMo27570a, "getMainThreadExecutor(...)");
                AbstractC7888l0 abstractC7888l0M32925b = C7931v1.m32925b(executorMo27570a);
                try {
                    e eVar = new e(abstractC1117cM47439b, interfaceC12710lM6256b, null);
                    dVar.f46283t = workerParameters2;
                    dVar.f46286w = 1;
                    objM32684g = C7872i.m32684g(abstractC7888l0M32925b, eVar, dVar);
                    if (objM32684g == objM38805e) {
                        return objM38805e;
                    }
                    workerParameters = workerParameters2;
                } catch (Throwable th3) {
                    th = th3;
                    workerParameters = workerParameters2;
                    String str3 = C13087s1.f46308a;
                    AbstractC12732w.m47441e().mo47447d(str3, this.workDescription + " failed because it threw an exception/error", th);
                    interfaceC12631aM6283p = this.configuration.m6283p();
                    if (interfaceC12631aM6283p != null) {
                        C6028h0.m26823a(interfaceC12631aM6283p, new C12727t0(this.workSpec.workerClassName, workerParameters, th), C13087s1.f46308a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                workerParameters = (WorkerParameters) dVar.f46283t;
                try {
                    C7348o.m30470b(objM32684g);
                } catch (Throwable th4) {
                    th = th4;
                    String str4 = C13087s1.f46308a;
                    AbstractC12732w.m47441e().mo47447d(str4, this.workDescription + " failed because it threw an exception/error", th);
                    interfaceC12631aM6283p = this.configuration.m6283p();
                    if (interfaceC12631aM6283p != null) {
                        C6028h0.m26823a(interfaceC12631aM6283p, new C12727t0(this.workSpec.workerClassName, workerParameters, th), C13087s1.f46308a);
                    }
                    return new b.a(null, 1, 0 == true ? 1 : 0);
                }
            }
            AbstractC1117c.a aVar = (AbstractC1117c.a) objM32684g;
            Intrinsics.checkNotNull(aVar);
            return new b.C14286b(aVar);
        } catch (CancellationException e10) {
            String str5 = C13087s1.f46308a;
            AbstractC12732w.m47441e().mo47449g(str5, this.workDescription + " was cancelled", e10);
            throw e10;
        }
    }
}
