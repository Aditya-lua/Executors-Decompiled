package tl;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.m0;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ul.GetQueryInfoError;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u00017BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Ltl/y;", "", "Ltl/d;", "gmaSdkInstaller", "Ltl/a;", "initialController", "Lku/p0;", "scope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function1;", "Lmm/m;", "Ltl/d0;", "showAdEventHandlerFactory", "<init>", "(Ltl/d;Ltl/a;Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", "", "messageName", "F", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "params", "callback", "", "N", "(Lorg/json/JSONObject;Lmm/m;)V", "Q", "(Lorg/json/JSONObject;)V", "M", "phase", "result", "V", "(Ljava/lang/String;Ljava/lang/String;)V", "T", "U", "E", "(Lorg/json/JSONObject;)Ljava/lang/String;", "queryInfo", "Lmm/l;", "G", "(Ljava/lang/String;)Lmm/l;", "", "isAdLoaded", "errorMessage", "J", "(ZLjava/lang/String;)Lmm/l;", "Lkotlin/Function0;", "block", "D", "(Lkotlin/jvm/functions/Function0;)V", "controller", "X", "(Ltl/a;)V", "C", "()V", "a", "Ltl/d;", "b", "Lku/p0;", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Ltl/a;", "gmaSdkController", "f", "Ljava/lang/String;", "protocolName", "Lcom/roblox/universalapp/messagebus/Connection;", "g", "Lcom/roblox/universalapp/messagebus/Connection;", "handleInstallConn", "h", "handleCloseAdConn", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "j", "Ljt/h;", "H", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "k", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tl.d gmaSdkInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<mm.m, d0> showAdEventHandlerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile a gmaSdkController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String protocolName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Connection handleInstallConn;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Connection handleCloseAdConn;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h getQueryInfoResultConfig;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.ads.RewardedAdsProtocol$enqueue$1", f = "RewardedAdsProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31915u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f31915u = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f31915u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31914t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            this.f31915u.invoke();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"tl/y$c", "Ltl/e;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lul/a;", "error", "a", "(Lul/a;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements tl.e {
        public final /* synthetic */ kotlin.jvm.internal.y b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mm.m f31917c;

        public c(kotlin.jvm.internal.y yVar, mm.m mVar) {
            this.b = yVar;
            this.f31917c = mVar;
        }

        public static final Unit d(GetQueryInfoError getQueryInfoError, kotlin.jvm.internal.y yVar, y yVar2, mm.m mVar) {
            gk.p.f("RewardedAdsProtocol", "Error getting query info", getQueryInfoError);
            if (th.h.a().I3() && yVar.f22568a) {
                String message = getQueryInfoError.getMessage();
                if (message == null) {
                    message = "UNKNOWN";
                }
                yVar2.V("terminal", message);
            }
            mVar.a(yVar2.G(null));
            return Unit.f22483a;
        }

        public static final Unit e(kotlin.jvm.internal.y yVar, y yVar2, mm.m mVar, String str) {
            if (th.h.a().I3() && yVar.f22568a) {
                yVar2.V("terminal", "success");
            }
            mVar.a(yVar2.G(str));
            return Unit.f22483a;
        }

        @Override // tl.e
        public void a(final GetQueryInfoError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            final y yVar = y.this;
            final kotlin.jvm.internal.y yVar2 = this.b;
            final mm.m mVar = this.f31917c;
            yVar.D(new Function0() { // from class: tl.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.c.d(error, yVar2, yVar, mVar);
                }
            });
        }

        @Override // tl.e
        public void onSuccess(final String queryInfo) {
            final y yVar = y.this;
            final kotlin.jvm.internal.y yVar2 = this.b;
            final mm.m mVar = this.f31917c;
            yVar.D(new Function0() { // from class: tl.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.c.e(yVar2, yVar, mVar, queryInfo);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"tl/y$d", "Ltl/c;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements tl.c {
        public final /* synthetic */ mm.m b;

        public d(mm.m mVar) {
            this.b = mVar;
        }

        public static final Unit c(mm.m mVar, y yVar, String str) {
            mVar.a(yVar.J(false, str));
            return Unit.f22483a;
        }

        public static final Unit d(mm.m mVar, y yVar) {
            mVar.a(yVar.J(true, ""));
            return Unit.f22483a;
        }

        @Override // tl.c
        public void onFailure(final String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            final y yVar = y.this;
            final mm.m mVar = this.b;
            yVar.D(new Function0() { // from class: tl.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.d.c(mVar, yVar, errorMessage);
                }
            });
        }

        @Override // tl.c
        public void onSuccess() {
            final y yVar = y.this;
            final mm.m mVar = this.b;
            yVar.D(new Function0() { // from class: tl.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.d.d(mVar, yVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"tl/y$e", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends kotlin.coroutines.a implements m0 {
        public e(m0.Companion companion) {
            super(companion);
        }

        @Override // ku.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            gk.p.f("RewardedAdsProtocol", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull tl.d gmaSdkInstaller, @NotNull a initialController, @NotNull p0 scope, @NotNull MessageBus messageBus, @NotNull Function1<? super mm.m, d0> showAdEventHandlerFactory) {
        Intrinsics.checkNotNullParameter(gmaSdkInstaller, "gmaSdkInstaller");
        Intrinsics.checkNotNullParameter(initialController, "initialController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(messageBus, "messageBus");
        Intrinsics.checkNotNullParameter(showAdEventHandlerFactory, "showAdEventHandlerFactory");
        this.gmaSdkInstaller = gmaSdkInstaller;
        this.scope = scope;
        this.messageBus = messageBus;
        this.showAdEventHandlerFactory = showAdEventHandlerFactory;
        this.gmaSdkController = initialController;
        String protocolName = JNINativeAdsProtocol.getProtocolName();
        Intrinsics.checkNotNullExpressionValue(protocolName, "getProtocolName(...)");
        this.protocolName = protocolName;
        String installMessageName = JNINativeAdsProtocol.getInstallMessageName();
        Intrinsics.checkNotNullExpressionValue(installMessageName, "getInstallMessageName(...)");
        Connection connectionT = messageBus.t(F(installMessageName), new Callback() { // from class: tl.r
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                y.R(this.f31898a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionT, "subscribe(...)");
        this.handleInstallConn = connectionT;
        String closeAdMessageName = JNINativeAdsProtocol.getCloseAdMessageName();
        Intrinsics.checkNotNullExpressionValue(closeAdMessageName, "getCloseAdMessageName(...)");
        Connection connectionT2 = messageBus.t(F(closeAdMessageName), new Callback() { // from class: tl.s
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                y.K(this.f31899a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionT2, "subscribe(...)");
        this.handleCloseAdConn = connectionT2;
        this.cleanedUp = new AtomicBoolean(false);
        this.getQueryInfoResultConfig = jt.i.b(new Function0() { // from class: tl.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.I();
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getInitWithCallbackMessageName(), new mm.j() { // from class: tl.u
            @Override // mm.j
            public final void a(JSONObject jSONObject, mm.m mVar) {
                y.u(this.f31900a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getGetQueryInfoMessageName(), new mm.j() { // from class: tl.v
            @Override // mm.j
            public final void a(JSONObject jSONObject, mm.m mVar) {
                y.v(this.f31901a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName(), new mm.j() { // from class: tl.w
            @Override // mm.j
            public final void a(JSONObject jSONObject, mm.m mVar) {
                y.w(this.f31902a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getShowAdMessageName(), new mm.j() { // from class: tl.x
            @Override // mm.j
            public final void a(JSONObject jSONObject, mm.m mVar) {
                y.x(this.f31903a, jSONObject, mVar);
            }
        });
    }

    public static final TelemetryConfig I() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("RewardedVideoGetQueryInfoResult", kotlin.collections.p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(th.h.a().T5()));
        aVar.b(2026, 8, 11);
        aVar.a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.d();
    }

    public static final void K(final y yVar, JSONObject jSONObject) {
        yVar.D(new Function0() { // from class: tl.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.L(this.f31883a);
            }
        });
    }

    public static final Unit L(y yVar) {
        yVar.gmaSdkController.a();
        return Unit.f22483a;
    }

    public static final void O(y yVar, final mm.m mVar, final Boolean success, final String errorMessage) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        yVar.D(new Function0() { // from class: tl.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.P(mVar, success, errorMessage);
            }
        });
    }

    public static final Unit P(mm.m mVar, Boolean bool, String str) {
        mm.l lVar = new mm.l();
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNull(bool);
        gk.n.f(jSONObject, "success", bool.booleanValue());
        gk.n.g(jSONObject, "errorMessage", str);
        Unit unit = Unit.f22483a;
        lVar.f24430a = jSONObject;
        mVar.a(lVar);
        return Unit.f22483a;
    }

    public static final void R(final y yVar, final JSONObject jSONObject) {
        yVar.D(new Function0() { // from class: tl.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.S(this.f31884a, jSONObject);
            }
        });
    }

    public static final Unit S(y yVar, JSONObject jSONObject) {
        Intrinsics.checkNotNull(jSONObject);
        yVar.Q(jSONObject);
        return Unit.f22483a;
    }

    public static /* synthetic */ void W(y yVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        yVar.V(str, str2);
    }

    public static final Unit Y(y yVar, a aVar) {
        yVar.gmaSdkController = aVar;
        return Unit.f22483a;
    }

    public static Unit b(y yVar, JSONObject jSONObject, mm.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        yVar.N(jSONObject, mVar);
        return Unit.f22483a;
    }

    public static Unit c(y yVar, JSONObject jSONObject, mm.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        yVar.T(jSONObject, mVar);
        return Unit.f22483a;
    }

    public static Unit p(y yVar, JSONObject jSONObject, mm.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        yVar.U(jSONObject, mVar);
        return Unit.f22483a;
    }

    public static Unit q(y yVar, JSONObject jSONObject, mm.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        yVar.M(jSONObject, mVar);
        return Unit.f22483a;
    }

    public static final d0 s(p0 p0Var, MessageBus messageBus, final mm.m callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new d0(p0Var, messageBus, new Function2() { // from class: tl.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y.t(callback, (vl.c) obj, ((Float) obj2).floatValue());
            }
        });
    }

    public static final Unit t(mm.m mVar, vl.c status, float f10) {
        Intrinsics.checkNotNullParameter(status, "status");
        mm.l lVar = new mm.l();
        JSONObject jSONObject = new JSONObject();
        gk.n.e(jSONObject, "playBackStatus", status.getValue());
        gk.n.b(jSONObject, "durationWatchedMs", f10);
        Unit unit = Unit.f22483a;
        lVar.f24430a = jSONObject;
        mVar.a(lVar);
        return Unit.f22483a;
    }

    public static final void u(final y yVar, final JSONObject jSONObject, final mm.m mVar) {
        yVar.D(new Function0() { // from class: tl.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.b(this.f31887a, jSONObject, mVar);
            }
        });
    }

    public static final void v(final y yVar, final JSONObject jSONObject, final mm.m mVar) {
        yVar.D(new Function0() { // from class: tl.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.q(this.f31889a, jSONObject, mVar);
            }
        });
    }

    public static final void w(final y yVar, final JSONObject jSONObject, final mm.m mVar) {
        yVar.D(new Function0() { // from class: tl.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.c(this.f31885a, jSONObject, mVar);
            }
        });
    }

    public static final void x(final y yVar, final JSONObject jSONObject, final mm.m mVar) {
        yVar.D(new Function0() { // from class: tl.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.p(this.f31891a, jSONObject, mVar);
            }
        });
    }

    public final void C() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            gk.p.e("RewardedAdsProtocol", "cleanup() called more than once");
            return;
        }
        gk.p.h("RewardedAdsProtocol", "cleanup");
        this.handleInstallConn.a();
        this.handleCloseAdConn.a();
        this.gmaSdkController.destroy();
        q0.f(this.scope, null, 1, null);
    }

    public final void D(Function0<Unit> block) {
        if (q0.i(this.scope)) {
            ku.k.d(this.scope, null, null, new b(block, null), 3, null);
        } else {
            gk.p.e("RewardedAdsProtocol", "Failed to enqueue ads task");
        }
    }

    public final String E(JSONObject params) {
        String strOptString = params.optString(JNINativeAdsProtocol.getAdTracingIdFieldName());
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final String F(String messageName) {
        return mm.f.f24426a.a(this.protocolName, messageName);
    }

    public final mm.l G(String queryInfo) {
        mm.l lVar = new mm.l();
        JSONObject jSONObject = new JSONObject();
        if (th.h.a().I3()) {
            String getQueryInfoMessageName = JNINativeAdsProtocol.getGetQueryInfoMessageName();
            Intrinsics.checkNotNullExpressionValue(getQueryInfoMessageName, "getGetQueryInfoMessageName(...)");
            if (queryInfo == null) {
                queryInfo = "";
            }
            gk.n.e(jSONObject, getQueryInfoMessageName, queryInfo);
        } else {
            String getQueryInfoMessageName2 = JNINativeAdsProtocol.getGetQueryInfoMessageName();
            Intrinsics.checkNotNullExpressionValue(getQueryInfoMessageName2, "getGetQueryInfoMessageName(...)");
            gk.n.h(jSONObject, getQueryInfoMessageName2, queryInfo);
        }
        lVar.f24430a = jSONObject;
        return lVar;
    }

    public final TelemetryConfig H() {
        return (TelemetryConfig) this.getQueryInfoResultConfig.getValue();
    }

    public final mm.l J(boolean isAdLoaded, String errorMessage) {
        mm.l lVar = new mm.l();
        JSONObject jSONObject = new JSONObject();
        String setAdStringWithDetailedCallbackMessageName = JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName();
        Intrinsics.checkNotNullExpressionValue(setAdStringWithDetailedCallbackMessageName, "getSetAdStringWithDetailedCallbackMessageName(...)");
        gk.n.f(jSONObject, setAdStringWithDetailedCallbackMessageName, isAdLoaded);
        gk.n.e(jSONObject, "errorMessage", errorMessage);
        lVar.f24430a = jSONObject;
        return lVar;
    }

    public final void M(JSONObject params, mm.m callback) {
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        if (th.h.a().I3()) {
            String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
            boolean z10 = Intrinsics.c(strOptString, "IsolatedRewarded") || Intrinsics.c(strOptString, "NonIsolatedRewarded");
            yVar.f22568a = z10;
            if (z10) {
                W(this, "attempt", null, 2, null);
            }
        }
        String strE = E(params);
        if (strE == null) {
            if (th.h.a().I3() && yVar.f22568a) {
                V("terminal", "MISSING_AD_TRACING_ID");
            }
            callback.a(G(null));
            return;
        }
        a aVar = this.gmaSdkController;
        String strOptString2 = params.optString(JNINativeAdsProtocol.getAdUnitIdFieldName());
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        aVar.c(strE, strOptString2, strOptString3, new c(yVar, callback));
    }

    public final void N(JSONObject params, final mm.m callback) {
        gk.p.h("RewardedAdsProtocol", "init");
        String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        a aVar = this.gmaSdkController;
        Intrinsics.checkNotNull(strOptString);
        aVar.b(strOptString, new BiConsumer() { // from class: tl.n
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                y.O(this.f31893a, callback, (Boolean) obj, (String) obj2);
            }
        });
    }

    public final void Q(JSONObject params) {
        gk.p.h("RewardedAdsProtocol", "install");
        if (!th.h.a().p5()) {
            this.gmaSdkInstaller.a(false);
        } else {
            this.gmaSdkInstaller.a(params.optBoolean(JNINativeAdsProtocol.getInstantInstallFieldName(), false));
        }
    }

    public final void T(JSONObject params, mm.m callback) {
        String strE = E(params);
        if (strE == null) {
            callback.a(J(false, "Missing 'adTracingId'"));
        } else {
            this.gmaSdkController.e(strE, params, new d(callback));
        }
    }

    public final void U(JSONObject params, mm.m callback) {
        d0 d0VarInvoke = this.showAdEventHandlerFactory.invoke(callback);
        String strE = E(params);
        if (strE == null) {
            d0VarInvoke.c(vl.c.INTERNAL_ERROR, 0.0f);
        } else {
            this.gmaSdkController.d(strE, d0VarInvoke);
        }
    }

    public final void V(String phase, String result) {
        TelemetryConfig telemetryConfigH = H();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.a(kotlin.collections.p.n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar.c("phase", phase);
        if (result != null) {
            bVar.c("result", result);
        }
        sm.c.h(telemetryConfigH, bVar.l());
    }

    public final void X(@NotNull final a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        a aVar = this.gmaSdkController;
        if ((aVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            D(new Function0() { // from class: tl.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.Y(this.f31897a, controller);
                }
            });
            return;
        }
        gk.p.e("RewardedAdsProtocol", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + aVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y(tl.d dVar, a aVar, p0 p0Var, MessageBus messageBus, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        a noopGmaSdkController = (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, null) : aVar;
        final p0 p0VarA = (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.U(g1.a(), 1, null, 2, null)).plus(new e(m0.INSTANCE))) : p0Var;
        if ((i10 & 8) != 0) {
            messageBus = MessageBus.f();
            Intrinsics.checkNotNullExpressionValue(messageBus, "getInstance(...)");
        }
        final MessageBus messageBus2 = messageBus;
        this(dVar, noopGmaSdkController, p0VarA, messageBus2, (i10 & 16) != 0 ? new Function1() { // from class: tl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.s(p0VarA, messageBus2, (mm.m) obj);
            }
        } : function1);
    }
}
