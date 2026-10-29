package fj;

import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.a2;
import ku.e3;
import ku.g1;
import ku.g3;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfj/f0;", "", "<init>", "()V", "Lv7/k;", "purchase", "", "orderId", "productId", "", "isInAppPurchase", "Lfj/f0$b;", "timeoutCallback", "", "a", "(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;)V", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lfj/f0$b;", "", "", "orderId", "purchaseToken", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(@NotNull String orderId, @NotNull String purchaseToken);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1", f = "IAPPurchaseManagerV2.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16692t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f16693u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f16694v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f16695w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ b f16696x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ v7.k f16697y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ProcessPaymentParams f16698z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1", f = "IAPPurchaseManagerV2.kt", l = {66}, m = "invokeSuspend", v = 1)
        public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f16699t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ProcessPaymentParams f16700u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProcessPaymentParams processPaymentParams, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f16700u = processPaymentParams;
            }

            public static final Unit r(ProcessPaymentParams processPaymentParams) {
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchaseV2(processPaymentParams);
                return Unit.f22483a;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f16700u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f16699t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    final ProcessPaymentParams processPaymentParams = this.f16700u;
                    Function0 function0 = new Function0() { // from class: fj.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f0.c.a.r(processPaymentParams);
                        }
                    };
                    this.f16699t = 1;
                    if (a2.c(null, function0, this, 1, null) == objE) {
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
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, b bVar, v7.k kVar, ProcessPaymentParams processPaymentParams, nt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f16693u = str;
            this.f16694v = str2;
            this.f16695w = z10;
            this.f16696x = bVar;
            this.f16697y = kVar;
            this.f16698z = processPaymentParams;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f16693u, this.f16694v, this.f16695w, this.f16696x, this.f16697y, this.f16698z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f16692t;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    a aVar = new a(this.f16698z, null);
                    this.f16692t = 1;
                    if (g3.c(30000L, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
            } catch (e3 unused) {
                gk.p.k("rbx.purchaseflow", "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId=" + this.f16693u + ", productId=" + this.f16694v + ", isInAppPurchase=" + this.f16695w);
                b bVar = this.f16696x;
                if (bVar != null) {
                    String str = this.f16693u;
                    String strG = this.f16697y.g();
                    Intrinsics.checkNotNullExpressionValue(strG, "getPurchaseToken(...)");
                    bVar.a(str, strG);
                }
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public final void a(@NotNull v7.k purchase, @NotNull String orderId, @NotNull String productId, boolean isInAppPurchase, @Nullable b timeoutCallback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long lI = fj.b.i(purchase);
        ku.k.d(q0.a(g1.b()), null, null, new c(orderId, productId, isInAppPurchase, timeoutCallback, purchase, ProcessPaymentParams.builder().setCheckoutSessionId(lI != null ? String.valueOf(lI.longValue()) : null).setPaymentProviderType(gk.s.k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setProductId(productId).setPackageName(purchase.d()).setOrderId(orderId).setToken(purchase.g()).setIsInApp(isInAppPurchase).build(), null), 3, null);
    }
}
