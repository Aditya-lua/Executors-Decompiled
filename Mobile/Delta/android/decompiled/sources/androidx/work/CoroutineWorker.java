package androidx.work;

import android.content.Context;
import gt.o;
import iu.g1;
import iu.h2;
import iu.l0;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne.x;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.k;
import x5.u;
import y1.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lne/x;", "Landroidx/work/c$a;", "startWork", "()Lne/x;", "doWork", "(Llt/b;)Ljava/lang/Object;", "Lx5/k;", "getForegroundInfo", "Landroidx/work/b;", "data", "", "setProgress", "(Landroidx/work/b;Llt/b;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lx5/k;Llt/b;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Liu/l0;", "coroutineContext", "Liu/l0;", "getCoroutineContext", "()Liu/l0;", "getCoroutineContext$annotations", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends androidx.work.c {

    @NotNull
    private final l0 coroutineContext;

    @NotNull
    private final WorkerParameters params;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Liu/l0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "I", "(Lkotlin/coroutines/CoroutineContext;)Z", "d", "Liu/l0;", "getDispatcher", "()Liu/l0;", "dispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f3285c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final l0 dispatcher = g1.a();

        @Override // iu.l0
        public boolean I(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dispatcher.I(context);
        }

        @Override // iu.l0
        public void w(@NotNull CoroutineContext context, @NotNull Runnable block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            dispatcher.w(context, block);
        }
    }

    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {121}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lx5/k;", "<anonymous>", "(Liu/p0;)Lx5/k;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3287t;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return CoroutineWorker.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super k> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f3287t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f3287t = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == objE ? objE : foregroundInfo;
        }
    }

    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Liu/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3289t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return CoroutineWorker.this.new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f3289t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f3289t = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == objE ? objE : objDoWork;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.coroutineContext = a.f3285c;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, lt.b<? super k> bVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull lt.b<? super androidx.work.c.a> bVar);

    @NotNull
    public l0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull lt.b<? super k> bVar) {
        return getForegroundInfo$suspendImpl(this, bVar);
    }

    @Override // androidx.work.c
    @NotNull
    public final x<k> getForegroundInfoAsync() {
        return u.k(getCoroutineContext().plus(h2.b(null, 1, null)), null, new b(null), 2, null);
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
    }

    @Nullable
    public final Object setForeground(@NotNull k kVar, @NotNull lt.b<? super Unit> bVar) throws Throwable {
        x<Void> foregroundAsync = setForegroundAsync(kVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        Object objB = e.b(foregroundAsync, bVar);
        return objB == mt.c.e() ? objB : Unit.f22938a;
    }

    @Nullable
    public final Object setProgress(@NotNull androidx.work.b bVar, @NotNull lt.b<? super Unit> bVar2) throws Throwable {
        x<Void> progressAsync = setProgressAsync(bVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(...)");
        Object objB = e.b(progressAsync, bVar2);
        return objB == mt.c.e() ? objB : Unit.f22938a;
    }

    @Override // androidx.work.c
    @NotNull
    public final x<androidx.work.c.a> startWork() {
        CoroutineContext coroutineContext = !Intrinsics.c(getCoroutineContext(), a.f3285c) ? getCoroutineContext() : this.params.l();
        Intrinsics.checkNotNull(coroutineContext);
        return u.k(coroutineContext.plus(h2.b(null, 1, null)), null, new c(null), 2, null);
    }
}
