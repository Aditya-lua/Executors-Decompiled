package nj;

import av.a2;
import av.e3;
import av.g1;
import av.g3;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnj/f0;", BuildConfig.FLAVOR, "<init>", "()V", "Lw7/k;", "purchase", BuildConfig.FLAVOR, "orderId", "productId", BuildConfig.FLAVOR, "isInAppPurchase", "Lnj/f0$b;", "timeoutCallback", BuildConfig.FLAVOR, "a", "(Lw7/k;Ljava/lang/String;Ljava/lang/String;ZLnj/f0$b;)V", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lnj/f0$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "orderId", "purchaseToken", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(@NotNull String orderId, @NotNull String purchaseToken);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1", f = "IAPPurchaseManagerV2.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25704t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f25705u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f25706v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f25707w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ b f25708x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ w7.k f25709y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ProcessPaymentParams f25710z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1", f = "IAPPurchaseManagerV2.kt", l = {66}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f25711t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ProcessPaymentParams f25712u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProcessPaymentParams processPaymentParams, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f25712u = processPaymentParams;
            }

            public static final Unit p(ProcessPaymentParams processPaymentParams) {
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchaseV2(processPaymentParams);
                return Unit.f21506a;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f25712u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f25711t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    final ProcessPaymentParams processPaymentParams = this.f25712u;
                    Function0 function0 = new Function0() { // from class: nj.g0
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f0.c.a.p(processPaymentParams);
                        }
                    };
                    this.f25711t = 1;
                    if (a2.c(null, function0, this, 1, null) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, b bVar, w7.k kVar, ProcessPaymentParams processPaymentParams, eu.b<? super c> bVar2) {
            super(2, bVar2);
            this.f25705u = str;
            this.f25706v = str2;
            this.f25707w = z10;
            this.f25708x = bVar;
            this.f25709y = kVar;
            this.f25710z = processPaymentParams;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f25705u, this.f25706v, this.f25707w, this.f25708x, this.f25709y, this.f25710z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f25704t;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    a aVar = new a(this.f25710z, null);
                    this.f25704t = 1;
                    if (g3.c(30000L, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
            } catch (e3 unused) {
                ok.q.k("rbx.purchaseflow", "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId=" + this.f25705u + ", productId=" + this.f25706v + ", isInAppPurchase=" + this.f25707w);
                b bVar = this.f25708x;
                if (bVar != null) {
                    String str = this.f25705u;
                    String strG = this.f25709y.g();
                    Intrinsics.checkNotNullExpressionValue(strG, "getPurchaseToken(...)");
                    bVar.a(str, strG);
                }
            }
            return Unit.f21506a;
        }
    }

    public final void a(@NotNull w7.k purchase, @NotNull String orderId, @NotNull String productId, boolean isInAppPurchase, @Nullable b timeoutCallback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long lJ = nj.b.j(purchase);
        av.k.d(q0.a(g1.b()), null, null, new c(orderId, productId, isInAppPurchase, timeoutCallback, purchase, ProcessPaymentParams.builder().b(lJ != null ? String.valueOf(lJ.longValue()) : null).f(ok.t.k() ? "VngGooglePlayStore" : "GooglePlayStore").g(productId).e(purchase.d()).d(orderId).h(purchase.g()).c(isInAppPurchase).a(), null), 3, null);
    }
}
