package np;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26281a;

    public c(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26281a = iVar;
    }

    public static c a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new c(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.a c(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.a(str, inquirySessionDataWrapper, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.a b(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return c(str, inquirySessionDataWrapper, this.f26281a.get());
    }
}
