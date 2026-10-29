package zo;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yn.DeviceMetrics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lzo/f;", "", "Lyn/d;", "collector", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "apiHelper", "Lku/l0;", "dispatcher", "<init>", "(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)V", "", "sessionToken", "", "a", "(Ljava/lang/String;)V", "c", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "()V", "Lyn/d;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "Lku/l0;", "Lku/p0;", "d", "Lku/p0;", "scope", "", "e", "Z", "hasSent", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.d collector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.network.e apiHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.l0 dispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean hasSent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator$collectAndSend$1", f = "DeviceMetricsOrchestrator.kt", l = {44}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37867t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37869v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f37869v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return f.this.new a(this.f37869v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37867t;
            if (i10 == 0) {
                jt.o.b(obj);
                f fVar = f.this;
                String str = this.f37869v;
                this.f37867t = 1;
                if (fVar.c(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator", f = "DeviceMetricsOrchestrator.kt", l = {52}, m = "perform")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37870t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37871u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37872v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37874x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37872v = obj;
            this.f37874x |= Integer.MIN_VALUE;
            return f.this.c(null, this);
        }
    }

    public f(@NotNull yn.d collector, @NotNull com.withpersona.sdk2.inquiry.internal.network.e apiHelper, @NotNull ku.l0 dispatcher) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.collector = collector;
        this.apiHelper = apiHelper;
        this.dispatcher = dispatcher;
        this.scope = q0.a(dispatcher.plus(z2.b(null, 1, null)));
    }

    public final void a(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        if (this.hasSent) {
            return;
        }
        this.hasSent = true;
        ku.k.d(this.scope, null, null, new a(sessionToken, null), 3, null);
    }

    public final void b() {
        q0.f(this.scope, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull String str, @NotNull nt.b<? super Unit> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f37874x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f37874x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objS = bVar2.f37872v;
        Object objE = ot.c.e();
        int i11 = bVar2.f37874x;
        try {
            if (i11 == 0) {
                jt.o.b(objS);
                DeviceMetrics deviceMetricsA = this.collector.a();
                com.withpersona.sdk2.inquiry.internal.network.e eVar = this.apiHelper;
                bVar2.f37870t = pt.l.a(str);
                bVar2.f37871u = pt.l.a(deviceMetricsA);
                bVar2.f37874x = 1;
                objS = eVar.s(str, deviceMetricsA, bVar2);
                if (objS == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(objS);
            }
            com.withpersona.sdk2.inquiry.internal.network.i iVar = (com.withpersona.sdk2.inquiry.internal.network.i) objS;
            if (!(iVar instanceof com.withpersona.sdk2.inquiry.internal.network.i.b) && !(iVar instanceof com.withpersona.sdk2.inquiry.internal.network.i.Error)) {
                throw new jt.l();
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return Unit.f22483a;
    }
}
