package dj;

import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import iu.a2;
import iu.e3;
import iu.g1;
import iu.g3;
import iu.p0;
import iu.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldj/f0;", "", "<init>", "()V", "Lv7/k;", "purchase", "", "orderId", "productId", "", "isInAppPurchase", "Ldj/f0$b;", "timeoutCallback", "", "a", "(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLdj/f0$b;)V", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldj/f0$b;", "", "", "orderId", "purchaseToken", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(@NotNull String orderId, @NotNull String purchaseToken);
    }

    @nt.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1", f = "IAPPurchaseManagerV2.kt", l = {65}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14888t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f14889u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f14890v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f14891w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ b f14892x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ v7.k f14893y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ProcessPaymentParams f14894z;

        @nt.f(c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1", f = "IAPPurchaseManagerV2.kt", l = {66}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14895t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ProcessPaymentParams f14896u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProcessPaymentParams processPaymentParams, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f14896u = processPaymentParams;
            }

            public static final Unit n(ProcessPaymentParams processPaymentParams) {
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchaseV2(processPaymentParams);
                return Unit.f22938a;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f14896u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f14895t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    final ProcessPaymentParams processPaymentParams = this.f14896u;
                    Function0 function0 = new Function0() { // from class: dj.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f0.c.a.n(processPaymentParams);
                        }
                    };
                    this.f14895t = 1;
                    if (a2.c(null, function0, this, 1, null) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, b bVar, v7.k kVar, ProcessPaymentParams processPaymentParams, lt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f14889u = str;
            this.f14890v = str2;
            this.f14891w = z10;
            this.f14892x = bVar;
            this.f14893y = kVar;
            this.f14894z = processPaymentParams;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f14889u, this.f14890v, this.f14891w, this.f14892x, this.f14893y, this.f14894z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f14888t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    a aVar = new a(this.f14894z, null);
                    this.f14888t = 1;
                    if (g3.c(30000L, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
            } catch (e3 unused) {
                ek.q.k("rbx.purchaseflow", "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId=" + this.f14889u + ", productId=" + this.f14890v + ", isInAppPurchase=" + this.f14891w);
                b bVar = this.f14892x;
                if (bVar != null) {
                    String str = this.f14889u;
                    String strG = this.f14893y.g();
                    Intrinsics.checkNotNullExpressionValue(strG, "getPurchaseToken(...)");
                    bVar.a(str, strG);
                }
            }
            return Unit.f22938a;
        }
    }

    public final void a(@NotNull v7.k purchase, @NotNull String orderId, @NotNull String productId, boolean isInAppPurchase, @Nullable b timeoutCallback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long lI = dj.b.i(purchase);
        iu.k.d(q0.a(g1.b()), null, null, new c(orderId, productId, isInAppPurchase, timeoutCallback, purchase, ProcessPaymentParams.builder().setCheckoutSessionId(lI != null ? String.valueOf(lI.longValue()) : null).setPaymentProviderType(ek.t.k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setProductId(productId).setPackageName(purchase.d()).setOrderId(orderId).setToken(purchase.g()).setIsInApp(isInAppPurchase).build(), null), 3, null);
    }
}
