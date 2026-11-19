package ch;

import av.e3;
import av.g1;
import av.g3;
import av.l0;
import av.m0;
import av.p0;
import av.q0;
import av.x;
import av.z;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener;
import com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds;
import com.roblox.protocols.nativeadsplatforminterface.generated.InitializeSdkFailureReason;
import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import im.GetQueryInfoError;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import jm.NativeAdsProgressData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u0001:\u0001KB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)Jg\u00103\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u0010\u001cJ\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010'J[\u0010>\u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\b2\u001e\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0;H\u0002¢\u0006\u0004\b>\u0010?J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190A2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bB\u0010CJ-\u0010G\u001a\u00020\u000e2\u001c\u0010F\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D\u0012\u0006\u0012\u0004\u0018\u00010E0\bH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010\\\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190A0Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lch/i;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;", "Lhm/i;", "moduleInstaller", "Lhm/c;", "gmaSdkController", "Lav/p0;", "scope", "Lkotlin/Function1;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "setPlatformImpl", "<init>", "(Lhm/i;Lhm/c;Lav/p0;Lkotlin/jvm/functions/Function1;)V", "controller", BuildConfig.FLAVOR, "n", "(Lhm/c;)V", "i", "()V", BuildConfig.FLAVOR, "eagerInstall", "install", "(Z)V", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "experimentVariant", "initialize", "(ILjava/lang/String;)V", "requestId", "initializeAdUnitId", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;)V", "adTracingId", "adUnitId", "loadInterstitialAd", "adResponseJson", "onServeInterstitialAdResponse", "onServeInterstitialAdFailed", "(Ljava/lang/String;)V", "getQueryInfo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adString", "durationNeededEnum", BuildConfig.FLAVOR, "durationNeededForRewardMs", "isEuUser", "creativeUrl", "uiExperimentData", "gmaAdType", "isClickable", "setAdString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "showAd", "cleanupAd", "destroyInterstitialAd", "Lhm/a;", "adFormat", "onSuccess", "Lkotlin/Function3;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "onFailure", "k", "(Lhm/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lpu/n;)V", "queryInfo", "Lzt/n;", "o", "(Lhm/a;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Leu/b;", BuildConfig.FLAVOR, "block", "j", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lhm/i;", "b", "Lhm/c;", "c", "Lav/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "f", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "nativeAdsCore", "Ljava/util/concurrent/ConcurrentHashMap;", "Lav/x;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "pendingServeAds", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends IPlatformNativeAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hm.i moduleInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile hm.c gmaSdkController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<i, INativeAdsCoreListener> setPlatformImpl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public INativeAdsCoreListener nativeAdsCore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<zt.n<String>>> pendingServeAds;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function1<IPlatformNativeAds, INativeAdsCoreListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5161a = new a();

        public a() {
            super(1, INativeAdsCoreListener.class, "setPlatformImpl", "setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", 0);
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final INativeAdsCoreListener invoke(IPlatformNativeAds iPlatformNativeAds) {
            return INativeAdsCoreListener.setPlatformImpl(iPlatformNativeAds);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5162a;

        static {
            int[] iArr = new int[hm.a.values().length];
            try {
                iArr[hm.a.Interstitial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hm.a.Rewarded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5162a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$cleanupAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5163t;

        public d(eu.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new d(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5163t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            i.this.gmaSdkController.f();
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$destroyInterstitialAd$1", f = "NativeAdsHandler.kt", l = {438}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5165t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f5167v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f5167v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new e(this.f5167v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f5165t;
            if (i10 == 0) {
                zt.o.b(obj);
                hm.c cVar = i.this.gmaSdkController;
                hm.a aVar = hm.a.Interstitial;
                String str = this.f5167v;
                this.f5165t = 1;
                if (cVar.a(aVar, str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$enqueue$1", f = "NativeAdsHandler.kt", l = {448}, m = "invokeSuspend", v = 1)
    public static final class f extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super Unit>, Object> f5169u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super eu.b<? super Unit>, ? extends Object> function1, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f5169u = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f5169u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f5168t;
            if (i10 == 0) {
                zt.o.b(obj);
                Function1<eu.b<? super Unit>, Object> function1 = this.f5169u;
                this.f5168t = 1;
                if (function1.invoke(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5170t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f5171u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f5172v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f5173w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f5174x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f5175y;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ch/i$g$a", "Lhm/j;", BuildConfig.FLAVOR, "queryInfo", BuildConfig.FLAVOR, "onSuccess", "(Ljava/lang/String;)V", "Lim/a;", "error", "a", "(Lim/a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements hm.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f5176a;
            public final /* synthetic */ boolean b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f5177c;

            /* JADX INFO: renamed from: ch.i$g$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0104a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5178t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f5179u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ GetQueryInfoError f5180v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ i f5181w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ int f5182x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0104a(boolean z10, GetQueryInfoError getQueryInfoError, i iVar, int i10, eu.b<? super C0104a> bVar) {
                    super(1, bVar);
                    this.f5179u = z10;
                    this.f5180v = getQueryInfoError;
                    this.f5181w = iVar;
                    this.f5182x = i10;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new C0104a(this.f5179u, this.f5180v, this.f5181w, this.f5182x, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5178t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    if (this.f5179u) {
                        ch.b bVar = ch.b.TERMINAL;
                        String message = this.f5180v.getMessage();
                        if (message == null) {
                            message = "UNKNOWN";
                        }
                        ch.l.e(bVar, message);
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5181w.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f5182x, BuildConfig.FLAVOR);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((C0104a) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5183t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f5184u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f5185v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f5186w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ String f5187x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z10, i iVar, int i10, String str, eu.b<? super b> bVar) {
                    super(1, bVar);
                    this.f5184u = z10;
                    this.f5185v = iVar;
                    this.f5186w = i10;
                    this.f5187x = str;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new b(this.f5184u, this.f5185v, this.f5186w, this.f5187x, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5183t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    if (this.f5184u) {
                        ch.l.e(ch.b.TERMINAL, "success");
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5185v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        int i10 = this.f5186w;
                        String str = this.f5187x;
                        if (str == null) {
                            str = BuildConfig.FLAVOR;
                        }
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, str);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            public a(i iVar, boolean z10, int i10) {
                this.f5176a = iVar;
                this.b = z10;
                this.f5177c = i10;
            }

            @Override // hm.j
            public void a(GetQueryInfoError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                i iVar = this.f5176a;
                iVar.j(new C0104a(this.b, error, iVar, this.f5177c, null));
            }

            @Override // hm.j
            public void onSuccess(String queryInfo) {
                i iVar = this.f5176a;
                iVar.j(new b(this.b, iVar, this.f5177c, queryInfo, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, i iVar, int i10, String str3, eu.b<? super g> bVar) {
            super(1, bVar);
            this.f5171u = str;
            this.f5172v = str2;
            this.f5173w = iVar;
            this.f5174x = i10;
            this.f5175y = str3;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new g(this.f5171u, this.f5172v, this.f5173w, this.f5174x, this.f5175y, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5170t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            boolean z10 = Intrinsics.c(this.f5171u, "IsolatedRewarded") || Intrinsics.c(this.f5171u, "NonIsolatedRewarded");
            if (z10) {
                ch.l.f(b.ATTEMPT, null, 2, null);
            }
            if (this.f5172v.length() != 0) {
                this.f5173w.gmaSdkController.d(this.f5172v, this.f5175y, this.f5171u, new a(this.f5173w, z10, this.f5174x));
                return Unit.f21506a;
            }
            if (z10) {
                ch.l.e(b.TERMINAL, "MISSING_AD_TRACING_ID");
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f5173w.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f5174x, BuildConfig.FLAVOR);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class h extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5188t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f5190v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f5191w;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1$1$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f5192t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f5193u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f5194v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Boolean f5195w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f5196x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, int i10, Boolean bool, String str, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f5193u = iVar;
                this.f5194v = i10;
                this.f5195w = bool;
                this.f5196x = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f5193u, this.f5194v, this.f5195w, this.f5196x, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f5192t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                INativeAdsCoreListener iNativeAdsCoreListener = this.f5193u.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    int i10 = this.f5194v;
                    Boolean bool = this.f5195w;
                    Intrinsics.checkNotNull(bool);
                    iNativeAdsCoreListener.onInitializeCompleted(i10, bool.booleanValue(), this.f5196x);
                }
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super Unit> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, eu.b<? super h> bVar) {
            super(1, bVar);
            this.f5190v = str;
            this.f5191w = i10;
        }

        public static final void q(i iVar, int i10, Boolean bool, String str) {
            iVar.j(new a(iVar, i10, bool, str, null));
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new h(this.f5190v, this.f5191w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5188t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            hm.c cVar = i.this.gmaSdkController;
            String str = this.f5190v;
            final i iVar = i.this;
            final int i10 = this.f5191w;
            cVar.i(str, new BiConsumer() { // from class: ch.j
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    i.h.q(iVar, i10, (Boolean) obj2, (String) obj3);
                }
            });
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: renamed from: ch.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1", f = "NativeAdsHandler.kt", l = {185, 198}, m = "invokeSuspend", v = 1)
    public static final class C0105i extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5197t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f5199v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f5200w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0105i(String str, String str2, eu.b<? super C0105i> bVar) {
            super(1, bVar);
            this.f5199v = str;
            this.f5200w = str2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new C0105i(this.f5199v, this.f5200w, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r5.b(r1, r4) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        
            if (r5 == r0) goto L27;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objC;
            INativeAdsCoreListener iNativeAdsCoreListener;
            InitializeSdkFailureReason initializeSdkFailureReason;
            Object objE = fu.c.e();
            int i10 = this.f5197t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (i.this.gmaSdkController instanceof NoopGmaSdkController) {
                    if (!JNINativeAdsProtocol.getGmaSdkBackgroundInstallIxpEnabled()) {
                        ok.q.h("NativeAdsHandler", "gmasdk is not installed, trigger the installation");
                        if (bi.h.a().q1()) {
                            hm.i iVar = i.this.moduleInstaller;
                            hm.i.a aVar = hm.i.a.BACKGROUND;
                            this.f5197t = 1;
                        } else {
                            i.this.moduleInstaller.a(false);
                        }
                    }
                    iNativeAdsCoreListener = i.this.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onInitializeSdkFailed(this.f5199v, InitializeSdkFailureReason.NOTINSTALLED, "gmasdk module not installed");
                    }
                    return Unit.f21506a;
                }
                hm.c cVar = i.this.gmaSdkController;
                String str = this.f5200w;
                this.f5197t = 2;
                objC = cVar.c(str, this);
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                iNativeAdsCoreListener = i.this.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    iNativeAdsCoreListener.onInitializeSdkFailed(this.f5199v, InitializeSdkFailureReason.NOTINSTALLED, "gmasdk module not installed");
                }
                return Unit.f21506a;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            objC = ((zt.n) obj).getValue();
            i iVar2 = i.this;
            String str2 = this.f5199v;
            if (zt.n.h(objC)) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = iVar2.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onInitializeSdkSuccess(str2);
                }
            }
            i iVar3 = i.this;
            String str3 = this.f5199v;
            Throwable thE = zt.n.e(objC);
            if (thE != null) {
                if (thE instanceof hm.b) {
                    initializeSdkFailureReason = InitializeSdkFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    initializeSdkFailureReason = thE instanceof e3 ? InitializeSdkFailureReason.TIMEDOUT : InitializeSdkFailureReason.UNDEFINED;
                }
                INativeAdsCoreListener iNativeAdsCoreListener3 = iVar3.nativeAdsCore;
                if (iNativeAdsCoreListener3 != null) {
                    String message = thE.getMessage();
                    if (message == null) {
                        message = BuildConfig.FLAVOR;
                    }
                    iNativeAdsCoreListener3.onInitializeSdkFailed(str3, initializeSdkFailureReason, message);
                }
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((C0105i) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$install$1", f = "NativeAdsHandler.kt", l = {157, 159}, m = "invokeSuspend", v = 1)
    public static final class j extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5201t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f5202u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f5203v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, i iVar, eu.b<? super j> bVar) {
            super(1, bVar);
            this.f5202u = z10;
            this.f5203v = iVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new j(this.f5202u, this.f5203v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r6.b(r1, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (r6.b(r1, r5) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        
            return r0;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f5201t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (JNINativeAdsProtocol.getGmaSdkBackgroundInstallIxpEnabled() && ai.h.y()) {
                    ok.q.h("NativeAdsHandler", "engine triggered gmasdk install, eager install: " + this.f5202u);
                    if (this.f5202u) {
                        hm.i iVar = this.f5203v.moduleInstaller;
                        hm.i.a aVar = hm.i.a.BACKGROUND;
                        this.f5201t = 1;
                    } else {
                        hm.i iVar2 = this.f5203v.moduleInstaller;
                        hm.i.a aVar2 = hm.i.a.DEFERRED;
                        this.f5201t = 2;
                    }
                } else {
                    this.f5203v.moduleInstaller.a(this.f5202u);
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1", f = "NativeAdsHandler.kt", l = {235}, m = "invokeSuspend", v = 1)
    public static final class k extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5204t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f5205u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ pu.n<String, LoadAdFailureReason, String, Unit> f5206v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f5207w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ hm.a f5208x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f5209y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f5210z;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "queryInfo", "Lzt/n;", "<anonymous>", "(Ljava/lang/String;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1$1", f = "NativeAdsHandler.kt", l = {236}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<String, eu.b<? super zt.n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f5211t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f5212u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i f5213v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ hm.a f5214w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f5215x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, hm.a aVar, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f5213v = iVar;
                this.f5214w = aVar;
                this.f5215x = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.f5213v, this.f5214w, this.f5215x, bVar);
                aVar.f5212u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objO;
                String str = (String) this.f5212u;
                Object objE = fu.c.e();
                int i10 = this.f5211t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    i iVar = this.f5213v;
                    hm.a aVar = this.f5214w;
                    String str2 = this.f5215x;
                    this.f5212u = gu.l.a(str);
                    this.f5211t = 1;
                    objO = iVar.o(aVar, str2, str, this);
                    if (objO == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    objO = ((zt.n) obj).getValue();
                }
                return zt.n.a(objO);
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, eu.b<? super zt.n<String>> bVar) {
                return ((a) create(str, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, pu.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> nVar, i iVar, hm.a aVar, String str2, Function1<? super String, Unit> function1, eu.b<? super k> bVar) {
            super(1, bVar);
            this.f5205u = str;
            this.f5206v = nVar;
            this.f5207w = iVar;
            this.f5208x = aVar;
            this.f5209y = str2;
            this.f5210z = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new k(this.f5205u, this.f5206v, this.f5207w, this.f5208x, this.f5209y, this.f5210z, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object objG;
            LoadAdFailureReason loadAdFailureReasonA;
            Object objE = fu.c.e();
            int i10 = this.f5204t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (this.f5205u.length() == 0) {
                    this.f5206v.invoke(this.f5205u, LoadAdFailureReason.ADTRACINGIDABSENT, "adTracingId is empty");
                    return Unit.f21506a;
                }
                hm.c cVar = this.f5207w.gmaSdkController;
                hm.a aVar = this.f5208x;
                String str = this.f5205u;
                String str2 = this.f5209y;
                a aVar2 = new a(this.f5207w, aVar, str, null);
                this.f5204t = 1;
                kVar = this;
                objG = cVar.g(aVar, str, str2, aVar2, kVar);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                objG = ((zt.n) obj).getValue();
                kVar = this;
            }
            Function1<String, Unit> function1 = kVar.f5210z;
            String str3 = kVar.f5205u;
            if (zt.n.h(objG)) {
                function1.invoke(str3);
            }
            pu.n<String, LoadAdFailureReason, String, Unit> nVar = kVar.f5206v;
            String str4 = kVar.f5205u;
            Throwable thE = zt.n.e(objG);
            if (thE != null) {
                if (thE instanceof hm.b) {
                    loadAdFailureReasonA = LoadAdFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    hm.e eVar = thE instanceof hm.e ? (hm.e) thE : null;
                    loadAdFailureReasonA = hm.h.a(eVar != null ? eVar.getReason() : null);
                }
                String message = thE.getMessage();
                if (message == null) {
                    message = BuildConfig.FLAVOR;
                }
                nVar.invoke(str4, loadAdFailureReasonA, message);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$replaceNoopGmaSdkController$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5216t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ hm.c f5218v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(hm.c cVar, eu.b<? super l> bVar) {
            super(1, bVar);
            this.f5218v = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new l(this.f5218v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5216t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            i.this.gmaSdkController = this.f5218v;
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler", f = "NativeAdsHandler.kt", l = {273}, m = "serveAd-BWLJW6A", v = 1)
    public static final class m extends gu.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f5219t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f5220u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f5221v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f5222w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f5223x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f5224y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f5225z;

        public m(eu.b<? super m> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5225z = obj;
            this.B |= Integer.MIN_VALUE;
            Object objO = i.this.o(null, null, null, this);
            return objO == fu.c.e() ? objO : zt.n.a(objO);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$serveAd$2", f = "NativeAdsHandler.kt", l = {274}, m = "invokeSuspend", v = 1)
    public static final class n extends gu.m implements Function2<p0, eu.b<? super zt.n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5226t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<zt.n<String>> f5227u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(x<zt.n<String>> xVar, eu.b<? super n> bVar) {
            super(2, bVar);
            this.f5227u = xVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new n(this.f5227u, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super zt.n<String>> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f5226t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            x<zt.n<String>> xVar = this.f5227u;
            this.f5226t = 1;
            Object objY = xVar.y(this);
            return objY == objE ? objE : objY;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super zt.n<? extends String>> bVar) {
            return invoke2(p0Var, (eu.b<? super zt.n<String>>) bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends gu.m implements Function1<eu.b<? super Unit>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5228t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f5229u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f5230v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f5231w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f5232x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f5233y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f5234z;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ch/i$o$a", "Lhm/f;", BuildConfig.FLAVOR, "onSuccess", "()V", BuildConfig.FLAVOR, "errorMessage", "onFailure", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements hm.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f5235a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: ch.i$o$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0106a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5236t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f5237u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f5238v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f5239w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0106a(i iVar, int i10, String str, eu.b<? super C0106a> bVar) {
                    super(1, bVar);
                    this.f5237u = iVar;
                    this.f5238v = i10;
                    this.f5239w = str;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new C0106a(this.f5237u, this.f5238v, this.f5239w, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5236t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5237u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f5238v, false, this.f5239w);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((C0106a) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5240t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f5241u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f5242v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i iVar, int i10, eu.b<? super b> bVar) {
                    super(1, bVar);
                    this.f5241u = iVar;
                    this.f5242v = i10;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new b(this.f5241u, this.f5242v, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5240t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5241u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f5242v, true, BuildConfig.FLAVOR);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            public a(i iVar, int i10) {
                this.f5235a = iVar;
                this.b = i10;
            }

            @Override // hm.f
            public void onFailure(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                i iVar = this.f5235a;
                iVar.j(new C0106a(iVar, this.b, errorMessage, null));
            }

            @Override // hm.f
            public void onSuccess() {
                i iVar = this.f5235a;
                iVar.j(new b(iVar, this.b, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, i iVar, int i10, long j10, String str2, boolean z10, String str3, String str4, boolean z11, String str5, String str6, String str7, eu.b<? super o> bVar) {
            super(1, bVar);
            this.f5229u = str;
            this.f5230v = iVar;
            this.f5231w = i10;
            this.f5232x = j10;
            this.f5233y = str2;
            this.f5234z = z10;
            this.A = str3;
            this.B = str4;
            this.C = z11;
            this.D = str5;
            this.E = str6;
            this.F = str7;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new o(this.f5229u, this.f5230v, this.f5231w, this.f5232x, this.f5233y, this.f5234z, this.A, this.B, this.C, this.D, this.E, this.F, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5228t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (this.f5229u.length() == 0) {
                INativeAdsCoreListener iNativeAdsCoreListener = this.f5230v.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    iNativeAdsCoreListener.onSetAdStringCompleted(this.f5231w, false, "adTracingId is empty");
                }
                return Unit.f21506a;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                long j10 = this.f5232x;
                String str = this.f5233y;
                boolean z10 = this.f5234z;
                String str2 = this.A;
                String str3 = this.B;
                boolean z11 = this.C;
                String str4 = this.D;
                String str5 = this.E;
                String str6 = this.F;
                jSONObject.put("durationNeededForRewardMs", j10);
                jSONObject.put("durationNeededEnum", str);
                jSONObject.put("isEUUser", z10);
                jSONObject.put("moderationExternalCreativeUrl", str2);
                jSONObject.put("gmaAdType", str3);
                jSONObject.put("isClickable", z11);
                jSONObject.put("uiExperimentData", new JSONObject(str4));
                jSONObject.put("adString", str5);
                jSONObject.put("adUnitId", str6);
                this.f5230v.gmaSdkController.j(this.f5229u, jSONObject, new a(this.f5230v, this.f5231w));
                return Unit.f21506a;
            } catch (JSONException e10) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = this.f5230v.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onSetAdStringCompleted(this.f5231w, false, "setAdString failed to construct JSON - " + e10);
                }
                return Unit.f21506a;
            }
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5243t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f5244u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f5245v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f5246w;

        @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"ch/i$p$a", "Lhm/k;", "Ljm/c;", "status", BuildConfig.FLAVOR, "watchDuration", BuildConfig.FLAVOR, "d", "(Ljm/c;F)V", BuildConfig.FLAVOR, "gmaAdType", BuildConfig.FLAVOR, "isEndCardVisible", "c", "(Ljava/lang/String;Z)V", "Ljm/b;", "progressData", "a", "(Ljm/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements hm.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f5247a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: ch.i$p$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0107a extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5248t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f5249u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ NativeAdsProgressData f5250v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0107a(i iVar, NativeAdsProgressData nativeAdsProgressData, eu.b<? super C0107a> bVar) {
                    super(1, bVar);
                    this.f5249u = iVar;
                    this.f5250v = nativeAdsProgressData;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new C0107a(this.f5249u, this.f5250v, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5248t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5249u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onAdProgress((float) this.f5250v.getAdProgress(), (float) this.f5250v.getVideoDuration(), this.f5250v.getPrice(), this.f5250v.getPricePrecisionType(), this.f5250v.getPriceCurrencyCode());
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((C0107a) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onCtaClicked$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5251t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f5252u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f5253v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f5254w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, i iVar, boolean z10, eu.b<? super b> bVar) {
                    super(1, bVar);
                    this.f5252u = str;
                    this.f5253v = iVar;
                    this.f5254w = z10;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new b(this.f5252u, this.f5253v, this.f5254w, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5251t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    ok.q.h("NativeAdsHandler", "cta clicked");
                    String str = this.f5252u;
                    if (str == null) {
                        ok.q.e("NativeAdsHandler", "Invalid ad type, cannot log click");
                        return Unit.f21506a;
                    }
                    String str2 = Intrinsics.c(str, "AppPromo") ? "AppPromo" : "ClickOut";
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5253v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onCtaClick(str2, this.f5254w);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onPlayBackEnded$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class c extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5255t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f5256u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f5257v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ jm.c f5258w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f5259x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(i iVar, int i10, jm.c cVar, float f10, eu.b<? super c> bVar) {
                    super(1, bVar);
                    this.f5256u = iVar;
                    this.f5257v = i10;
                    this.f5258w = cVar;
                    this.f5259x = f10;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new c(this.f5256u, this.f5257v, this.f5258w, this.f5259x, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5255t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5256u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onShowAdCompleted(this.f5257v, this.f5258w.getValue(), this.f5259x);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((c) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onUserReportAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class d extends gu.m implements Function1<eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f5260t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f5261u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f5262v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f5263w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(i iVar, String str, String str2, eu.b<? super d> bVar) {
                    super(1, bVar);
                    this.f5261u = iVar;
                    this.f5262v = str;
                    this.f5263w = str2;
                }

                @Override // gu.a
                public final eu.b<Unit> create(eu.b<?> bVar) {
                    return new d(this.f5261u, this.f5262v, this.f5263w, bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f5260t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f5261u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onReportAd(this.f5262v, this.f5263w);
                    }
                    return Unit.f21506a;
                }

                @Override // p001kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(eu.b<? super Unit> bVar) {
                    return ((d) create(bVar)).invokeSuspend(Unit.f21506a);
                }
            }

            public a(i iVar, int i10) {
                this.f5247a = iVar;
                this.b = i10;
            }

            @Override // hm.k
            public void a(NativeAdsProgressData progressData) {
                Intrinsics.checkNotNullParameter(progressData, "progressData");
                i iVar = this.f5247a;
                iVar.j(new C0107a(iVar, progressData, null));
            }

            @Override // hm.k
            public void b(String reasonKey, String description) {
                Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
                Intrinsics.checkNotNullParameter(description, "description");
                i iVar = this.f5247a;
                iVar.j(new d(iVar, reasonKey, description, null));
            }

            @Override // hm.k
            public void c(String gmaAdType, boolean isEndCardVisible) {
                i iVar = this.f5247a;
                iVar.j(new b(gmaAdType, iVar, isEndCardVisible, null));
            }

            @Override // hm.k
            public void d(jm.c status, float watchDuration) {
                Intrinsics.checkNotNullParameter(status, "status");
                i iVar = this.f5247a;
                iVar.j(new c(iVar, this.b, status, watchDuration, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, i iVar, int i10, eu.b<? super p> bVar) {
            super(1, bVar);
            this.f5244u = str;
            this.f5245v = iVar;
            this.f5246w = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new p(this.f5244u, this.f5245v, this.f5246w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f5243t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (this.f5244u.length() != 0) {
                this.f5245v.gmaSdkController.b(this.f5244u, new a(this.f5245v, this.f5246w));
                return Unit.f21506a;
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f5245v.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onShowAdCompleted(this.f5246w, jm.c.INTERNAL_ERROR.getValue(), 0.0f);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ch/i$q", "Lkotlin/coroutines/a;", "Lav/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", BuildConfig.FLAVOR, "exception", BuildConfig.FLAVOR, "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class q extends p001kotlin.coroutines.a implements m0 {
        public q(m0.Companion companion) {
            super(companion);
        }

        @Override // av.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            ok.q.f("NativeAdsHandler", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull hm.i moduleInstaller, @NotNull hm.c gmaSdkController, @NotNull p0 scope, @NotNull Function1<? super i, ? extends INativeAdsCoreListener> setPlatformImpl) {
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

    public static final Unit l(i iVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INativeAdsCoreListener iNativeAdsCoreListener = iVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdSuccess(it);
        }
        return Unit.f21506a;
    }

    public static final Unit m(i iVar, String id2, LoadAdFailureReason reason, String message) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        INativeAdsCoreListener iNativeAdsCoreListener = iVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdFailed(id2, reason, message);
        }
        return Unit.f21506a;
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void cleanupAd() {
        j(new d(null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void destroyInterstitialAd(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        j(new e(adTracingId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void getQueryInfo(int id2, @NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        j(new g(experimentVariant, adTracingId, this, id2, adUnitId, null));
    }

    public final void i() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            ok.q.e("NativeAdsHandler", "cleanup() called more than once");
            return;
        }
        ok.q.h("NativeAdsHandler", "cleanup");
        this.setPlatformImpl.invoke(null);
        this.nativeAdsCore = null;
        this.gmaSdkController.destroy();
        q0.f(this.scope, null, 1, null);
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initialize(int id2, @NotNull String experimentVariant) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        j(new h(experimentVariant, id2, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initializeSdk(@NotNull String requestId, @NotNull String initializeAdUnitId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(initializeAdUnitId, "initializeAdUnitId");
        j(new C0105i(requestId, initializeAdUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void install(boolean eagerInstall) {
        j(new j(eagerInstall, this, null));
    }

    public final void j(Function1<? super eu.b<? super Unit>, ? extends Object> block) {
        if (q0.i(this.scope)) {
            av.k.d(this.scope, null, null, new f(block, null), 3, null);
        } else {
            ok.q.e("NativeAdsHandler", "Failed to enqueue ads task");
        }
    }

    public final void k(hm.a adFormat, String adTracingId, String adUnitId, Function1<? super String, Unit> onSuccess, pu.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> onFailure) {
        j(new k(adTracingId, onFailure, this, adFormat, adUnitId, onSuccess, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void loadInterstitialAd(@NotNull String adTracingId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        k(hm.a.Interstitial, adTracingId, adUnitId, new Function1() { // from class: ch.g
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.l(this.f5152a, (String) obj);
            }
        }, new pu.n() { // from class: ch.h
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.m(this.f5153a, (String) obj, (LoadAdFailureReason) obj2, (String) obj3);
            }
        });
    }

    public final void n(@NotNull hm.c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        hm.c cVar = this.gmaSdkController;
        if ((cVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            j(new l(controller, null));
            return;
        }
        ok.q.e("NativeAdsHandler", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + cVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(hm.a aVar, String str, String str2, eu.b<? super zt.n<String>> bVar) {
        m mVar;
        if (bVar instanceof m) {
            mVar = (m) bVar;
            int i10 = mVar.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.B = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(bVar);
            }
        } else {
            mVar = new m(bVar);
        }
        Object objD = mVar.f5225z;
        Object objE = fu.c.e();
        int i11 = mVar.B;
        try {
            if (i11 == 0) {
                zt.o.b(objD);
                INativeAdsCoreListener iNativeAdsCoreListener = this.nativeAdsCore;
                if (iNativeAdsCoreListener == null) {
                    zt.n.Companion companion = zt.n.INSTANCE;
                    return zt.n.b(zt.o.a(new IllegalStateException("nativeAdsCore is null")));
                }
                x<zt.n<String>> xVarC = z.c(null, 1, null);
                x<zt.n<String>> xVarPutIfAbsent = this.pendingServeAds.putIfAbsent(str, xVarC);
                if (xVarPutIfAbsent != null) {
                    String str3 = "serveAd already in flight for adTracingId " + str + "; ignoring newer request";
                    ok.q.e("NativeAdsHandler", str3);
                    zt.n.Companion companion2 = zt.n.INSTANCE;
                    return zt.n.b(zt.o.a(new IllegalStateException(str3)));
                }
                int i12 = c.f5162a[aVar.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new zt.l();
                    }
                    this.pendingServeAds.remove(str);
                    ok.q.e("NativeAdsHandler", "serveAd not supported for rewarded ads");
                    zt.n.Companion companion3 = zt.n.INSTANCE;
                    return zt.n.b(zt.o.a(new IllegalStateException("serveAd not supported for rewarded ads")));
                }
                iNativeAdsCoreListener.onServeInterstitialAd(str, str2);
                p001kotlin.time.a.Companion companion4 = p001kotlin.time.a.INSTANCE;
                long jP = p001kotlin.time.b.p(bi.h.a().U4(), zu.b.SECONDS);
                n nVar = new n(xVarC, null);
                mVar.f5219t = gu.l.a(aVar);
                mVar.f5220u = str;
                mVar.f5221v = gu.l.a(str2);
                mVar.f5222w = gu.l.a(iNativeAdsCoreListener);
                mVar.f5223x = gu.l.a(xVarC);
                mVar.f5224y = gu.l.a(xVarPutIfAbsent);
                mVar.B = 1;
                objD = g3.d(jP, nVar, mVar);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) mVar.f5220u;
                zt.o.b(objD);
            }
            return ((zt.n) objD).getValue();
        } catch (e3 e10) {
            this.pendingServeAds.remove(str);
            zt.n.Companion companion5 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(e10));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdFailed(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        x<zt.n<String>> xVarRemove = this.pendingServeAds.remove(adTracingId);
        if (xVarRemove != null) {
            zt.n.Companion companion = zt.n.INSTANCE;
            xVarRemove.s(zt.n.a(zt.n.b(zt.o.a(new RuntimeException("serveAd failed")))));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdResponse(@NotNull String adTracingId, @NotNull String adResponseJson) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adResponseJson, "adResponseJson");
        x<zt.n<String>> xVarRemove = this.pendingServeAds.remove(adTracingId);
        if (xVarRemove != null) {
            xVarRemove.s(zt.n.a(zt.n.b(adResponseJson)));
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
        j(new o(adTracingId, this, id2, durationNeededForRewardMs, durationNeededEnum, isEuUser, creativeUrl, gmaAdType, isClickable, uiExperimentData, adString, adUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void showAd(int id2, @NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        j(new p(adTracingId, this, id2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i(hm.i iVar, hm.c cVar, p0 p0Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0) : cVar, (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.T(g1.a(), 1, null, 2, null)).plus(new q(m0.INSTANCE))) : p0Var, (i10 & 8) != 0 ? a.f5161a : function1);
    }
}
