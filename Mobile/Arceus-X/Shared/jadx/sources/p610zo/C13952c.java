package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3672a;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13952c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48728a;

    public C13952c(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48728a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13952c m50447a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13952c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3672a m50448c(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, C3706e c3706e) {
        return new C3672a(str, inquirySessionDataWrapper, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3672a m50449b(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return m50448c(str, inquirySessionDataWrapper, this.f48728a.get());
    }
}
