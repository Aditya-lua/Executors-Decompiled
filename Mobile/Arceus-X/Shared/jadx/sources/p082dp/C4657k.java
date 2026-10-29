package p082dp;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: dp.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C4657k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C0967l0> f19081a;

    public C4657k(InterfaceC5835i<C0967l0> interfaceC5835i) {
        this.f19081a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C4657k m22900a(InterfaceC5835i<C0967l0> interfaceC5835i) {
        return new C4657k(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3686i m22901c(List<? extends NextStep> list, String str, C0967l0 c0967l0) {
        return new C3686i(list, str, c0967l0);
    }

    /* JADX INFO: renamed from: b */
    public C3686i m22902b(List<? extends NextStep> list, String str) {
        return m22901c(list, str, this.f19081a.get());
    }
}
