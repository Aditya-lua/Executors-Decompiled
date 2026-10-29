package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p610zo.C13969k0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\r\u0013B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/q;", "", "Lzo/k0;", "orchestrator", "Lku/l0;", "dispatcher", "<init>", "(Lzo/k0;Lku/l0;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "state", "", "d", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "b", "()V", "c", "Lcom/withpersona/sdk2/inquiry/internal/q$b;", "e", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/internal/q$b;", "a", "Lzo/k0;", "Lku/l0;", "Lku/p0;", "Lku/p0;", "scope", "Lku/d2;", "Lku/d2;", "currentJob", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3714q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C13969k0 orchestrator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public volatile InterfaceC7850d2 currentJob;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.q$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/q$b;", "", "", "sessionToken", "checkUrl", "", "timeoutSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class SnaParams {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String checkUrl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        public final Integer timeoutSeconds;

        public SnaParams(@NotNull String sessionToken, @NotNull String checkUrl, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(checkUrl, "checkUrl");
            this.sessionToken = sessionToken;
            this.checkUrl = checkUrl;
            this.timeoutSeconds = num;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCheckUrl() {
            return this.checkUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SnaParams)) {
                return false;
            }
            SnaParams snaParams = (SnaParams) other;
            return Intrinsics.m31980c(this.sessionToken, snaParams.sessionToken) && Intrinsics.m31980c(this.checkUrl, snaParams.checkUrl) && Intrinsics.m31980c(this.timeoutSeconds, snaParams.timeoutSeconds);
        }

        public int hashCode() {
            int iHashCode = ((this.sessionToken.hashCode() * 31) + this.checkUrl.hashCode()) * 31;
            Integer num = this.timeoutSeconds;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "SnaParams(sessionToken=" + this.sessionToken + ", checkUrl=" + this.checkUrl + ", timeoutSeconds=" + this.timeoutSeconds + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.q$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager$start$1", m39664f = "SilentNetworkAuthenticationManager.kt", m39665l = {30}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15539t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SnaParams f15541v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SnaParams snaParams, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15541v = snaParams;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3714q.this.new c(this.f15541v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15539t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C13969k0 c13969k0 = C3714q.this.orchestrator;
                String sessionToken = this.f15541v.getSessionToken();
                String checkUrl = this.f15541v.getCheckUrl();
                Integer timeoutSeconds = this.f15541v.getTimeoutSeconds();
                int iIntValue = timeoutSeconds != null ? timeoutSeconds.intValue() : 10;
                this.f15539t = 1;
                if (c13969k0.m50490c(sessionToken, checkUrl, iIntValue, this) == objM38805e) {
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
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3714q(@NotNull C13969k0 orchestrator, @NotNull AbstractC7888l0 dispatcher) {
        Intrinsics.checkNotNullParameter(orchestrator, "orchestrator");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.orchestrator = orchestrator;
        this.dispatcher = dispatcher;
        this.scope = C7910q0.m32885a(dispatcher.plus(C7948z2.m32943b(null, 1, null)));
    }

    /* JADX INFO: renamed from: b */
    public final void m18792b() {
        InterfaceC7850d2 interfaceC7850d2 = this.currentJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.currentJob = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18793c() {
        C7910q0.m32890f(this.scope, null, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m18794d(@NotNull InquiryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SnaParams snaParamsM18795e = m18795e(state);
        if (snaParamsM18795e == null) {
            return;
        }
        InterfaceC7850d2 interfaceC7850d2 = this.currentJob;
        if (interfaceC7850d2 == null || !interfaceC7850d2.mo32556b()) {
            this.currentJob = C7882k.m32780d(this.scope, null, null, new c(snaParamsM18795e, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final SnaParams m18795e(InquiryState inquiryState) {
        InquiryState.SelfieStepRunning selfieStepRunning;
        String silentNetworkAuthenticationCheckUrl;
        if (!(inquiryState instanceof InquiryState.GovernmentIdStepRunning)) {
            if (!(inquiryState instanceof InquiryState.SelfieStepRunning) || (silentNetworkAuthenticationCheckUrl = (selfieStepRunning = (InquiryState.SelfieStepRunning) inquiryState).getSilentNetworkAuthenticationCheckUrl()) == null || silentNetworkAuthenticationCheckUrl.length() == 0) {
                return null;
            }
            return new SnaParams(selfieStepRunning.getSessionToken(), silentNetworkAuthenticationCheckUrl, selfieStepRunning.getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
        }
        InquiryState.GovernmentIdStepRunning governmentIdStepRunning = (InquiryState.GovernmentIdStepRunning) inquiryState;
        String silentNetworkAuthenticationCheckUrl2 = governmentIdStepRunning.getSilentNetworkAuthenticationCheckUrl();
        if (silentNetworkAuthenticationCheckUrl2 == null || silentNetworkAuthenticationCheckUrl2.length() == 0) {
            return null;
        }
        return new SnaParams(governmentIdStepRunning.getSessionToken(), silentNetworkAuthenticationCheckUrl2, governmentIdStepRunning.getSilentNetworkAuthenticationBackgroundTimeoutSeconds());
    }
}
