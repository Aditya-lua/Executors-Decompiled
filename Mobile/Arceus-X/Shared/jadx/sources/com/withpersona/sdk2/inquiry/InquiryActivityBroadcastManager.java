package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9574g0;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;", "", "<init>", "()V", "", "skipBackendCall", "", "cancelRunningInquiries", "(Z)V", "Lku/p0;", "coroutineScope", "Lku/p0;", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "_eventFlow", "Lnu/b0;", "Lnu/g0;", "getEventFlow", "()Lnu/g0;", "eventFlow", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class InquiryActivityBroadcastManager {

    @NotNull
    public static final InquiryActivityBroadcastManager INSTANCE = new InquiryActivityBroadcastManager();

    @NotNull
    private static final InterfaceC7906p0 coroutineScope = C7910q0.m32885a(C7864g1.m32643a().plus(C7948z2.m32943b(null, 1, null)));

    @NotNull
    private static final InterfaceC9564b0<InquiryActivityEvent> _eventFlow = C9578i0.m37758b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1 */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1", m39664f = "InquiryActivityBroadcastManager.kt", m39665l = {19}, m39666m = "invokeSuspend")
    public static final class C34101 extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {
        final /* synthetic */ boolean $skipBackendCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34101(boolean z10, InterfaceC9557b<? super C34101> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.$skipBackendCall = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C34101(this.$skipBackendCall, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.label;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9564b0 interfaceC9564b0 = InquiryActivityBroadcastManager._eventFlow;
                InquiryActivityEvent.CancelInquiry cancelInquiry = new InquiryActivityEvent.CancelInquiry(this.$skipBackendCall);
                this.label = 1;
                if (interfaceC9564b0.emit(cancelInquiry, this) == objM38805e) {
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
            return ((C34101) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
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
        C7882k.m32780d(coroutineScope, null, null, new C34101(skipBackendCall, null), 3, null);
    }

    @NotNull
    public final InterfaceC9574g0<InquiryActivityEvent> getEventFlow() {
        return _eventFlow;
    }
}
