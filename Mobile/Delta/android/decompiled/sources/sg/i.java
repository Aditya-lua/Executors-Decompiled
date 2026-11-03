package sg;

import com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener;
import com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds;
import com.roblox.protocols.nativeadsplatforminterface.generated.LoadAdFailureReason;
import com.roblox.universalapp.ads.NoopGmaSdkController;
import iu.e3;
import iu.g1;
import iu.g3;
import iu.l0;
import iu.m0;
import iu.p0;
import iu.q0;
import iu.x;
import iu.z;
import iu.z2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import sl.GetQueryInfoError;
import tl.NativeAdsProgressData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ]2\u00020\u0001:\u0001KB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)Jg\u00103\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u0010\u001cJ\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010'J[\u0010>\u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\b2\u001e\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0;H\u0002¢\u0006\u0004\b>\u0010?J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190A2\u0006\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bB\u0010CJ-\u0010G\u001a\u00020\u000e2\u001c\u0010F\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D\u0012\u0006\u0012\u0004\u0018\u00010E0\bH\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR,\u0010\\\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190A0Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lsg/i;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;", "Lrl/i;", "moduleInstaller", "Lrl/c;", "gmaSdkController", "Liu/p0;", "scope", "Lkotlin/Function1;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "setPlatformImpl", "<init>", "(Lrl/i;Lrl/c;Liu/p0;Lkotlin/jvm/functions/Function1;)V", "controller", "", "n", "(Lrl/c;)V", "i", "()V", "", "eagerInstall", "install", "(Z)V", "", "id", "", "experimentVariant", "initialize", "(ILjava/lang/String;)V", "requestId", "initializeAdUnitId", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;)V", "adTracingId", "adUnitId", "loadInterstitialAd", "adResponseJson", "onServeInterstitialAdResponse", "onServeInterstitialAdFailed", "(Ljava/lang/String;)V", "getQueryInfo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adString", "durationNeededEnum", "", "durationNeededForRewardMs", "isEuUser", "creativeUrl", "uiExperimentData", "gmaAdType", "isClickable", "setAdString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "showAd", "cleanupAd", "destroyInterstitialAd", "Lrl/a;", "adFormat", "onSuccess", "Lkotlin/Function3;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;", "onFailure", "k", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lxt/n;)V", "queryInfo", "Lgt/n;", "o", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Llt/b;", "", "block", "j", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lrl/i;", "b", "Lrl/c;", "c", "Liu/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "f", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "nativeAdsCore", "Ljava/util/concurrent/ConcurrentHashMap;", "Liu/x;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "pendingServeAds", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends IPlatformNativeAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rl.i moduleInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile rl.c gmaSdkController;

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
    public final ConcurrentHashMap<String, x<gt.n<String>>> pendingServeAds;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function1<IPlatformNativeAds, INativeAdsCoreListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31219a = new a();

        public a() {
            super(1, INativeAdsCoreListener.class, "setPlatformImpl", "setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final INativeAdsCoreListener invoke(IPlatformNativeAds iPlatformNativeAds) {
            return INativeAdsCoreListener.setPlatformImpl(iPlatformNativeAds);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31220a;

        static {
            int[] iArr = new int[rl.a.values().length];
            try {
                iArr[rl.a.Interstitial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl.a.Rewarded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31220a = iArr;
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$cleanupAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31221t;

        public d(lt.b<? super d> bVar) {
            super(1, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new d(bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31221t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            i.this.gmaSdkController.d();
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$destroyInterstitialAd$1", f = "NativeAdsHandler.kt", l = {438}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31223t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31225v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f31225v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new e(this.f31225v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f31223t;
            if (i10 == 0) {
                gt.o.b(obj);
                rl.c cVar = i.this.gmaSdkController;
                rl.a aVar = rl.a.Interstitial;
                String str = this.f31225v;
                this.f31223t = 1;
                if (cVar.a(aVar, str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$enqueue$1", f = "NativeAdsHandler.kt", l = {448}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31226t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super Unit>, Object> f31227u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super lt.b<? super Unit>, ? extends Object> function1, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f31227u = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(this.f31227u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f31226t;
            if (i10 == 0) {
                gt.o.b(obj);
                Function1<lt.b<? super Unit>, Object> function1 = this.f31227u;
                this.f31226t = 1;
                if (function1.invoke(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31228t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31229u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31230v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f31231w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f31232x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31233y;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"sg/i$g$a", "Lrl/j;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lsl/a;", "error", "a", "(Lsl/a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31234a;
            public final /* synthetic */ boolean b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f31235c;

            /* JADX INFO: renamed from: sg.i$g$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0552a extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31236t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f31237u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ GetQueryInfoError f31238v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ i f31239w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ int f31240x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0552a(boolean z10, GetQueryInfoError getQueryInfoError, i iVar, int i10, lt.b<? super C0552a> bVar) {
                    super(1, bVar);
                    this.f31237u = z10;
                    this.f31238v = getQueryInfoError;
                    this.f31239w = iVar;
                    this.f31240x = i10;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new C0552a(this.f31237u, this.f31238v, this.f31239w, this.f31240x, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31236t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    if (this.f31237u) {
                        sg.b bVar = sg.b.TERMINAL;
                        String message = this.f31238v.getMessage();
                        if (message == null) {
                            message = "UNKNOWN";
                        }
                        sg.l.e(bVar, message);
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31239w.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f31240x, "");
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((C0552a) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class b extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31241t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f31242u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f31243v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f31244w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ String f31245x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z10, i iVar, int i10, String str, lt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31242u = z10;
                    this.f31243v = iVar;
                    this.f31244w = i10;
                    this.f31245x = str;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new b(this.f31242u, this.f31243v, this.f31244w, this.f31245x, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31241t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    if (this.f31242u) {
                        sg.l.e(sg.b.TERMINAL, "success");
                    }
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31243v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        int i10 = this.f31244w;
                        String str = this.f31245x;
                        if (str == null) {
                            str = "";
                        }
                        iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, str);
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            public a(i iVar, boolean z10, int i10) {
                this.f31234a = iVar;
                this.b = z10;
                this.f31235c = i10;
            }

            @Override // rl.j
            public void a(GetQueryInfoError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                i iVar = this.f31234a;
                iVar.j(new C0552a(this.b, error, iVar, this.f31235c, null));
            }

            @Override // rl.j
            public void onSuccess(String queryInfo) {
                i iVar = this.f31234a;
                iVar.j(new b(this.b, iVar, this.f31235c, queryInfo, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, i iVar, int i10, String str3, lt.b<? super g> bVar) {
            super(1, bVar);
            this.f31229u = str;
            this.f31230v = str2;
            this.f31231w = iVar;
            this.f31232x = i10;
            this.f31233y = str3;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new g(this.f31229u, this.f31230v, this.f31231w, this.f31232x, this.f31233y, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31228t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            boolean z10 = Intrinsics.c(this.f31229u, "IsolatedRewarded") || Intrinsics.c(this.f31229u, "NonIsolatedRewarded");
            if (z10) {
                sg.l.f(b.ATTEMPT, null, 2, null);
            }
            if (this.f31230v.length() != 0) {
                this.f31231w.gmaSdkController.e(this.f31230v, this.f31233y, this.f31229u, new a(this.f31231w, z10, this.f31232x));
                return Unit.f22938a;
            }
            if (z10) {
                sg.l.e(b.TERMINAL, "MISSING_AD_TRACING_ID");
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f31231w.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onGetQueryInfoCompleted(this.f31232x, "");
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31246t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31248v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31249w;

        @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$initialize$1$1$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a extends nt.m implements Function1<lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31250t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f31251u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f31252v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Boolean f31253w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f31254x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, int i10, Boolean bool, String str, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f31251u = iVar;
                this.f31252v = i10;
                this.f31253w = bool;
                this.f31254x = str;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f31251u, this.f31252v, this.f31253w, this.f31254x, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f31250t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                INativeAdsCoreListener iNativeAdsCoreListener = this.f31251u.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    int i10 = this.f31252v;
                    Boolean bool = this.f31253w;
                    Intrinsics.checkNotNull(bool);
                    iNativeAdsCoreListener.onInitializeCompleted(i10, bool.booleanValue(), this.f31254x);
                }
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super Unit> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, lt.b<? super h> bVar) {
            super(1, bVar);
            this.f31248v = str;
            this.f31249w = i10;
        }

        public static final void q(i iVar, int i10, Boolean bool, String str) {
            iVar.j(new a(iVar, i10, bool, str, null));
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new h(this.f31248v, this.f31249w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31246t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            rl.c cVar = i.this.gmaSdkController;
            String str = this.f31248v;
            final i iVar = i.this;
            final int i10 = this.f31249w;
            cVar.g(str, new BiConsumer() { // from class: sg.j
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    i.h.q(iVar, i10, (Boolean) obj2, (String) obj3);
                }
            });
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: renamed from: sg.i$i, reason: collision with other inner class name */
    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1", f = "NativeAdsHandler.kt", l = {185, 198}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0553i extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31255t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f31257v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f31258w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0553i(String str, String str2, lt.b<? super C0553i> bVar) {
            super(1, bVar);
            this.f31257v = str;
            this.f31258w = str2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new C0553i(this.f31257v, this.f31258w, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r5.b(r1, r4) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        
            if (r5 == r0) goto L27;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.i.C0553i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((C0553i) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$install$1", f = "NativeAdsHandler.kt", l = {157, 159}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class j extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31259t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f31260u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31261v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, i iVar, lt.b<? super j> bVar) {
            super(1, bVar);
            this.f31260u = z10;
            this.f31261v = iVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new j(this.f31260u, this.f31261v, bVar);
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
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r5.f31259t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                gt.o.b(r6)
                goto L73
            L1b:
                gt.o.b(r6)
                boolean r6 = com.roblox.universalapp.ads.JNINativeAdsProtocol.getGmaSdkBackgroundInstallIxpEnabled()
                if (r6 == 0) goto L68
                boolean r6 = qh.g.u()
                if (r6 == 0) goto L68
                boolean r6 = r5.f31260u
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "engine triggered gmasdk install, eager install: "
                r1.append(r4)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                java.lang.String r1 = "NativeAdsHandler"
                ek.q.h(r1, r6)
                boolean r6 = r5.f31260u
                if (r6 == 0) goto L57
                sg.i r6 = r5.f31261v
                rl.i r6 = sg.i.e(r6)
                rl.i$a r1 = rl.i.a.BACKGROUND
                r5.f31259t = r3
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L73
                goto L67
            L57:
                sg.i r6 = r5.f31261v
                rl.i r6 = sg.i.e(r6)
                rl.i$a r1 = rl.i.a.DEFERRED
                r5.f31259t = r2
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L73
            L67:
                return r0
            L68:
                sg.i r6 = r5.f31261v
                rl.i r6 = sg.i.e(r6)
                boolean r0 = r5.f31260u
                r6.a(r0)
            L73:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.i.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1", f = "NativeAdsHandler.kt", l = {235}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31262t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31263u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ xt.n<String, LoadAdFailureReason, String, Unit> f31264v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f31265w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ rl.a f31266x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31267y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f31268z;

        @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1$1", f = "NativeAdsHandler.kt", l = {236}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "queryInfo", "Lgt/n;", "<anonymous>", "(Ljava/lang/String;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<String, lt.b<? super gt.n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31269t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f31270u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i f31271v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ rl.a f31272w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f31273x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, rl.a aVar, String str, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f31271v = iVar;
                this.f31272w = aVar;
                this.f31273x = str;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f31271v, this.f31272w, this.f31273x, bVar);
                aVar.f31270u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objO;
                String str = (String) this.f31270u;
                Object objE = mt.c.e();
                int i10 = this.f31269t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    i iVar = this.f31271v;
                    rl.a aVar = this.f31272w;
                    String str2 = this.f31273x;
                    this.f31270u = nt.l.a(str);
                    this.f31269t = 1;
                    objO = iVar.o(aVar, str2, str, this);
                    if (objO == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    objO = ((gt.n) obj).getValue();
                }
                return gt.n.a(objO);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, lt.b<? super gt.n<String>> bVar) {
                return ((a) create(str, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, xt.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> nVar, i iVar, rl.a aVar, String str2, Function1<? super String, Unit> function1, lt.b<? super k> bVar) {
            super(1, bVar);
            this.f31263u = str;
            this.f31264v = nVar;
            this.f31265w = iVar;
            this.f31266x = aVar;
            this.f31267y = str2;
            this.f31268z = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new k(this.f31263u, this.f31264v, this.f31265w, this.f31266x, this.f31267y, this.f31268z, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object objJ;
            LoadAdFailureReason loadAdFailureReasonA;
            Object objE = mt.c.e();
            int i10 = this.f31262t;
            if (i10 == 0) {
                gt.o.b(obj);
                if (this.f31263u.length() == 0) {
                    this.f31264v.invoke(this.f31263u, LoadAdFailureReason.ADTRACINGIDABSENT, "adTracingId is empty");
                    return Unit.f22938a;
                }
                rl.c cVar = this.f31265w.gmaSdkController;
                rl.a aVar = this.f31266x;
                String str = this.f31263u;
                String str2 = this.f31267y;
                a aVar2 = new a(this.f31265w, aVar, str, null);
                this.f31262t = 1;
                kVar = this;
                objJ = cVar.j(aVar, str, str2, aVar2, kVar);
                if (objJ == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                objJ = ((gt.n) obj).getValue();
                kVar = this;
            }
            Function1<String, Unit> function1 = kVar.f31268z;
            String str3 = kVar.f31263u;
            if (gt.n.h(objJ)) {
                function1.invoke(str3);
            }
            xt.n<String, LoadAdFailureReason, String, Unit> nVar = kVar.f31264v;
            String str4 = kVar.f31263u;
            Throwable thE = gt.n.e(objJ);
            if (thE != null) {
                if (thE instanceof rl.b) {
                    loadAdFailureReasonA = LoadAdFailureReason.NATIVESHUTTINGDOWN;
                } else {
                    rl.e eVar = thE instanceof rl.e ? (rl.e) thE : null;
                    loadAdFailureReasonA = rl.h.a(eVar != null ? eVar.getReason() : null);
                }
                String message = thE.getMessage();
                if (message == null) {
                    message = "";
                }
                nVar.invoke(str4, loadAdFailureReasonA, message);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$replaceNoopGmaSdkController$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31274t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ rl.c f31276v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(rl.c cVar, lt.b<? super l> bVar) {
            super(1, bVar);
            this.f31276v = cVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new l(this.f31276v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31274t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            i.this.gmaSdkController = this.f31276v;
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler", f = "NativeAdsHandler.kt", l = {273}, m = "serveAd-BWLJW6A", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class m extends nt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31277t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31278u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31279v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31280w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f31281x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f31282y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f31283z;

        public m(lt.b<? super m> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31283z = obj;
            this.B |= Integer.MIN_VALUE;
            Object objO = i.this.o(null, null, null, this);
            return objO == mt.c.e() ? objO : gt.n.a(objO);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$serveAd$2", f = "NativeAdsHandler.kt", l = {274}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends nt.m implements Function2<p0, lt.b<? super gt.n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31284t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<gt.n<String>> f31285u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(x<gt.n<String>> xVar, lt.b<? super n> bVar) {
            super(2, bVar);
            this.f31285u = xVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new n(this.f31285u, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super gt.n<String>> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f31284t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            x<gt.n<String>> xVar = this.f31285u;
            this.f31284t = 1;
            Object objN = xVar.n(this);
            return objN == objE ? objE : objN;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super gt.n<? extends String>> bVar) {
            return invoke2(p0Var, (lt.b<? super gt.n<String>>) bVar);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class o extends nt.m implements Function1<lt.b<? super Unit>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31286t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31287u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31288v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31289w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f31290x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f31291y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f31292z;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"sg/i$o$a", "Lrl/f;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31293a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: sg.i$o$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onFailure$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0554a extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31294t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31295u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31296v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f31297w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0554a(i iVar, int i10, String str, lt.b<? super C0554a> bVar) {
                    super(1, bVar);
                    this.f31295u = iVar;
                    this.f31296v = i10;
                    this.f31297w = str;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new C0554a(this.f31295u, this.f31296v, this.f31297w, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31294t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31295u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f31296v, false, this.f31297w);
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((C0554a) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$setAdString$1$1$onSuccess$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class b extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31298t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31299u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31300v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i iVar, int i10, lt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31299u = iVar;
                    this.f31300v = i10;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new b(this.f31299u, this.f31300v, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31298t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31299u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onSetAdStringCompleted(this.f31300v, true, "");
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            public a(i iVar, int i10) {
                this.f31293a = iVar;
                this.b = i10;
            }

            @Override // rl.f
            public void onFailure(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                i iVar = this.f31293a;
                iVar.j(new C0554a(iVar, this.b, errorMessage, null));
            }

            @Override // rl.f
            public void onSuccess() {
                i iVar = this.f31293a;
                iVar.j(new b(iVar, this.b, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, i iVar, int i10, long j10, String str2, boolean z10, String str3, String str4, boolean z11, String str5, String str6, String str7, lt.b<? super o> bVar) {
            super(1, bVar);
            this.f31287u = str;
            this.f31288v = iVar;
            this.f31289w = i10;
            this.f31290x = j10;
            this.f31291y = str2;
            this.f31292z = z10;
            this.A = str3;
            this.B = str4;
            this.C = z11;
            this.D = str5;
            this.E = str6;
            this.F = str7;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new o(this.f31287u, this.f31288v, this.f31289w, this.f31290x, this.f31291y, this.f31292z, this.A, this.B, this.C, this.D, this.E, this.F, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31286t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f31287u.length() == 0) {
                INativeAdsCoreListener iNativeAdsCoreListener = this.f31288v.nativeAdsCore;
                if (iNativeAdsCoreListener != null) {
                    iNativeAdsCoreListener.onSetAdStringCompleted(this.f31289w, false, "adTracingId is empty");
                }
                return Unit.f22938a;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                long j10 = this.f31290x;
                String str = this.f31291y;
                boolean z10 = this.f31292z;
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
                this.f31288v.gmaSdkController.f(this.f31287u, jSONObject, new a(this.f31288v, this.f31289w));
                return Unit.f22938a;
            } catch (JSONException e10) {
                INativeAdsCoreListener iNativeAdsCoreListener2 = this.f31288v.nativeAdsCore;
                if (iNativeAdsCoreListener2 != null) {
                    iNativeAdsCoreListener2.onSetAdStringCompleted(this.f31289w, false, "setAdString failed to construct JSON - " + e10);
                }
                return Unit.f22938a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class p extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31301t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31302u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i f31303v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31304w;

        @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"sg/i$p$a", "Lrl/k;", "Ltl/c;", "status", "", "watchDuration", "", "d", "(Ltl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "c", "(Ljava/lang/String;Z)V", "Ltl/b;", "progressData", "a", "(Ltl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements rl.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f31305a;
            public final /* synthetic */ int b;

            /* JADX INFO: renamed from: sg.i$p$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0555a extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31306t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31307u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ NativeAdsProgressData f31308v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0555a(i iVar, NativeAdsProgressData nativeAdsProgressData, lt.b<? super C0555a> bVar) {
                    super(1, bVar);
                    this.f31307u = iVar;
                    this.f31308v = nativeAdsProgressData;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new C0555a(this.f31307u, this.f31308v, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31306t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31307u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onAdProgress((float) this.f31308v.getAdProgress(), (float) this.f31308v.getVideoDuration(), this.f31308v.getPrice(), this.f31308v.getPricePrecisionType(), this.f31308v.getPriceCurrencyCode());
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((C0555a) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onCtaClicked$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class b extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31309t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f31310u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ i f31311v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f31312w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, i iVar, boolean z10, lt.b<? super b> bVar) {
                    super(1, bVar);
                    this.f31310u = str;
                    this.f31311v = iVar;
                    this.f31312w = z10;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new b(this.f31310u, this.f31311v, this.f31312w, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31309t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    ek.q.h("NativeAdsHandler", "cta clicked");
                    String str = this.f31310u;
                    if (str == null) {
                        ek.q.e("NativeAdsHandler", "Invalid ad type, cannot log click");
                        return Unit.f22938a;
                    }
                    String str2 = Intrinsics.c(str, "AppPromo") ? "AppPromo" : "ClickOut";
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31311v.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onCtaClick(str2, this.f31312w);
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onPlayBackEnded$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class c extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31313t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31314u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ int f31315v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ tl.c f31316w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f31317x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(i iVar, int i10, tl.c cVar, float f10, lt.b<? super c> bVar) {
                    super(1, bVar);
                    this.f31314u = iVar;
                    this.f31315v = i10;
                    this.f31316w = cVar;
                    this.f31317x = f10;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new c(this.f31314u, this.f31315v, this.f31316w, this.f31317x, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31313t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31314u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onShowAdCompleted(this.f31315v, this.f31316w.getValue(), this.f31317x);
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((c) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            @nt.f(c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onUserReportAd$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class d extends nt.m implements Function1<lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f31318t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i f31319u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f31320v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f31321w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(i iVar, String str, String str2, lt.b<? super d> bVar) {
                    super(1, bVar);
                    this.f31319u = iVar;
                    this.f31320v = str;
                    this.f31321w = str2;
                }

                @Override // nt.a
                public final lt.b<Unit> create(lt.b<?> bVar) {
                    return new d(this.f31319u, this.f31320v, this.f31321w, bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f31318t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    INativeAdsCoreListener iNativeAdsCoreListener = this.f31319u.nativeAdsCore;
                    if (iNativeAdsCoreListener != null) {
                        iNativeAdsCoreListener.onReportAd(this.f31320v, this.f31321w);
                    }
                    return Unit.f22938a;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(lt.b<? super Unit> bVar) {
                    return ((d) create(bVar)).invokeSuspend(Unit.f22938a);
                }
            }

            public a(i iVar, int i10) {
                this.f31305a = iVar;
                this.b = i10;
            }

            @Override // rl.k
            public void a(NativeAdsProgressData progressData) {
                Intrinsics.checkNotNullParameter(progressData, "progressData");
                i iVar = this.f31305a;
                iVar.j(new C0555a(iVar, progressData, null));
            }

            @Override // rl.k
            public void b(String reasonKey, String description) {
                Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
                Intrinsics.checkNotNullParameter(description, "description");
                i iVar = this.f31305a;
                iVar.j(new d(iVar, reasonKey, description, null));
            }

            @Override // rl.k
            public void c(String gmaAdType, boolean isEndCardVisible) {
                i iVar = this.f31305a;
                iVar.j(new b(gmaAdType, iVar, isEndCardVisible, null));
            }

            @Override // rl.k
            public void d(tl.c status, float watchDuration) {
                Intrinsics.checkNotNullParameter(status, "status");
                i iVar = this.f31305a;
                iVar.j(new c(iVar, this.b, status, watchDuration, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, i iVar, int i10, lt.b<? super p> bVar) {
            super(1, bVar);
            this.f31302u = str;
            this.f31303v = iVar;
            this.f31304w = i10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new p(this.f31302u, this.f31303v, this.f31304w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f31301t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            if (this.f31302u.length() != 0) {
                this.f31303v.gmaSdkController.b(this.f31302u, new a(this.f31303v, this.f31304w));
                return Unit.f22938a;
            }
            INativeAdsCoreListener iNativeAdsCoreListener = this.f31303v.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onShowAdCompleted(this.f31304w, tl.c.INTERNAL_ERROR.getValue(), 0.0f);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"sg/i$q", "Lkotlin/coroutines/a;", "Liu/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class q extends kotlin.coroutines.a implements m0 {
        public q(m0.Companion companion) {
            super(companion);
        }

        @Override // iu.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            ek.q.f("NativeAdsHandler", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull rl.i moduleInstaller, @NotNull rl.c gmaSdkController, @NotNull p0 scope, @NotNull Function1<? super i, ? extends INativeAdsCoreListener> setPlatformImpl) {
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
        return Unit.f22938a;
    }

    public static final Unit m(i iVar, String id2, LoadAdFailureReason reason, String message) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        INativeAdsCoreListener iNativeAdsCoreListener = iVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onLoadInterstitialAdFailed(id2, reason, message);
        }
        return Unit.f22938a;
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
            ek.q.e("NativeAdsHandler", "cleanup() called more than once");
            return;
        }
        ek.q.h("NativeAdsHandler", "cleanup");
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
        j(new C0553i(requestId, initializeAdUnitId, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void install(boolean eagerInstall) {
        j(new j(eagerInstall, this, null));
    }

    public final void j(Function1<? super lt.b<? super Unit>, ? extends Object> block) {
        if (q0.i(this.scope)) {
            iu.k.d(this.scope, null, null, new f(block, null), 3, null);
        } else {
            ek.q.e("NativeAdsHandler", "Failed to enqueue ads task");
        }
    }

    public final void k(rl.a adFormat, String adTracingId, String adUnitId, Function1<? super String, Unit> onSuccess, xt.n<? super String, ? super LoadAdFailureReason, ? super String, Unit> onFailure) {
        j(new k(adTracingId, onFailure, this, adFormat, adUnitId, onSuccess, null));
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void loadInterstitialAd(@NotNull String adTracingId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        k(rl.a.Interstitial, adTracingId, adUnitId, new Function1() { // from class: sg.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.l(this.f31210a, (String) obj);
            }
        }, new xt.n() { // from class: sg.h
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.m(this.f31211a, (String) obj, (LoadAdFailureReason) obj2, (String) obj3);
            }
        });
    }

    public final void n(@NotNull rl.c controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        rl.c cVar = this.gmaSdkController;
        if ((cVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            j(new l(controller, null));
            return;
        }
        ek.q.e("NativeAdsHandler", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + cVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(rl.a aVar, String str, String str2, lt.b<? super gt.n<String>> bVar) {
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
        Object objD = mVar.f31283z;
        Object objE = mt.c.e();
        int i11 = mVar.B;
        try {
            if (i11 == 0) {
                gt.o.b(objD);
                INativeAdsCoreListener iNativeAdsCoreListener = this.nativeAdsCore;
                if (iNativeAdsCoreListener == null) {
                    gt.n.Companion companion = gt.n.INSTANCE;
                    return gt.n.b(gt.o.a(new IllegalStateException("nativeAdsCore is null")));
                }
                x<gt.n<String>> xVarC = z.c(null, 1, null);
                x<gt.n<String>> xVarPutIfAbsent = this.pendingServeAds.putIfAbsent(str, xVarC);
                if (xVarPutIfAbsent != null) {
                    String str3 = "serveAd already in flight for adTracingId " + str + "; ignoring newer request";
                    ek.q.e("NativeAdsHandler", str3);
                    gt.n.Companion companion2 = gt.n.INSTANCE;
                    return gt.n.b(gt.o.a(new IllegalStateException(str3)));
                }
                int i12 = c.f31220a[aVar.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new gt.l();
                    }
                    this.pendingServeAds.remove(str);
                    ek.q.e("NativeAdsHandler", "serveAd not supported for rewarded ads");
                    gt.n.Companion companion3 = gt.n.INSTANCE;
                    return gt.n.b(gt.o.a(new IllegalStateException("serveAd not supported for rewarded ads")));
                }
                iNativeAdsCoreListener.onServeInterstitialAd(str, str2);
                kotlin.time.a.Companion companion4 = kotlin.time.a.INSTANCE;
                long jP = kotlin.time.b.p(rh.h.a().U4(), hu.b.SECONDS);
                n nVar = new n(xVarC, null);
                mVar.f31277t = nt.l.a(aVar);
                mVar.f31278u = str;
                mVar.f31279v = nt.l.a(str2);
                mVar.f31280w = nt.l.a(iNativeAdsCoreListener);
                mVar.f31281x = nt.l.a(xVarC);
                mVar.f31282y = nt.l.a(xVarPutIfAbsent);
                mVar.B = 1;
                objD = g3.d(jP, nVar, mVar);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) mVar.f31278u;
                gt.o.b(objD);
            }
            return ((gt.n) objD).getValue();
        } catch (e3 e10) {
            this.pendingServeAds.remove(str);
            gt.n.Companion companion5 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(e10));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdFailed(@NotNull String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        x<gt.n<String>> xVarRemove = this.pendingServeAds.remove(adTracingId);
        if (xVarRemove != null) {
            gt.n.Companion companion = gt.n.INSTANCE;
            xVarRemove.v(gt.n.a(gt.n.b(gt.o.a(new RuntimeException("serveAd failed")))));
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void onServeInterstitialAdResponse(@NotNull String adTracingId, @NotNull String adResponseJson) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adResponseJson, "adResponseJson");
        x<gt.n<String>> xVarRemove = this.pendingServeAds.remove(adTracingId);
        if (xVarRemove != null) {
            xVarRemove.v(gt.n.a(gt.n.b(adResponseJson)));
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
    public /* synthetic */ i(rl.i iVar, rl.c cVar, p0 p0Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, 0 == true ? 1 : 0) : cVar, (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.U(g1.a(), 1, null, 2, null)).plus(new q(m0.INSTANCE))) : p0Var, (i10 & 8) != 0 ? a.f31219a : function1);
    }
}
