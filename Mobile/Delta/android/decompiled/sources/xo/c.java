package xo;

import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f35965a;

    public c(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f35965a = iVar;
    }

    public static c a(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new c(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.a c(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.a(str, inquirySessionDataWrapper, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.a b(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return c(str, inquirySessionDataWrapper, this.f35965a.get());
    }
}
