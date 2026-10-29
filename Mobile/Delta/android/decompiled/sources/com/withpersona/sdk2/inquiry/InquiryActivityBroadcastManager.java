package com.withpersona.sdk2.inquiry;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import ku.z2;
import nt.b;
import nu.b0;
import nu.g0;
import nu.i0;
import org.jetbrains.annotations.NotNull;
import ot.c;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;", "", "<init>", "()V", "", "skipBackendCall", "", "cancelRunningInquiries", "(Z)V", "Lku/p0;", "coroutineScope", "Lku/p0;", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "_eventFlow", "Lnu/b0;", "Lnu/g0;", "getEventFlow", "()Lnu/g0;", "eventFlow", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryActivityBroadcastManager {

    @NotNull
    public static final InquiryActivityBroadcastManager INSTANCE = new InquiryActivityBroadcastManager();

    @NotNull
    private static final p0 coroutineScope = q0.a(g1.a().plus(z2.b(null, 1, null)));

    @NotNull
    private static final b0<InquiryActivityEvent> _eventFlow = i0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1", f = "InquiryActivityBroadcastManager.kt", l = {19}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends m implements Function2<p0, b<? super Unit>, Object> {
        final /* synthetic */ boolean $skipBackendCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, b<? super AnonymousClass1> bVar) {
            super(2, bVar);
            this.$skipBackendCall = z10;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new AnonymousClass1(this.$skipBackendCall, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                b0 b0Var = InquiryActivityBroadcastManager._eventFlow;
                InquiryActivityEvent.CancelInquiry cancelInquiry = new InquiryActivityEvent.CancelInquiry(this.$skipBackendCall);
                this.label = 1;
                if (b0Var.emit(cancelInquiry, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((AnonymousClass1) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    private InquiryActivityBroadcastManager() {
    }

    public static /* synthetic */ void cancelRunningInquiries$default(InquiryActivityBroadcastManager inquiryActivityBroadcastManager, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        inquiryActivityBroadcastManager.cancelRunningInquiries(z10);
    }

    public final void cancelRunningInquiries(boolean skipBackendCall) {
        k.d(coroutineScope, null, null, new AnonymousClass1(skipBackendCall, null), 3, null);
    }

    @NotNull
    public final g0<InquiryActivityEvent> getEventFlow() {
        return _eventFlow;
    }
}
