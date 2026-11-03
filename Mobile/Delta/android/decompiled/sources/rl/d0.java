package rl;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import iu.g1;
import iu.l0;
import iu.m0;
import iu.p0;
import iu.q0;
import iu.z2;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import sl.GetQueryInfoError;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u00017BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lrl/d0;", "", "Lrl/i;", "gmaSdkInstaller", "Lrl/c;", "initialController", "Liu/p0;", "scope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function1;", "Lkm/m;", "Lrl/i0;", "showAdEventHandlerFactory", "<init>", "(Lrl/i;Lrl/c;Liu/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", "", "messageName", "F", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "params", "callback", "", "N", "(Lorg/json/JSONObject;Lkm/m;)V", "Q", "(Lorg/json/JSONObject;)V", "M", "phase", "result", "V", "(Ljava/lang/String;Ljava/lang/String;)V", "T", "U", "E", "(Lorg/json/JSONObject;)Ljava/lang/String;", "queryInfo", "Lkm/l;", "G", "(Ljava/lang/String;)Lkm/l;", "", "isAdLoaded", "errorMessage", "J", "(ZLjava/lang/String;)Lkm/l;", "Lkotlin/Function0;", "block", "D", "(Lkotlin/jvm/functions/Function0;)V", "controller", "X", "(Lrl/c;)V", "C", "()V", "a", "Lrl/i;", "b", "Liu/p0;", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Lrl/c;", "gmaSdkController", "f", "Ljava/lang/String;", "protocolName", "Lcom/roblox/universalapp/messagebus/Connection;", "g", "Lcom/roblox/universalapp/messagebus/Connection;", "handleInstallConn", "h", "handleCloseAdConn", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "j", "Lgt/h;", "H", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "k", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i gmaSdkInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<km.m, i0> showAdEventHandlerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile rl.c gmaSdkController;

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
    public final gt.h getQueryInfoResultConfig;

    @nt.f(c = "com.roblox.universalapp.ads.RewardedAdsProtocol$enqueue$1", f = "RewardedAdsProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30784t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30785u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f30785u = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f30785u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30784t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            this.f30785u.invoke();
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"rl/d0$c", "Lrl/j;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lsl/a;", "error", "a", "(Lsl/a;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements j {
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ km.m f30787c;

        public c(boolean z10, km.m mVar) {
            this.b = z10;
            this.f30787c = mVar;
        }

        public static final Unit d(GetQueryInfoError getQueryInfoError, boolean z10, d0 d0Var, km.m mVar) {
            ek.q.f("RewardedAdsProtocol", "Error getting query info", getQueryInfoError);
            if (z10) {
                String message = getQueryInfoError.getMessage();
                if (message == null) {
                    message = "UNKNOWN";
                }
                d0Var.V("terminal", message);
            }
            mVar.a(d0Var.G(null));
            return Unit.f22938a;
        }

        public static final Unit e(boolean z10, d0 d0Var, km.m mVar, String str) {
            if (z10) {
                d0Var.V("terminal", "success");
            }
            mVar.a(d0Var.G(str));
            return Unit.f22938a;
        }

        @Override // rl.j
        public void a(final GetQueryInfoError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            final d0 d0Var = d0.this;
            final boolean z10 = this.b;
            final km.m mVar = this.f30787c;
            d0Var.D(new Function0() { // from class: rl.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.c.d(error, z10, d0Var, mVar);
                }
            });
        }

        @Override // rl.j
        public void onSuccess(final String queryInfo) {
            final d0 d0Var = d0.this;
            final boolean z10 = this.b;
            final km.m mVar = this.f30787c;
            d0Var.D(new Function0() { // from class: rl.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.c.e(z10, d0Var, mVar, queryInfo);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"rl/d0$d", "Lrl/f;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements f {
        public final /* synthetic */ km.m b;

        public d(km.m mVar) {
            this.b = mVar;
        }

        public static final Unit c(km.m mVar, d0 d0Var, String str) {
            mVar.a(d0Var.J(false, str));
            return Unit.f22938a;
        }

        public static final Unit d(km.m mVar, d0 d0Var) {
            mVar.a(d0Var.J(true, ""));
            return Unit.f22938a;
        }

        @Override // rl.f
        public void onFailure(final String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            final d0 d0Var = d0.this;
            final km.m mVar = this.b;
            d0Var.D(new Function0() { // from class: rl.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.d.c(mVar, d0Var, errorMessage);
                }
            });
        }

        @Override // rl.f
        public void onSuccess() {
            final d0 d0Var = d0.this;
            final km.m mVar = this.b;
            d0Var.D(new Function0() { // from class: rl.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.d.d(mVar, d0Var);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"rl/d0$e", "Lkotlin/coroutines/a;", "Liu/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends kotlin.coroutines.a implements m0 {
        public e(m0.Companion companion) {
            super(companion);
        }

        @Override // iu.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            ek.q.f("RewardedAdsProtocol", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull i gmaSdkInstaller, @NotNull rl.c initialController, @NotNull p0 scope, @NotNull MessageBus messageBus, @NotNull Function1<? super km.m, i0> showAdEventHandlerFactory) {
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
        Connection connectionT = messageBus.t(F(installMessageName), new Callback() { // from class: rl.v
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                d0.R(this.f30843a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionT, "subscribe(...)");
        this.handleInstallConn = connectionT;
        String closeAdMessageName = JNINativeAdsProtocol.getCloseAdMessageName();
        Intrinsics.checkNotNullExpressionValue(closeAdMessageName, "getCloseAdMessageName(...)");
        Connection connectionT2 = messageBus.t(F(closeAdMessageName), new Callback() { // from class: rl.w
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                d0.K(this.f30844a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionT2, "subscribe(...)");
        this.handleCloseAdConn = connectionT2;
        this.cleanedUp = new AtomicBoolean(false);
        this.getQueryInfoResultConfig = gt.i.b(new Function0() { // from class: rl.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.I();
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getInitWithCallbackMessageName(), new km.j() { // from class: rl.y
            @Override // km.j
            public final void a(JSONObject jSONObject, km.m mVar) {
                d0.u(this.f30845a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getGetQueryInfoMessageName(), new km.j() { // from class: rl.z
            @Override // km.j
            public final void a(JSONObject jSONObject, km.m mVar) {
                d0.v(this.f30846a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName(), new km.j() { // from class: rl.a0
            @Override // km.j
            public final void a(JSONObject jSONObject, km.m mVar) {
                d0.w(this.f30770a, jSONObject, mVar);
            }
        });
        messageBus.q(protocolName, JNINativeAdsProtocol.getShowAdMessageName(), new km.j() { // from class: rl.b0
            @Override // km.j
            public final void a(JSONObject jSONObject, km.m mVar) {
                d0.x(this.f30771a, jSONObject, mVar);
            }
        });
    }

    public static final TelemetryConfig I() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("RewardedVideoGetQueryInfoResult", kotlin.collections.p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(rh.h.a().c6()));
        aVar.b(2026, 8, 11);
        aVar.a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.d();
    }

    public static final void K(final d0 d0Var, JSONObject jSONObject) {
        d0Var.D(new Function0() { // from class: rl.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.L(this.f30829a);
            }
        });
    }

    public static final Unit L(d0 d0Var) {
        d0Var.gmaSdkController.d();
        return Unit.f22938a;
    }

    public static final void O(d0 d0Var, final km.m mVar, final Boolean success, final String errorMessage) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        d0Var.D(new Function0() { // from class: rl.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.P(mVar, success, errorMessage);
            }
        });
    }

    public static final Unit P(km.m mVar, Boolean bool, String str) {
        km.l lVar = new km.l();
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNull(bool);
        ek.o.f(jSONObject, "success", bool.booleanValue());
        ek.o.g(jSONObject, "errorMessage", str);
        Unit unit = Unit.f22938a;
        lVar.f22909a = jSONObject;
        mVar.a(lVar);
        return Unit.f22938a;
    }

    public static final void R(final d0 d0Var, final JSONObject jSONObject) {
        d0Var.D(new Function0() { // from class: rl.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.S(this.f30830a, jSONObject);
            }
        });
    }

    public static final Unit S(d0 d0Var, JSONObject jSONObject) {
        Intrinsics.checkNotNull(jSONObject);
        d0Var.Q(jSONObject);
        return Unit.f22938a;
    }

    public static /* synthetic */ void W(d0 d0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        d0Var.V(str, str2);
    }

    public static final Unit Y(d0 d0Var, rl.c cVar) {
        d0Var.gmaSdkController = cVar;
        return Unit.f22938a;
    }

    public static Unit b(d0 d0Var, JSONObject jSONObject, km.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        d0Var.N(jSONObject, mVar);
        return Unit.f22938a;
    }

    public static Unit c(d0 d0Var, JSONObject jSONObject, km.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        d0Var.T(jSONObject, mVar);
        return Unit.f22938a;
    }

    public static Unit p(d0 d0Var, JSONObject jSONObject, km.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        d0Var.U(jSONObject, mVar);
        return Unit.f22938a;
    }

    public static Unit q(d0 d0Var, JSONObject jSONObject, km.m mVar) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(mVar);
        d0Var.M(jSONObject, mVar);
        return Unit.f22938a;
    }

    public static final i0 s(p0 p0Var, MessageBus messageBus, final km.m callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new i0(p0Var, messageBus, new Function2() { // from class: rl.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d0.t(callback, (tl.c) obj, ((Float) obj2).floatValue());
            }
        });
    }

    public static final Unit t(km.m mVar, tl.c status, float f10) {
        Intrinsics.checkNotNullParameter(status, "status");
        km.l lVar = new km.l();
        JSONObject jSONObject = new JSONObject();
        ek.o.e(jSONObject, "playBackStatus", status.getValue());
        ek.o.b(jSONObject, "durationWatchedMs", f10);
        Unit unit = Unit.f22938a;
        lVar.f22909a = jSONObject;
        mVar.a(lVar);
        return Unit.f22938a;
    }

    public static final void u(final d0 d0Var, final JSONObject jSONObject, final km.m mVar) {
        d0Var.D(new Function0() { // from class: rl.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.b(this.f30833a, jSONObject, mVar);
            }
        });
    }

    public static final void v(final d0 d0Var, final JSONObject jSONObject, final km.m mVar) {
        d0Var.D(new Function0() { // from class: rl.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.q(this.f30835a, jSONObject, mVar);
            }
        });
    }

    public static final void w(final d0 d0Var, final JSONObject jSONObject, final km.m mVar) {
        d0Var.D(new Function0() { // from class: rl.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.c(this.f30831a, jSONObject, mVar);
            }
        });
    }

    public static final void x(final d0 d0Var, final JSONObject jSONObject, final km.m mVar) {
        d0Var.D(new Function0() { // from class: rl.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.p(this.f30837a, jSONObject, mVar);
            }
        });
    }

    public final void C() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            ek.q.e("RewardedAdsProtocol", "cleanup() called more than once");
            return;
        }
        ek.q.h("RewardedAdsProtocol", "cleanup");
        this.handleInstallConn.a();
        this.handleCloseAdConn.a();
        this.gmaSdkController.destroy();
        q0.f(this.scope, null, 1, null);
    }

    public final void D(Function0<Unit> block) {
        if (q0.i(this.scope)) {
            iu.k.d(this.scope, null, null, new b(block, null), 3, null);
        } else {
            ek.q.e("RewardedAdsProtocol", "Failed to enqueue ads task");
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
        return km.f.f22905a.a(this.protocolName, messageName);
    }

    public final km.l G(String queryInfo) {
        km.l lVar = new km.l();
        JSONObject jSONObject = new JSONObject();
        String getQueryInfoMessageName = JNINativeAdsProtocol.getGetQueryInfoMessageName();
        Intrinsics.checkNotNullExpressionValue(getQueryInfoMessageName, "getGetQueryInfoMessageName(...)");
        if (queryInfo == null) {
            queryInfo = "";
        }
        ek.o.e(jSONObject, getQueryInfoMessageName, queryInfo);
        lVar.f22909a = jSONObject;
        return lVar;
    }

    public final TelemetryConfig H() {
        return (TelemetryConfig) this.getQueryInfoResultConfig.getValue();
    }

    public final km.l J(boolean isAdLoaded, String errorMessage) {
        km.l lVar = new km.l();
        JSONObject jSONObject = new JSONObject();
        String setAdStringWithDetailedCallbackMessageName = JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName();
        Intrinsics.checkNotNullExpressionValue(setAdStringWithDetailedCallbackMessageName, "getSetAdStringWithDetailedCallbackMessageName(...)");
        ek.o.f(jSONObject, setAdStringWithDetailedCallbackMessageName, isAdLoaded);
        ek.o.e(jSONObject, "errorMessage", errorMessage);
        lVar.f22909a = jSONObject;
        return lVar;
    }

    public final void M(JSONObject params, km.m callback) {
        String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        boolean z10 = Intrinsics.c(strOptString, "IsolatedRewarded") || Intrinsics.c(strOptString, "NonIsolatedRewarded");
        if (z10) {
            W(this, "attempt", null, 2, null);
        }
        String strE = E(params);
        if (strE == null) {
            if (z10) {
                V("terminal", "MISSING_AD_TRACING_ID");
            }
            callback.a(G(null));
        } else {
            rl.c cVar = this.gmaSdkController;
            String strOptString2 = params.optString(JNINativeAdsProtocol.getAdUnitIdFieldName());
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            String strOptString3 = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            cVar.e(strE, strOptString2, strOptString3, new c(z10, callback));
        }
    }

    public final void N(JSONObject params, final km.m callback) {
        ek.q.h("RewardedAdsProtocol", "init");
        String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        rl.c cVar = this.gmaSdkController;
        Intrinsics.checkNotNull(strOptString);
        cVar.g(strOptString, new BiConsumer() { // from class: rl.s
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                d0.O(this.f30839a, callback, (Boolean) obj, (String) obj2);
            }
        });
    }

    public final void Q(JSONObject params) {
        ek.q.h("RewardedAdsProtocol", "install");
        this.gmaSdkInstaller.a(params.optBoolean(JNINativeAdsProtocol.getInstantInstallFieldName(), false));
    }

    public final void T(JSONObject params, km.m callback) {
        String strE = E(params);
        if (strE == null) {
            callback.a(J(false, "Missing 'adTracingId'"));
        } else {
            this.gmaSdkController.f(strE, params, new d(callback));
        }
    }

    public final void U(JSONObject params, km.m callback) {
        i0 i0VarInvoke = this.showAdEventHandlerFactory.invoke(callback);
        String strE = E(params);
        if (strE == null) {
            i0VarInvoke.d(tl.c.INTERNAL_ERROR, 0.0f);
        } else {
            this.gmaSdkController.b(strE, i0VarInvoke);
        }
    }

    public final void V(String phase, String result) {
        TelemetryConfig telemetryConfigH = H();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.a(kotlin.collections.p.n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar.c("phase", phase);
        if (result != null) {
            bVar.c("result", result);
        }
        qm.c.h(telemetryConfigH, bVar.l());
    }

    public final void X(@NotNull final rl.c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        rl.c cVar = this.gmaSdkController;
        if ((cVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            D(new Function0() { // from class: rl.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d0.Y(this.f30772a, controller);
                }
            });
            return;
        }
        ek.q.e("RewardedAdsProtocol", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + cVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d0(i iVar, rl.c cVar, p0 p0Var, MessageBus messageBus, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        rl.c noopGmaSdkController = (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0) : cVar;
        final p0 p0VarA = (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.U(g1.a(), 1, null, 2, null)).plus(new e(m0.INSTANCE))) : p0Var;
        if ((i10 & 8) != 0) {
            messageBus = MessageBus.f();
            Intrinsics.checkNotNullExpressionValue(messageBus, "getInstance(...)");
        }
        final MessageBus messageBus2 = messageBus;
        this(iVar, noopGmaSdkController, p0VarA, messageBus2, (i10 & 16) != 0 ? new Function1() { // from class: rl.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.s(p0VarA, messageBus2, (km.m) obj);
            }
        } : function1);
    }
}
