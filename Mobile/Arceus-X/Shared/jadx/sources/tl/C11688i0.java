package tl;

import androidx.core.app.NotificationCompat;
import com.roblox.universalapp.ads.JNINativeAdsProtocol;
import com.roblox.universalapp.messagebus.MessageBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mm.C8589f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p151gk.C6122o;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p494vl.EnumC12230c;
import p494vl.NativeAdsProgressData;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: tl.i0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 '2\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006("}, m31665d2 = {"Ltl/i0;", "Ltl/k;", "Lku/p0;", "coroutineScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "Lkotlin/Function2;", "Lvl/c;", "", "", "onPlayBackEndedCallback", "<init>", "(Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lkotlin/jvm/functions/Function2;)V", NotificationCompat.CATEGORY_STATUS, "watchDuration", "c", "(Lvl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "d", "(Ljava/lang/String;Z)V", "Lvl/b;", "progressData", "a", "(Lvl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "messageName", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lku/p0;", "Lcom/roblox/universalapp/messagebus/MessageBus;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/String;", "protocolName", "e", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11688i0 implements InterfaceC11690k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MessageBus messageBus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<EnumC12230c, Float, Unit> onPlayBackEndedCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String protocolName;

    /* JADX INFO: renamed from: tl.i0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.ads.ShowAdEventHandler$onAdProgress$1", m39664f = "ShowAdEventHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41324t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ JSONObject f41326v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41326v = jSONObject;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11688i0.this.new b(this.f41326v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41324t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            MessageBus messageBus = C11688i0.this.messageBus;
            C11688i0 c11688i0 = C11688i0.this;
            String adProgressMessageName = JNINativeAdsProtocol.getAdProgressMessageName();
            Intrinsics.checkNotNullExpressionValue(adProgressMessageName, "getAdProgressMessageName(...)");
            messageBus.m16024l(c11688i0.m43900h(adProgressMessageName), this.f41326v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tl.i0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.ads.ShowAdEventHandler$onCtaClicked$1", m39664f = "ShowAdEventHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41327t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ JSONObject f41329v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41329v = jSONObject;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11688i0.this.new c(this.f41329v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41327t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            MessageBus messageBus = C11688i0.this.messageBus;
            C11688i0 c11688i0 = C11688i0.this;
            String clickCTAMessageName = JNINativeAdsProtocol.getClickCTAMessageName();
            Intrinsics.checkNotNullExpressionValue(clickCTAMessageName, "getClickCTAMessageName(...)");
            messageBus.m16024l(c11688i0.m43900h(clickCTAMessageName), this.f41329v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tl.i0$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.ads.ShowAdEventHandler$onPlayBackEnded$1", m39664f = "ShowAdEventHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41330t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ EnumC12230c f41332v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ float f41333w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC12230c enumC12230c, float f10, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41332v = enumC12230c;
            this.f41333w = f10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11688i0.this.new d(this.f41332v, this.f41333w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41330t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C11688i0.this.onPlayBackEndedCallback.invoke(this.f41332v, C10340b.m39660c(this.f41333w));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: tl.i0$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.ads.ShowAdEventHandler$onUserReportAd$1", m39664f = "ShowAdEventHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f41334t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ JSONObject f41336v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f41336v = jSONObject;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11688i0.this.new e(this.f41336v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f41334t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            MessageBus messageBus = C11688i0.this.messageBus;
            C11688i0 c11688i0 = C11688i0.this;
            String reportAdMessageName = JNINativeAdsProtocol.getReportAdMessageName();
            Intrinsics.checkNotNullExpressionValue(reportAdMessageName, "getReportAdMessageName(...)");
            messageBus.m16024l(c11688i0.m43900h(reportAdMessageName), this.f41336v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super vl.c, ? super java.lang.Float, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11688i0(@NotNull InterfaceC7906p0 coroutineScope, @NotNull MessageBus messageBus, @NotNull Function2<? super EnumC12230c, ? super Float, Unit> onPlayBackEndedCallback) {
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

    @Override // tl.InterfaceC11690k
    /* JADX INFO: renamed from: a */
    public void mo43370a(@NotNull NativeAdsProgressData progressData) {
        Intrinsics.checkNotNullParameter(progressData, "progressData");
        JSONObject jSONObjectM45357f = progressData.m45357f();
        C6124q.m27063h("ShowAdEventHandler", "ad progress: " + jSONObjectM45357f);
        C7882k.m32780d(this.coroutineScope, null, null, new b(jSONObjectM45357f, null), 3, null);
    }

    @Override // tl.InterfaceC11690k
    /* JADX INFO: renamed from: b */
    public void mo43371b(@NotNull String reasonKey, @NotNull String description) {
        Intrinsics.checkNotNullParameter(reasonKey, "reasonKey");
        Intrinsics.checkNotNullParameter(description, "description");
        JSONObject jSONObject = new JSONObject();
        C6122o.m27051e(jSONObject, "reason", reasonKey);
        C6122o.m27051e(jSONObject, "comment", description);
        C6124q.m27063h("ShowAdEventHandler", "report ad: " + jSONObject);
        C7882k.m32780d(this.coroutineScope, null, null, new e(jSONObject, null), 3, null);
    }

    @Override // tl.InterfaceC11690k
    /* JADX INFO: renamed from: c */
    public void mo43372c(@NotNull EnumC12230c status, float watchDuration) {
        Intrinsics.checkNotNullParameter(status, "status");
        C7882k.m32780d(this.coroutineScope, null, null, new d(status, watchDuration, null), 3, null);
    }

    @Override // tl.InterfaceC11690k
    /* JADX INFO: renamed from: d */
    public void mo43373d(@Nullable String gmaAdType, boolean isEndCardVisible) {
        C6124q.m27063h("ShowAdEventHandler", "cta clicked");
        if (gmaAdType == null) {
            C6124q.m27066k("ShowAdEventHandler", "Invalid ad type, cannot log click");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C6122o.m27051e(jSONObject, "gmaAdType", Intrinsics.m31980c(gmaAdType, "AppPromo") ? "AppPromo" : "ClickOut");
        C6122o.m27052f(jSONObject, "isEndCardVisible", isEndCardVisible);
        C7882k.m32780d(this.coroutineScope, null, null, new c(jSONObject, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final String m43900h(String messageName) {
        return C8589f.f31550a.m34619a(this.protocolName, messageName);
    }
}
