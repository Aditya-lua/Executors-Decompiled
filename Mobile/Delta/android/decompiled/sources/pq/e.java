package pq;

import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import kotlin.Metadata;
import nu.b0;
import nu.c0;
import org.jetbrains.annotations.NotNull;
import wo.ScreenState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lpq/e;", "", "Lnu/h;", "Lpq/a;", "c", "()Lnu/h;", "controllerRequestFlow", "Lnu/c0;", "Lwo/c;", "b", "()Lnu/c0;", "getScreenStateFlow$annotations", "()V", "screenStateFlow", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "a", "()Lnu/b0;", "getEventFlow$annotations", "eventFlow", "", "d", "()Z", "isNavBarEnabled", "e", "handleBackPress", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @NotNull
    b0<InquiryEvent> a();

    @NotNull
    c0<ScreenState> b();

    @NotNull
    nu.h<a> c();

    boolean d();

    boolean e();
}
