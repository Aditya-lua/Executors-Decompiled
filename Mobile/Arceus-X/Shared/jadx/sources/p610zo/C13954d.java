package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3674c;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import gp.InquiryAttributes;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13954d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48736a;

    public C13954d(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48736a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13954d m50453a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13954d(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3674c m50454c(InquiryAttributes inquiryAttributes, C3706e c3706e) {
        return new C3674c(inquiryAttributes, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3674c m50455b(InquiryAttributes inquiryAttributes) {
        return m50454c(inquiryAttributes, this.f48736a.get());
    }
}
