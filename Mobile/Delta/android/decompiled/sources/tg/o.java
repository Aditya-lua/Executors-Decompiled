package tg;

import com.roblox.protocols.nativeadsplatforminterface.generated.INativeAdsCoreListener;
import com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds;
import com.roblox.universalapp.ads.NoopGmaSdkController;
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
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import ul.GetQueryInfoError;
import vl.NativeAdsProgressData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 A2\u00020\u0001:\u00012B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 Jg\u0010*\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010\u001cJ\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\u0012J\u001d\u00100\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0.H\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Ltg/o;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;", "Ltl/d;", "moduleInstaller", "Ltl/a;", "gmaSdkController", "Lku/p0;", "scope", "Lkotlin/Function1;", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "setPlatformImpl", "<init>", "(Ltl/d;Ltl/a;Lku/p0;Lkotlin/jvm/functions/Function1;)V", "controller", "", "v", "(Ltl/a;)V", "n", "()V", "", "instantInstall", "install", "(Z)V", "", "id", "", "experimentVariant", "initialize", "(ILjava/lang/String;)V", "adTracingId", "adUnitId", "getQueryInfo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adString", "durationNeededEnum", "", "durationNeededForRewardMs", "isEuUser", "creativeUrl", "uiExperimentData", "gmaAdType", "isClickable", "setAdString", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "showAd", "cleanupAd", "Lkotlin/Function0;", "block", "p", "(Lkotlin/jvm/functions/Function0;)V", "a", "Ltl/d;", "b", "Ltl/a;", "c", "Lku/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cleanedUp", "f", "Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;", "nativeAdsCore", "g", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends IPlatformNativeAds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tl.d moduleInstaller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile tl.a gmaSdkController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<o, INativeAdsCoreListener> setPlatformImpl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean cleanedUp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public INativeAdsCoreListener nativeAdsCore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.ads.NativeAdsHandler$enqueue$1", f = "NativeAdsHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31791t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31792u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> function0, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f31792u = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f31792u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31791t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            this.f31792u.invoke();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"tg/o$c", "Ltl/e;", "", "queryInfo", "", "onSuccess", "(Ljava/lang/String;)V", "Lul/a;", "error", "a", "(Lul/a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements tl.e {
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31794c;

        public c(boolean z10, int i10) {
            this.b = z10;
            this.f31794c = i10;
        }

        public static final Unit d(boolean z10, GetQueryInfoError getQueryInfoError, o oVar, int i10) {
            if (z10) {
                tg.b bVar = tg.b.TERMINAL;
                String message = getQueryInfoError.getMessage();
                if (message == null) {
                    message = "UNKNOWN";
                }
                y.e(bVar, message);
            }
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, "");
            }
            return Unit.f22483a;
        }

        public static final Unit e(boolean z10, o oVar, int i10, String str) {
            if (z10) {
                y.e(tg.b.TERMINAL, "success");
            }
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                if (str == null) {
                    str = "";
                }
                iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, str);
            }
            return Unit.f22483a;
        }

        @Override // tl.e
        public void a(final GetQueryInfoError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            final o oVar = o.this;
            final boolean z10 = this.b;
            final int i10 = this.f31794c;
            oVar.p(new Function0() { // from class: tg.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.c.d(z10, error, oVar, i10);
                }
            });
        }

        @Override // tl.e
        public void onSuccess(final String queryInfo) {
            final o oVar = o.this;
            final boolean z10 = this.b;
            final int i10 = this.f31794c;
            oVar.p(new Function0() { // from class: tg.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.c.e(z10, oVar, i10, queryInfo);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"tg/o$d", "Ltl/c;", "", "onSuccess", "()V", "", "errorMessage", "onFailure", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements tl.c {
        public final /* synthetic */ int b;

        public d(int i10) {
            this.b = i10;
        }

        public static final Unit c(o oVar, int i10, String str) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onSetAdStringCompleted(i10, false, str);
            }
            return Unit.f22483a;
        }

        public static final Unit d(o oVar, int i10) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onSetAdStringCompleted(i10, true, "");
            }
            return Unit.f22483a;
        }

        @Override // tl.c
        public void onFailure(final String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            final o oVar = o.this;
            final int i10 = this.b;
            oVar.p(new Function0() { // from class: tg.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.d.c(oVar, i10, errorMessage);
                }
            });
        }

        @Override // tl.c
        public void onSuccess() {
            final o oVar = o.this;
            final int i10 = this.b;
            oVar.p(new Function0() { // from class: tg.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.d.d(oVar, i10);
                }
            });
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"tg/o$e", "Ltl/f;", "Lvl/c;", "status", "", "watchDuration", "", "c", "(Lvl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "d", "(Ljava/lang/String;Z)V", "Lvl/b;", "progressData", "a", "(Lvl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements tl.f {
        public final /* synthetic */ int b;

        public e(int i10) {
            this.b = i10;
        }

        public static final Unit i(o oVar, NativeAdsProgressData nativeAdsProgressData) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onAdProgress((float) nativeAdsProgressData.getAdProgress(), (float) nativeAdsProgressData.getVideoDuration(), nativeAdsProgressData.getPrice(), nativeAdsProgressData.getPricePrecisionType(), nativeAdsProgressData.getPriceCurrencyCode());
            }
            return Unit.f22483a;
        }

        public static final Unit j(String str, o oVar, boolean z10) {
            gk.p.h("NativeAdsHandler", "cta clicked");
            if (str == null) {
                gk.p.e("NativeAdsHandler", "Invalid ad type, cannot log click");
                return Unit.f22483a;
            }
            String str2 = Intrinsics.c(str, "AppPromo") ? "AppPromo" : "ClickOut";
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onCtaClick(str2, z10);
            }
            return Unit.f22483a;
        }

        public static final Unit k(o oVar, int i10, vl.c cVar, float f10) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onShowAdCompleted(i10, cVar.getValue(), f10);
            }
            return Unit.f22483a;
        }

        public static final Unit l(o oVar, String str, String str2) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onReportAd(str, str2);
            }
            return Unit.f22483a;
        }

        @Override // tl.f
        public void a(final NativeAdsProgressData progressData) {
            Intrinsics.checkNotNullParameter(progressData, "progressData");
            final o oVar = o.this;
            oVar.p(new Function0() { // from class: tg.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.e.i(oVar, progressData);
                }
            });
        }

        @Override // tl.f
        public void b(final String reasonKey, final String description) {
            Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
            Intrinsics.checkNotNullParameter(description, "description");
            final o oVar = o.this;
            oVar.p(new Function0() { // from class: tg.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.e.l(oVar, reasonKey, description);
                }
            });
        }

        @Override // tl.f
        public void c(final vl.c status, final float watchDuration) {
            Intrinsics.checkNotNullParameter(status, "status");
            final o oVar = o.this;
            final int i10 = this.b;
            oVar.p(new Function0() { // from class: tg.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.e.k(oVar, i10, status, watchDuration);
                }
            });
        }

        @Override // tl.f
        public void d(final String gmaAdType, final boolean isEndCardVisible) {
            final o oVar = o.this;
            oVar.p(new Function0() { // from class: tg.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.e.j(gmaAdType, oVar, isEndCardVisible);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"tg/o$f", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends kotlin.coroutines.a implements m0 {
        public f(m0.Companion companion) {
            super(companion);
        }

        @Override // ku.m0
        public void handleException(CoroutineContext context, Throwable exception) {
            gk.p.f("NativeAdsHandler", "Uncaught exception in ads task", exception);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull tl.d moduleInstaller, @NotNull tl.a gmaSdkController, @NotNull p0 scope, @NotNull Function1<? super o, ? extends INativeAdsCoreListener> setPlatformImpl) {
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(gmaSdkController, "gmaSdkController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(setPlatformImpl, "setPlatformImpl");
        this.moduleInstaller = moduleInstaller;
        this.gmaSdkController = gmaSdkController;
        this.scope = scope;
        this.setPlatformImpl = setPlatformImpl;
        this.cleanedUp = new AtomicBoolean(false);
        this.nativeAdsCore = (INativeAdsCoreListener) setPlatformImpl.invoke(this);
    }

    public static final INativeAdsCoreListener k(o oVar) {
        return INativeAdsCoreListener.setPlatformImpl(oVar);
    }

    public static final Unit o(o oVar) {
        oVar.gmaSdkController.a();
        return Unit.f22483a;
    }

    public static final Unit q(String str, String str2, o oVar, int i10, String str3) {
        boolean z10 = th.h.a().I3() && (Intrinsics.c(str, "IsolatedRewarded") || Intrinsics.c(str, "NonIsolatedRewarded"));
        if (z10) {
            y.f(tg.b.ATTEMPT, null, 2, null);
        }
        if (str2.length() != 0) {
            oVar.gmaSdkController.c(str2, str3, str, oVar.new c(z10, i10));
            return Unit.f22483a;
        }
        if (z10) {
            y.e(tg.b.TERMINAL, "MISSING_AD_TRACING_ID");
        }
        INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onGetQueryInfoCompleted(i10, "");
        }
        return Unit.f22483a;
    }

    public static final Unit r(final o oVar, String str, final int i10) {
        oVar.gmaSdkController.b(str, new BiConsumer() { // from class: tg.m
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                o.s(this.f31781a, i10, (Boolean) obj, (String) obj2);
            }
        });
        return Unit.f22483a;
    }

    public static final void s(final o oVar, final int i10, final Boolean success, final String errorMessage) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        oVar.p(new Function0() { // from class: tg.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.t(this.f31782a, i10, success, errorMessage);
            }
        });
    }

    public static final Unit t(o oVar, int i10, Boolean bool, String str) {
        INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            Intrinsics.checkNotNull(bool);
            iNativeAdsCoreListener.onInitializeCompleted(i10, bool.booleanValue(), str);
        }
        return Unit.f22483a;
    }

    public static final Unit u(o oVar, boolean z10) {
        oVar.moduleInstaller.a(th.h.a().p5() && z10);
        return Unit.f22483a;
    }

    public static final Unit w(o oVar, tl.a aVar) {
        oVar.gmaSdkController = aVar;
        return Unit.f22483a;
    }

    public static final Unit x(String str, o oVar, int i10, long j10, String str2, boolean z10, String str3, String str4, boolean z11, String str5, String str6, String str7) {
        if (str.length() == 0) {
            INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener != null) {
                iNativeAdsCoreListener.onSetAdStringCompleted(i10, false, "adTracingId is empty");
            }
            return Unit.f22483a;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("durationNeededForRewardMs", j10);
            jSONObject.put("durationNeededEnum", str2);
            jSONObject.put("isEUUser", z10);
            jSONObject.put("moderationExternalCreativeUrl", str3);
            jSONObject.put("gmaAdType", str4);
            jSONObject.put("isClickable", z11);
            jSONObject.put("uiExperimentData", new JSONObject(str5));
            jSONObject.put("adString", str6);
            jSONObject.put("adUnitId", str7);
            oVar.gmaSdkController.e(str, jSONObject, oVar.new d(i10));
            return Unit.f22483a;
        } catch (JSONException e10) {
            INativeAdsCoreListener iNativeAdsCoreListener2 = oVar.nativeAdsCore;
            if (iNativeAdsCoreListener2 != null) {
                iNativeAdsCoreListener2.onSetAdStringCompleted(i10, false, "setAdString failed to construct JSON - " + e10);
            }
            return Unit.f22483a;
        }
    }

    public static final Unit y(String str, o oVar, int i10) {
        if (str.length() != 0) {
            oVar.gmaSdkController.d(str, oVar.new e(i10));
            return Unit.f22483a;
        }
        INativeAdsCoreListener iNativeAdsCoreListener = oVar.nativeAdsCore;
        if (iNativeAdsCoreListener != null) {
            iNativeAdsCoreListener.onShowAdCompleted(i10, vl.c.INTERNAL_ERROR.getValue(), 0.0f);
        }
        return Unit.f22483a;
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void cleanupAd() {
        p(new Function0() { // from class: tg.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.o(this.f31779a);
            }
        });
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void getQueryInfo(final int id2, @NotNull final String adTracingId, @NotNull final String adUnitId, @NotNull final String experimentVariant) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        p(new Function0() { // from class: tg.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.q(experimentVariant, adTracingId, this, id2, adUnitId);
            }
        });
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void initialize(final int id2, @NotNull final String experimentVariant) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        p(new Function0() { // from class: tg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.r(this.f31759a, experimentVariant, id2);
            }
        });
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void install(final boolean instantInstall) {
        p(new Function0() { // from class: tg.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.u(this.f31761a, instantInstall);
            }
        });
    }

    public final void n() {
        if (!this.cleanedUp.compareAndSet(false, true)) {
            gk.p.e("NativeAdsHandler", "cleanup() called more than once");
            return;
        }
        gk.p.h("NativeAdsHandler", "cleanup");
        this.setPlatformImpl.invoke(null);
        this.nativeAdsCore = null;
        this.gmaSdkController.destroy();
        q0.f(this.scope, null, 1, null);
    }

    public final void p(Function0<Unit> block) {
        if (q0.i(this.scope)) {
            ku.k.d(this.scope, null, null, new b(block, null), 3, null);
        } else {
            gk.p.e("NativeAdsHandler", "Failed to enqueue ads task");
        }
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void setAdString(final int id2, @NotNull final String adTracingId, @NotNull final String adUnitId, @NotNull final String adString, @NotNull final String durationNeededEnum, final long durationNeededForRewardMs, final boolean isEuUser, @NotNull final String creativeUrl, @NotNull final String uiExperimentData, @NotNull final String gmaAdType, final boolean isClickable) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adString, "adString");
        Intrinsics.checkNotNullParameter(durationNeededEnum, "durationNeededEnum");
        Intrinsics.checkNotNullParameter(creativeUrl, "creativeUrl");
        Intrinsics.checkNotNullParameter(uiExperimentData, "uiExperimentData");
        Intrinsics.checkNotNullParameter(gmaAdType, "gmaAdType");
        p(new Function0() { // from class: tg.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.x(adTracingId, this, id2, durationNeededForRewardMs, durationNeededEnum, isEuUser, creativeUrl, gmaAdType, isClickable, uiExperimentData, adString, adUnitId);
            }
        });
    }

    @Override // com.roblox.protocols.nativeadsplatforminterface.generated.IPlatformNativeAds
    public void showAd(final int id2, @NotNull final String adTracingId) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        p(new Function0() { // from class: tg.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.y(adTracingId, this, id2);
            }
        });
    }

    public final void v(@NotNull final tl.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        tl.a aVar = this.gmaSdkController;
        if ((aVar instanceof NoopGmaSdkController) && !(controller instanceof NoopGmaSdkController)) {
            p(new Function0() { // from class: tg.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o.w(this.f31780a, controller);
                }
            });
            return;
        }
        gk.p.e("NativeAdsHandler", "replaceNoopGmaSdkController must swap a no-op for a real controller but was " + aVar.getClass().getSimpleName() + " -> " + controller.getClass().getSimpleName());
    }

    public /* synthetic */ o(tl.d dVar, tl.a aVar, p0 p0Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? new NoopGmaSdkController(null, 1, null) : aVar, (i10 & 4) != 0 ? q0.a(z2.b(null, 1, null).plus(l0.U(g1.a(), 1, null, 2, null)).plus(new f(m0.INSTANCE))) : p0Var, (i10 & 8) != 0 ? new Function1() { // from class: tg.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.k((o) obj);
            }
        } : function1);
    }
}
