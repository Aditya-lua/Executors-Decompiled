package rl;

import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.messagebus.MessageBus;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tl.NativeAdsProgressData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 '2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006("}, d2 = {"Lrl/i0;", "Lrl/k;", "Liu/p0;", "coroutineScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function2;", "Ltl/c;", "", "", "onPlayBackEndedCallback", "<init>", "(Liu/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function2;)V", "status", "watchDuration", "d", "(Ltl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "c", "(Ljava/lang/String;Z)V", "Ltl/b;", "progressData", "a", "(Ltl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "messageName", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Liu/p0;", "Lcom/roblox/universalapp/messagebus/MessageBus;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/String;", "protocolName", "e", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<tl.c, Float, Unit> onPlayBackEndedCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String protocolName;

    @nt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onAdProgress$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30815t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30817v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f30817v = jSONObject;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i0.this.new b(this.f30817v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30815t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            MessageBus messageBus = i0.this.messageBus;
            i0 i0Var = i0.this;
            String adProgressMessageName = JNINativeAdsProtocol.getAdProgressMessageName();
            Intrinsics.checkNotNullExpressionValue(adProgressMessageName, "getAdProgressMessageName(...)");
            messageBus.l(i0Var.h(adProgressMessageName), this.f30817v);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onCtaClicked$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30818t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30820v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f30820v = jSONObject;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i0.this.new c(this.f30820v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30818t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            MessageBus messageBus = i0.this.messageBus;
            i0 i0Var = i0.this;
            String clickCTAMessageName = JNINativeAdsProtocol.getClickCTAMessageName();
            Intrinsics.checkNotNullExpressionValue(clickCTAMessageName, "getClickCTAMessageName(...)");
            messageBus.l(i0Var.h(clickCTAMessageName), this.f30820v);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onPlayBackEnded$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30821t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ tl.c f30823v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ float f30824w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.c cVar, float f10, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f30823v = cVar;
            this.f30824w = f10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i0.this.new d(this.f30823v, this.f30824w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30821t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            i0.this.onPlayBackEndedCallback.invoke(this.f30823v, nt.b.c(this.f30824w));
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onUserReportAd$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30825t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30827v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f30827v = jSONObject;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i0.this.new e(this.f30827v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f30825t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            MessageBus messageBus = i0.this.messageBus;
            i0 i0Var = i0.this;
            String reportAdMessageName = JNINativeAdsProtocol.getReportAdMessageName();
            Intrinsics.checkNotNullExpressionValue(reportAdMessageName, "getReportAdMessageName(...)");
            messageBus.l(i0Var.h(reportAdMessageName), this.f30827v);
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0(@NotNull p0 coroutineScope, @NotNull MessageBus messageBus, @NotNull Function2<? super tl.c, ? super Float, Unit> onPlayBackEndedCallback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageBus, "messageBus");
        Intrinsics.checkNotNullParameter(onPlayBackEndedCallback, "onPlayBackEndedCallback");
        this.coroutineScope = coroutineScope;
        this.messageBus = messageBus;
        this.onPlayBackEndedCallback = onPlayBackEndedCallback;
        String protocolName = JNINativeAdsProtocol.getProtocolName();
        Intrinsics.checkNotNullExpressionValue(protocolName, "getProtocolName(...)");
        this.protocolName = protocolName;
    }

    @Override // rl.k
    public void a(@NotNull NativeAdsProgressData progressData) {
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        JSONObject jSONObjectF = progressData.f();
        ek.q.h("ShowAdEventHandler", "ad progress: " + jSONObjectF);
        iu.k.d(this.coroutineScope, null, null, new b(jSONObjectF, null), 3, null);
    }

    @Override // rl.k
    public void b(@NotNull String reasonKey, @NotNull String description) {
        Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
        Intrinsics.checkNotNullParameter(description, "description");
        JSONObject jSONObject = new JSONObject();
        ek.o.e(jSONObject, "reason", reasonKey);
        ek.o.e(jSONObject, "comment", description);
        ek.q.h("ShowAdEventHandler", "report ad: " + jSONObject);
        iu.k.d(this.coroutineScope, null, null, new e(jSONObject, null), 3, null);
    }

    @Override // rl.k
    public void c(@Nullable String gmaAdType, boolean isEndCardVisible) {
        ek.q.h("ShowAdEventHandler", "cta clicked");
        if (gmaAdType == null) {
            ek.q.k("ShowAdEventHandler", "Invalid ad type, cannot log click");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        ek.o.e(jSONObject, "gmaAdType", Intrinsics.c(gmaAdType, "AppPromo") ? "AppPromo" : "ClickOut");
        ek.o.f(jSONObject, "isEndCardVisible", isEndCardVisible);
        iu.k.d(this.coroutineScope, null, null, new c(jSONObject, null), 3, null);
    }

    @Override // rl.k
    public void d(@NotNull tl.c status, float watchDuration) {
        Intrinsics.checkNotNullParameter(status, "status");
        iu.k.d(this.coroutineScope, null, null, new d(status, watchDuration, null), 3, null);
    }

    public final String h(String messageName) {
        return km.f.f22905a.a(this.protocolName, messageName);
    }
}
