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
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.coroutines.AbstractC7717a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mm.C8589f;
import mm.C8595l;
import mm.InterfaceC8593j;
import mm.InterfaceC8596m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p151gk.C6122o;
import p151gk.C6124q;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7893m0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p470ul.GetQueryInfoError;
import p494vl.EnumC12230c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: tl.d0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u00017BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170.H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006V"}, m31665d2 = {"Ltl/d0;", "", "Ltl/i;", "gmaSdkInstaller", "Ltl/c;", "initialController", "Lku/p0;", "scope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function1;", "Lmm/m;", "Ltl/i0;", "showAdEventHandlerFactory", "<init>", "(Ltl/i;Ltl/c;Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function1;)V", "", "messageName", "F", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "params", "callback", "", "N", "(Lorg/json/JSONObject;Lmm/m;)V", "Q", "(Lorg/json/JSONObject;)V", "M", "phase", "result", "V", "(Ljava/lang/String;Ljava/lang/String;)V", "T", "U", "E", "(Lorg/json/JSONObject;)Ljava/lang/String;", "queryInfo", "Lmm/l;", "G", "(Ljava/lang/String;)Lmm/l;", "", "isAdLoaded", "errorMessage", "J", "(ZLjava/lang/String;)Lmm/l;", "Lkotlin/Function0;", "block", "D", "(Lkotlin/jvm/functions/Function0;)V", "controller", "X", "(Ltl/c;)V", "C", "()V", "a", "Ltl/i;", "b", "Lku/p0;", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Ltl/c;", "gmaSdkController", "f", "Ljava/lang/String;", "protocolName", "Lcom/roblox/universalapp/messagebus/Connection;", "g", "Lcom/roblox/universalapp/messagebus/Connection;", "handleInstallConn", "h", "handleCloseAdConn", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "j", "Ljt/h;", "H", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getQueryInfoResultConfig", "k", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11678d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11687i gmaSdkInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<InterfaceC8596m, C11688i0> showAdEventHandlerFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public volatile InterfaceC11675c gmaSdkController;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String protocolName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Connection handleInstallConn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Connection handleCloseAdConn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h getQueryInfoResultConfig;

    /* JADX INFO: renamed from: tl.d0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.ads.RewardedAdsProtocol$enqueue$1", m39664f = "RewardedAdsProtocol.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41288t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function0<Unit> f41289u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41289u = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f41289u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41288t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f41289u.invoke();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tl.d0$c */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"tl/d0$c", "Ltl/j;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lul/a;", "error", "a", "(Lul/a;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC11689j {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7758y f41291b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC8596m f41292c;

        public c(C7758y c7758y, InterfaceC8596m interfaceC8596m) {
            this.f41291b = c7758y;
            this.f41292c = interfaceC8596m;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m43888d(GetQueryInfoError getQueryInfoError, C7758y c7758y, C11678d0 c11678d0, InterfaceC8596m interfaceC8596m) {
            C6124q.m27061f("RewardedAdsProtocol", "Error getting query info", getQueryInfoError);
            if (C11659h.m43403a().mo43498N3() && c7758y.f29445a) {
                String message = getQueryInfoError.getMessage();
                if (message == null) {
                    message = "UNKNOWN";
                }
                c11678d0.m43884V("terminal", message);
            }
            interfaceC8596m.mo34618a(c11678d0.m43876G(null));
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m43889e(C7758y c7758y, C11678d0 c11678d0, InterfaceC8596m interfaceC8596m, String str) {
            if (C11659h.m43403a().mo43498N3() && c7758y.f29445a) {
                c11678d0.m43884V("terminal", "success");
            }
            interfaceC8596m.mo34618a(c11678d0.m43876G(str));
            return Unit.f29331a;
        }

        @Override // tl.InterfaceC11689j
        /* JADX INFO: renamed from: a */
        public void mo43354a(final GetQueryInfoError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            final C11678d0 c11678d0 = C11678d0.this;
            final C7758y c7758y = this.f41291b;
            final InterfaceC8596m interfaceC8596m = this.f41292c;
            c11678d0.m43873D(new Function0() { // from class: tl.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11678d0.c.m43888d(error, c7758y, c11678d0, interfaceC8596m);
                }
            });
        }

        @Override // tl.InterfaceC11689j
        public void onSuccess(final String queryInfo) {
            final C11678d0 c11678d0 = C11678d0.this;
            final C7758y c7758y = this.f41291b;
            final InterfaceC8596m interfaceC8596m = this.f41292c;
            c11678d0.m43873D(new Function0() { // from class: tl.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11678d0.c.m43889e(c7758y, c11678d0, interfaceC8596m, queryInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: tl.d0$d */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"tl/d0$d", "Ltl/f;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements InterfaceC11681f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC8596m f41294b;

        public d(InterfaceC8596m interfaceC8596m) {
            this.f41294b = interfaceC8596m;
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m43892c(InterfaceC8596m interfaceC8596m, C11678d0 c11678d0, String str) {
            interfaceC8596m.mo34618a(c11678d0.m43878J(false, str));
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m43893d(InterfaceC8596m interfaceC8596m, C11678d0 c11678d0) {
            interfaceC8596m.mo34618a(c11678d0.m43878J(true, ""));
            return Unit.f29331a;
        }

        @Override // tl.InterfaceC11681f
        public void onFailure(final String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            final C11678d0 c11678d0 = C11678d0.this;
            final InterfaceC8596m interfaceC8596m = this.f41294b;
            c11678d0.m43873D(new Function0() { // from class: tl.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11678d0.d.m43892c(interfaceC8596m, c11678d0, errorMessage);
                }
            });
        }

        @Override // tl.InterfaceC11681f
        public void onSuccess() {
            final C11678d0 c11678d0 = C11678d0.this;
            final InterfaceC8596m interfaceC8596m = this.f41294b;
            c11678d0.m43873D(new Function0() { // from class: tl.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11678d0.d.m43893d(interfaceC8596m, c11678d0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: tl.d0$e */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"tl/d0$e", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC7717a implements InterfaceC7893m0 {
        public e(InterfaceC7893m0.Companion companion) {
            super(companion);
        }

        @Override // p256ku.InterfaceC7893m0
        public void handleException(CoroutineContext context, Throwable exception) {
            C6124q.m27061f("RewardedAdsProtocol", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super mm.m, tl.i0> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11678d0(@NotNull InterfaceC11687i gmaSdkInstaller, @NotNull InterfaceC11675c initialController, @NotNull InterfaceC7906p0 scope, @NotNull MessageBus messageBus, @NotNull Function1<? super InterfaceC8596m, C11688i0> showAdEventHandlerFactory) {
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
        Connection connectionM16030t = messageBus.m16030t(m43875F(installMessageName), new Callback() { // from class: tl.v
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                C11678d0.m43842R(this.f41360a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionM16030t, "subscribe(...)");
        this.handleInstallConn = connectionM16030t;
        String closeAdMessageName = JNINativeAdsProtocol.getCloseAdMessageName();
        Intrinsics.checkNotNullExpressionValue(closeAdMessageName, "getCloseAdMessageName(...)");
        Connection connectionM16030t2 = messageBus.m16030t(m43875F(closeAdMessageName), new Callback() { // from class: tl.w
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                C11678d0.m43838K(this.f41361a, jSONObject);
            }
        });
        Intrinsics.checkNotNullExpressionValue(connectionM16030t2, "subscribe(...)");
        this.handleCloseAdConn = connectionM16030t2;
        this.cleanedUp = new AtomicBoolean(false);
        this.getQueryInfoResultConfig = C7342i.m30456b(new Function0() { // from class: tl.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43837I();
            }
        });
        messageBus.m16027q(protocolName, JNINativeAdsProtocol.getInitWithCallbackMessageName(), new InterfaceC8593j() { // from class: tl.y
            @Override // mm.InterfaceC8593j
            /* JADX INFO: renamed from: a */
            public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                C11678d0.m43866u(this.f41362a, jSONObject, interfaceC8596m);
            }
        });
        messageBus.m16027q(protocolName, JNINativeAdsProtocol.getGetQueryInfoMessageName(), new InterfaceC8593j() { // from class: tl.z
            @Override // mm.InterfaceC8593j
            /* JADX INFO: renamed from: a */
            public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                C11678d0.m43867v(this.f41363a, jSONObject, interfaceC8596m);
            }
        });
        messageBus.m16027q(protocolName, JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName(), new InterfaceC8593j() { // from class: tl.a0
            @Override // mm.InterfaceC8593j
            /* JADX INFO: renamed from: a */
            public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                C11678d0.m43868w(this.f41272a, jSONObject, interfaceC8596m);
            }
        });
        messageBus.m16027q(protocolName, JNINativeAdsProtocol.getShowAdMessageName(), new InterfaceC8593j() { // from class: tl.b0
            @Override // mm.InterfaceC8593j
            /* JADX INFO: renamed from: a */
            public final void mo15882a(JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
                C11678d0.m43869x(this.f41273a, jSONObject, interfaceC8596m);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static final TelemetryConfig m43837I() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("RewardedVideoGetQueryInfoResult", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43583Z5()));
        aVar.mo42755b(2026, 8, 11);
        aVar.mo42754a("Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: K */
    public static final void m43838K(final C11678d0 c11678d0, JSONObject jSONObject) {
        c11678d0.m43873D(new Function0() { // from class: tl.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43839L(this.f41339a);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m43839L(C11678d0 c11678d0) {
        c11678d0.gmaSdkController.mo15968d();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O */
    public static final void m43840O(C11678d0 c11678d0, final InterfaceC8596m interfaceC8596m, final Boolean success, final String errorMessage) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        c11678d0.m43873D(new Function0() { // from class: tl.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43841P(interfaceC8596m, success, errorMessage);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m43841P(InterfaceC8596m interfaceC8596m, Boolean bool, String str) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNull(bool);
        C6122o.m27052f(jSONObject, "success", bool.booleanValue());
        C6122o.m27053g(jSONObject, "errorMessage", str);
        Unit unit = Unit.f29331a;
        c8595l.f31556a = jSONObject;
        interfaceC8596m.mo34618a(c8595l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R */
    public static final void m43842R(final C11678d0 c11678d0, final JSONObject jSONObject) {
        c11678d0.m43873D(new Function0() { // from class: tl.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43843S(this.f41340a, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m43843S(C11678d0 c11678d0, JSONObject jSONObject) {
        Intrinsics.checkNotNull(jSONObject);
        c11678d0.m43881Q(jSONObject);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m43844W(C11678d0 c11678d0, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        c11678d0.m43884V(str, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m43845Y(C11678d0 c11678d0, InterfaceC11675c interfaceC11675c) {
        c11678d0.gmaSdkController = interfaceC11675c;
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m43847b(C11678d0 c11678d0, JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(interfaceC8596m);
        c11678d0.m43880N(jSONObject, interfaceC8596m);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m43848c(C11678d0 c11678d0, JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(interfaceC8596m);
        c11678d0.m43882T(jSONObject, interfaceC8596m);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m43861p(C11678d0 c11678d0, JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(interfaceC8596m);
        c11678d0.m43883U(jSONObject, interfaceC8596m);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static Unit m43862q(C11678d0 c11678d0, JSONObject jSONObject, InterfaceC8596m interfaceC8596m) {
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(interfaceC8596m);
        c11678d0.m43879M(jSONObject, interfaceC8596m);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final C11688i0 m43864s(InterfaceC7906p0 interfaceC7906p0, MessageBus messageBus, final InterfaceC8596m callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new C11688i0(interfaceC7906p0, messageBus, new Function2() { // from class: tl.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C11678d0.m43865t(callback, (EnumC12230c) obj, ((Float) obj2).floatValue());
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m43865t(InterfaceC8596m interfaceC8596m, EnumC12230c status, float f10) {
        Intrinsics.checkNotNullParameter(status, "status");
        C8595l c8595l = new C8595l();
        JSONObject jSONObject = new JSONObject();
        C6122o.m27051e(jSONObject, "playBackStatus", status.getValue());
        C6122o.m27048b(jSONObject, "durationWatchedMs", f10);
        Unit unit = Unit.f29331a;
        c8595l.f31556a = jSONObject;
        interfaceC8596m.mo34618a(c8595l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m43866u(final C11678d0 c11678d0, final JSONObject jSONObject, final InterfaceC8596m interfaceC8596m) {
        c11678d0.m43873D(new Function0() { // from class: tl.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43847b(this.f41345a, jSONObject, interfaceC8596m);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m43867v(final C11678d0 c11678d0, final JSONObject jSONObject, final InterfaceC8596m interfaceC8596m) {
        c11678d0.m43873D(new Function0() { // from class: tl.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43862q(this.f41348a, jSONObject, interfaceC8596m);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final void m43868w(final C11678d0 c11678d0, final JSONObject jSONObject, final InterfaceC8596m interfaceC8596m) {
        c11678d0.m43873D(new Function0() { // from class: tl.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43848c(this.f41342a, jSONObject, interfaceC8596m);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static final void m43869x(final C11678d0 c11678d0, final JSONObject jSONObject, final InterfaceC8596m interfaceC8596m) {
        c11678d0.m43873D(new Function0() { // from class: tl.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11678d0.m43861p(this.f41351a, jSONObject, interfaceC8596m);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m43872C() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            C6124q.m27060e("RewardedAdsProtocol", "cleanup() called more than once");
            return;
        }
        C6124q.m27063h("RewardedAdsProtocol", "cleanup");
        this.handleInstallConn.m16010a();
        this.handleCloseAdConn.m16010a();
        this.gmaSdkController.destroy();
        C7910q0.m32890f(this.scope, null, 1, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m43873D(Function0<Unit> block) {
        if (C7910q0.m32893i(this.scope)) {
            C7882k.m32780d(this.scope, null, null, new b(block, null), 3, null);
        } else {
            C6124q.m27060e("RewardedAdsProtocol", "Failed to enqueue ads task");
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m43874E(JSONObject params) {
        String strOptString = params.optString(JNINativeAdsProtocol.getAdTracingIdFieldName());
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final String m43875F(String messageName) {
        return C8589f.f31550a.m34619a(this.protocolName, messageName);
    }

    /* JADX INFO: renamed from: G */
    public final C8595l m43876G(String queryInfo) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject = new JSONObject();
        if (C11659h.m43403a().mo43498N3()) {
            String getQueryInfoMessageName = JNINativeAdsProtocol.getGetQueryInfoMessageName();
            Intrinsics.checkNotNullExpressionValue(getQueryInfoMessageName, "getGetQueryInfoMessageName(...)");
            if (queryInfo == null) {
                queryInfo = "";
            }
            C6122o.m27051e(jSONObject, getQueryInfoMessageName, queryInfo);
        } else {
            String getQueryInfoMessageName2 = JNINativeAdsProtocol.getGetQueryInfoMessageName();
            Intrinsics.checkNotNullExpressionValue(getQueryInfoMessageName2, "getGetQueryInfoMessageName(...)");
            C6122o.m27054h(jSONObject, getQueryInfoMessageName2, queryInfo);
        }
        c8595l.f31556a = jSONObject;
        return c8595l;
    }

    /* JADX INFO: renamed from: H */
    public final TelemetryConfig m43877H() {
        return (TelemetryConfig) this.getQueryInfoResultConfig.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final C8595l m43878J(boolean isAdLoaded, String errorMessage) {
        C8595l c8595l = new C8595l();
        JSONObject jSONObject = new JSONObject();
        String setAdStringWithDetailedCallbackMessageName = JNINativeAdsProtocol.getSetAdStringWithDetailedCallbackMessageName();
        Intrinsics.checkNotNullExpressionValue(setAdStringWithDetailedCallbackMessageName, "getSetAdStringWithDetailedCallbackMessageName(...)");
        C6122o.m27052f(jSONObject, setAdStringWithDetailedCallbackMessageName, isAdLoaded);
        C6122o.m27051e(jSONObject, "errorMessage", errorMessage);
        c8595l.f31556a = jSONObject;
        return c8595l;
    }

    /* JADX INFO: renamed from: M */
    public final void m43879M(JSONObject params, InterfaceC8596m callback) {
        C7758y c7758y = new C7758y();
        if (C11659h.m43403a().mo43498N3()) {
            String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
            boolean z10 = Intrinsics.m31980c(strOptString, "IsolatedRewarded") || Intrinsics.m31980c(strOptString, "NonIsolatedRewarded");
            c7758y.f29445a = z10;
            if (z10) {
                m43844W(this, "attempt", null, 2, null);
            }
        }
        String strM43874E = m43874E(params);
        if (strM43874E == null) {
            if (C11659h.m43403a().mo43498N3() && c7758y.f29445a) {
                m43884V("terminal", "MISSING_AD_TRACING_ID");
            }
            callback.mo34618a(m43876G(null));
            return;
        }
        InterfaceC11675c interfaceC11675c = this.gmaSdkController;
        String strOptString2 = params.optString(JNINativeAdsProtocol.getAdUnitIdFieldName());
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        interfaceC11675c.mo15970h(strM43874E, strOptString2, strOptString3, new c(c7758y, callback));
    }

    /* JADX INFO: renamed from: N */
    public final void m43880N(JSONObject params, final InterfaceC8596m callback) {
        C6124q.m27063h("RewardedAdsProtocol", "init");
        String strOptString = params.optString(JNINativeAdsProtocol.getExperimentVariantFieldName());
        InterfaceC11675c interfaceC11675c = this.gmaSdkController;
        Intrinsics.checkNotNull(strOptString);
        interfaceC11675c.mo15969g(strOptString, new BiConsumer() { // from class: tl.s
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C11678d0.m43840O(this.f41354a, callback, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m43881Q(JSONObject params) {
        C6124q.m27063h("RewardedAdsProtocol", "install");
        if (!C11659h.m43403a().mo43742v5()) {
            this.gmaSdkInstaller.mo43330a(false);
        } else {
            this.gmaSdkInstaller.mo43330a(params.optBoolean(JNINativeAdsProtocol.getInstantInstallFieldName(), false));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m43882T(JSONObject params, InterfaceC8596m callback) {
        String strM43874E = m43874E(params);
        if (strM43874E == null) {
            callback.mo34618a(m43878J(false, "Missing 'adTracingId'"));
        } else {
            this.gmaSdkController.mo15972j(strM43874E, params, new d(callback));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m43883U(JSONObject params, InterfaceC8596m callback) {
        C11688i0 c11688i0Invoke = this.showAdEventHandlerFactory.invoke(callback);
        String strM43874E = m43874E(params);
        if (strM43874E == null) {
            c11688i0Invoke.mo43372c(EnumC12230c.INTERNAL_ERROR, 0.0f);
        } else {
            this.gmaSdkController.mo15966b(strM43874E, c11688i0Invoke);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m43884V(String phase, String result) {
        TelemetryConfig telemetryConfigM43877H = m43877H();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42757a(C7699p.m31895n(TelemetryStandardizedField.ADD_OS_INFO, TelemetryStandardizedField.ADD_UNIVERSE_ID, TelemetryStandardizedField.ADD_PLAY_SESSION_ID, TelemetryStandardizedField.ADD_PLACE_ID));
        bVar.mo42759c("phase", phase);
        if (result != null) {
            bVar.mo42759c("result", result);
        }
        C11416c.m42772h(telemetryConfigM43877H, bVar.m42785l());
    }

    /* JADX INFO: renamed from: X */
    public final void m43885X(@NotNull final InterfaceC11675c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC11675c interfaceC11675c = this.gmaSdkController;
        if ((interfaceC11675c instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            m43873D(new Function0() { // from class: tl.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C11678d0.m43845Y(this.f41274a, controller);
                }
            });
            return;
        }
        C6124q.m27060e("RewardedAdsProtocol", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + interfaceC11675c.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C11678d0(InterfaceC11687i interfaceC11687i, InterfaceC11675c interfaceC11675c, InterfaceC7906p0 interfaceC7906p0, MessageBus messageBus, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC11675c noopGmaSdkController = (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0) : interfaceC11675c;
        final InterfaceC7906p0 interfaceC7906p0M32885a = (i10 & 4) != 0 ? C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(AbstractC7888l0.m32791U(C7864g1.m32643a(), 1, null, 2, null)).plus(new e(InterfaceC7893m0.INSTANCE))) : interfaceC7906p0;
        if ((i10 & 8) != 0) {
            messageBus = MessageBus.m16016f();
            Intrinsics.checkNotNullExpressionValue(messageBus, "getInstance(...)");
        }
        final MessageBus messageBus2 = messageBus;
        this(interfaceC11687i, noopGmaSdkController, interfaceC7906p0M32885a, messageBus2, (i10 & 16) != 0 ? new Function1() { // from class: tl.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11678d0.m43864s(interfaceC7906p0M32885a, messageBus2, (InterfaceC8596m) obj);
            }
        } : function1);
    }
}
