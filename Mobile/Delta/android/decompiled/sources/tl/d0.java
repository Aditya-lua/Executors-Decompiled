package tl;

import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.messagebus.MessageBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import vl.NativeAdsProgressData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 '2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006("}, d2 = {"Ltl/d0;", "Ltl/f;", "Lku/p0;", "coroutineScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function2;", "Lvl/c;", "", "", "onPlayBackEndedCallback", "<init>", "(Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function2;)V", "status", "watchDuration", "c", "(Lvl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "d", "(Ljava/lang/String;Z)V", "Lvl/b;", "progressData", "a", "(Lvl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "messageName", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lku/p0;", "Lcom/roblox/universalapp/messagebus/MessageBus;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/String;", "protocolName", "e", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<vl.c, Float, Unit> onPlayBackEndedCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String protocolName;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onAdProgress$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31869t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f31871v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f31871v = jSONObject;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d0.this.new b(this.f31871v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31869t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            MessageBus messageBus = d0.this.messageBus;
            d0 d0Var = d0.this;
            String adProgressMessageName = JNINativeAdsProtocol.getAdProgressMessageName();
            Intrinsics.checkNotNullExpressionValue(adProgressMessageName, "getAdProgressMessageName(...)");
            messageBus.l(d0Var.h(adProgressMessageName), this.f31871v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onCtaClicked$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31872t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f31874v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f31874v = jSONObject;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d0.this.new c(this.f31874v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31872t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            MessageBus messageBus = d0.this.messageBus;
            d0 d0Var = d0.this;
            String clickCTAMessageName = JNINativeAdsProtocol.getClickCTAMessageName();
            Intrinsics.checkNotNullExpressionValue(clickCTAMessageName, "getClickCTAMessageName(...)");
            messageBus.l(d0Var.h(clickCTAMessageName), this.f31874v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onPlayBackEnded$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31875t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vl.c f31877v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ float f31878w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vl.c cVar, float f10, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f31877v = cVar;
            this.f31878w = f10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d0.this.new d(this.f31877v, this.f31878w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31875t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            d0.this.onPlayBackEndedCallback.invoke(this.f31877v, pt.b.c(this.f31878w));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.ads.ShowAdEventHandler$onUserReportAd$1", f = "ShowAdEventHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31879t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ JSONObject f31881v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f31881v = jSONObject;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d0.this.new e(this.f31881v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f31879t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            MessageBus messageBus = d0.this.messageBus;
            d0 d0Var = d0.this;
            String reportAdMessageName = JNINativeAdsProtocol.getReportAdMessageName();
            Intrinsics.checkNotNullExpressionValue(reportAdMessageName, "getReportAdMessageName(...)");
            messageBus.l(d0Var.h(reportAdMessageName), this.f31881v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull p0 coroutineScope, @NotNull MessageBus messageBus, @NotNull Function2<? super vl.c, ? super Float, Unit> onPlayBackEndedCallback) {
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

    @Override // tl.f
    public void a(@NotNull NativeAdsProgressData progressData) {
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        JSONObject jSONObjectF = progressData.f();
        gk.p.h("ShowAdEventHandler", "ad progress: " + jSONObjectF);
        ku.k.d(this.coroutineScope, null, null, new b(jSONObjectF, null), 3, null);
    }

    @Override // tl.f
    public void b(@NotNull String reasonKey, @NotNull String description) {
        Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
        Intrinsics.checkNotNullParameter(description, "description");
        JSONObject jSONObject = new JSONObject();
        gk.n.e(jSONObject, "reason", reasonKey);
        gk.n.e(jSONObject, "comment", description);
        gk.p.h("ShowAdEventHandler", "report ad: " + jSONObject);
        ku.k.d(this.coroutineScope, null, null, new e(jSONObject, null), 3, null);
    }

    @Override // tl.f
    public void c(@NotNull vl.c status, float watchDuration) {
        Intrinsics.checkNotNullParameter(status, "status");
        ku.k.d(this.coroutineScope, null, null, new d(status, watchDuration, null), 3, null);
    }

    @Override // tl.f
    public void d(@Nullable String gmaAdType, boolean isEndCardVisible) {
        gk.p.h("ShowAdEventHandler", "cta clicked");
        if (gmaAdType == null) {
            gk.p.k("ShowAdEventHandler", "Invalid ad type, cannot log click");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        gk.n.e(jSONObject, "gmaAdType", Intrinsics.c(gmaAdType, "AppPromo") ? "AppPromo" : "ClickOut");
        gk.n.f(jSONObject, "isEndCardVisible", isEndCardVisible);
        ku.k.d(this.coroutineScope, null, null, new c(jSONObject, null), 3, null);
    }

    public final String h(String messageName) {
        return mm.f.f24426a.a(this.protocolName, messageName);
    }
}
