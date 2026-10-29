package p363pq;

import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9564b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: pq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lpq/c;", "", "Lpq/e;", "externalInquiryController", "Lku/p0;", "coroutineScope", "<init>", "(Lpq/e;Lku/p0;)V", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "inquiryEvent", "", "b", "(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V", "Lpq/i;", "page", "c", "(Lpq/i;)V", "a", "Lpq/e;", "Lku/p0;", "Lpq/i;", "currentPage", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10309c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10311e externalInquiryController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AbstractC10315i currentPage;

    /* JADX INFO: renamed from: pq.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger$logEvent$1", m39664f = "ExternalEventLogger.kt", m39665l = {21}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f37111t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InquiryEvent f37113v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InquiryEvent inquiryEvent, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f37113v = inquiryEvent;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C10309c.this.new a(this.f37113v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f37111t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9564b0<InquiryEvent> interfaceC9564b0Mo18568a = C10309c.this.externalInquiryController.mo18568a();
                InquiryEvent inquiryEvent = this.f37113v;
                this.f37111t = 1;
                if (interfaceC9564b0Mo18568a.emit(inquiryEvent, this) == objM38805e) {
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

    public C10309c(@NotNull InterfaceC10311e externalInquiryController, @NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.externalInquiryController = externalInquiryController;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: renamed from: b */
    public final void m39606b(@NotNull InquiryEvent inquiryEvent) {
        Intrinsics.checkNotNullParameter(inquiryEvent, "inquiryEvent");
        C7882k.m32780d(this.coroutineScope, null, null, new a(inquiryEvent, null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m39607c(@NotNull AbstractC10315i page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.m31980c(this.currentPage, page)) {
            return;
        }
        this.currentPage = page;
        m39606b(new InquiryEvent.PageChange(page.getStepName(), page.toString()));
    }
}
