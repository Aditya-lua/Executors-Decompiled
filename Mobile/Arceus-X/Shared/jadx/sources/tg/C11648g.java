package tg;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener;
import com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds;
import com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason;
import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractC7717a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.AbstractC7888l0;
import p256ku.C7856e3;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7945z;
import p256ku.C7948z2;
import p256ku.InterfaceC7893m0;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p470ul.GetQueryInfoError;
import p494vl.EnumC12230c;
import p494vl.NativeAdsProgressData;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;
import tl.C11673b;
import tl.C11679e;
import tl.C11685h;
import tl.EnumC11671a;
import tl.InterfaceC11675c;
import tl.InterfaceC11681f;
import tl.InterfaceC11687i;
import tl.InterfaceC11689j;
import tl.InterfaceC11690k;

/* JADX INFO: renamed from: tg.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u0001:\u0001KB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)Jg\u00103\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u0010\u001cJ\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010'J[\u0010>\u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\b2\u001e\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0;H\u0002¢\u0006\u0004\b>\u0010?J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190A2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bB\u0010CJ-\u0010G\u001a\u00020\u000e2\u001c\u0010F\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D\u0012\u0006\u0012\u0004\u0018\u00010E0\bH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010\\\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190A0Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, m31665d2 = {"Ltg/g;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;", "Ltl/i;", "moduleInstaller", "Ltl/c;", "gmaSdkController", "Lku/p0;", "scope", "Lkotlin/Function1;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "setPlatformImpl", "<init>", "(Ltl/i;Ltl/c;Lku/p0;Lkotlin/jvm/functions/Function1;)V", "controller", "", "n", "(Ltl/c;)V", "i", "()V", "", "instantInstall", "install", "(Z)V", "", "id", "", "experimentVariant", "initialize", "(ILjava/lang/String;)V", "requestId", "initializeAdUnitId", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;)V", "adTracingId", "adUnitId", "loadInterstitialAd", "adResponseJson", "onServeInterstitialAdResponse", "onServeInterstitialAdFailed", "(Ljava/lang/String;)V", "getQueryInfo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adString", "durationNeededEnum", "", "durationNeededForRewardMs", "isEuUser", "creativeUrl", "uiExperimentData", "gmaAdType", "isClickable", "setAdString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "showAd", "cleanupAd", "destroyInterstitialAd", "Ltl/a;", "adFormat", "onSuccess", "Lkotlin/Function3;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "onFailure", "k", "(Ltl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lzt/n;)V", "queryInfo", "Ljt/n;", "o", "(Ltl/a;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lnt/b;", "", "block", "j", "(Lkotlin/jvm/functions/Function1;)V", "a", "Ltl/i;", "b", "Ltl/c;", "c", "Lku/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "f", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "nativeAdsCore", "Ljava/util/concurrent/ConcurrentHashMap;", "Lku/x;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "pendingServeAds", "h", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11648g extends IPlatformNativeAds {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11687i moduleInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile InterfaceC11675c gmaSdkController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<C11648g, INativeAdsCoreListener> setPlatformImpl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public INativeAdsCoreListener nativeAdsCore;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC7937x<C7347n<String>>> pendingServeAds;

    /* JADX INFO: renamed from: tg.g$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function1<IPlatformNativeAds, INativeAdsCoreListener> {

        /* JADX INFO: renamed from: a */
        public static final a f41094a = new a();

        public a() {
            super(1, INativeAdsCoreListener.class, "setPlatformImpl", "setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final INativeAdsCoreListener invoke(IPlatformNativeAds iPlatformNativeAds) {
            return INativeAdsCoreListener.setPlatformImpl(iPlatformNativeAds);
        }
    }

    /* JADX INFO: renamed from: tg.g$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41095a;

        static {
            int[] iArr = new int[EnumC11671a.values().length];
            try {
                iArr[EnumC11671a.Interstitial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11671a.Rewarded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41095a = iArr;
        }
    }

    /* JADX INFO: renamed from: tg.g$d */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$cleanupAd$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41096t;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(1, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41096t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C11648g.this.gmaSdkController.mo15968d();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$destroyInterstitialAd$1", m39664f = "NativeAdsHandler.kt", m39665l = {418}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41098t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f41100v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41100v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new e(this.f41100v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41098t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC11675c interfaceC11675c = C11648g.this.gmaSdkController;
                EnumC11671a enumC11671a = EnumC11671a.Interstitial;
                String str = this.f41100v;
                this.f41098t = 1;
                if (interfaceC11675c.mo15965a(enumC11671a, str, this) == objM38805e) {
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$enqueue$1", m39664f = "NativeAdsHandler.kt", m39665l = {428}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41101t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function1<InterfaceC9557b<? super Unit>, Object> f41102u;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41102u = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f41102u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41101t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Function1<InterfaceC9557b<? super Unit>, Object> function1 = this.f41102u;
                this.f41101t = 1;
                if (function1.invoke(this) == objM38805e) {
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
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$g */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class g extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41103t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f41104u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f41105v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11648g f41106w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ int f41107x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f41108y;

        /* JADX INFO: renamed from: tg.g$g$a */
        @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"tg/g$g$a", "Ltl/j;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lul/a;", "error", "a", "(Lul/a;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC11689j {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11648g f41109a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f41110b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f41111c;

            /* JADX INFO: renamed from: tg.g$g$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onFailure$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class C14261a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41112t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ boolean f41113u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ GetQueryInfoError f41114v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ C11648g f41115w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ int f41116x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14261a(boolean z10, GetQueryInfoError getQueryInfoError, C11648g c11648g, int i10, InterfaceC9557b<? super C14261a> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41113u = z10;
                    this.f41114v = getQueryInfoError;
                    this.f41115w = c11648g;
                    this.f41116x = i10;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new C14261a(this.f41113u, this.f41114v, this.f41115w, this.f41116x, interfaceC9557b);
                }

                /* JADX DEBUG: Class process forced to load method for inline: tg.j.b(tg.b, java.lang.String):void */
                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41112t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    if (this.f41113u) {
                        EnumC11643b enumC11643b = EnumC11643b.TERMINAL;
                        String message = this.f41114v.getMessage();
                        if (message == null) {
                            message = "UNKNOWN";
                        }
                        C11651j.m43382e(enumC11643b, message);
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41115w.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f41116x, "");
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14261a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: tg.g$g$a$b */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onSuccess$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41117t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ boolean f41118u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C11648g f41119v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ int f41120w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ String f41121x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z10, C11648g c11648g, int i10, String str, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41118u = z10;
                    this.f41119v = c11648g;
                    this.f41120w = i10;
                    this.f41121x = str;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new b(this.f41118u, this.f41119v, this.f41120w, this.f41121x, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41117t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    if (this.f41118u) {
                        C11651j.m43382e(EnumC11643b.TERMINAL, "success");
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41119v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        int i10 = this.f41120w;
                        String str = this.f41121x;
                        if (str == null) {
                            str = "";
                        }
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, str);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            public a(C11648g c11648g, boolean z10, int i10) {
                this.f41109a = c11648g;
                this.f41110b = z10;
                this.f41111c = i10;
            }

            @Override // tl.InterfaceC11689j
            /* JADX INFO: renamed from: a */
            public void mo43354a(GetQueryInfoError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                C11648g c11648g = this.f41109a;
                c11648g.m43346j(new C14261a(this.f41110b, error, c11648g, this.f41111c, null));
            }

            @Override // tl.InterfaceC11689j
            public void onSuccess(String queryInfo) {
                C11648g c11648g = this.f41109a;
                c11648g.m43346j(new b(this.f41110b, c11648g, this.f41111c, queryInfo, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, C11648g c11648g, int i10, String str3, InterfaceC9557b<? super g> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41104u = str;
            this.f41105v = str2;
            this.f41106w = c11648g;
            this.f41107x = i10;
            this.f41108y = str3;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f41104u, this.f41105v, this.f41106w, this.f41107x, this.f41108y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41103t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            boolean z10 = C11659h.m43403a().mo43498N3() && (Intrinsics.m31980c(this.f41104u, "IsolatedRewarded") || Intrinsics.m31980c(this.f41104u, "NonIsolatedRewarded"));
            if (z10) {
                C11651j.m43383f(EnumC11643b.ATTEMPT, null, 2, null);
            }
            if (this.f41105v.length() != 0) {
                this.f41106w.gmaSdkController.mo15970h(this.f41105v, this.f41108y, this.f41104u, new a(this.f41106w, z10, this.f41107x));
                return Unit.f29331a;
            }
            if (z10) {
                C11651j.m43382e(EnumC11643b.TERMINAL, "MISSING_AD_TRACING_ID");
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f41106w.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f41107x, "");
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$h */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$initialize$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class h extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41122t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f41124v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ int f41125w;

        /* JADX INFO: renamed from: tg.g$h$a */
        @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$initialize$1$1$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f41126t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C11648g f41127u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ int f41128v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ Boolean f41129w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ String f41130x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11648g c11648g, int i10, Boolean bool, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f41127u = c11648g;
                this.f41128v = i10;
                this.f41129w = bool;
                this.f41130x = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f41127u, this.f41128v, this.f41129w, this.f41130x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f41126t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                INativeAdsCoreListener iNativeAdsCoreListener = this.f41127u.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    int i10 = this.f41128v;
                    Boolean bool = this.f41129w;
                    Intrinsics.checkNotNull(bool);
                    iNativeAdsCoreListener.onInitializeCompleted(i10, bool.booleanValue(), this.f41130x);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, InterfaceC9557b<? super h> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41124v = str;
            this.f41125w = i10;
        }

        /* JADX INFO: renamed from: s */
        public static final void m43358s(C11648g c11648g, int i10, Boolean bool, String str) {
            c11648g.m43346j(new a(c11648g, i10, bool, str, null));
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new h(this.f41124v, this.f41125w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41122t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC11675c interfaceC11675c = C11648g.this.gmaSdkController;
            String str = this.f41124v;
            final C11648g c11648g = C11648g.this;
            final int i10 = this.f41125w;
            interfaceC11675c.mo15969g(str, new BiConsumer() { // from class: tg.h
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    C11648g.h.m43358s(c11648g, i10, (Boolean) obj2, (String) obj3);
                }
            });
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$i */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1", m39664f = "NativeAdsHandler.kt", m39665l = {177}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class i extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41131t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f41133v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f41134w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, InterfaceC9557b<? super i> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41133v = str;
            this.f41134w = str2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new i(this.f41133v, this.f41134w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo15967c;
            InitializeSdkFailureReason initializeSdkFailureReason;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41131t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (C11648g.this.gmaSdkController instanceof NoopGmaSdkController) {
                    C11648g.this.moduleInstaller.mo43330a(false);
                    INativeAdsCoreListener iNativeAdsCoreListener = C11648g.this.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onInitializeSdkFailed(this.f41133v, InitializeSdkFailureReason.NOTINSTALLED, "gmasdk module not installed");
                    }
                    return Unit.f29331a;
                }
                InterfaceC11675c interfaceC11675c = C11648g.this.gmaSdkController;
                String str = this.f41134w;
                this.f41131t = 1;
                objMo15967c = interfaceC11675c.mo15967c(str, this);
                if (objMo15967c == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo15967c = ((C7347n) obj).getValue();
            }
            C11648g c11648g = C11648g.this;
            String str2 = this.f41133v;
            if (C7347n.m30466h(objMo15967c)) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = c11648g.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onInitializeSdkSuccess(str2);
                }
            }
            C11648g c11648g2 = C11648g.this;
            String str3 = this.f41133v;
            Throwable thM30463e = C7347n.m30463e(objMo15967c);
            if (thM30463e != null) {
                if (thM30463e instanceof C11673b) {
                    initializeSdkFailureReason = InitializeSdkFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    initializeSdkFailureReason = thM30463e instanceof C7856e3 ? InitializeSdkFailureReason.TIMEDOUT : InitializeSdkFailureReason.UNDEFINED;
                }
                INativeAdsCoreListener iNativeAdsCoreListener3 = c11648g2.nativeAdsCore;
                if (iNativeAdsCoreListener3 != null) {
                    String message = thM30463e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    iNativeAdsCoreListener3.onInitializeSdkFailed(str3, initializeSdkFailureReason, message);
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((i) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$j */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$install$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class j extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41135t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ boolean f41137v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, InterfaceC9557b<? super j> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41137v = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new j(this.f41137v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41135t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C11648g.this.moduleInstaller.mo43330a(C11659h.m43403a().mo43742v5() && this.f41137v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$k */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1", m39664f = "NativeAdsHandler.kt", m39665l = {214}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class k extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41138t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f41139u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC14057n<String, LoadAdFailureReason, String, Unit> f41140v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C11648g f41141w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ EnumC11671a f41142x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f41143y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function1<String, Unit> f41144z;

        /* JADX INFO: renamed from: tg.g$k$a */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "queryInfo", "Ljt/n;", "<anonymous>", "(Ljava/lang/String;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1$1", m39664f = "NativeAdsHandler.kt", m39665l = {215}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<String, InterfaceC9557b<? super C7347n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f41145t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f41146u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C11648g f41147v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ EnumC11671a f41148w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ String f41149x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11648g c11648g, EnumC11671a enumC11671a, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f41147v = c11648g;
                this.f41148w = enumC11671a;
                this.f41149x = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f41147v, this.f41148w, this.f41149x, interfaceC9557b);
                aVar.f41146u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM43349o;
                String str = (String) this.f41146u;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f41145t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C11648g c11648g = this.f41147v;
                    EnumC11671a enumC11671a = this.f41148w;
                    String str2 = this.f41149x;
                    this.f41146u = C10350l.m39676a(str);
                    this.f41145t = 1;
                    objM43349o = c11648g.m43349o(enumC11671a, str2, str, this);
                    if (objM43349o == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    objM43349o = ((C7347n) obj).getValue();
                }
                return C7347n.m30459a(objM43349o);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
                return ((a) create(str, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: zt.n<? super java.lang.String, ? super com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason, ? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, InterfaceC14057n<? super String, ? super LoadAdFailureReason, ? super String, Unit> interfaceC14057n, C11648g c11648g, EnumC11671a enumC11671a, String str2, Function1<? super String, Unit> function1, InterfaceC9557b<? super k> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41139u = str;
            this.f41140v = interfaceC14057n;
            this.f41141w = c11648g;
            this.f41142x = enumC11671a;
            this.f41143y = str2;
            this.f41144z = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new k(this.f41139u, this.f41140v, this.f41141w, this.f41142x, this.f41143y, this.f41144z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object objMo15971i;
            LoadAdFailureReason loadAdFailureReasonM43896a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41138t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (this.f41139u.length() == 0) {
                    this.f41140v.invoke(this.f41139u, LoadAdFailureReason.ADTRACINGIDABSENT, "adTracingId is empty");
                    return Unit.f29331a;
                }
                InterfaceC11675c interfaceC11675c = this.f41141w.gmaSdkController;
                EnumC11671a enumC11671a = this.f41142x;
                String str = this.f41139u;
                String str2 = this.f41143y;
                a aVar = new a(this.f41141w, enumC11671a, str, null);
                this.f41138t = 1;
                kVar = this;
                objMo15971i = interfaceC11675c.mo15971i(enumC11671a, str, str2, aVar, kVar);
                if (objMo15971i == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo15971i = ((C7347n) obj).getValue();
                kVar = this;
            }
            Function1<String, Unit> function1 = kVar.f41144z;
            String str3 = kVar.f41139u;
            if (C7347n.m30466h(objMo15971i)) {
                function1.invoke(str3);
            }
            InterfaceC14057n<String, LoadAdFailureReason, String, Unit> interfaceC14057n = kVar.f41140v;
            String str4 = kVar.f41139u;
            Throwable thM30463e = C7347n.m30463e(objMo15971i);
            if (thM30463e != null) {
                if (thM30463e instanceof C11673b) {
                    loadAdFailureReasonM43896a = LoadAdFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    C11679e c11679e = thM30463e instanceof C11679e ? (C11679e) thM30463e : null;
                    loadAdFailureReasonM43896a = C11685h.m43896a(c11679e != null ? c11679e.getReason() : null);
                }
                String message = thM30463e.getMessage();
                if (message == null) {
                    message = "";
                }
                interfaceC14057n.invoke(str4, loadAdFailureReasonM43896a, message);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((k) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$l */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$replaceNoopGmaSdkController$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class l extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41150t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC11675c f41152v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC11675c interfaceC11675c, InterfaceC9557b<? super l> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41152v = interfaceC11675c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C11648g.this.new l(this.f41152v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41150t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C11648g.this.gmaSdkController = this.f41152v;
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((l) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$m */
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler", m39664f = "NativeAdsHandler.kt", m39665l = {252}, m39666m = "serveAd-BWLJW6A", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class m extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f41154B;

        /* JADX INFO: renamed from: t */
        public Object f41155t;

        /* JADX INFO: renamed from: u */
        public Object f41156u;

        /* JADX INFO: renamed from: v */
        public Object f41157v;

        /* JADX INFO: renamed from: w */
        public Object f41158w;

        /* JADX INFO: renamed from: x */
        public Object f41159x;

        /* JADX INFO: renamed from: y */
        public Object f41160y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f41161z;

        public m(InterfaceC9557b<? super m> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41161z = obj;
            this.f41154B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM43349o = C11648g.this.m43349o(null, null, null, this);
            return objM43349o == C10047c.m38805e() ? objM43349o : C7347n.m30459a(objM43349o);
        }
    }

    /* JADX INFO: renamed from: tg.g$n */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$serveAd$2", m39664f = "NativeAdsHandler.kt", m39665l = {253}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class n extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41162t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC7937x<C7347n<String>> f41163u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC7937x<C7347n<String>> interfaceC7937x, InterfaceC9557b<? super n> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41163u = interfaceC7937x;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new n(this.f41163u, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<String>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f41162t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC7937x<C7347n<String>> interfaceC7937x = this.f41163u;
            this.f41162t = 1;
            Object objMo32927B = interfaceC7937x.mo32927B(this);
            return objMo32927B == objM38805e ? objM38805e : objMo32927B;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
            return ((n) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$o */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class o extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ String f41164A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ String f41165B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f41166C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ String f41167D;

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ String f41168E;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ String f41169F;

        /* JADX INFO: renamed from: t */
        public int f41170t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f41171u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11648g f41172v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ int f41173w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ long f41174x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f41175y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ boolean f41176z;

        /* JADX INFO: renamed from: tg.g$o$a */
        @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"tg/g$o$a", "Ltl/f;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC11681f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11648g f41177a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f41178b;

            /* JADX INFO: renamed from: tg.g$o$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onFailure$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class C14262a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41179t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C11648g f41180u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ int f41181v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ String f41182w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14262a(C11648g c11648g, int i10, String str, InterfaceC9557b<? super C14262a> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41180u = c11648g;
                    this.f41181v = i10;
                    this.f41182w = str;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new C14262a(this.f41180u, this.f41181v, this.f41182w, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41179t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41180u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f41181v, false, this.f41182w);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14262a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: tg.g$o$a$b */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onSuccess$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41183t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C11648g f41184u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ int f41185v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C11648g c11648g, int i10, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41184u = c11648g;
                    this.f41185v = i10;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new b(this.f41184u, this.f41185v, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41183t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41184u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f41185v, true, "");
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            public a(C11648g c11648g, int i10) {
                this.f41177a = c11648g;
                this.f41178b = i10;
            }

            @Override // tl.InterfaceC11681f
            public void onFailure(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                C11648g c11648g = this.f41177a;
                c11648g.m43346j(new C14262a(c11648g, this.f41178b, errorMessage, null));
            }

            @Override // tl.InterfaceC11681f
            public void onSuccess() {
                C11648g c11648g = this.f41177a;
                c11648g.m43346j(new b(c11648g, this.f41178b, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, C11648g c11648g, int i10, long j10, String str2, boolean z10, String str3, String str4, boolean z11, String str5, String str6, String str7, InterfaceC9557b<? super o> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41171u = str;
            this.f41172v = c11648g;
            this.f41173w = i10;
            this.f41174x = j10;
            this.f41175y = str2;
            this.f41176z = z10;
            this.f41164A = str3;
            this.f41165B = str4;
            this.f41166C = z11;
            this.f41167D = str5;
            this.f41168E = str6;
            this.f41169F = str7;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new o(this.f41171u, this.f41172v, this.f41173w, this.f41174x, this.f41175y, this.f41176z, this.f41164A, this.f41165B, this.f41166C, this.f41167D, this.f41168E, this.f41169F, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41170t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (this.f41171u.length() == 0) {
                INativeAdsCoreListener iNativeAdsCoreListener = this.f41172v.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    iNativeAdsCoreListener.onSetAdStringCompleted(this.f41173w, false, "adTracingId is empty");
                }
                return Unit.f29331a;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                long j10 = this.f41174x;
                String str = this.f41175y;
                boolean z10 = this.f41176z;
                String str2 = this.f41164A;
                String str3 = this.f41165B;
                boolean z11 = this.f41166C;
                String str4 = this.f41167D;
                String str5 = this.f41168E;
                String str6 = this.f41169F;
                jSONObject.put("durationNeededForRewardMs", j10);
                jSONObject.put("durationNeededEnum", str);
                jSONObject.put("isEUUser", z10);
                jSONObject.put("moderationExternalCreativeUrl", str2);
                jSONObject.put("gmaAdType", str3);
                jSONObject.put("isClickable", z11);
                jSONObject.put("uiExperimentData", new JSONObject(str4));
                jSONObject.put("adString", str5);
                jSONObject.put("adUnitId", str6);
                this.f41172v.gmaSdkController.mo15972j(this.f41171u, jSONObject, new a(this.f41172v, this.f41173w));
                return Unit.f29331a;
            } catch (JSONException e10) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = this.f41172v.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onSetAdStringCompleted(this.f41173w, false, "setAdString failed to construct JSON - " + e10);
                }
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((o) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$p */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$showAd$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class p extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41186t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f41187u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11648g f41188v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ int f41189w;

        /* JADX INFO: renamed from: tg.g$p$a */
        @Metadata(m31664d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"tg/g$p$a", "Ltl/k;", "Lvl/c;", NotificationCompat.CATEGORY_STATUS, "", "watchDuration", "", "c", "(Lvl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "d", "(Ljava/lang/String;Z)V", "Lvl/b;", "progressData", "a", "(Lvl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC11690k {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11648g f41190a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f41191b;

            /* JADX INFO: renamed from: tg.g$p$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class C14263a extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41192t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C11648g f41193u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ NativeAdsProgressData f41194v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14263a(C11648g c11648g, NativeAdsProgressData nativeAdsProgressData, InterfaceC9557b<? super C14263a> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41193u = c11648g;
                    this.f41194v = nativeAdsProgressData;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new C14263a(this.f41193u, this.f41194v, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41192t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41193u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onAdProgress((float) this.f41194v.getAdProgress(), (float) this.f41194v.getVideoDuration(), this.f41194v.getPrice(), this.f41194v.getPricePrecisionType(), this.f41194v.getPriceCurrencyCode());
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14263a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: tg.g$p$a$b */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onCtaClicked$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41195t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ String f41196u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C11648g f41197v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ boolean f41198w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, C11648g c11648g, boolean z10, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41196u = str;
                    this.f41197v = c11648g;
                    this.f41198w = z10;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new b(this.f41196u, this.f41197v, this.f41198w, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41195t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    C6124q.m27063h("NativeAdsHandler", "cta clicked");
                    String str = this.f41196u;
                    if (str == null) {
                        C6124q.m27060e("NativeAdsHandler", "Invalid ad type, cannot log click");
                        return Unit.f29331a;
                    }
                    String str2 = Intrinsics.m31980c(str, "AppPromo") ? "AppPromo" : "ClickOut";
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41197v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onCtaClick(str2, this.f41198w);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: tg.g$p$a$c */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onPlayBackEnded$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class c extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41199t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C11648g f41200u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ int f41201v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ EnumC12230c f41202w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ float f41203x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C11648g c11648g, int i10, EnumC12230c enumC12230c, float f10, InterfaceC9557b<? super c> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41200u = c11648g;
                    this.f41201v = i10;
                    this.f41202w = enumC12230c;
                    this.f41203x = f10;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new c(this.f41200u, this.f41201v, this.f41202w, this.f41203x, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41199t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41200u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onShowAdCompleted(this.f41201v, this.f41202w.getValue(), this.f41203x);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((c) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: tg.g$p$a$d */
            @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            @InterfaceC10344f(m39663c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onUserReportAd$1", m39664f = "NativeAdsHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class d extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f41204t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ C11648g f41205u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ String f41206v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ String f41207w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(C11648g c11648g, String str, String str2, InterfaceC9557b<? super d> interfaceC9557b) {
                    super(1, interfaceC9557b);
                    this.f41205u = c11648g;
                    this.f41206v = str;
                    this.f41207w = str2;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                    return new d(this.f41205u, this.f41206v, this.f41207w, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f41204t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f41205u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onReportAd(this.f41206v, this.f41207w);
                    }
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((d) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            public a(C11648g c11648g, int i10) {
                this.f41190a = c11648g;
                this.f41191b = i10;
            }

            @Override // tl.InterfaceC11690k
            /* JADX INFO: renamed from: a */
            public void mo43370a(NativeAdsProgressData progressData) {
                Intrinsics.checkNotNullParameter(progressData, "progressData");
                C11648g c11648g = this.f41190a;
                c11648g.m43346j(new C14263a(c11648g, progressData, null));
            }

            @Override // tl.InterfaceC11690k
            /* JADX INFO: renamed from: b */
            public void mo43371b(String reasonKey, String description) {
                Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
                Intrinsics.checkNotNullParameter(description, "description");
                C11648g c11648g = this.f41190a;
                c11648g.m43346j(new d(c11648g, reasonKey, description, null));
            }

            @Override // tl.InterfaceC11690k
            /* JADX INFO: renamed from: c */
            public void mo43372c(EnumC12230c status, float watchDuration) {
                Intrinsics.checkNotNullParameter(status, "status");
                C11648g c11648g = this.f41190a;
                c11648g.m43346j(new c(c11648g, this.f41191b, status, watchDuration, null));
            }

            @Override // tl.InterfaceC11690k
            /* JADX INFO: renamed from: d */
            public void mo43373d(String gmaAdType, boolean isEndCardVisible) {
                C11648g c11648g = this.f41190a;
                c11648g.m43346j(new b(gmaAdType, c11648g, isEndCardVisible, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, C11648g c11648g, int i10, InterfaceC9557b<? super p> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f41187u = str;
            this.f41188v = c11648g;
            this.f41189w = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new p(this.f41187u, this.f41188v, this.f41189w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41186t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (this.f41187u.length() != 0) {
                this.f41188v.gmaSdkController.mo15966b(this.f41187u, new a(this.f41188v, this.f41189w));
                return Unit.f29331a;
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f41188v.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onShowAdCompleted(this.f41189w, EnumC12230c.INTERNAL_ERROR.getValue(), 0.0f);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((p) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tg.g$q */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"tg/g$q", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class q extends AbstractC7717a implements InterfaceC7893m0 {
        public q(InterfaceC7893m0.Companion companion) {
            super(companion);
        }

        @Override // p256ku.InterfaceC7893m0
        public void handleException(CoroutineContext context, Throwable exception) {
            C6124q.m27061f("NativeAdsHandler", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super tg.g, ? extends com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11648g(@NotNull InterfaceC11687i moduleInstaller, @NotNull InterfaceC11675c gmaSdkController, @NotNull InterfaceC7906p0 scope, @NotNull Function1<? super C11648g, ? extends INativeAdsCoreListener> setPlatformImpl) {
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(gmaSdkController, "gmaSdkController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(setPlatformImpl, "setPlatformImpl");
        this.moduleInstaller = moduleInstaller;
        this.gmaSdkController = gmaSdkController;
        this.scope = scope;
        this.setPlatformImpl = setPlatformImpl;
        this.cleanedUp = new AtomicBoolean(false);
        this.pendingServeAds = new ConcurrentHashMap<>();
        this.nativeAdsCore = (INativeAdsCoreListener) setPlatformImpl.invoke(this);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m43343l(C11648g c11648g, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INativeAdsCoreListener iNativeAdsCoreListener = c11648g.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdSuccess(it);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m43344m(C11648g c11648g, String id2, LoadAdFailureReason reason, String message) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        INativeAdsCoreListener iNativeAdsCoreListener = c11648g.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdFailed(id2, reason, message);
        }
        return Unit.f29331a;
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void cleanupAd() {
        m43346j(new d(null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void destroyInterstitialAd(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        m43346j(new e(adTracingId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void getQueryInfo(int id2, @NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        m43346j(new g(experimentVariant, adTracingId, this, id2, adUnitId, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m43345i() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            C6124q.m27060e("NativeAdsHandler", "cleanup() called more than once");
            return;
        }
        C6124q.m27063h("NativeAdsHandler", "cleanup");
        this.setPlatformImpl.invoke(null);
        this.nativeAdsCore = null;
        this.gmaSdkController.destroy();
        C7910q0.m32890f(this.scope, null, 1, null);
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initialize(int id2, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        m43346j(new h(experimentVariant, id2, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initializeSdk(@NotNull String requestId, @NotNull String initializeAdUnitId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(initializeAdUnitId, "initializeAdUnitId");
        m43346j(new i(requestId, initializeAdUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void install(boolean instantInstall) {
        m43346j(new j(instantInstall, null));
    }

    /* JADX INFO: renamed from: j */
    public final void m43346j(Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> block) {
        if (C7910q0.m32893i(this.scope)) {
            C7882k.m32780d(this.scope, null, null, new f(block, null), 3, null);
        } else {
            C6124q.m27060e("NativeAdsHandler", "Failed to enqueue ads task");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m43347k(EnumC11671a adFormat, String adTracingId, String adUnitId, Function1<? super String, Unit> onSuccess, InterfaceC14057n<? super String, ? super LoadAdFailureReason, ? super String, Unit> onFailure) {
        m43346j(new k(adTracingId, onFailure, this, adFormat, adUnitId, onSuccess, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void loadInterstitialAd(@NotNull String adTracingId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        m43347k(EnumC11671a.Interstitial, adTracingId, adUnitId, new Function1() { // from class: tg.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11648g.m43343l(this.f41084a, (String) obj);
            }
        }, new InterfaceC14057n() { // from class: tg.f
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C11648g.m43344m(this.f41085a, (String) obj, (LoadAdFailureReason) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m43348n(@NotNull InterfaceC11675c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC11675c interfaceC11675c = this.gmaSdkController;
        if ((interfaceC11675c instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            m43346j(new l(controller, null));
            return;
        }
        C6124q.m27060e("NativeAdsHandler", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + interfaceC11675c.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m43349o(EnumC11671a enumC11671a, String str, String str2, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
        m mVar;
        if (interfaceC9557b instanceof m) {
            mVar = (m) interfaceC9557b;
            int i10 = mVar.f41154B;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                mVar.f41154B = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                mVar = new m(interfaceC9557b);
            }
        } else {
            mVar = new m(interfaceC9557b);
        }
        Object objM32661d = mVar.f41161z;
        Object objM38805e = C10047c.m38805e();
        int i11 = mVar.f41154B;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM32661d);
                INativeAdsCoreListener iNativeAdsCoreListener = this.nativeAdsCore;
                if (iNativeAdsCoreListener == null) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new IllegalStateException("nativeAdsCore is null")));
                }
                InterfaceC7937x<C7347n<String>> interfaceC7937xM32935c = C7945z.m32935c(null, 1, null);
                InterfaceC7937x<C7347n<String>> interfaceC7937xPutIfAbsent = this.pendingServeAds.putIfAbsent(str, interfaceC7937xM32935c);
                if (interfaceC7937xPutIfAbsent != null) {
                    String str3 = "serveAd already in flight for adTracingId " + str + "; ignoring newer request";
                    C6124q.m27060e("NativeAdsHandler", str3);
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new IllegalStateException(str3)));
                }
                int i12 = c.f41095a[enumC11671a.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new C7345l();
                    }
                    this.pendingServeAds.remove(str);
                    C6124q.m27060e("NativeAdsHandler", "serveAd not supported for rewarded ads");
                    C7347n.Companion companion3 = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new IllegalStateException("serveAd not supported for rewarded ads")));
                }
                iNativeAdsCoreListener.onServeInterstitialAd(str, str2);
                C7800a.Companion companion4 = C7800a.INSTANCE;
                long jM32371p = C7801b.m32371p(C11659h.m43403a().mo43499N4(), EnumC7361b.SECONDS);
                n nVar = new n(interfaceC7937xM32935c, null);
                mVar.f41155t = C10350l.m39676a(enumC11671a);
                mVar.f41156u = str;
                mVar.f41157v = C10350l.m39676a(str2);
                mVar.f41158w = C10350l.m39676a(iNativeAdsCoreListener);
                mVar.f41159x = C10350l.m39676a(interfaceC7937xM32935c);
                mVar.f41160y = C10350l.m39676a(interfaceC7937xPutIfAbsent);
                mVar.f41154B = 1;
                objM32661d = C7866g3.m32661d(jM32371p, nVar, mVar);
                if (objM32661d == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) mVar.f41156u;
                C7348o.m30470b(objM32661d);
            }
            return ((C7347n) objM32661d).getValue();
        } catch (C7856e3 e10) {
            this.pendingServeAds.remove(str);
            C7347n.Companion companion5 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(e10));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdFailed(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        InterfaceC7937x<C7347n<String>> interfaceC7937xRemove = this.pendingServeAds.remove(adTracingId);
        if (interfaceC7937xRemove != null) {
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7937xRemove.mo32930s(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(new RuntimeException("serveAd failed")))));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdResponse(@NotNull String adTracingId, @NotNull String adResponseJson) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adResponseJson, "adResponseJson");
        InterfaceC7937x<C7347n<String>> interfaceC7937xRemove = this.pendingServeAds.remove(adTracingId);
        if (interfaceC7937xRemove != null) {
            interfaceC7937xRemove.mo32930s(C7347n.m30459a(C7347n.m30460b(adResponseJson)));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void setAdString(int id2, @NotNull String adTracingId, @NotNull String adUnitId, @NotNull String adString, @NotNull String durationNeededEnum, long durationNeededForRewardMs, boolean isEuUser, @NotNull String creativeUrl, @NotNull String uiExperimentData, @NotNull String gmaAdType, boolean isClickable) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adString, "adString");
        Intrinsics.checkNotNullParameter(durationNeededEnum, "durationNeededEnum");
        Intrinsics.checkNotNullParameter(creativeUrl, "creativeUrl");
        Intrinsics.checkNotNullParameter(uiExperimentData, "uiExperimentData");
        Intrinsics.checkNotNullParameter(gmaAdType, "gmaAdType");
        m43346j(new o(adTracingId, this, id2, durationNeededForRewardMs, durationNeededEnum, isEuUser, creativeUrl, gmaAdType, isClickable, uiExperimentData, adString, adUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void showAd(int id2, @NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        m43346j(new p(adTracingId, this, id2, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
      (r4v0 tl.i)
      (wrap tl.c:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap tl.c:0x0008: CONSTRUCTOR 
      (null java.lang.String)
      (1 int)
      (wrap java.lang.Object[]:?: TERNARY null = ((0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
     A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.roblox.universalapp.ads.NoopGmaSdkController.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r5v0 tl.c))
      (wrap ku.p0:?: TERNARY null = ((wrap int:0x000b: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap ku.p0:0x002b: INVOKE 
      (wrap kotlin.coroutines.CoroutineContext:0x0027: INVOKE 
      (wrap kotlin.coroutines.CoroutineContext:0x001c: INVOKE 
      (wrap ku.a0:0x000f: INVOKE (null ku.d2), (1 int), (null java.lang.Object) STATIC call: ku.z2.b(ku.d2, int, java.lang.Object):ku.a0 A[MD:(ku.d2, int, java.lang.Object):ku.a0 (m), WRAPPED] (LINE:10))
      (wrap ku.l0:0x0018: INVOKE 
      (wrap ku.l0:0x0013: INVOKE  STATIC call: ku.g1.a():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:11))
      (1 int)
      (null java.lang.String)
      (2 int)
      (null java.lang.Object)
     STATIC call: ku.l0.U(ku.l0, int, java.lang.String, int, java.lang.Object):ku.l0 A[MD:(ku.l0, int, java.lang.String, int, java.lang.Object):ku.l0 (m), WRAPPED] (LINE:11))
     INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:12))
      (wrap tg.g$q:0x0024: CONSTRUCTOR (wrap ku.m0$a:0x0020: SGET  A[WRAPPED] (LINE:13) ku.m0.Lo ku.m0$a) A[MD:(ku.m0$a):void (m), WRAPPED] (LINE:13) call: tg.g.q.<init>(ku.m0$a):void type: CONSTRUCTOR)
     INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:14))
     STATIC call: ku.q0.a(kotlin.coroutines.CoroutineContext):ku.p0 A[MD:(kotlin.coroutines.CoroutineContext):ku.p0 (m), WRAPPED] (LINE:15)) : (r6v0 ku.p0))
      (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x002f: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function1:0x0033: SGET  A[WRAPPED] (LINE:16) tg.g.a.a tg.g$a) : (r7v0 kotlin.jvm.functions.Function1))
     A[MD:(tl.i, tl.c, ku.p0, kotlin.jvm.functions.Function1<? super tg.g, ? extends com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener>):void (m)] (LINE:17) call: tg.g.<init>(tl.i, tl.c, ku.p0, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C11648g(InterfaceC11687i interfaceC11687i, InterfaceC11675c interfaceC11675c, InterfaceC7906p0 interfaceC7906p0, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11687i, (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0) : interfaceC11675c, (i10 & 4) != 0 ? C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(AbstractC7888l0.m32791U(C7864g1.m32643a(), 1, null, 2, null)).plus(new q(InterfaceC7893m0.INSTANCE))) : interfaceC7906p0, (i10 & 8) != 0 ? a.f41094a : function1);
    }
}
