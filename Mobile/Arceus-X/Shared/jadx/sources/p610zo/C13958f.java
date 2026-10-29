package p610zo;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.network.AbstractC3710i;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p582yn.DeviceMetrics;
import p582yn.InterfaceC13240d;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zo.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Lzo/f;", "", "Lyn/d;", "collector", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "apiHelper", "Lku/l0;", "dispatcher", "<init>", "(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)V", "", "sessionToken", "", "a", "(Ljava/lang/String;)V", "c", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "()V", "Lyn/d;", "Lcom/withpersona/sdk2/inquiry/internal/network/e;", "Lku/l0;", "Lku/p0;", "d", "Lku/p0;", "scope", "", "e", "Z", "hasSent", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13958f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13240d collector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3706e apiHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile boolean hasSent;

    /* JADX INFO: renamed from: zo.f$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator$collectAndSend$1", m39664f = "DeviceMetricsOrchestrator.kt", m39665l = {44}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48756t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f48758v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48758v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13958f.this.new a(this.f48758v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48756t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C13958f c13958f = C13958f.this;
                String str = this.f48758v;
                this.f48756t = 1;
                if (c13958f.m50459c(str, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zo.f$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.DeviceMetricsOrchestrator", m39664f = "DeviceMetricsOrchestrator.kt", m39665l = {52}, m39666m = "perform")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48759t;

        /* JADX INFO: renamed from: u */
        public Object f48760u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48761v;

        /* JADX INFO: renamed from: x */
        public int f48763x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48761v = obj;
            this.f48763x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13958f.this.m50459c(null, this);
        }
    }

    public C13958f(@NotNull InterfaceC13240d collector, @NotNull C3706e apiHelper, @NotNull AbstractC7888l0 dispatcher) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(apiHelper, "apiHelper");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.collector = collector;
        this.apiHelper = apiHelper;
        this.dispatcher = dispatcher;
        this.scope = C7910q0.m32885a(dispatcher.plus(C7948z2.m32943b(null, 1, null)));
    }

    /* JADX INFO: renamed from: a */
    public final void m50457a(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        if (this.hasSent) {
            return;
        }
        this.hasSent = true;
        C7882k.m32780d(this.scope, null, null, new a(sessionToken, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m50458b() {
        C7910q0.m32890f(this.scope, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m50459c(@NotNull String str, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f48763x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f48763x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM18746s = bVar.f48761v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f48763x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM18746s);
                DeviceMetrics deviceMetricsMo48967a = this.collector.mo48967a();
                C3706e c3706e = this.apiHelper;
                bVar.f48759t = C10350l.m39676a(str);
                bVar.f48760u = C10350l.m39676a(deviceMetricsMo48967a);
                bVar.f48763x = 1;
                objM18746s = c3706e.m18746s(str, deviceMetricsMo48967a, bVar);
                if (objM18746s == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM18746s);
            }
            AbstractC3710i abstractC3710i = (AbstractC3710i) objM18746s;
            if (!(abstractC3710i instanceof AbstractC3710i.b) && !(abstractC3710i instanceof AbstractC3710i.Error)) {
                throw new C7345l();
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return Unit.f29331a;
    }
}
