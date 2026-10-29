package p342or;

import com.withpersona.sdk2.inquiry.p057ui.C4158k;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import java.util.Map;
import mp.InterfaceC8611b;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p392qr.InterfaceC10703c;
import p471um.C11888w;

/* JADX INFO: renamed from: or.k6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9933k6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> f35900a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC10703c> f35901b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C11888w> f35902c;

    public C9933k6(InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i, InterfaceC5835i<InterfaceC10703c> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3) {
        this.f35900a = interfaceC5835i;
        this.f35901b = interfaceC5835i2;
        this.f35902c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C9933k6 m38757a(InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> interfaceC5835i, InterfaceC5835i<InterfaceC10703c> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3) {
        return new C9933k6(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C4158k m38758c(AbstractC5854c<InterfaceC8611b> abstractC5854c, InterfaceC10703c interfaceC10703c, C11888w c11888w, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new C4158k(abstractC5854c, interfaceC10703c, c11888w, str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: b */
    public C4158k m38759b(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return m38758c(this.f35900a.get(), this.f35901b.get(), this.f35902c.get(), str, str2, str3, str4, map);
    }
}
