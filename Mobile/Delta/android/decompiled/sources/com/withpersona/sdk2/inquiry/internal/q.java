package com.withpersona.sdk2.inquiry.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zo.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\r\u0013B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/q;", "", "Lzo/k0;", "orchestrator", "Lku/l0;", "dispatcher", "<init>", "(Lzo/k0;Lku/l0;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "state", "", "d", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "b", "()V", "c", "Lcom/withpersona/sdk2/inquiry/internal/q$b;", "e", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/internal/q$b;", "a", "Lzo/k0;", "Lku/l0;", "Lku/p0;", "Lku/p0;", "scope", "Lku/d2;", "Lku/d2;", "currentJob", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k0 orchestrator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile d2 currentJob;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.q$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/q$b;", "", "", "sessionToken", "checkUrl", "", "timeoutSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SnaParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String checkUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
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
            return Intrinsics.c(this.sessionToken, snaParams.sessionToken) && Intrinsics.c(this.checkUrl, snaParams.checkUrl) && Intrinsics.c(this.timeoutSeconds, snaParams.timeoutSeconds);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager$start$1", f = "SilentNetworkAuthenticationManager.kt", l = {30}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12070t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SnaParams f12072v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SnaParams snaParams, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f12072v = snaParams;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return q.this.new c(this.f12072v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12070t;
            if (i10 == 0) {
                jt.o.b(obj);
                k0 k0Var = q.this.orchestrator;
                String sessionToken = this.f12072v.getSessionToken();
                String checkUrl = this.f12072v.getCheckUrl();
                Integer timeoutSeconds = this.f12072v.getTimeoutSeconds();
                int iIntValue = timeoutSeconds != null ? timeoutSeconds.intValue() : 10;
                this.f12070t = 1;
                if (k0Var.c(sessionToken, checkUrl, iIntValue, this) == objE) {
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
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public q(@NotNull k0 orchestrator, @NotNull l0 dispatcher) {
        Intrinsics.checkNotNullParameter(orchestrator, "orchestrator");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.orchestrator = orchestrator;
        this.dispatcher = dispatcher;
        this.scope = q0.a(dispatcher.plus(z2.b(null, 1, null)));
    }

    public final void b() {
        d2 d2Var = this.currentJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.currentJob = null;
    }

    public final void c() {
        q0.f(this.scope, null, 1, null);
    }

    public final void d(@NotNull InquiryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SnaParams snaParamsE = e(state);
        if (snaParamsE == null) {
            return;
        }
        d2 d2Var = this.currentJob;
        if (d2Var == null || !d2Var.b()) {
            this.currentJob = ku.k.d(this.scope, null, null, new c(snaParamsE, null), 3, null);
        }
    }

    public final SnaParams e(InquiryState inquiryState) {
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
