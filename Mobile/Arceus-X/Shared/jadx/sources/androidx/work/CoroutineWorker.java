package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7870h2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.C12708k;
import p536x5.C12728u;
import p563y1.C12999e;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m31665d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lne/x;", "Landroidx/work/c$a;", "startWork", "()Lne/x;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Lx5/k;", "getForegroundInfo", "Landroidx/work/b;", "data", "", "setProgress", "(Landroidx/work/b;Lnt/b;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lx5/k;Lnt/b;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lku/l0;", "coroutineContext", "Lku/l0;", "getCoroutineContext", "()Lku/l0;", "getCoroutineContext$annotations", "a", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class CoroutineWorker extends AbstractC1117c {

    @NotNull
    private final AbstractC7888l0 coroutineContext;

    @NotNull
    private final WorkerParameters params;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Landroidx/work/CoroutineWorker$a;", "Lku/l0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "H", "(Lkotlin/coroutines/CoroutineContext;)Z", "d", "Lku/l0;", "getDispatcher", "()Lku/l0;", "dispatcher", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class C1111a extends AbstractC7888l0 {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final C1111a f4516c = new C1111a();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public static final AbstractC7888l0 dispatcher = C7864g1.m32643a();

        @Override // p256ku.AbstractC7888l0
        /* JADX INFO: renamed from: H */
        public boolean mo6245H(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dispatcher.mo6245H(context);
        }

        @Override // p256ku.AbstractC7888l0
        /* JADX INFO: renamed from: w */
        public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            dispatcher.mo6246w(context, block);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx5/k;", "<anonymous>", "(Lku/p0;)Lx5/k;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m39664f = "CoroutineWorker.kt", m39665l = {121}, m39666m = "invokeSuspend")
    public static final class C1112b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C12708k>, Object> {

        /* JADX INFO: renamed from: t */
        public int f4518t;

        public C1112b(InterfaceC9557b<? super C1112b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return CoroutineWorker.this.new C1112b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f4518t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f4518t = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == objM38805e ? objM38805e : foregroundInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C12708k> interfaceC9557b) {
            return ((C1112b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.work.CoroutineWorker$startWork$1", m39664f = "CoroutineWorker.kt", m39665l = {67}, m39666m = "invokeSuspend")
    public static final class C1113c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: t */
        public int f4520t;

        public C1113c(InterfaceC9557b<? super C1113c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return CoroutineWorker.this.new C1113c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f4520t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f4520t = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == objM38805e ? objM38805e : objDoWork;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C1113c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.coroutineContext = C1111a.f4516c;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC9557b<? super C12708k> interfaceC9557b) {
        throw new IllegalStateException("Not implemented");
    }

    @Nullable
    public abstract Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b);

    @NotNull
    public AbstractC7888l0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull InterfaceC9557b<? super C12708k> interfaceC9557b) {
        return getForegroundInfo$suspendImpl(this, interfaceC9557b);
    }

    @Override // androidx.work.AbstractC1117c
    @NotNull
    public final InterfaceFutureC9440x<C12708k> getForegroundInfoAsync() {
        return C12728u.m47434k(getCoroutineContext().plus(C7870h2.m32666b(null, 1, null)), null, new C1112b(null), 2, null);
    }

    @Override // androidx.work.AbstractC1117c
    public final void onStopped() {
        super.onStopped();
    }

    @Nullable
    public final Object setForeground(@NotNull C12708k c12708k, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        InterfaceFutureC9440x<Void> foregroundAsync = setForegroundAsync(c12708k);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        Object objM48322b = C12999e.m48322b(foregroundAsync, interfaceC9557b);
        return objM48322b == C10047c.m38805e() ? objM48322b : Unit.f29331a;
    }

    @Nullable
    public final Object setProgress(@NotNull C1116b c1116b, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        InterfaceFutureC9440x<Void> progressAsync = setProgressAsync(c1116b);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(...)");
        Object objM48322b = C12999e.m48322b(progressAsync, interfaceC9557b);
        return objM48322b == C10047c.m38805e() ? objM48322b : Unit.f29331a;
    }

    @Override // androidx.work.AbstractC1117c
    @NotNull
    public final InterfaceFutureC9440x<AbstractC1117c.a> startWork() {
        CoroutineContext coroutineContext = !Intrinsics.m31980c(getCoroutineContext(), C1111a.f4516c) ? getCoroutineContext() : this.params.m6266l();
        Intrinsics.checkNotNull(coroutineContext);
        return C12728u.m47434k(coroutineContext.plus(C7870h2.m32666b(null, 1, null)), null, new C1113c(null), 2, null);
    }
}
