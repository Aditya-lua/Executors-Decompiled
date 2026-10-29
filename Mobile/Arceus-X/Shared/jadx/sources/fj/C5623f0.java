package fj;

import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p151gk.C6127t;
import p229jt.C7348o;
import p256ku.C7835a2;
import p256ku.C7856e3;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p486v7.C12052k;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fj.f0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lfj/f0;", "", "<init>", "()V", "Lv7/k;", "purchase", "", "orderId", "productId", "", "isInAppPurchase", "Lfj/f0$b;", "timeoutCallback", "", "a", "(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;)V", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5623f0 {

    /* JADX INFO: renamed from: fj.f0$b */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lfj/f0$b;", "", "", "orderId", "purchaseToken", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo25468a(@NotNull String orderId, @NotNull String purchaseToken);
    }

    /* JADX INFO: renamed from: fj.f0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1", m39664f = "IAPPurchaseManagerV2.kt", m39665l = {65}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21569t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f21570u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f21571v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f21572w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ b f21573x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C12052k f21574y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ ProcessPaymentParams f21575z;

        /* JADX INFO: renamed from: fj.f0$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1", m39664f = "IAPPurchaseManagerV2.kt", m39665l = {66}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f21576t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ ProcessPaymentParams f21577u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProcessPaymentParams processPaymentParams, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f21577u = processPaymentParams;
            }

            /* JADX INFO: renamed from: r */
            public static final Unit m25470r(ProcessPaymentParams processPaymentParams) {
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchaseV2(processPaymentParams);
                return Unit.f29331a;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f21577u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f21576t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    final ProcessPaymentParams processPaymentParams = this.f21577u;
                    Function0 function0 = new Function0() { // from class: fj.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C5623f0.c.a.m25470r(processPaymentParams);
                        }
                    };
                    this.f21576t = 1;
                    if (C7835a2.m32563c(null, function0, this, 1, null) == objM38805e) {
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
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, b bVar, C12052k c12052k, ProcessPaymentParams processPaymentParams, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f21570u = str;
            this.f21571v = str2;
            this.f21572w = z10;
            this.f21573x = bVar;
            this.f21574y = c12052k;
            this.f21575z = processPaymentParams;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f21570u, this.f21571v, this.f21572w, this.f21573x, this.f21574y, this.f21575z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f21569t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    a aVar = new a(this.f21575z, null);
                    this.f21569t = 1;
                    if (C7866g3.m32660c(30000L, aVar, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
            } catch (C7856e3 unused) {
                C6124q.m27066k("rbx.purchaseflow", "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId=" + this.f21570u + ", productId=" + this.f21571v + ", isInAppPurchase=" + this.f21572w);
                b bVar = this.f21573x;
                if (bVar != null) {
                    String str = this.f21570u;
                    String strM44886g = this.f21574y.m44886g();
                    Intrinsics.checkNotNullExpressionValue(strM44886g, "getPurchaseToken(...)");
                    bVar.mo25468a(str, strM44886g);
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25467a(@NotNull C12052k purchase, @NotNull String orderId, @NotNull String productId, boolean isInAppPurchase, @Nullable b timeoutCallback) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Long lM25426i = C5614b.m25426i(purchase);
        C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new c(orderId, productId, isInAppPurchase, timeoutCallback, purchase, ProcessPaymentParams.builder().setCheckoutSessionId(lM25426i != null ? String.valueOf(lM25426i.longValue()) : null).setPaymentProviderType(C6127t.m27095k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setProductId(productId).setPackageName(purchase.m44883d()).setOrderId(orderId).setToken(purchase.m44886g()).setIsInApp(isInAppPurchase).build(), null), 3, null);
    }
}
