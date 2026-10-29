package pq;

import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.k;
import ku.p0;
import nu.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpq/c;", "", "Lpq/e;", "externalInquiryController", "Lku/p0;", "coroutineScope", "<init>", "(Lpq/e;Lku/p0;)V", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "inquiryEvent", "", "b", "(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V", "Lpq/i;", "page", "c", "(Lpq/i;)V", "a", "Lpq/e;", "Lku/p0;", "Lpq/i;", "currentPage", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e externalInquiryController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public i currentPage;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger$logEvent$1", f = "ExternalEventLogger.kt", l = {21}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28814t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryEvent f28816v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InquiryEvent inquiryEvent, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f28816v = inquiryEvent;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new a(this.f28816v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f28814t;
            if (i10 == 0) {
                o.b(obj);
                b0<InquiryEvent> b0VarA = c.this.externalInquiryController.a();
                InquiryEvent inquiryEvent = this.f28816v;
                this.f28814t = 1;
                if (b0VarA.emit(inquiryEvent, this) == objE) {
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
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull e externalInquiryController, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.externalInquiryController = externalInquiryController;
        this.coroutineScope = coroutineScope;
    }

    public final void b(@NotNull InquiryEvent inquiryEvent) {
        Intrinsics.checkNotNullParameter(inquiryEvent, "inquiryEvent");
        k.d(this.coroutineScope, null, null, new a(inquiryEvent, null), 3, null);
    }

    public final void c(@NotNull i page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.c(this.currentPage, page)) {
            return;
        }
        this.currentPage = page;
        b(new InquiryEvent.PageChange(page.getStepName(), page.toString()));
    }
}
